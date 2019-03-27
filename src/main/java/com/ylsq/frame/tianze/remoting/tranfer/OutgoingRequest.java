package com.ylsq.frame.tianze.remoting.tranfer;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.ylsq.frame.common.base.BaseModel;
import com.ylsq.frame.tianze.request.cons.ApproveStatus;
import com.ylsq.frame.tianze.request.dao.model.TzRequestOutgoing;

public class OutgoingRequest {
	private String userName;
	private String token;
    private Long strategyId;
    private Long strategyName;
    private Long fileId;
    private byte[] fileData;
    private String recipient;
    private String recipientOrg;
    
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Long getStrategyId() {
		return strategyId;
	}
	public void setStrategyId(Long strategyId) {
		this.strategyId = strategyId;
	}
	public Long getStrategyName() {
		return strategyName;
	}
	public void setStrategyName(Long strategyName) {
		this.strategyName = strategyName;
	}
	public Long getFileId() {
		return fileId;
	}
	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getRecipientOrg() {
		return recipientOrg;
	}
	public void setRecipientOrg(String recipientOrg) {
		this.recipientOrg = recipientOrg;
	}
	public byte[] getFileData() {
		return fileData;
	}
	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}
	
	public TzRequestOutgoing convert() {
		TzRequestOutgoing obj = new TzRequestOutgoing();
		if(this == null || StringUtils.isBlank(getUserName())) {
			return obj;
		}
		obj.setRequestId(1l);
		obj.setCreateTime(new Date());
		obj.setApproveStatus(ApproveStatus.DRAFT);
		obj.setCreateUser(getUserName());
		obj.setRecipient(getRecipient());
		obj.setRecipientOrg(getRecipientOrg());
		obj.setRecStatus(BaseModel.recStatus_valid);
		obj.setStrategyId(getStrategyId());
//		if(getFileData() != null) {
//			obj.setFileId(fileId);
//		}
		
		return obj;
	}
}
