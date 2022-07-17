package com.plcoding.dictionary.feature_dictionary.data.local

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverters
import com.google.gson.reflect.TypeToken
import com.plcoding.dictionary.feature_dictionary.data.util.JsonParser
import com.plcoding.dictionary.feature_dictionary.domain.model.Meaning

@ProvidedTypeConverter
class Converters(
    private val jsonParser: JsonParser
) {
    @TypeConverters
    fun fromMeaningsJson(json: String): List<Meaning> {
        return jsonParser.fromJson<ArrayList<Meaning>>(
            json,
            object : TypeToken<ArrayList<Meaning>>() {}.type
        ) ?: emptyList()
    }

    @TypeConverters
    fun toMeaningsJson(meaning: List<Meaning>): String {
        return jsonParser.toJson(
            meaning,
            object : TypeToken<ArrayList<Meaning>>() {}.type
        ) ?: "[]"
    }
}