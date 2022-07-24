package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eurakaserver")
public class TestController {
    
    @GetMapping("/")
    public String list(){
        return "erueka server";
    }

}
