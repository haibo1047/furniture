package com.ylsq.frame.tianze.base.utils;

import org.junit.jupiter.api.Test;

import com.ylsq.frame.common.util.PasswordUtils;

public class TokenUtil {

	public static String buildToken(String userName) {
		String thetoken = PasswordUtils.encode(userName, "token");
		return thetoken;
	}
	
	@Test
	void test() {
		System.out.println(buildToken("test"));
	}
}
