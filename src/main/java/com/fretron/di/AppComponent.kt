package com.fretron.di

import dagger.Component
import org.glassfish.grizzly.http.server.HttpServer
import javax.inject.Singleton

@Singleton
@Component (
    modules =
    (
            [
                HttpModule::class,
                DatabaseModule::class,
                SchemaModule::class
            ]
            )
        )
interface AppComponent {

    fun server() : HttpServer
}