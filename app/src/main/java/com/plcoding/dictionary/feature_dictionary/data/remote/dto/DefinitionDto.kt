package com.plcoding.dictionary.feature_dictionary.data.remote.dto

import com.plcoding.dictionary.feature_dictionary.domain.model.Definition

data class DefinitionDto(
    var antonyms: List<String>,
    val definition: String,
    val example: String,
    val synonyms: List<String>
) {
    fun toDefinition() = Definition(
        antonyms = this.antonyms,
        definition = this.definition,
        example = this.example,
        synonyms = this.synonyms
    )
}