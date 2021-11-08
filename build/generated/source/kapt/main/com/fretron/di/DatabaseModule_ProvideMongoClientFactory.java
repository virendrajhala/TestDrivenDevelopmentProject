package com.fretron.di;

import com.mongodb.MongoClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DatabaseModule_ProvideMongoClientFactory implements Factory<MongoClient> {
  private final DatabaseModule module;

  public DatabaseModule_ProvideMongoClientFactory(DatabaseModule module) {
    this.module = module;
  }

  @Override
  public MongoClient get() {
    return provideInstance(module);
  }

  public static MongoClient provideInstance(DatabaseModule module) {
    return proxyProvideMongoClient(module);
  }

  public static DatabaseModule_ProvideMongoClientFactory create(DatabaseModule module) {
    return new DatabaseModule_ProvideMongoClientFactory(module);
  }

  public static MongoClient proxyProvideMongoClient(DatabaseModule instance) {
    return Preconditions.checkNotNull(
        instance.provideMongoClient(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
