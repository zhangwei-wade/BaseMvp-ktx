package com.e.lib.framework.base

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.e.lib.framework.R
import com.ns.yc.ycstatelib.StateLayoutManager
import kotlinx.android.synthetic.main.activity_base_view.*

public abstract class BaseActivity : AppCompatActivity() {

    protected var mStatusLayoutManager: StateLayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (isFullScreen()) {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        setContentView(R.layout.activity_base_view)

        mStatusLayoutManager = initStatusLayout()

        initBaseView()

        initView()
    }

    protected abstract fun isFullScreen(): Boolean

    protected abstract fun initStatusLayout(): StateLayoutManager

    protected abstract fun initView()

    private fun initBaseView() {
        ll_main.addView(mStatusLayoutManager?.rootLayout)
    }

    protected open fun showContent() {
        mStatusLayoutManager?.showContent()
    }

    protected open fun showEmptyData() {
        mStatusLayoutManager?.showEmptyData()
    }

    protected open fun showError() {
        mStatusLayoutManager?.showError()
    }

    protected open fun showNetWorkError() {
        mStatusLayoutManager?.showNetWorkError()
    }

    protected open fun showLoading() {
        mStatusLayoutManager?.showLoading()
    }


}