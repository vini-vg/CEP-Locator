package com.example.via_cep.data.remote.repository

import com.example.via_cep.data.remote.api.AddressApi
import com.example.via_cep.data.remote.model.AddressResponse
import com.example.via_cep.domain.remote.repository.AddressRemoteRepository
import javax.inject.Inject

class AddressRemoteRepositoryImpl @Inject constructor(
    private val addressApi: AddressApi
): AddressRemoteRepository {

    override suspend fun getAddress(zipcode: String): AddressResponse {
        return addressApi.getaddress(zipcode)
    }


}