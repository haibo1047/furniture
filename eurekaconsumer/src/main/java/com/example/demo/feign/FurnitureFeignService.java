package com.example.demo.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.FurnProduct;

@FeignClient("app")
public interface FurnitureFeignService {
    
    @GetMapping("/9tian/product/list")
    public List<FurnProduct> getProduct();
}
