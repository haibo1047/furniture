package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.FurnProduct;

@FeignClient("eurekaprovider")
public interface ConsumerFeighService {
    
    @GetMapping("/provider/")
    public FurnProduct getAllProducts();
}
