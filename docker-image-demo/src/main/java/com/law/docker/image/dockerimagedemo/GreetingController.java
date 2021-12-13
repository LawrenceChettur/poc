package com.law.docker.image.dockerimagedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/api")
public class GreetingController {

    @GetMapping(value = "/greet")
    public String greet(){
        return "Hello Law";
    }
}
