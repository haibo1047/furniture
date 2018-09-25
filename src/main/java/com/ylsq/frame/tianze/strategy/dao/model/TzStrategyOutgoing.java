package com.ylsq.frame.tianze.strategy.dao.model;

import java.io.Serializable;
import java.util.Date;

import com.ylsq.frame.common.base.BaseModel;

public class TzStrategyOutgoing implements BaseModel, Serializable {
	
	public static String Strategy_Type = "outgoing";
    /**
     * 编号
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 模板名
     *
     * @mbg.generated
     */
    private String strategyName;

    /**
     * 申请等级
     *
     * @mbg.generated
     */
    private Integer outgoingLevel;

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

    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

    public Integer getOutgoingLevel() {
        return outgoingLevel;
    }

    public void setOutgoingLevel(Integer outgoingLevel) {
        this.outgoingLevel = outgoingLevel;
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
        sb.append(", strategyName=").append(strategyName);
        sb.append(", outgoingLevel=").append(outgoingLevel);
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
        TzStrategyOutgoing other = (TzStrategyOutgoing) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStrategyName() == null ? other.getStrategyName() == null : this.getStrategyName().equals(other.getStrategyName()))
            && (this.getOutgoingLevel() == null ? other.getOutgoingLevel() == null : this.getOutgoingLevel().equals(other.getOutgoingLevel()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getRecStatus() == null ? other.getRecStatus() == null : this.getRecStatus().equals(other.getRecStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStrategyName() == null) ? 0 : getStrategyName().hashCode());
        result = prime * result + ((getOutgoingLevel() == null) ? 0 : getOutgoingLevel().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getRecStatus() == null) ? 0 : getRecStatus().hashCode());
        return result;
    }
}