package com.abuuaasiyah.coolApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    

    @GetMapping("/")
    public String greet(){
        return "Hello world!!";
    }
}
