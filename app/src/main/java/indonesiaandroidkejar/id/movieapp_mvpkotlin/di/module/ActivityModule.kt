package indonesiaandroidkejar.id.movieapp_mvpkotlin.di.module

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides
import indonesiaandroidkejar.id.movieapp_mvpkotlin.di.scope.ActivityContext
import indonesiaandroidkejar.id.movieapp_mvpkotlin.di.scope.PerActivity

/**
 * Created by Handy on 18/02/18.
 * akang.handy95@gmail.com
 */

@Module
class ActivityModule (val activity: Activity) {

    @Provides
    @PerActivity
    fun provideActivity() : Activity = activity

    @Provides
    @ActivityContext
    fun provideActivityContex() : Context = activity
}