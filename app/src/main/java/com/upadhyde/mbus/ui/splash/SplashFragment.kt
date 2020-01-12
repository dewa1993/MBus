package com.upadhyde.mbus.ui.splash

import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.upadhyde.mbus.R
import com.upadhyde.mbus.base.fragment.AbstractDataBindingFragment
import com.upadhyde.mbus.databinding.FragmentSplashBinding

//
// Created by  on 24/12/2019.
//
class SplashFragment : AbstractDataBindingFragment<FragmentSplashBinding>() {

    companion object {
        fun getInstance() = SplashFragment()
    }

    override fun getLayout(): Int = R.layout.fragment_splash

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Toast.makeText(context, " HelloQQ", Toast.LENGTH_LONG).show()
        Handler().postDelayed({
            navigationController.navigateToDashboard()
        }, 5000)
    }
}