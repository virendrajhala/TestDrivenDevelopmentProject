package com.fretron.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/fretron/di/HttpModule;", "", "()V", "provideHttpServer", "Lorg/glassfish/grizzly/http/server/HttpServer;", "resourceConfig", "Lorg/glassfish/jersey/server/ResourceConfig;", "provideRestApplicationBootstrap", "vehicleResource", "Lcom/fretron/resources/VehicleResource;", "JunitTestProject"})
@dagger.Module()
public final class HttpModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final org.glassfish.jersey.server.ResourceConfig provideRestApplicationBootstrap(@org.jetbrains.annotations.NotNull()
    com.fretron.resources.VehicleResource vehicleResource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final org.glassfish.grizzly.http.server.HttpServer provideHttpServer(@org.jetbrains.annotations.NotNull()
    org.glassfish.jersey.server.ResourceConfig resourceConfig) {
        return null;
    }
    
    public HttpModule() {
        super();
    }
}