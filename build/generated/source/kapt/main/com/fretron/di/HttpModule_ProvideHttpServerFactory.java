package com.fretron.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.server.ResourceConfig;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HttpModule_ProvideHttpServerFactory implements Factory<HttpServer> {
  private final HttpModule module;

  private final Provider<ResourceConfig> resourceConfigProvider;

  public HttpModule_ProvideHttpServerFactory(
      HttpModule module, Provider<ResourceConfig> resourceConfigProvider) {
    this.module = module;
    this.resourceConfigProvider = resourceConfigProvider;
  }

  @Override
  public HttpServer get() {
    return provideInstance(module, resourceConfigProvider);
  }

  public static HttpServer provideInstance(
      HttpModule module, Provider<ResourceConfig> resourceConfigProvider) {
    return proxyProvideHttpServer(module, resourceConfigProvider.get());
  }

  public static HttpModule_ProvideHttpServerFactory create(
      HttpModule module, Provider<ResourceConfig> resourceConfigProvider) {
    return new HttpModule_ProvideHttpServerFactory(module, resourceConfigProvider);
  }

  public static HttpServer proxyProvideHttpServer(
      HttpModule instance, ResourceConfig resourceConfig) {
    return Preconditions.checkNotNull(
        instance.provideHttpServer(resourceConfig),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
