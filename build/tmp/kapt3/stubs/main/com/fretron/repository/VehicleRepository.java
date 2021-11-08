package com.fretron.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/fretron/repository/VehicleRepository;", "", "mongoClient", "Lcom/mongodb/MongoClient;", "mongoDatabase", "Lcom/mongodb/client/MongoDatabase;", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lcom/mongodb/MongoClient;Lcom/mongodb/client/MongoDatabase;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "addVehicle", "Lcom/fretron/Model/Vehicle;", "vehicle", "getVehicles", "", "JunitTestProject"})
public final class VehicleRepository {
    private final com.mongodb.MongoClient mongoClient = null;
    private final com.mongodb.client.MongoDatabase mongoDatabase = null;
    private final com.fasterxml.jackson.databind.ObjectMapper mapper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fretron.Model.Vehicle> getVehicles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fretron.Model.Vehicle addVehicle(@org.jetbrains.annotations.NotNull()
    com.fretron.Model.Vehicle vehicle) {
        return null;
    }
    
    @javax.inject.Inject()
    public VehicleRepository(@org.jetbrains.annotations.NotNull()
    com.mongodb.MongoClient mongoClient, @org.jetbrains.annotations.NotNull()
    com.mongodb.client.MongoDatabase mongoDatabase, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper mapper) {
        super();
    }
}