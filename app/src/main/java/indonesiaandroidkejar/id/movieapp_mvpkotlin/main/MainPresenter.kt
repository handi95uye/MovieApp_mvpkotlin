package indonesiaandroidkejar.id.movieapp_mvpkotlin.main

import indonesiaandroidkejar.id.movieapp_mvpkotlin.base.BasePresenter
import indonesiaandroidkejar.id.movieapp_mvpkotlin.data.repository.ClubRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by Handy on 19/02/18.
 * akang.handy95@gmail.com
 */
class MainPresenter @Inject constructor(
        private val clubRepository: ClubRepository) : BasePresenter<MainView>() {

    fun getMovie() {
        view?.showProgress(true)
        disposables.add(clubRepository.getMovies()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnEach{view?.showProgress(false)}
                .subscribe({view?.showMovie(it)}, {it.printStackTrace()}))
    }
}