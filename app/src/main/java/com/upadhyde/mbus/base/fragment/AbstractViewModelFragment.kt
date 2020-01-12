package com.upadhyde.mbus.base.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.upadhyde.mbus.di.Injectable
import dagger.android.HasFragmentInjector
import javax.inject.Inject

abstract class AbstractViewModelFragment: Fragment(), Injectable {

//  @Inject
//  lateinit var viewModelFactory: ViewModelProvider.Factory

}