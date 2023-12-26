package com.csm.main.controller

import com.csm.main.service.CsmService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CsmController(private val csmService: CsmService){

    @GetMapping("/test")
    fun test() : String{
       return csmService.test()
    }

}