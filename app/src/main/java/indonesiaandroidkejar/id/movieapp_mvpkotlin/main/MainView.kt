package indonesiaandroidkejar.id.movieapp_mvpkotlin.main

import indonesiaandroidkejar.id.movieapp_mvpkotlin.base.BaseView
import indonesiaandroidkejar.id.movieapp_mvpkotlin.data.model.Movies

/**
 * Created by Handy on 19/02/18.
 * akang.handy95@gmail.com
 */
interface MainView : BaseView {
    fun showMovie (movies : Movies)
}