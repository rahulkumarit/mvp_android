package com.mvpsample.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mvpsample.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.MyView {

    var mainPresenter: MainPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter = MainPresenter(this,this)
    }

    override fun initView() {
        btnClick.setOnClickListener {
            mainPresenter?.onClick(btnClick)
        }
        btnLogin.setOnClickListener {
            mainPresenter?.onClick(btnLogin)
        }

    }

    override fun setViewData(string: String?) {
        textView.setText(string)
    }

}
