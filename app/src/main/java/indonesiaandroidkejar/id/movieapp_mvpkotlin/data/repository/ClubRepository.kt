package indonesiaandroidkejar.id.movieapp_mvpkotlin.data.repository

import indonesiaandroidkejar.id.movieapp_mvpkotlin.data.model.Movies
import indonesiaandroidkejar.id.movieapp_mvpkotlin.data.model.ResponseMovie
import io.reactivex.Flowable

/**
 * Created by Handy on 18/02/18.
 * akang.handy95@gmail.com
 */
interface ClubRepository {
    fun getMovies() : Flowable<Movies>

}