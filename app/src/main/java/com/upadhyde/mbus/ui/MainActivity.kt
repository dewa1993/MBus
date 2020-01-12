package com.upadhyde.mbus.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.upadhyde.mbus.R
import com.upadhyde.mbus.base.activity.AbstractActivity
import javax.inject.Inject

//
// Created by dewashish on 24/12/2019.
// Copyright (c) 2019 upadhyde.com. All rights reserved.
//
class MainActivity : AbstractActivity() {

    @Inject
    lateinit var mainNavigationController: MainNavigationController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainNavigationController.navigateToSplash()
    }
}