package com.tsunemi.springboottests.form

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer
import com.tsunemi.springboottests.deserializer.IntDeserializer

data class Form(
    var text: String? = "",
//    @JsonDeserialize(using = IntDeserializer::class)
    var number: Int=0
)
