package com.example.kotlinjsonexample.Common

import com.example.kotlinjsonexample.Interface.RetrofitService
import com.example.kotlinjsonexample.Retrofit.RetrofitClient

object Common {
    private var BASE_URL = "http://simplifiedcoding.net/demos/"
    val retrofitService: RetrofitService
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitService::class.java)
}