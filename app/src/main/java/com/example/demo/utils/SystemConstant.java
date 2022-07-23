package com.example.demo.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder.BCryptVersion;
import org.springframework.security.crypto.password.PasswordEncoder;

public final class SystemConstant {
    public static PasswordEncoder PWD_ENCODER = new BCryptPasswordEncoder(BCryptVersion.$2Y, 12);
    public static String DEAULT_ROLE_NAME = "NOT-LOGIN-ROLE";
}
