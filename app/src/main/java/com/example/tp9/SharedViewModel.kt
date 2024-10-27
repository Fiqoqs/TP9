package com.example.tp9

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    private val _accountHolderName = MutableLiveData<String>()
    val accountHolderName: LiveData<String> get() = _accountHolderName

    fun setAccountHolderName(name: String) {
        _accountHolderName.value = name
    }
}
