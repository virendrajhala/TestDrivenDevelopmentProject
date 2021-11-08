package com.fretron.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehicleRepository_Factory implements Factory<VehicleRepository> {
  private final Provider<MongoClient> mongoClientProvider;

  private final Provider<MongoDatabase> mongoDatabaseProvider;

  private final Provider<ObjectMapper> mapperProvider;

  public VehicleRepository_Factory(
      Provider<MongoClient> mongoClientProvider,
      Provider<MongoDatabase> mongoDatabaseProvider,
      Provider<ObjectMapper> mapperProvider) {
    this.mongoClientProvider = mongoClientProvider;
    this.mongoDatabaseProvider = mongoDatabaseProvider;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public VehicleRepository get() {
    return provideInstance(mongoClientProvider, mongoDatabaseProvider, mapperProvider);
  }

  public static VehicleRepository provideInstance(
      Provider<MongoClient> mongoClientProvider,
      Provider<MongoDatabase> mongoDatabaseProvider,
      Provider<ObjectMapper> mapperProvider) {
    return new VehicleRepository(
        mongoClientProvider.get(), mongoDatabaseProvider.get(), mapperProvider.get());
  }

  public static VehicleRepository_Factory create(
      Provider<MongoClient> mongoClientProvider,
      Provider<MongoDatabase> mongoDatabaseProvider,
      Provider<ObjectMapper> mapperProvider) {
    return new VehicleRepository_Factory(
        mongoClientProvider, mongoDatabaseProvider, mapperProvider);
  }

  public static VehicleRepository newVehicleRepository(
      MongoClient mongoClient, MongoDatabase mongoDatabase, ObjectMapper mapper) {
    return new VehicleRepository(mongoClient, mongoDatabase, mapper);
  }
}
