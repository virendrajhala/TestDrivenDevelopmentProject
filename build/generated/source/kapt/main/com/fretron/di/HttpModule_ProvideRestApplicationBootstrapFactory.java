package com.fretron.di;

import com.fretron.resources.VehicleResource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.glassfish.jersey.server.ResourceConfig;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HttpModule_ProvideRestApplicationBootstrapFactory
    implements Factory<ResourceConfig> {
  private final HttpModule module;

  private final Provider<VehicleResource> vehicleResourceProvider;

  public HttpModule_ProvideRestApplicationBootstrapFactory(
      HttpModule module, Provider<VehicleResource> vehicleResourceProvider) {
    this.module = module;
    this.vehicleResourceProvider = vehicleResourceProvider;
  }

  @Override
  public ResourceConfig get() {
    return provideInstance(module, vehicleResourceProvider);
  }

  public static ResourceConfig provideInstance(
      HttpModule module, Provider<VehicleResource> vehicleResourceProvider) {
    return proxyProvideRestApplicationBootstrap(module, vehicleResourceProvider.get());
  }

  public static HttpModule_ProvideRestApplicationBootstrapFactory create(
      HttpModule module, Provider<VehicleResource> vehicleResourceProvider) {
    return new HttpModule_ProvideRestApplicationBootstrapFactory(module, vehicleResourceProvider);
  }

  public static ResourceConfig proxyProvideRestApplicationBootstrap(
      HttpModule instance, VehicleResource vehicleResource) {
    return Preconditions.checkNotNull(
        instance.provideRestApplicationBootstrap(vehicleResource),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
