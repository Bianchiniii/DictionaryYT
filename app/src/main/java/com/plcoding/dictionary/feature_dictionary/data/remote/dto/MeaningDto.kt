package com.plcoding.dictionary.feature_dictionary.data.remote.dto

import com.plcoding.dictionary.feature_dictionary.domain.model.Meaning

data class MeaningDto(
    val definitionDtos: List<DefinitionDto>,
    val partOfSpeech: String
) {
    fun toMeaning() = Meaning(
        definition = this.definitionDtos.map { it.toDefinition() },
        partOfSpeech = this.partOfSpeech
    )
}