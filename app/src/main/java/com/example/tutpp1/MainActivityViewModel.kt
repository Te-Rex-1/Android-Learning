package com.example.tutpp1

import androidx.lifecycle.ViewModel
import java.io.DataInput

class MainActivityViewModel(startingTotal:Int):ViewModel() {
    private var total=0

    init {
        total=startingTotal
    }
    fun getTotal():Int{
        return  total
    }
    fun setTotal(input:Int){
        total+=input
    }


}