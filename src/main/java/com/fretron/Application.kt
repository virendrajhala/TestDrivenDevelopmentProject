package com.fretron

import com.fretron.di.DaggerAppComponent


fun main(){

    val appComponent = DaggerAppComponent.builder().build()
    val httpServer = appComponent.server()
    httpServer.start()
}