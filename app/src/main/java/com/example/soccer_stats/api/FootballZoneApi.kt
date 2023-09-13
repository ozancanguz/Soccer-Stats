package com.example.soccer_stats.api

import com.example.soccer_stats.data.Results
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface FootballZoneApi {

    @Headers("authorization: apikey 2xAW88zA1iemGAxzWMNumI:47IyS3uICCasjqzWaFtxnn", "content-type: application/json")
    @GET("results?data.league=super-lig")
    suspend fun getResults(): Response<Results>


}