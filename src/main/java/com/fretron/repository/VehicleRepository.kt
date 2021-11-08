package com.fretron.repository

import com.fasterxml.jackson.databind.ObjectMapper
import com.fretron.Model.Vehicle
import com.mongodb.BasicDBObject
import com.mongodb.MongoClient
import com.mongodb.client.MongoDatabase
import com.mongodb.client.model.Filters
import com.mongodb.client.model.FindOneAndUpdateOptions
import com.mongodb.client.model.ReturnDocument
import com.mongodb.util.JSON
import org.bson.Document
import javax.inject.Inject

class VehicleRepository @Inject constructor(
    private val mongoClient : MongoClient,
    private val mongoDatabase : MongoDatabase,
    private val mapper: ObjectMapper
) {
    fun getVehicles():List<Vehicle>{

        try {
            val databaseName = mongoDatabase.name
            val database = mongoClient.getDatabase(databaseName)
            val vehicleCollection = database.getCollection("vehicles")
            val cursor = vehicleCollection.find().iterator()
            val vehicleList = mutableListOf<Vehicle>()
            while (cursor.hasNext()) {
                val doc = cursor.next()
                doc.remove("_id")
                val serialized = JSON.serialize(doc)
                val vehicle = mapper.readValue(serialized, Vehicle::class.java)
                vehicleList.add(vehicle)
            }
            return vehicleList
        }
        catch (e:Exception){
            println("error occurred while fetching vehicles list from database ${e.localizedMessage}")
            throw e
        }
    }

    fun addVehicle(vehicle:Vehicle):Vehicle{

        try {
            val databaseName = mongoDatabase.name
            val database = mongoClient.getDatabase(databaseName)
            val vehicleCollection = database.getCollection("vehicles")
            val doc = Document.parse(vehicle.toString())
            doc["_id"] = vehicle.getUuid()
            val filter = Filters.eq("_id",vehicle.getUuid())
            val updatedDoc = vehicleCollection.findOneAndUpdate(filter,BasicDBObject("\$set",doc), FindOneAndUpdateOptions()
                                       .returnDocument(ReturnDocument.AFTER).upsert(true))

            if(updatedDoc != null){
                updatedDoc.remove("_id")
                val serialized = JSON.serialize(updatedDoc)
                return mapper.readValue(serialized,Vehicle::class.java)
            }
            else {
                throw Exception("Ack not received while updating notification event: ${vehicle.getUuid()}")
            }
        } catch (e: Exception) {
            e.printStackTrace()
            throw Exception(" ${vehicle.getUuid()}: ${e.localizedMessage}")
        }
    }

}