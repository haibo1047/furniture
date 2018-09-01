package com.ylsq.frame.sys.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import com.ylsq.frame.sys.base.service.SysProfileService;

@Component
public class DbAutomatBackUpJob extends QuartzJobBean{
	private Logger log = LoggerFactory.getLogger(DbAutomatBackUpJob.class);
	@Autowired
	private SysProfileService sysProfileService;
	
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub
		log.info("DB backup job is been triggered now.");
	}

}
