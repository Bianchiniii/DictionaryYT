package com.plcoding.dictionary.feature_dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.plcoding.dictionary.feature_dictionary.data.remote.dto.PhoneticDto
import com.plcoding.dictionary.feature_dictionary.domain.model.Meaning
import com.plcoding.dictionary.feature_dictionary.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    @PrimaryKey val id: Int? = null,
    val meaning: List<Meaning>,
    val origin: String,
    val phonetic: String,
    val word: String
) {
    fun toWordInfo() = WordInfo(
        meaning = this.meaning,
        origin = this.origin,
        phonetic = this.phonetic,
        word = this.word
    )
}