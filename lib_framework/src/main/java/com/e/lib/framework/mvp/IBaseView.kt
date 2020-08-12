package com.e.lib.framework.mvp

import android.app.Activity
import android.content.Intent

public interface IBaseView {

    fun showNoNetworkView()

    fun showErrorView()

    fun showContentView()

    fun showLoadingView()

    fun getAct(): Activity

    fun startToActivity(intent: Intent?)
}