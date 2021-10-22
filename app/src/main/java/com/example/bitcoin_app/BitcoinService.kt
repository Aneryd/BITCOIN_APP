package com.example.bitcoin_app

import io.reactivex.Single
import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.GET
import retrofit2.http.Headers


interface BitcoinService {
//    fun getCriptList(): Call<List<Cripta>>
//    @GET("limit=5")
    @GET("application/json?CMC_PRO_API_KEY=36bc5ee0-40d7-4fa2-87da-bf391acbe8fd")
//    @Headers("X-CMC_PRO_API_KEY: 36bc5ee0-40d7-4fa2-87da-bf391acbe8fd")
    fun getCriptList(): Call<DataList>
}