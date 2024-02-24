package ru.krdpt

import org.json.JSONObject

class Departure(
    val route: String,
    val times: List<String>,
    val type: VehicleType,
    val routeId: String
) {

    constructor(
        route: String,
        times: List<String>,
        type: String,
        routeId: String
    ) : this (
        route, times, VehicleType.valueOf(type.uppercase()), routeId
    )

    constructor(data: JSONObject): this(
        data.getString("route"),
        data.getJSONArray("times").toList() as List<String>,
        data.getString("type"),
        data.getString("routeId")
    )

    constructor(json: String): this(JSONObject(json))

    override fun toString(): String {
        return "Departure(route='$route', times=$times, type=$type, routeId='$routeId')"
    }
}