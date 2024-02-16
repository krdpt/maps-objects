package ru.krdpt

import org.json.JSONObject

enum class VehicleType {
    TROLLEY, BUS, EBUS, TRAM, SERVICE, COMMERCIAL
}

class Vehicle {
    val id: String
    val type: VehicleType

    val registration_number: String?
    val model: String?
    val route: String?
    val route_id: String?

    val lat: Float
    val lng: Float

    val speed: Double?
    val arrow: Double?

    val kttu: Boolean
    val long: Boolean
    val routeless: Boolean

    constructor(data: JSONObject) {
        this.id = data.getString("id")
        this.type = VehicleType.valueOf(data.getString("type").uppercase())

        this.registration_number = if (data.has("registration_number"))
            data.getString("registration_number") else null
        this.model = if (data.has("model")) data.getString("model") else null
        this.route = if (data.has("route")) data.getString("route") else null
        this.route_id = if (data.has("route_id")) data.getString("route_id") else null

        this.lat = data.getFloat("lat")
        this.lng = data.getFloat("lng")
        this.speed = if (data.has("speed")) data.getDouble("speed") else null
        this.arrow = if (data.has("arrow")) data.getDouble("arrow") else null

        this.kttu = data.getBoolean("kttu")
        this.long = data.getBoolean("long")
        this.routeless = data.getBoolean("routeless")
    }

    override fun toString(): String {
        return "Vehicle(id='$id', type='$type', registration_number=$registration_number, model=$model, route=$route, route_id=$route_id, lat=$lat, lng=$lng, speed=$speed, arrow=$arrow, kttu=$kttu, long=$long, routeless=$routeless)"
    }
}