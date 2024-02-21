package ru.krdpt

import org.json.JSONObject

class Departure {
    val route: String
    val times: List<String>
    val type: VehicleType
    val routeId: String

    constructor(
        route: String,
        times: List<String>,
        type: VehicleType,
        routeId: String
    ) {
        this.route = route
        this.times = times
        this.type = type
        this.routeId = routeId
    }

    constructor(data: JSONObject): this(
        data.getString("route"),
        data.getJSONArray("times").toList() as List<String>,
        VehicleType.valueOf(data.getString("type").uppercase()),
        data.getString("routeId")
    )

    constructor(json: String): this(JSONObject(json))

}