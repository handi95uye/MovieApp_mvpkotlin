package indonesiaandroidkejar.id.movieapp_mvpkotlin.data.repository

import android.annotation.SuppressLint
import indonesiaandroidkejar.id.movieapp_mvpkotlin.data.model.Movies
import indonesiaandroidkejar.id.movieapp_mvpkotlin.data.model.ResponseMovie
import indonesiaandroidkejar.id.movieapp_mvpkotlin.data.network.RetrofitService
import io.reactivex.Flowable
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Handy on 18/02/18.
 * akang.handy95@gmail.com
 */
@Singleton
class ClubRepositoryImpl @Inject constructor(val service: RetrofitService) : ClubRepository {

    val page = 1
    override fun getMovies(): Flowable<ResponseMovie> {
        return service.getMovies(realease = getRealeaseDate(), page = page,sortBy = RetrofitService.SortBy.RELEASE_DATE_DESCENDING)
    }

    fun getRealeaseDate() : String {
        val cal = Calendar.getInstance()
        @SuppressLint("SimpleDateFormat")
        val format1 = SimpleDateFormat("yyyy-MM-dd")
        return format1.format(cal.time)
    }

}