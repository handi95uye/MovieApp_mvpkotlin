package indonesiaandroidkejar.id.movieapp_mvpkotlin.base

import android.app.Fragment

/**
 * Created by Handy on 18/02/18.
 * akang.handy95@gmail.com
 */
interface BaseCallback {

    fun onChangeFragment(fragment: Fragment,enableAnimation: Boolean)

    fun onBackPress()

}