package com.upadhyde.mbus.di

import android.app.Activity
import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.upadhyde.mbus.BusApplication
import dagger.android.AndroidInjection
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.HasSupportFragmentInjector

/**
 * Helper class to automatically inject fragments if they implement [Injectable].
 */
object AppInjector {

    fun init(application: BusApplication) {
        DaggerApplicationComponent.builder().application(application)
            .build().inject(application)
        application
            .registerActivityLifecycleCallbacks(object : Application.ActivityLifecycleCallbacks {
                override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                    handleActivity(activity)
                }

                override fun onActivityStarted(activity: Activity) {
                    // stub-method
                }

                override fun onActivityResumed(activity: Activity) {
                    // stub-method
                }

                override fun onActivityPaused(activity: Activity) {
                    // stub-method
                }

                override fun onActivityStopped(activity: Activity) {
                    // stub-method
                }

                override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle?) {
                    // stub-method
                }

                override fun onActivityDestroyed(activity: Activity) {
                    // stub-method
                }
            })
    }

    private fun handleActivity(activity: Activity) {
        if (activity is HasSupportFragmentInjector) {
            AndroidInjection.inject(activity)
        }
        if (activity is FragmentActivity) {
            activity.supportFragmentManager
                .registerFragmentLifecycleCallbacks(
                    object : FragmentManager.FragmentLifecycleCallbacks() {
                        override fun onFragmentCreated(
                            fm: FragmentManager,
                            f: Fragment,
                            savedInstanceState: Bundle?
                        ) {
                            if (f is Injectable) {
                                AndroidSupportInjection.inject(f)
                            }
                        }
                    }, true
                )
        }
    }
}
