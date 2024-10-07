package com.example.via_cep.data.remote.api

import com.example.via_cep.data.remote.model.AddressResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface AddressApi {
    @GET("{zipcode}/json")
    suspend fun getaddress(
        @Path("zipcode") zipcode: String
    ): AddressResponse
}