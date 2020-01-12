package com.upadhyde.mbus.ui.dashboard

import android.os.Bundle
import android.widget.Toast
import com.upadhyde.mbus.R
import com.upadhyde.mbus.base.fragment.AbstractDataBindingFragment
import com.upadhyde.mbus.base.fragment.AbstractViewModelFragment
import com.upadhyde.mbus.databinding.FragmentDashboardBinding

//
// Created by Dewashish on 25/12/2019.
//
class DashboardFragment : AbstractDataBindingFragment<FragmentDashboardBinding>(){

    companion object{
        fun getInstance() = DashboardFragment()
    }

    override fun getLayout(): Int = R.layout.fragment_dashboard
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Toast.makeText(context, " HelloQQ", Toast.LENGTH_LONG).show()
    }
}