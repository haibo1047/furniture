package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.FurnProductMapper;
import com.example.demo.model.FurnProduct;
import com.example.demo.model.FurnProductExample;

@Service
public class FurnProductService {

    @Autowired
    private FurnProductMapper furnProductMapper;

    public FurnProduct getProduct(long id){
        FurnProduct fd = furnProductMapper.selectByPrimaryKey(id);
        return fd;
    }

    public List<FurnProduct> getAll(){
        return furnProductMapper.selectByExample(new FurnProductExample());
    }

}
