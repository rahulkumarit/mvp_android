package com.mvpsample.login

import android.content.Context
import android.view.View
import android.widget.Toast

/**
 * Created by Devrepublic-14 on 3/26/2018.
 */
class LoginPresenter : LoginContract.Presenter {

    var view: LoginContract.LoginView? = null
    var loginModel: LoginModel? = null
    var context: Context? = null

    constructor(context: Context, view: LoginContract.LoginView) {
        this.view = view
        this.context = context
    }

    override fun onClick(view: View) {
        Toast.makeText(context, "this is login", Toast.LENGTH_SHORT).show()
    }


}