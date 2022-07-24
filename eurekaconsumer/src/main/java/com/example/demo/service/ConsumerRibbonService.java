package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.FurnProduct;

@Service
public class ConsumerRibbonService {
    
    @Autowired
    private RestTemplate restTemplate;

    public FurnProduct getAllProducts(){
        FurnProduct result = restTemplate.getForObject("http://eurekaprovider/provider/", FurnProduct.class); //after enabled loadbalanced
        return result;
    }
}
