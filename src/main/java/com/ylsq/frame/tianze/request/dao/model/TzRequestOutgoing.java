package com.ylsq.frame.tianze.request.dao.model;

import com.ylsq.frame.common.base.BaseModel;
import java.io.Serializable;
import java.util.Date;

public class TzRequestOutgoing implements BaseModel, Serializable {
    /**
     * 编号
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 申请ID
     *
     * @mbg.generated
     */
    private Long requestId;

    /**
     * 策略ID
     *
     * @mbg.generated
     */
    private Long strategyId;

    /**
     * 文件ID
     *
     * @mbg.generated
     */
    private Long fileId;

    /**
     * 接收人
     *
     * @mbg.generated
     */
    private String recipient;

    /**
     * 接收单位
     *
     * @mbg.generated
     */
    private String recipientOrg;

    /**
     * 审批状态
     *
     * @mbg.generated
     */
    private String approveStatus;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 创建人
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * 记录状态
     *
     * @mbg.generated
     */
    private Integer recStatus;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
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

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Integer getRecStatus() {
        return recStatus;
    }

    public void setRecStatus(Integer recStatus) {
        this.recStatus = recStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", requestId=").append(requestId);
        sb.append(", strategyId=").append(strategyId);
        sb.append(", fileId=").append(fileId);
        sb.append(", recipient=").append(recipient);
        sb.append(", recipientOrg=").append(recipientOrg);
        sb.append(", approveStatus=").append(approveStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", recStatus=").append(recStatus);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TzRequestOutgoing other = (TzRequestOutgoing) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRequestId() == null ? other.getRequestId() == null : this.getRequestId().equals(other.getRequestId()))
            && (this.getStrategyId() == null ? other.getStrategyId() == null : this.getStrategyId().equals(other.getStrategyId()))
            && (this.getFileId() == null ? other.getFileId() == null : this.getFileId().equals(other.getFileId()))
            && (this.getRecipient() == null ? other.getRecipient() == null : this.getRecipient().equals(other.getRecipient()))
            && (this.getRecipientOrg() == null ? other.getRecipientOrg() == null : this.getRecipientOrg().equals(other.getRecipientOrg()))
            && (this.getApproveStatus() == null ? other.getApproveStatus() == null : this.getApproveStatus().equals(other.getApproveStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getRecStatus() == null ? other.getRecStatus() == null : this.getRecStatus().equals(other.getRecStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        result = prime * result + ((getStrategyId() == null) ? 0 : getStrategyId().hashCode());
        result = prime * result + ((getFileId() == null) ? 0 : getFileId().hashCode());
        result = prime * result + ((getRecipient() == null) ? 0 : getRecipient().hashCode());
        result = prime * result + ((getRecipientOrg() == null) ? 0 : getRecipientOrg().hashCode());
        result = prime * result + ((getApproveStatus() == null) ? 0 : getApproveStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getRecStatus() == null) ? 0 : getRecStatus().hashCode());
        return result;
    }
}