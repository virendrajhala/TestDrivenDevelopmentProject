package com.fretron.di;

import com.fasterxml.jackson.databind.ObjectMapper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SchemaModule_ProvideObjectMapper2Factory implements Factory<ObjectMapper> {
  private final SchemaModule module;

  public SchemaModule_ProvideObjectMapper2Factory(SchemaModule module) {
    this.module = module;
  }

  @Override
  public ObjectMapper get() {
    return provideInstance(module);
  }

  public static ObjectMapper provideInstance(SchemaModule module) {
    return proxyProvideObjectMapper2(module);
  }

  public static SchemaModule_ProvideObjectMapper2Factory create(SchemaModule module) {
    return new SchemaModule_ProvideObjectMapper2Factory(module);
  }

  public static ObjectMapper proxyProvideObjectMapper2(SchemaModule instance) {
    return Preconditions.checkNotNull(
        instance.provideObjectMapper2(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
