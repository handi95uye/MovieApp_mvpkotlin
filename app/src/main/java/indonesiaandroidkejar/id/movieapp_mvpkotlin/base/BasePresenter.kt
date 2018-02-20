package indonesiaandroidkejar.id.movieapp_mvpkotlin.base

import io.reactivex.disposables.CompositeDisposable

/**
 * Created by Handy on 18/02/18.
 * akang.handy95@gmail.com
 */

open class BasePresenter<T: BaseView> {

    protected val disposables = CompositeDisposable()
    protected var view: T? = null

    fun bind(view: T){
        this.view = view
    }

    fun unbind(){
        this.view = null
    }

    fun destroy(){
        disposables.clear()
        if (!disposables.isDisposed) disposables.dispose()
        unbind()
    }
}