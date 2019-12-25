package com.upadhyde.mbus.di.module

import androidx.lifecycle.ViewModelProvider
import com.upadhyde.mbus.base.vm.ViewModelFactory
import dagger.Binds
import dagger.Module

//
// Created by Dewashish on 25/12/2019.
//
@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}