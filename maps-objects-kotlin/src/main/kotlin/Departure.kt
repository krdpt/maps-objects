package ru.krdpt

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import org.json.JSONObject

enum class Direction {
    @SerializedName("forward") @SerialName("forward") FORWARD,
    @SerializedName("backward") @SerialName("backward") BACKWARD
}

class Departure(
    val route: String,
    val times: List<String>,
    val type: VehicleType,
    val routeId: String,
    val destination: String,
    val direction: Direction,
) {

    constructor(
        route: String,
        times: List<String>,
        type: String,
        routeId: String,
        destination: String,
        direction: String
    ) : this (
        route, times, VehicleType.valueOf(type.uppercase()),
        routeId, destination, Direction.valueOf(direction.uppercase())
    )

    constructor(data: JSONObject): this(
        data.getString("route"),
        data.getJSONArray("times").toList() as List<String>,
        data.getString("type"),
        data.getString("routeId"),
        data.getString("destination"),
        data.getString("direction"),
    )

    constructor(json: String): this(JSONObject(json))

    override fun toString(): String {
        return "Departure(route='$route', times=$times, type=$type, routeId='$routeId', destination='$destination', direction=$direction)"
    }
}