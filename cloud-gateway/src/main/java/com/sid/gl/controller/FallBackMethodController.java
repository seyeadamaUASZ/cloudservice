package com.sid.gl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod(){
        return "User service is taking longer than expected "+
                "Please try again";
    }


    @GetMapping("/departmentServiceFallBack")
    public String departementServiceFallBackMethod(){
        return "department service is taking longer than expected "+
                "Please try again";
    }
}
