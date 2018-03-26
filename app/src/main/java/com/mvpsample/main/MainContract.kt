package com.mvpsample.main

import android.view.View


/**
 * Created by Devrepublic-14 on 3/23/2018.
 */
interface MainContract {

    interface MyView {
        fun initView()
        fun setViewData(string: String?)
    }

    interface Presenter {
        fun onClick(view: View)
    }

    interface Model {
        fun getData(): String
    }

}