package ru.krdpt

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.json.JSONObject

@Serializable
class VehicleInfo (
    val num: String?,
    val model: String?,
    val years: Double?,

    @SerializedName("factory_id")
    @SerialName("factory_id")
    val factoryId: Int?,

    @SerializedName("built_in")
    @SerialName("built_in")
    val builtIn: String?,

    @SerializedName("exploitation_since")
    @SerialName("exploitation_since")
    val exploitationSince: String?,

    @SerializedName("registration_number")
    @SerialName("registration_number")
    val registrationNumber: String?,

    @SerializedName("more_url")
    @SerialName("more_url")
    val moreUrl: String?,

    @SerializedName("image_url")
    @SerialName("image_url")
    val imageUrl: String?,

    @SerializedName("small_image_url")
    @SerialName("small_image_url")
    val smallImageUrl: String?,

    val depot: String?,
    val comment: String?,

    val tags: List<String>?,
    val raw: List<String>?
) {

    constructor(data: JSONObject) : this(
        if (data.has("num")) data.getString("num") else null,
        if (data.has("model")) data.getString("model") else null,
        if (data.has("years")) data.getDouble("years") else null,

        if (data.has("factoryId")) data.getInt("factoryId") else null,
        if (data.has("built_in")) data.getString("built_in") else null,
        if (data.has("exploitation_since")) data.getString("exploitation_since") else null,
        if (data.has("registration_number")) data.getString("registration_number") else null,

        if (data.has("more_url")) data.getString("more_url") else null,
        if (data.has("image_url")) data.getString("image_url") else null,
        if (data.has("small_image_url")) data.getString("small_image_url") else null,

        if (data.has("depot")) data.getString("depot") else null,
        if (data.has("comment")) data.getString("comment") else null,

        if (data.has("tags")) data.getJSONArray("tags").toList() as List<String> else null,
        if (data.has("raw")) data.getJSONArray("raw").toList() as List<String> else null,
    )

    constructor(json: String): this(JSONObject(json))

    override fun toString(): String {
        return "VehicleInfo(num=$num, model=$model, years=$years, factoryId=$factoryId, builtIn=$builtIn, exploitationSince=$exploitationSince, registrationNumber=$registrationNumber, moreUrl=$moreUrl, imageUrl=$imageUrl, smallImageUrl=$smallImageUrl, depot=$depot, comment=$comment, tags=$tags, raw=$raw)"
    }
}