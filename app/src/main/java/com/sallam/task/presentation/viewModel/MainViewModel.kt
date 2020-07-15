package com.sallam.task.presentation.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sallam.task.data.remote.MainResponse
import com.sallam.task.data.repo.MainRepo
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainViewModel(private var mMainRepo: MainRepo) : ViewModel() {
    var carsList = MutableLiveData<List<MainResponse.Data>>()
    fun getCarsList(page: Int) {
        mMainRepo.getCarsList(page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { mainResponse -> carsList.value = mainResponse.data },
                { t: Throwable? -> Log.d("ERROR", t.toString()) })


    }

}