package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.FurnProduct;

@Service
public class ConsumerSingleService {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * only work when EurekaConsumerApplication.getRestTemplate disabled loadbalance
     * @return
     */
    public FurnProduct getAllProducts(){
        FurnProduct result = restTemplate.getForObject("http://localhost:10022/provider/", FurnProduct.class);
        return result;
    }
}
