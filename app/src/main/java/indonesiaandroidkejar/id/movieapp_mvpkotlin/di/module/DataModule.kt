package indonesiaandroidkejar.id.movieapp_mvpkotlin.di.module

import dagger.Module
import dagger.Provides
import indonesiaandroidkejar.id.movieapp_mvpkotlin.data.repository.ClubRepository
import indonesiaandroidkejar.id.movieapp_mvpkotlin.data.repository.ClubRepositoryImpl
import javax.inject.Singleton

/**
 * Created by Handy on 18/02/18.
 * akang.handy95@gmail.com
 */

@Module
class DataModule {

    @Provides
    @Singleton
    fun provideClubManager(clubManagerImpl: ClubRepositoryImpl) : ClubRepository = clubManagerImpl


}