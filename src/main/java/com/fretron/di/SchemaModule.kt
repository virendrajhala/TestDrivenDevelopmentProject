package com.fretron.di

import com.fasterxml.jackson.databind.DeserializationFeature
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SchemaModule {

    @Singleton
    @Provides
    fun provideObjectMapper2(): com.fasterxml.jackson.databind.ObjectMapper {
        val mapper = com.fasterxml.jackson.databind.ObjectMapper()
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        return mapper
    }
}