package com.fretron.di

import com.mongodb.MongoClient
import com.mongodb.client.MongoDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideMongoClient(

    ): MongoClient {
        val host = "localhost"
        val port = 27017
        return MongoClient(host,port)
    }


    @Provides
    fun provideDatabase(
        mongoClient: MongoClient
    ): MongoDatabase {
        val databaseName = "vehiclesDatabase"
        return mongoClient.getDatabase(databaseName)
    }

}