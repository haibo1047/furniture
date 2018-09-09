package com.ylsq.frame.tianze.remoting.base;

import org.apache.commons.lang3.StringUtils;

import com.ylsq.frame.tianze.base.utils.TokenUtil;

public abstract class BaseRemotingController {

	protected boolean verifyToken(String userName,String token) {
		if(StringUtils.isNotBlank(userName) && StringUtils.isNotBlank(token)) {
			if(token.equals(TokenUtil.buildToken(userName)))
				return true;
		}
		return false;
	}
}
