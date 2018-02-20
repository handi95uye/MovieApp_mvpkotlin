package indonesiaandroidkejar.id.movieapp_mvpkotlin.base

import android.content.Context
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import indonesiaandroidkejar.id.movieapp_mvpkotlin.data.model.Movies

/**
 * Created by Handy on 18/02/18.
 * akang.handy95@gmail.com
 */

abstract class BaseListAdapter <T: Parcelable> : RecyclerView.Adapter<BaseListAdapter<T>.ViewHolder>() {


    protected var items = ArrayList<T>()

    abstract fun getListItemView(context: Context) : BaseViewHolder<T>

    fun clearItem(){
        items.clear()
        notifyItemRangeRemoved(0, items.size)
    }

    fun addItems(itemsToAdd: Movies){
        items.addAll(itemsToAdd)
        notifyItemRangeInserted(0, itemsToAdd.size)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int) = ViewHolder(getListItemView(parent?.context!!))

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) = holder?.view?.bind(items[position])!!

    override fun getItemCount(): Int = items.size

    inner class ViewHolder(val view: BaseViewHolder<T>) : RecyclerView.ViewHolder(view)

}