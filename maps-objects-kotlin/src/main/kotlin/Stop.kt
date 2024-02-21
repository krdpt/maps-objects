package ru.krdpt

import org.json.JSONObject

class Stop {
    val id: String
    val index: Int

    val name: String
    val description: String

    val lat: Float
    val lon: Float

    val routes: List<String>?
    val transport: VehicleType

    val kttu: String?
    val trolley: String?
    val tram: String?

    constructor(
        id: String,
        index: Int,
        name: String,
        description: String,
        lat: Float,
        lon: Float,
        routes: List<String>?,
        transport: VehicleType,
        kttu: String?,
        trolley: String?,
        tram: String?
    ) {
        this.id = id
        this.description = description
        this.index = index
        this.kttu = kttu
        this.lat = lat
        this.lon = lon
        this.name = name
        this.transport = transport
        this.trolley = trolley
        this.tram = tram
        this.routes = routes
    }

    constructor(data: JSONObject) {
        this.id = data.getString("id")
        this.description = data.getString("description")
        this.index = data.getInt("index")
        this.kttu = if (data.has("kttu")) data.getString("kttu") else null
        this.lat = data.getFloat("lat")
        this.lon = data.getFloat("lon")
        this.name = data.getString("name")
        this.transport = VehicleType.valueOf(data.getString("transport").uppercase())
        this.trolley = if (data.has("trolley")) data.getString("trolley") else null
        this.tram = if (data.has("tram")) data.getString("tram") else null
        this.routes = if (data.has("routes")) data.getJSONArray("routes").toList() as List<String> else null
    }

    constructor(json: String): this(JSONObject(json))

    override fun toString(): String {
        return "Stop(id='$id', index=$index, name='$name', description='$description', lat=$lat, lon=$lon, routes=$routes, transport='$transport', kttu=$kttu, trolley=$trolley, tram=$tram)"
    }
}