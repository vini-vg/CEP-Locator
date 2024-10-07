package com.example.via_cep.domain.remote.repository

import com.example.via_cep.data.remote.model.AddressResponse

interface AddressRemoteRepository {

    suspend fun getAddress(zipcode: String) : AddressResponse

}