package com.ylsq.frame.tianze.encrypt.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.tianze.base.cons.TerminalStatus;
import com.ylsq.frame.tianze.encrypt.dao.mapper.TzEncryptTerminalMapper;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptTerminal;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptTerminalExample;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptTerminalExample.Criteria;
import com.ylsq.frame.tianze.encrypt.service.TzEncryptTerminalService;

/**
* TzEncryptTerminalService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class TzEncryptTerminalServiceImpl extends BaseServiceImpl<TzEncryptTerminalMapper, TzEncryptTerminal, TzEncryptTerminalExample> implements TzEncryptTerminalService {

    private static final Logger log = LoggerFactory.getLogger(TzEncryptTerminalServiceImpl.class);

    @Autowired
    TzEncryptTerminalMapper tzEncryptTerminalMapper;

	@Override
	public boolean online(TzEncryptTerminal terminal) {
		// TODO Auto-generated method stub
		if(terminal != null && StringUtils.isNotBlank(terminal.getLoginId())) {
			TzEncryptTerminalExample example = new TzEncryptTerminalExample();
			example.createCriteria().andLoginIdEqualTo(terminal.getLoginId());
			List<TzEncryptTerminal> list = selectByExample(example);
			terminal.setTerminalStatus(TerminalStatus.Normal);
			if(list.size() > 0) {
				log.debug(terminal.getLoginId() + " is online");
				terminal.setId(list.get(0).getId());
				updateByPrimaryKeySelective(terminal);
			}
			else {
				terminal.setLastLoginTime(new Date());
				insert(terminal);
			}
		}
		return false;
	}

	@Override
	public boolean offline(TzEncryptTerminal terminal) {
		// TODO Auto-generated method stub
		if(terminal != null && StringUtils.isNotBlank(terminal.getLoginId())) {
			TzEncryptTerminalExample example = new TzEncryptTerminalExample();
			example.createCriteria().andLoginIdEqualTo(terminal.getLoginId());
			List<TzEncryptTerminal> list = selectByExample(example);
			terminal.setTerminalStatus(TerminalStatus.Offline);
			if(list.size() > 0) {
				terminal.setId(list.get(0).getId());
				updateByPrimaryKeySelective(terminal);
			}
			else {
				insert(terminal);
			}
		}
		return false;
	}

	@Override
	public boolean heartbeat(String guid, String userName) {
		// TODO Auto-generated method stub
		TzEncryptTerminal terminal = new TzEncryptTerminal();
		terminal.setLoginId(userName);
		terminal.setUpdateTime(new Date());
		terminal.setLastLoginTime(new Date());
		terminal.setTerminalStatus(TerminalStatus.Normal);
		TzEncryptTerminalExample example = new TzEncryptTerminalExample();
		Criteria criteria = example.createCriteria();
		criteria.andGuidEqualTo(guid);
		if(StringUtils.isNotEmpty(userName))
			criteria.andLoginIdEqualTo(userName);
		int cnt = updateByExampleSelective(terminal, example);
		if(cnt ==1)
			return true;
		return false;
	}

}