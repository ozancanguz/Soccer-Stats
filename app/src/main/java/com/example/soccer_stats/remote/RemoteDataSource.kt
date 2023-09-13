package com.example.soccer_stats.remote

import com.example.soccer_stats.api.FootballZoneApi
import com.example.soccer_stats.data.Results
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource@Inject constructor(private val footballZoneApi: FootballZoneApi) {


    suspend fun getResults(): Response<Results> {
        return footballZoneApi.getResults()
    }
}