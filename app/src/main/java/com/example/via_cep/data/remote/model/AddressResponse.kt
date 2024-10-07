package com.example.via_cep.data.remote.model

import com.google.gson.annotations.SerializedName

data class AddressResponse(
    @SerializedName("cep")
    val zipCode: String?,

    @SerializedName("bairro")
    val neighborhood: String?,

    @SerializedName("localidade")
    val city: String?,

    @SerializedName("logradouro")
    val street: String?,

    @SerializedName("uf")
    val uf: String?
)