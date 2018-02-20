package indonesiaandroidkejar.id.movieapp_mvpkotlin.di.component

import dagger.Component
import indonesiaandroidkejar.id.movieapp_mvpkotlin.di.module.AppModule
import indonesiaandroidkejar.id.movieapp_mvpkotlin.di.module.DataModule
import javax.inject.Singleton

/**
 * Created by Handy on 18/02/18.
 * akang.handy95@gmail.com
 */

@Singleton
@Component (modules = arrayOf(AppModule::class,DataModule::class))
interface AppComponent {
    fun activityComponent(): ActivityComponent.Builder

}