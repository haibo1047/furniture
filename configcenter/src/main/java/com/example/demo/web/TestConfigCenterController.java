package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/configcenter")
public class TestConfigCenterController {
    
    @GetMapping("/")
    public String list(){
        return "config server";
    }

}
