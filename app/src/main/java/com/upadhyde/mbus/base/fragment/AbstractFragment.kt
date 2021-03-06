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
import javax.inject.Inject

abstract class AbstractFragment<T : ViewDataBinding> : Fragment(), Injectable {

//  @Inject
//  lateinit var viewModelFactory: ViewModelProvider.Factory

  lateinit var binding: T

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setHasOptionsMenu(true)
  }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    binding = DataBindingUtil.inflate(inflater, getLayout(), container, false)
    return binding.root
  }

  @LayoutRes
  protected abstract fun getLayout(): Int

}