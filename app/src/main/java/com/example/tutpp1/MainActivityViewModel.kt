package com.example.tutpp1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import java.io.DataInput

class MainActivityViewModel(startingTotal:Int):ViewModel() {
//    private var total=0
    private var total=MutableLiveData<Int>()
    val  totalData: LiveData<Int>
        get() =total

    init {
        total.value=startingTotal
    }
//    fun getTotal():Int{
//        return  total
//    }


    fun setTotal(input:Int){
        total.value=(total.value)?.plus(input)
    }

    fun setTotalData()
    {
        total.value?.let { setTotal(it) }
    }


}