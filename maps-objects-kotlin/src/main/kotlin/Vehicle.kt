package ru.krdpt

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.json.JSONObject
import com.google.gson.annotations.SerializedName

@Serializable
enum class VehicleType {
    @SerializedName("trolley") @SerialName("trolley") TROLLEY,
    @SerializedName("bus") @SerialName("bus") BUS,
    @SerializedName("ebus") @SerialName("ebus") EBUS,
    @SerializedName("tram") @SerialName("tram") TRAM,
    @SerializedName("service") @SerialName("service") SERVICE,
    @SerializedName("commercial") @SerialName("commercial") COMMERCIAL
}

@Serializable
class Vehicle (
    val id: String,
    val type: VehicleType,

    @SerializedName("registration_number")
    @SerialName("registration_number")
    val registrationNumber: String?,
    val model: String?,
    val route: String?,

    @SerializedName("route_id")
    @SerialName("route_id")
    val routeId: String?,

    val lat: Double,
    val lng: Double,

    val speed: Double?,
    val arrow: Double?,

    val kttu: Boolean,
    val long: Boolean,
    val routeless: Boolean
) {

    constructor(data: JSONObject) : this(
        data.getString("id"),
        VehicleType.valueOf(data.getString("type").uppercase()),

        if (data.has("registration_number"))
            data.getString("registration_number") else null,
        if (data.has("model")) data.getString("model") else null,
        if (data.has("route")) data.getString("route") else null,
        if (data.has("route_id")) data.getString("route_id") else null,

        data.getDouble("lat"),
        data.getDouble("lng"),
        if (data.has("speed") && !data.isNull("speed"))
            data.getDouble("speed") else null,
        if (data.has("arrow")) data.getDouble("arrow") else null,

        data.getBoolean("kttu"),
        data.getBoolean("long"),
        data.getBoolean("routeless")
    )

    constructor(json: String): this(JSONObject(json))

    override fun toString(): String {
        return "Vehicle(id='$id', type='$type', registration_number=$registrationNumber, model=$model, route=$route, route_id=$routeId, lat=$lat, lng=$lng, speed=$speed, arrow=$arrow, kttu=$kttu, long=$long, routeless=$routeless)"
    }
}