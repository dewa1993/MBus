package com.upadhyde.mbus.base.activity

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

abstract class AbstractActivity : AppCompatActivity(), HasSupportFragmentInjector {

  @Inject
  lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

  override fun supportFragmentInjector() = dispatchingAndroidInjector

  override fun onBackPressed() {
    if (supportFragmentManager.backStackEntryCount == 1) {
      finish()
      return
    }
    super.onBackPressed()
  }
}