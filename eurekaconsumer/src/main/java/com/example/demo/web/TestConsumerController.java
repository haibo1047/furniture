package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.feign.FurnitureFeignService;
import com.example.demo.model.FurnProduct;
import com.example.demo.service.ConsumerFeighService;
import com.example.demo.service.ConsumerRibbonService;
import com.example.demo.service.ConsumerSingleService;


@RestController
@RequestMapping("/consumer")
public class TestConsumerController {

    @Autowired
    ConsumerSingleService consumerSingleService;
    @Autowired
    ConsumerRibbonService consumerRibbonService;
    @Autowired
    ConsumerFeighService consumerFeighService;
    @Autowired
    FurnitureFeignService furnitureFeignService;

    @GetMapping("/single")
    public FurnProduct index(){
        FurnProduct fp = consumerSingleService.getAllProducts();
        System.out.println(fp);
        return fp;
    }

    @GetMapping("/lb")
    public FurnProduct ld(){
        return consumerRibbonService.getAllProducts();
    }

    @GetMapping(value="/feign")
    public FurnProduct feigh(){
        return consumerFeighService.getAllProducts();
    }

    @GetMapping("/product")
    public List<FurnProduct> getProducts(){
        return furnitureFeignService.getProduct();
    }

}
