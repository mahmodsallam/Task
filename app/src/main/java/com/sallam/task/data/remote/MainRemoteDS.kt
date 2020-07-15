package com.sallam.task.data.remote

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface MainRemoteDS {
    @GET("api/v1/cars")
    fun getCarsList(@Query("page") page: Int): Observable<MainResponse>
}