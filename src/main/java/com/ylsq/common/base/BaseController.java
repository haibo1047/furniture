package com.ylsq.common.base;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController {
	private static Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	/**
	 * 统一异常处理
	 * @param request
	 * @param response
	 * @param exception
	 */
	@ExceptionHandler
	public String exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception exception) {
		logger.error(exception.getMessage());
		request.setAttribute("ex", exception);
		return "/common/error";
	}
	
	protected void initModel(BaseModel obj) {
		if(obj == null)
			return;
		if(obj.getId() == null) {
			obj.setCreateTime(new Date());
			obj.setCreateUser("not ready");
			obj.setRecStatus("1");
		}
		else {
			obj.setRecStatus("2");
		}
		
	}
}
