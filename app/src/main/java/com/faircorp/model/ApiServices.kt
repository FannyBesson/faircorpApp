package com.faircorp.model

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ApiServices {
    val windowsApiService : WindowApiService by lazy {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            //.baseUrl("https://dev-mind.fr/training/android/")
                //on se sert de notre propre API
            .baseUrl("http://fannybesson.cleverapps.io/api/")
            .build()
            .create(WindowApiService::class.java)
    }
}