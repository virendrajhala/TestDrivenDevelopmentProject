package com.fretron.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/fretron/di/DatabaseModule;", "", "()V", "provideDatabase", "Lcom/mongodb/client/MongoDatabase;", "mongoClient", "Lcom/mongodb/MongoClient;", "provideMongoClient", "JunitTestProject"})
@dagger.Module()
public final class DatabaseModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.mongodb.MongoClient provideMongoClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.mongodb.client.MongoDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    com.mongodb.MongoClient mongoClient) {
        return null;
    }
    
    public DatabaseModule() {
        super();
    }
}