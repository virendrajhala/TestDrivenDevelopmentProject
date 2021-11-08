package com.fretron.services

import com.fasterxml.jackson.databind.ObjectMapper
import com.fretron.Model.Vehicle
import com.fretron.repository.VehicleRepository
import org.json.JSONObject
import javax.inject.Inject
import kotlin.Exception

class VehicleService @Inject constructor(
    private val vehicleRepository: VehicleRepository,
    private val mapper:ObjectMapper
){

    companion object {
        var count = 1001
    }
    fun getVehicles() : List<Vehicle>{

        try {
            return vehicleRepository.getVehicles()
        }

        catch (e:Exception){
            println("${e.localizedMessage}")
            throw e
        }
    }

    fun addVehicle(json:String):Vehicle{


        try {
            val jsonObject = JSONObject(json)
            if(jsonObject.isNull("uuid")) {
                jsonObject.put("uuid", count)
                count++
            }
            val vehicle = mapper.readValue(jsonObject.toString(),Vehicle::class.java)
            if (vehicle.getRegistrationNumber().isNullOrBlank() || vehicle.getChassisType().isNullOrBlank()) {
                throw Exception("Vehicle's registration number or the chassis type is not provided, please check")
            }

            return vehicleRepository.addVehicle(vehicle)
        }

        catch (e:Exception){
            e.printStackTrace()
            throw Exception("Error adding/updating the vehicle in the database - ${e.localizedMessage}")
        }

    }
}