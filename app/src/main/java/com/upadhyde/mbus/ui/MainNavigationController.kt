package com.upadhyde.mbus.ui

import com.upadhyde.mbus.R
import com.upadhyde.mbus.base.BaseNavigationController
import com.upadhyde.mbus.ui.dashboard.DashboardFragment
import com.upadhyde.mbus.ui.splash.SplashFragment
import javax.inject.Inject

class MainNavigationController @Inject constructor(mainActivity: MainActivity) :
    BaseNavigationController(mainActivity) {

    override fun provideContainerId(): Int = R.id.container


    companion object {
        const val DASHBOARD_BACK_STACK = "DASHBOARD_BACK_STACK"
    }

    fun navigateToSplash() {
        changeFragment(
            SplashFragment.getInstance(),
            animate = false,
            addToBackStack = false,
            backStackName = DASHBOARD_BACK_STACK
        )
    }

    fun navigateToDashboard(){
        changeFragment(
            DashboardFragment.getInstance(),
            animate = false,
            addToBackStack = false,
            backStackName = DASHBOARD_BACK_STACK
        )
    }

}


