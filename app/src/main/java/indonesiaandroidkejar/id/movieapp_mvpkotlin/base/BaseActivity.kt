package indonesiaandroidkejar.id.movieapp_mvpkotlin.base

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import indonesiaandroidkejar.id.movieapp_mvpkotlin.BaseApp
import indonesiaandroidkejar.id.movieapp_mvpkotlin.di.component.ActivityComponent
import indonesiaandroidkejar.id.movieapp_mvpkotlin.di.module.ActivityModule

/**
 * Created by Handy on 18/02/18.
 * akang.handy95@gmail.com
 */

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityComponent = BaseApp.get(this)
                .appComponent
                .activityComponent()
                .activityModule(ActivityModule(this))
                .build()

        injectModule(activityComponent)
    }

    abstract fun injectModule(activityComponent: ActivityComponent)
}