package com.tsunemi.springboottests.config

import com.fasterxml.jackson.databind.module.SimpleModule
import com.tsunemi.springboottests.deserializer.IntDeserializer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CustomSerialzier {

    @Bean
    fun customSerializer(): SimpleModule {
        val module = SimpleModule()
        module.addDeserializer(Int::class.java, IntDeserializer())
        return module
    }
}