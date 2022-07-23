package com.example.demo.utils;

public class PasswordUtil {
    

    public static String encode(String raw){
        return SystemConstant.PWD_ENCODER.encode(raw);
    }

    public static void main(String []args){
        String encodedPwd = PasswordUtil.encode("nuo1");
        System.out.println(encodedPwd);
        System.out.println(SystemConstant.PWD_ENCODER.matches("nuo1", encodedPwd));
    }
}
