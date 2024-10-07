package com.example.via_cep.data.remote.mapper

import com.example.via_cep.data.remote.model.AddressResponse
import com.example.via_cep.domain.remote.model.Address

fun AddressResponse.toDomain(): Address {
    return Address(
        zipCode = zipCode,
        neighborhood = neighborhood,
        city = city,
        street = street,
        uf = uf
    )
}