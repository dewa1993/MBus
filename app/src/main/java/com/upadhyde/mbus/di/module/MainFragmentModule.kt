package com.upadhyde.mbus.di.module

import com.upadhyde.mbus.ui.dashboard.DashboardFragment
import com.upadhyde.mbus.ui.splash.SplashFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

//
// Created by Dewashish on 25/12/2019.
//

@Module
abstract class MainFragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeSplashFragment(): SplashFragment

    @ContributesAndroidInjector
    abstract fun contributeDashboardFragment(): DashboardFragment
}