package com.example.via_cep.di

import com.example.via_cep.data.remote.api.AddressApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    fun providesAddressApi(
        retrofit: Retrofit
    ): AddressApi {
        return retrofit.create(AddressApi::class.java)
    }

}