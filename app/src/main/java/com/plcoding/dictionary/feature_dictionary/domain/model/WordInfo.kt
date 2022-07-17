package com.plcoding.dictionary.feature_dictionary.domain.model

import com.plcoding.dictionary.feature_dictionary.data.remote.dto.PhoneticDto

class WordInfo(
    val meaning: List<Meaning>,
    val origin: String,
    val phonetic: String,
    val phonetics: List<PhoneticDto>? = null,
    val word: String
)
