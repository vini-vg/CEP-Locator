package com.example.via_cep.di

import com.example.via_cep.data.remote.repository.AddressRemoteRepositoryImpl
import com.example.via_cep.domain.remote.repository.AddressRemoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DomainModule {

    @Binds
    abstract fun bindsAddressRemoteRepositoryImpl(
        addressRemoteRepositoryImpl: AddressRemoteRepositoryImpl
    ): AddressRemoteRepository

}