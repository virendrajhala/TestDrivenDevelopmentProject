package com.fretron.di;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fretron.repository.VehicleRepository;
import com.fretron.resources.VehicleResource;
import com.fretron.services.VehicleService;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.server.ResourceConfig;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private HttpModule httpModule;

  private DatabaseModule databaseModule;

  private Provider<MongoClient> provideMongoClientProvider;

  private Provider<ObjectMapper> provideObjectMapper2Provider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  private MongoDatabase getMongoDatabase() {
    return DatabaseModule_ProvideDatabaseFactory.proxyProvideDatabase(
        databaseModule, provideMongoClientProvider.get());
  }

  private VehicleRepository getVehicleRepository() {
    return new VehicleRepository(
        provideMongoClientProvider.get(), getMongoDatabase(), provideObjectMapper2Provider.get());
  }

  private VehicleService getVehicleService() {
    return new VehicleService(getVehicleRepository(), provideObjectMapper2Provider.get());
  }

  private VehicleResource getVehicleResource() {
    return new VehicleResource(getVehicleService());
  }

  private ResourceConfig getResourceConfig() {
    return HttpModule_ProvideRestApplicationBootstrapFactory.proxyProvideRestApplicationBootstrap(
        httpModule, getVehicleResource());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.httpModule = builder.httpModule;
    this.provideMongoClientProvider =
        DoubleCheck.provider(
            DatabaseModule_ProvideMongoClientFactory.create(builder.databaseModule));
    this.databaseModule = builder.databaseModule;
    this.provideObjectMapper2Provider =
        DoubleCheck.provider(SchemaModule_ProvideObjectMapper2Factory.create(builder.schemaModule));
  }

  @Override
  public HttpServer server() {
    return HttpModule_ProvideHttpServerFactory.proxyProvideHttpServer(
        httpModule, getResourceConfig());
  }

  public static final class Builder {
    private DatabaseModule databaseModule;

    private SchemaModule schemaModule;

    private HttpModule httpModule;

    private Builder() {}

    public AppComponent build() {
      if (databaseModule == null) {
        this.databaseModule = new DatabaseModule();
      }
      if (schemaModule == null) {
        this.schemaModule = new SchemaModule();
      }
      if (httpModule == null) {
        this.httpModule = new HttpModule();
      }
      return new DaggerAppComponent(this);
    }

    public Builder httpModule(HttpModule httpModule) {
      this.httpModule = Preconditions.checkNotNull(httpModule);
      return this;
    }

    public Builder databaseModule(DatabaseModule databaseModule) {
      this.databaseModule = Preconditions.checkNotNull(databaseModule);
      return this;
    }

    public Builder schemaModule(SchemaModule schemaModule) {
      this.schemaModule = Preconditions.checkNotNull(schemaModule);
      return this;
    }
  }
}
