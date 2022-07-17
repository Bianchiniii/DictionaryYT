package com.plcoding.dictionary.feature_dictionary.data.remote.dto

import com.plcoding.dictionary.feature_dictionary.domain.model.WordInfo

data class WordInfoDto(
    val meaningDtos: List<MeaningDto>,
    val origin: String,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val word: String
) {
    fun toWordInfo() = WordInfo(
        meaning = this.meaningDtos.map { it.toMeaning() },
        origin = this.origin,
        phonetic = this.phonetic,
        phonetics = this.phonetics,
        word = this.word
    )
}