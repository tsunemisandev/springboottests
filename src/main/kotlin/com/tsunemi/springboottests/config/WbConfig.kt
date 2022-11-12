package com.tsunemi.springboottests.config

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Configuration
import org.springframework.core.convert.converter.Converter
import org.springframework.format.FormatterRegistry
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


@Configuration
class WbConfig :WebMvcConfigurer{

    override fun addFormatters(registry: FormatterRegistry) {
        registry.addConverter(StringToInt())
        super.addFormatters(registry)
    }

    class StringToInt: Converter<String, Int> {
        override fun convert(source: String): Int? {
           return source.replace(",","").toInt()
        }
    }


}