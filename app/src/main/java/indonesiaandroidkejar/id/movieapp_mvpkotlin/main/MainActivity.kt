package indonesiaandroidkejar.id.movieapp_mvpkotlin.main

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import indonesiaandroidkejar.id.movieapp_mvpkotlin.R
import indonesiaandroidkejar.id.movieapp_mvpkotlin.base.BaseActivity
import indonesiaandroidkejar.id.movieapp_mvpkotlin.data.model.Movies
import indonesiaandroidkejar.id.movieapp_mvpkotlin.di.component.ActivityComponent
import indonesiaandroidkejar.id.movieapp_mvpkotlin.main.adapter.MovieAdapter
import indonesiaandroidkejar.id.movieapp_mvpkotlin.utilities.TAG
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

/**
 * Created by Handy on 19/02/18.
 * akang.handy95@gmail.com
 */
class MainActivity : BaseActivity(),MainView {

    val TAG = TAG (MainActivity::class.java)

    @Inject
    lateinit var presenter: MainPresenter

    @Inject
    lateinit var movieadapter : MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.bind(this)

        recMovie.layoutManager = LinearLayoutManager(this)
        recMovie.adapter = movieadapter

        presenter.getMovie()
    }

    override fun injectModule(activityComponent: ActivityComponent) {
        activityComponent.inject(this)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }

    override fun showMovie(movies: Movies) {
        movieadapter.clearItem()
        movieadapter.addItems(movies)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun showProgress(show: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}