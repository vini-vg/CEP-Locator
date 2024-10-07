package com.example.via_cep.domain.remote.useCase

import com.example.via_cep.data.remote.mapper.toDomain
import com.example.via_cep.domain.remote.model.Address
import com.example.via_cep.domain.remote.repository.AddressRemoteRepository
import javax.inject.Inject

class GetAdressUseCase @Inject constructor(
    private val repository: AddressRemoteRepository
) {

    suspend operator fun invoke(zipcode: String): Address {
        return repository.getAddress(zipcode).toDomain()

    }

}