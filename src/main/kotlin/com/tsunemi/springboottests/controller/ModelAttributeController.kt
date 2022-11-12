package com.tsunemi.springboottests.controller

import com.tsunemi.springboottests.form.Form
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("model")
class ModelAttributeController {

    @GetMapping
    fun index() : String{
        return "/model/index"
    }

    @GetMapping("/get")
    @ResponseBody
    fun get2(@ModelAttribute form: Form): Form{
        return form
    }

    @PostMapping("/get2")
    @ResponseBody
    fun get3(@RequestBody form: Form): Form{
        return form
    }
}