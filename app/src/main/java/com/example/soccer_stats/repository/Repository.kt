package com.example.soccer_stats.repository

import com.example.soccer_stats.remote.RemoteDataSource
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repository@Inject constructor(private val remoteDataSource: RemoteDataSource) {

    val remote=remoteDataSource
}