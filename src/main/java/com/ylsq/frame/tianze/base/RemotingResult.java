package com.ylsq.frame.tianze.base;

public class RemotingResult {
	private int status;
	private String token;
	private Object content;
	
	public static RemotingResult SU = new RemotingResult(1);
	public static RemotingResult FA = new RemotingResult(0);
	
	public RemotingResult() {
		setStatus(0);
	}
	public RemotingResult(int status) {
		setStatus(status==1? 1: 0);
	}
	public RemotingResult(String token) {
		setStatus(1);
		setToken(token);
	}
	public RemotingResult(String token, Object o){
		setContent(o);
		setToken(token);
		setStatus(1);
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
	
}
