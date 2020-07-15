package com.sallam.task.data.repo

import com.sallam.task.data.remote.MainResponse
import io.reactivex.Observable

interface IMainRepo {
    fun getCarsList(page: Int): Observable<MainResponse>
}