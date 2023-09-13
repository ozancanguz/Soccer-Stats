package com.example.soccer_stats.api

import com.example.soccer_stats.data.Results
import retrofit2.Response
import retrofit2.http.GET

interface FootballZoneApi {


    @GET("results?data.league=super-lig")
    suspend fun getResults(): Response<Results>


}