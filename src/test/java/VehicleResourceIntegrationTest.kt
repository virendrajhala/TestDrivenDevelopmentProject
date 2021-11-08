import com.fretron.resources.VehicleResource
import org.glassfish.jersey.server.ResourceConfig
import org.glassfish.jersey.test.JerseyTest
import org.junit.Assert.assertEquals
import org.junit.Test
import javax.ws.rs.client.Entity
import javax.ws.rs.core.Application
import javax.ws.rs.core.HttpHeaders
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

class VehicleResourceIntegrationTest : JerseyTest() {

    override fun configure():Application{

        return ResourceConfig(VehicleResource::class.java)
    }

    @Test
    fun getVehicles_whenCorrectRequest_thenResponseIsOkAndContentIsVehicles(){
        val vehicleJsonList = """{
            | "uuid": "1001",
        |"driverName": "John Wick",
        |"bodyType": "Mini",
        |"chassisType": "A",
        |"registrationNumber": "599910",
        |"carryingCapacity": 20
            |},
            |{
            |"uuid": "1002",
        |"driverName": "John Carter",
        |"bodyType": "Heavy",
        |"chassisType": "F",
        |"registrationNumber": "599905",
        |"carryingCapacity": 100
            |}""".trimMargin()
        val response = target("/vehicle/vehicles").request().get()

        // check for status code
        assertEquals("Response Status Code should be 200 ", Response.Status.OK.statusCode,response.status)

        // check for content type
        assertEquals("Content type should be Application_JSON",MediaType.APPLICATION_JSON,response.getHeaderString(HttpHeaders.CONTENT_TYPE))

        // check for content match
        assertEquals("Content should be Vehicles list",vehicleJsonList,response.readEntity(String::class.java))


    }

    @Test
    fun addVehicle_whenCorrectRequest_thenResponseIsOkAndContentIsVehicleObject(){
        val vehicleJson = """{
            | "uuid": "1001",
        |"driverName": "John Wick",
        |"bodyType": "Mini",
        |"chassisType": "A",
        |"registrationNumber": "599910",
        |"carryingCapacity": 20
            |}""".trimMargin()
        val response = target("/vehicle/add").request().put(Entity.entity(vehicleJson,MediaType.APPLICATION_JSON))

        // check for status code
        assertEquals("Response Status Code should be 200 ", Response.Status.OK.statusCode,response.status)

        // check for content type
        assertEquals("Content type should be Application_JSON",MediaType.APPLICATION_JSON,response.getHeaderString(HttpHeaders.CONTENT_TYPE))

        // check for content match
        assertEquals("Content should be Vehicle object",vehicleJson,response.readEntity(String::class.java))


    }
}