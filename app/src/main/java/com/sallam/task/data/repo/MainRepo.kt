package com.sallam.task.data.repo

import com.sallam.task.data.remote.MainRemoteDS
import com.sallam.task.data.remote.MainResponse
import io.reactivex.Observable

class MainRepo(private var mMainRemoteDS: MainRemoteDS) : IMainRepo {
    override fun getCarsList(page: Int): Observable<MainResponse> {
        return mMainRemoteDS.getCarsList(page)
    }
}