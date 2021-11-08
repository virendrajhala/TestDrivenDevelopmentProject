package com.fretron.resources

import com.fretron.services.VehicleService
import javax.inject.Inject
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/vehicle")
class VehicleResource @Inject constructor(
    private val vehicleService: VehicleService
)
{
    @GET
    @Path("/vehicles")
    @Produces(MediaType.APPLICATION_JSON)
    fun getVehicles():String{

        return try {
            val vehicleList = vehicleService.getVehicles()
            return vehicleList.toString()
        } catch(e:Exception){
            return Response.serverError().entity(e.message).toString()
        }
    }

    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun addVehicles(
        request : String
    ):String{

        return try {
            val addedVehicle = vehicleService.addVehicle(request)
            return addedVehicle.toString()
        } catch(e:Exception){
            return Response.serverError().entity(e.message).toString()
        }
    }

}