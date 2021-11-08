package com.fretron.resources;

import com.fretron.services.VehicleService;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehicleResource_Factory implements Factory<VehicleResource> {
  private final Provider<VehicleService> vehicleServiceProvider;

  public VehicleResource_Factory(Provider<VehicleService> vehicleServiceProvider) {
    this.vehicleServiceProvider = vehicleServiceProvider;
  }

  @Override
  public VehicleResource get() {
    return provideInstance(vehicleServiceProvider);
  }

  public static VehicleResource provideInstance(Provider<VehicleService> vehicleServiceProvider) {
    return new VehicleResource(vehicleServiceProvider.get());
  }

  public static VehicleResource_Factory create(Provider<VehicleService> vehicleServiceProvider) {
    return new VehicleResource_Factory(vehicleServiceProvider);
  }

  public static VehicleResource newVehicleResource(VehicleService vehicleService) {
    return new VehicleResource(vehicleService);
  }
}
