package com.mvpsample.main

import android.content.Context
import android.content.Intent
import android.view.View
import com.mvpsample.R.id.btnClick
import com.mvpsample.R.id.btnLogin
import com.mvpsample.login.LoginActivity

/**
 * Created by Devrepublic-14 on 3/23/2018.
 */
class MainPresenter : MainContract.Presenter {
    var view: MainContract.MyView? = null
    var model: MainModel? = null
    var context: Context? = null

    constructor(context: Context, view: MainContract.MyView) {
        this.view = view
        this.context = context
        initPresenter()
    }

    fun initPresenter() {
        model = MainModel()
        view?.initView()
    }

    override fun onClick(view: View) {
        when (view.id) {
            btnLogin -> {
                context?.startActivity(Intent(context, LoginActivity::class.java))
             }
            btnClick -> this.view?.setViewData(model?.getData())
        }
    }
}