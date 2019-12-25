package com.upadhyde.mbus.di.module

import com.upadhyde.mbus.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

//
// Created by Dewashish on 25/12/2019.
//

@Module
abstract class ActivityModule{

    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun contributeMainActivity(): MainActivity
}