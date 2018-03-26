package com.mvpsample.login

import android.view.View

/**
 * Created by Devrepublic-14 on 3/26/2018.
 */
interface LoginContract {

    interface LoginView {
        fun initView()
        fun setViewData(loginModel: LoginModel)
    }

    interface Presenter {
        fun onClick(view: View)
    }

    interface LoginModel {
        fun getData(): LoginModel
    }


}