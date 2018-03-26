package com.mvpsample.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.mvpsample.R
import kotlinx.android.synthetic.main.login_activity.*

/**
 * Created by Devrepublic-14 on 3/26/2018.
 */
class LoginActivity : AppCompatActivity(), LoginContract.LoginView {

    var loginPresenter: LoginPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        loginPresenter = LoginPresenter(this, this)
    }

    override fun initView() {
        btnLogin.setOnClickListener {
            Toast.makeText(this, "login...", Toast.LENGTH_SHORT).show()
        }
    }

    override fun setViewData(loginModel: LoginContract.LoginModel) {


     }



}