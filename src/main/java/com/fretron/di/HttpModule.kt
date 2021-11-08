package com.fretron.di

import com.fretron.resources.VehicleResource
import dagger.Module
import dagger.Provides
import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import javax.ws.rs.core.UriBuilder

@Module
class HttpModule {

    @Provides
    fun provideRestApplicationBootstrap(
        vehicleResource:VehicleResource
    ): ResourceConfig {
        return ResourceConfig()
            .register(vehicleResource)
    }

    @Provides
    fun provideHttpServer(
        resourceConfig: ResourceConfig
    ):HttpServer{
        val host = "http://0.0.0.0"
        val port = 8080
        val uri = UriBuilder.fromUri(host).port(port).build()
        return GrizzlyHttpServerFactory.createHttpServer(uri,resourceConfig,false)
    }

}