package com.fretron.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/fretron/services/VehicleService;", "", "vehicleRepository", "Lcom/fretron/repository/VehicleRepository;", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lcom/fretron/repository/VehicleRepository;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "addVehicle", "Lcom/fretron/Model/Vehicle;", "json", "", "getVehicles", "", "Companion", "JunitTestProject"})
public final class VehicleService {
    private final com.fretron.repository.VehicleRepository vehicleRepository = null;
    private final com.fasterxml.jackson.databind.ObjectMapper mapper = null;
    private static int count;
    public static final com.fretron.services.VehicleService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fretron.Model.Vehicle> getVehicles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fretron.Model.Vehicle addVehicle(@org.jetbrains.annotations.NotNull()
    java.lang.String json) {
        return null;
    }
    
    @javax.inject.Inject()
    public VehicleService(@org.jetbrains.annotations.NotNull()
    com.fretron.repository.VehicleRepository vehicleRepository, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper mapper) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/fretron/services/VehicleService$Companion;", "", "()V", "count", "", "getCount", "()I", "setCount", "(I)V", "JunitTestProject"})
    public static final class Companion {
        
        public final int getCount() {
            return 0;
        }
        
        public final void setCount(int p0) {
        }
        
        private Companion() {
            super();
        }
    }
}