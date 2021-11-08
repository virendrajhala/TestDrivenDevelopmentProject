package com.fretron.resources;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/fretron/resources/VehicleResource;", "", "vehicleService", "Lcom/fretron/services/VehicleService;", "(Lcom/fretron/services/VehicleService;)V", "addVehicles", "", "request", "getVehicles", "JunitTestProject"})
@javax.ws.rs.Path(value = "/vehicle")
public final class VehicleResource {
    private final com.fretron.services.VehicleService vehicleService = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Produces(value = {"application/json"})
    @javax.ws.rs.Path(value = "/vehicles")
    @javax.ws.rs.GET()
    public final java.lang.String getVehicles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Consumes(value = {"application/json"})
    @javax.ws.rs.Produces(value = {"application/json"})
    @javax.ws.rs.Path(value = "/add")
    @javax.ws.rs.POST()
    public final java.lang.String addVehicles(@org.jetbrains.annotations.NotNull()
    java.lang.String request) {
        return null;
    }
    
    @javax.inject.Inject()
    public VehicleResource(@org.jetbrains.annotations.NotNull()
    com.fretron.services.VehicleService vehicleService) {
        super();
    }
}