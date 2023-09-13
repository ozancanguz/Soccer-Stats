package com.example.soccer_stats.ui.fragments.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.soccer_stats.data.Results
import com.example.soccer_stats.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class ListViewModel@Inject constructor(private val repository: Repository,application: Application):AndroidViewModel(application) {


    val result=MutableLiveData<Results>()

    fun getResults(){
        viewModelScope.launch {
            val response=repository.remote.getResults()
            if(response.isSuccessful){
                result.postValue(response.body())
            }else{
                Log.d("listviewmodel ","error no data")
            }
        }
    }

}