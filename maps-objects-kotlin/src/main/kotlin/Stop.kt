package ru.krdpt

import org.json.JSONObject

class Stop {
    val id: String
    val index: Int

    val name: String
    val description: String

    val lat: Float
    val lon: Float

    val routes: List<String>
    val transport: String

    val kttu: String?
    val trolley: String?
    val tram: String?

    constructor(data: JSONObject) {
        this.id = data.getString("id")
        this.description = data.getString("description")
        this.index = data.getInt("index")
        this.kttu = if (data.has("kttu")) data.getString("kttu") else null
        this.lat = data.getFloat("lat")
        this.lon = data.getFloat("lon")
        this.name = data.getString("name")
        this.transport = data.getString("transport")
        this.trolley = if (data.has("trolley")) data.getString("trolley") else null
        this.tram = if (data.has("tram")) data.getString("tram") else null
        this.routes = data.getJSONArray("routes").toList() as List<String>
    }

    override fun toString(): String {
        return "Stop(id='$id', index=$index, name='$name', description='$description', lat=$lat, lon=$lon, routes=$routes, transport='$transport', kttu=$kttu, trolley=$trolley, tram=$tram)"
    }
}