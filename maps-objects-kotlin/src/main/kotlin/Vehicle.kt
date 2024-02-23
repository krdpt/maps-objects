package ru.krdpt

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.json.JSONObject

@Serializable
enum class VehicleType {
    @SerialName("trolley")
    TROLLEY,

    @SerialName("bus")
    BUS,

    @SerialName("ebus")
    EBUS,

    @SerialName("tram")
    TRAM,

    @SerialName("service")
    SERVICE,

    @SerialName("commercial")
    COMMERCIAL
}

@Serializable
class Vehicle {
    val id: String
    val type: VehicleType

    @SerialName("registration_number")
    val registrationNumber: String?
    val model: String?
    val route: String?
    @SerialName("route_id")
    val routeId: String?

    val lat: Double
    val lng: Double

    val speed: Double?
    val arrow: Double?

    val kttu: Boolean
    val long: Boolean
    val routeless: Boolean

    constructor(
        id: String,
        type: VehicleType,

        registrationNumber: String?,
        model: String?,
        route: String?,
        routeId: String?,

        lat: Double,
        lng: Double,

        speed: Double?,
        arrow: Double?,

        kttu: Boolean,
        long: Boolean,
        routeless: Boolean
    ) {
        this.id = id
        this.type = type
        this.registrationNumber = registrationNumber
        this.model = model
        this.route = route
        this.routeId = routeId
        this.lat = lat
        this.lng = lng
        this.speed = speed
        this.arrow = arrow
        this.kttu = kttu
        this.long = long
        this.routeless = routeless
    }

    constructor(data: JSONObject) {
        this.id = data.getString("id")
        this.type = VehicleType.valueOf(data.getString("type").uppercase())

        this.registrationNumber = if (data.has("registration_number"))
            data.getString("registration_number") else null
        this.model = if (data.has("model")) data.getString("model") else null
        this.route = if (data.has("route")) data.getString("route") else null
        this.routeId = if (data.has("route_id")) data.getString("route_id") else null

        this.lat = data.getDouble("lat")
        this.lng = data.getDouble("lng")
        this.speed = if (data.has("speed") && !data.isNull("speed"))
            data.getDouble("speed") else null
        this.arrow = if (data.has("arrow")) data.getDouble("arrow") else null

        this.kttu = data.getBoolean("kttu")
        this.long = data.getBoolean("long")
        this.routeless = data.getBoolean("routeless")
    }

    constructor(json: String): this(JSONObject(json))

    override fun toString(): String {
        return "Vehicle(id='$id', type='$type', registration_number=$registrationNumber, model=$model, route=$route, route_id=$routeId, lat=$lat, lng=$lng, speed=$speed, arrow=$arrow, kttu=$kttu, long=$long, routeless=$routeless)"
    }
}