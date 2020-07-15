package com.sallam.task.di

import com.sallam.task.base.ApiClient
import com.sallam.task.data.remote.MainRemoteDS
import com.sallam.task.data.repo.MainRepo
import com.sallam.task.presentation.viewModel.MainViewModel

fun getMainRemoteDS(): MainRemoteDS {
    return ApiClient.getInstance().create(MainRemoteDS::class.java)
}

fun getMainRepository(): MainRepo {
    return MainRepo(getMainRemoteDS())
}

fun getMainViewModel(): MainViewModel {
    return MainViewModel(getMainRepository())
}