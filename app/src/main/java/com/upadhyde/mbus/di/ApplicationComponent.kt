package com.upadhyde.mbus.di

import android.app.Application
import com.upadhyde.mbus.BusApplication
import com.upadhyde.mbus.di.module.ActivityModule
import com.upadhyde.mbus.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

//
// Created by  on 25/12/2019.
//
@Singleton
@Component(modules = [AndroidInjectionModule::class, ActivityModule::class, AppModule::class])
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }

    fun inject(application: BusApplication)

}