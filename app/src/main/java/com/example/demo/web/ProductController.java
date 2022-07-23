package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/list")
    public String list(){
        return furnProductService.getAll().toString();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public FurnProduct get(@PathVariable Long id){
        return furnProductService.getProduct(id);
    }
}
