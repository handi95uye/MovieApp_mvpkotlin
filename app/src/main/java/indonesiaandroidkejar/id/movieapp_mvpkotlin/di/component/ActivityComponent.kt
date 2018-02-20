package indonesiaandroidkejar.id.movieapp_mvpkotlin.di.component

import dagger.Subcomponent
import indonesiaandroidkejar.id.movieapp_mvpkotlin.di.module.ActivityModule
import indonesiaandroidkejar.id.movieapp_mvpkotlin.di.scope.PerActivity
import indonesiaandroidkejar.id.movieapp_mvpkotlin.main.MainActivity

/**
 * Created by Handy on 18/02/18.
 * akang.handy95@gmail.com
 */
@PerActivity
@Subcomponent(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    @Subcomponent.Builder
    interface Builder {
        fun activityModule(activityModule: ActivityModule): Builder

        fun build(): ActivityComponent
    }

    fun inject(activityMain: MainActivity)

}