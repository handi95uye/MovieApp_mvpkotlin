package indonesiaandroidkejar.id.movieapp_mvpkotlin

import android.app.Application
import android.content.Context
import indonesiaandroidkejar.id.movieapp_mvpkotlin.di.component.AppComponent
import indonesiaandroidkejar.id.movieapp_mvpkotlin.di.component.DaggerAppComponent
import indonesiaandroidkejar.id.movieapp_mvpkotlin.di.module.AppModule

/**
 * Created by Handy on 18/02/18.
 * akang.handy95@gmail.com
 */

class BaseApp : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

    companion object {
        fun get(context: Context): BaseApp = context.applicationContext as BaseApp
    }

    override fun onCreate() {
        super.onCreate()
    }
}