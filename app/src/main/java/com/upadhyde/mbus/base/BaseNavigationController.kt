package com.upadhyde.mbus.base

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.upadhyde.mbus.base.navigation.popBackStackImmediate
import com.upadhyde.mbus.base.navigation.popBackStackInclusive
import com.upadhyde.mbus.base.navigation.replaceFragment
import javax.inject.Inject


abstract class BaseNavigationController constructor(private var appCompatActivity: AppCompatActivity) {

    protected abstract fun provideContainerId(): Int


    protected fun changeFragment(
        fragment: Fragment,
        animate: Boolean,
        backStackName: String,
        addToBackStack: Boolean
    ) {
        appCompatActivity.replaceFragment(
            containerId = provideContainerId(),
            fragment = fragment,
            animate = animate,
            backStackName = backStackName,
            addToBackStack = addToBackStack
        )
    }

    fun popBackStackImmediate() {
        appCompatActivity.popBackStackImmediate()
    }

    fun popBackStackInclusive(backStackName: String) {
        appCompatActivity.popBackStackInclusive(backStackName = backStackName)
    }
}