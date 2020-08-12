package com.e.lib.framework.mvp

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner

public interface IBasePresenter<V : IBaseView> : LifecycleObserver {

    fun onViewAttached(view: V)

    fun onViewDetached()

    fun getView(): V

    fun setLifecycleOwner(owner: LifecycleOwner)
}