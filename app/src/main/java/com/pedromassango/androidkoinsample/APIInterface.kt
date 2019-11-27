package com.pedromassango.androidkoinsample

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

internal interface APIInterface {

    @GET("/api/unknown")
    fun doGetListResources(): Call<data>
}