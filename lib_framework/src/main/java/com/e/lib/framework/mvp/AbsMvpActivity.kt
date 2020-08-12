package com.e.lib.framework.mvp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.e.lib.framework.base.BaseActivity
import java.lang.NullPointerException

public abstract class AbsMvpActivity<P : IBasePresenter<IBaseView>> : BaseActivity(), IBaseView {



    protected var mPresenter: P? = null

    override fun getAct(): Activity {
        return this
    }

    override fun startToActivity(intent: Intent?) {
        if (intent == null) {
            throw NullPointerException("intent == null")
        }
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter = createPresenter()
        mPresenter
    }

    public abstract fun createPresenter():P


}