package com.ylsq.frame.tianze.encrypt.service;

import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptTerminal;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptTerminalExample;

/**
* TzEncryptTerminalService接口
* Created by harper
*/
public interface TzEncryptTerminalService extends BaseService<TzEncryptTerminal, TzEncryptTerminalExample> {

	/**
	 * 上线
	 * @param terminal
	 * @return
	 */
	public boolean online(TzEncryptTerminal terminal);
	
	/**
	 * 下线
	 * @param terminal
	 * @return
	 */
	public boolean offline(TzEncryptTerminal terminal);
}