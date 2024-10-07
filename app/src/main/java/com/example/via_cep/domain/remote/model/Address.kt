package com.example.via_cep.domain.remote.model


data class Address(
    val zipCode: String? = null,
    val neighborhood: String? = null,
    val city: String? = null,
    val street: String? = null,
    val uf: String? = null,

)