package com.ylsq.frame.sys.quartz;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.ylsq.frame.tianze.base.cons.TerminalStatus;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptTerminal;
import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptTerminalExample;
import com.ylsq.frame.tianze.encrypt.service.TzEncryptTerminalService;

public class RemotingLoginStatusUpdateJob extends QuartzJobBean {
	private Logger log = LoggerFactory.getLogger(RemotingLoginStatusUpdateJob.class);
	
	@Autowired
	private TzEncryptTerminalService tzEncryptTerminalService;
	
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
		log.debug("Remoting login status update job is been triggered now.");
		
		TzEncryptTerminalExample example = new TzEncryptTerminalExample();
		example.createCriteria().andUpdateTimeLessThan(DateUtils.addMinutes(new Date(), -4));
		example.or().andUpdateTimeIsNull();
		List<TzEncryptTerminal> list = tzEncryptTerminalService.selectByExample(example);
		for(TzEncryptTerminal e : list) {
			log.info("about to offline the login:" + e.getLoginId() );
			TzEncryptTerminal terminal = new TzEncryptTerminal();
			terminal.setId(e.getId());
			terminal.setTerminalStatus(TerminalStatus.Offline);
			tzEncryptTerminalService.updateByPrimaryKeySelective(terminal);
		}
	}

}
