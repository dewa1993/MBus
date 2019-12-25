package com.upadhyde.mbus.ui

import android.os.Bundle
import android.os.PersistableBundle
import com.upadhyde.mbus.R
import com.upadhyde.mbus.base.activity.AbstractActivity

//
// Created by dewashish on 24/12/2019.
// Copyright (c) 2019 upadhyde.com. All rights reserved.
//
class MainActivity : AbstractActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
    }
}