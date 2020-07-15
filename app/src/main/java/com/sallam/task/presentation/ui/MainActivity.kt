package com.sallam.task.presentation.ui

import CarsAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.sallam.task.R
import com.sallam.task.di.getMainViewModel
import com.sallam.task.presentation.viewModel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mMainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mMainViewModel = getMainViewModel()
        mMainViewModel.getCarsList(1)
        mMainViewModel.carsList.observe(this, Observer {
            rvCars.adapter = CarsAdapter(this, it)
            val layoutManager =
                LinearLayoutManager(this)
            rvCars.layoutManager = layoutManager
            rvCars.itemAnimator = DefaultItemAnimator()
        })
    }
}