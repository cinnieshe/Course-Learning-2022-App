package com.example.year3spring.ui.comp2611

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CompOrgViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is COMP2611 Fragment"
    }
    val text: LiveData<String> = _text
}