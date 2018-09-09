package com.ylsq.frame.tianze.base.service;

import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.tianze.base.dao.model.TzBaseFeedback;
import com.ylsq.frame.tianze.base.dao.model.TzBaseFeedbackExample;

/**
* TzBaseFeedbackService接口
* Created by harper
*/
public interface TzBaseFeedbackService extends BaseService<TzBaseFeedback, TzBaseFeedbackExample> {

	/**
	 * 初始化用户反馈
	 * @param userName
	 * @param feedback
	 * @return
	 */
	public int initFeedback(String userName,String feedback);
}