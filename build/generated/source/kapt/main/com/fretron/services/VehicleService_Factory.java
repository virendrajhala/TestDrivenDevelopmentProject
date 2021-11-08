package com.fretron.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fretron.repository.VehicleRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehicleService_Factory implements Factory<VehicleService> {
  private final Provider<VehicleRepository> vehicleRepositoryProvider;

  private final Provider<ObjectMapper> mapperProvider;

  public VehicleService_Factory(
      Provider<VehicleRepository> vehicleRepositoryProvider,
      Provider<ObjectMapper> mapperProvider) {
    this.vehicleRepositoryProvider = vehicleRepositoryProvider;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public VehicleService get() {
    return provideInstance(vehicleRepositoryProvider, mapperProvider);
  }

  public static VehicleService provideInstance(
      Provider<VehicleRepository> vehicleRepositoryProvider,
      Provider<ObjectMapper> mapperProvider) {
    return new VehicleService(vehicleRepositoryProvider.get(), mapperProvider.get());
  }

  public static VehicleService_Factory create(
      Provider<VehicleRepository> vehicleRepositoryProvider,
      Provider<ObjectMapper> mapperProvider) {
    return new VehicleService_Factory(vehicleRepositoryProvider, mapperProvider);
  }

  public static VehicleService newVehicleService(
      VehicleRepository vehicleRepository, ObjectMapper mapper) {
    return new VehicleService(vehicleRepository, mapper);
  }
}
