package com.fretron.di;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DatabaseModule_ProvideDatabaseFactory implements Factory<MongoDatabase> {
  private final DatabaseModule module;

  private final Provider<MongoClient> mongoClientProvider;

  public DatabaseModule_ProvideDatabaseFactory(
      DatabaseModule module, Provider<MongoClient> mongoClientProvider) {
    this.module = module;
    this.mongoClientProvider = mongoClientProvider;
  }

  @Override
  public MongoDatabase get() {
    return provideInstance(module, mongoClientProvider);
  }

  public static MongoDatabase provideInstance(
      DatabaseModule module, Provider<MongoClient> mongoClientProvider) {
    return proxyProvideDatabase(module, mongoClientProvider.get());
  }

  public static DatabaseModule_ProvideDatabaseFactory create(
      DatabaseModule module, Provider<MongoClient> mongoClientProvider) {
    return new DatabaseModule_ProvideDatabaseFactory(module, mongoClientProvider);
  }

  public static MongoDatabase proxyProvideDatabase(
      DatabaseModule instance, MongoClient mongoClient) {
    return Preconditions.checkNotNull(
        instance.provideDatabase(mongoClient),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
