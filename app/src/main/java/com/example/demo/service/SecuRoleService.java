package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.SecuUserRoleMapper;
import com.example.demo.model.SecuUserRole;
import com.example.demo.model.SecuUserRoleExample;

@Service
public class SecuRoleService {
    
    @Autowired
    private SecuUserRoleMapper secuUserRoleMapper;


    public List<String> getRoleNamesByUserName(String userName){
        SecuUserRoleExample surExample = new SecuUserRoleExample();
        surExample.createCriteria().andUserNameEqualTo(userName);
        List<SecuUserRole> list = secuUserRoleMapper.selectByExample(surExample);
        List<String> result = new ArrayList<String>(list.size());
        for (SecuUserRole sur : list) {
            result.add(sur.getRoleName());
        }
        return result;
    }
}
