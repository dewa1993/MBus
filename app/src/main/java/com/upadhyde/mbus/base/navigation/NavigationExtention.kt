package com.upadhyde.mbus.base.navigation


import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentManager.POP_BACK_STACK_INCLUSIVE
import androidx.fragment.app.FragmentTransaction
import com.upadhyde.mbus.R


fun AppCompatActivity.replaceFragment(
    containerId: Int,
    fragment: Fragment,
    animate: Boolean,
    backStackName: String,
    addToBackStack: Boolean
) {
    supportFragmentManager.transact(backStackName, addToBackStack = addToBackStack) {
        if (animate)
            setCustomAnimations(
                R.anim.slide_in_right,
                R.anim.slide_out_left,
                R.anim.slide_in_left,
                R.anim.slide_out_right
            )
        replace(containerId, fragment)
    }
}

private inline fun FragmentManager.transact(
    backStackName: String?,
    addToBackStack: Boolean,
    action: FragmentTransaction.() -> Unit
) {
    beginTransaction().apply {
        action()
        if (addToBackStack)
            addToBackStack(backStackName)
    }.commit()
}

fun AppCompatActivity.popBackStackImmediate() {
    supportFragmentManager.popBackStackImmediate()
}

fun AppCompatActivity.popBackStackInclusive(backStackName: String) {
    supportFragmentManager.popBackStack(backStackName, POP_BACK_STACK_INCLUSIVE)
}





