package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FurnProduct;
import com.example.demo.service.FurnProductService;

@RestController
@RequestMapping("/9tian/product")
public class ProductController {
    
    @Autowired
    FurnProductService furnProductService;

    @Value("${port2}")
    private String configFromServer;

    @GetMapping("/list")
    public List<FurnProduct> list(){
        System.out.println("load from config center:"+configFromServer);
        return furnProductService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public FurnProduct get(@PathVariable Long id){
        return furnProductService.getProduct(id);
    }
}
