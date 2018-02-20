package indonesiaandroidkejar.id.movieapp_mvpkotlin.data.network

import indonesiaandroidkejar.id.movieapp_mvpkotlin.data.model.ResponseMovie
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by Handy on 17/02/18.
 * akang.handy95@gmail.com
 */

interface RetrofitService {

     enum class SortBy constructor(value:String) {
        RELEASE_DATE_ASCENDING("release_date.asc"),
        RELEASE_DATE_DESCENDING("release_date.desc");

         var value:String = value
         override fun toString():String {
            return this.value
        }
    }

    /*Get Movies*/
    @GET("discover/movie")
    fun getMovies(@Query("primary_release_date.lte") realease : String,
                  @Query("sort_by") sortBy: SortBy,
                  @Query("page") page : Int) : Flowable <ResponseMovie>

    /* Get Detail Movies */
    @GET("movie/{id}")
    fun getDetailMovies(@Path("id") id : Int) : Flowable <ResponseMovie>

}