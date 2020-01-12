package com.upadhyde.mbus.base.fragment

import com.upadhyde.mbus.ui.MainNavigationController
import javax.inject.Inject

//
// Created by Dewashish on 05/01/2020.
//
abstract class AbstractNavigationFragment : AbstractViewModelFragment(){

    @Inject
    lateinit var navigationController: MainNavigationController
}