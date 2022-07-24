package com.example.demo.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FurnProduct;
import com.example.demo.service.ProviderService;

@RestController
@RequestMapping("/provider")
public class TestProviderController {

    private static long ID = 0l;
    
    @Value("${host1}")
    private String configFromServer;

    @Autowired
    private ProviderService providerService;


    @GetMapping("/")
    public FurnProduct index(){
        FurnProduct fd = providerService.getAllProducts();
        fd.setCreateTime(new Date());
        fd.setId(ID++);
        System.out.println(configFromServer);
        return fd;
    }

}
