package indonesiaandroidkejar.id.movieapp_mvpkotlin.base

import android.content.Context
import android.os.Parcelable
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout

/**
 * Created by Handy on 18/02/18.
 * akang.handy95@gmail.com
 */
abstract class BaseViewHolder<T: Parcelable> : RelativeLayout {


    constructor(context : Context?) : super (context) {
        init()
    }

    constructor(context: Context?, attrs : AttributeSet?) : super(context,attrs) {
        init()
    }

    constructor(context: Context?,attrs: AttributeSet?,defStyleAttr : Int) : super (context,attrs,defStyleAttr)
    {
        init()
    }

    fun init() {
        View.inflate(context,layoutResId(), this)
    }

    protected abstract  fun  layoutResId() : Int

    abstract fun bind (item: T)

}