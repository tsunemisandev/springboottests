package com.tsunemi.springboottests.deserializer

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer

class IntDeserializer : JsonDeserializer<Int>() {
    override fun deserialize(p: JsonParser?, ctxt: DeserializationContext?): Int {
        return p!!.text.replace(",","").toInt()
    }
}