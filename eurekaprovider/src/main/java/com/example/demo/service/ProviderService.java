package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.FurnProduct;

@Service
public class ProviderService {

    public FurnProduct getAllProducts(){
        FurnProduct fd = new FurnProduct();
        fd.setProductName("sofa");
        return fd;
    }
}
