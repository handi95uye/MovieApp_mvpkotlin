package indonesiaandroidkejar.id.movieapp_mvpkotlin.main.adapter

import android.content.Context
import com.bumptech.glide.Glide
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.request.RequestOptions
import indonesiaandroidkejar.id.movieapp_mvpkotlin.R
import indonesiaandroidkejar.id.movieapp_mvpkotlin.base.BaseListAdapter
import indonesiaandroidkejar.id.movieapp_mvpkotlin.base.BaseViewHolder
import indonesiaandroidkejar.id.movieapp_mvpkotlin.data.model.Images
import indonesiaandroidkejar.id.movieapp_mvpkotlin.data.model.Movies
import indonesiaandroidkejar.id.movieapp_mvpkotlin.di.scope.PerActivity
import kotlinx.android.synthetic.main.item_movie.view.*
import javax.inject.Inject

/**
 * Created by Handy on 19/02/18.
 * akang.handy95@gmail.com
 */
@GlideModule
@PerActivity
class MovieAdapter @Inject constructor() : BaseListAdapter<Movies>(){

    val image : Images? = null

    override fun getListItemView(context: Context):
            BaseViewHolder<Movies> = ViewHolder(context)

    inner class ViewHolder(context: Context?) : BaseViewHolder<Movies>(context) {
        override fun layoutResId(): Int = R.layout.item_movie

        var fullImageUrl  = getFullImageUrl(movies = Movies())
        override fun bind(item: Movies) {
            titleTextView.text      = item.title
            popularityTextView.text = item.popularity.toString()
            Glide.with(this)
                    .load(fullImageUrl)
                    .apply(RequestOptions().centerCrop())
                    .into(imageView)
        }
    }
    fun getFullImageUrl (movies: Movies) :String {
        val imagePath : String =
                if (movies.posterPath !=null && movies.posterPath.isEmpty()) {
            movies.posterPath
        }
        else {
            movies.backdropPath.toString()
        }

        if (image?.baseUrl != null && !image.baseUrl.isEmpty()) {
            if (image.posterSizes !=null) {
                if (image.posterSizes.size > 4) {
                    return image.baseUrl + image.posterSizes.get(4) + imagePath

                } else{
                    return image.baseUrl + "w500" + imagePath
                }
            }
        }
        return ""
    }
}