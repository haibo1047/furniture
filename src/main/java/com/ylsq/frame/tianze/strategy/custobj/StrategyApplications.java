package com.ylsq.frame.tianze.strategy.custobj;

import java.util.List;

import com.ylsq.frame.tianze.encrypt.dao.model.TzEncryptApplication;

public class StrategyApplications {
	private Integer appType;
	private String appTypeName;
	private List<TzEncryptApplication> appList;
	
	public Integer getAppType() {
		return appType;
	}
	public void setAppType(Integer appType) {
		this.appType = appType;
	}
	public String getAppTypeName() {
		return appTypeName;
	}
	public void setAppTypeName(String appTypeName) {
		this.appTypeName = appTypeName;
	}
	public List<TzEncryptApplication> getAppList() {
		return appList;
	}
	public void setAppList(List<TzEncryptApplication> appList) {
		this.appList = appList;
	}
	
}
