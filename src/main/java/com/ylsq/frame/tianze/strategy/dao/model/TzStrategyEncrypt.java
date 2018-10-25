package com.ylsq.frame.tianze.strategy.dao.model;

import com.ylsq.frame.common.base.BaseModel;
import java.io.Serializable;
import java.util.Date;

public class TzStrategyEncrypt implements BaseModel, Serializable {
	public static String Strategy_Type = "encrypt";
	
    /**
     * 编号
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 策略名
     *
     * @mbg.generated
     */
    private String strategyName;

    /**
     * 允许拷贝
     *
     * @mbg.generated
     */
    private Integer allowCopy;

    /**
     * 允许截屏
     *
     * @mbg.generated
     */
    private Integer allowScreen;

    /**
     * 允许打印
     *
     * @mbg.generated
     */
    private Integer allowPrint;

    /**
     * 水印
     *
     * @mbg.generated
     */
    private Integer watermark;

    /**
     * 允许外发转加密
     *
     * @mbg.generated
     */
    private Integer allowSendout;

    /**
     * 标识加密文件
     *
     * @mbg.generated
     */
    private Integer encryptFlag;

    /**
     * 允许运行黑客软件
     *
     * @mbg.generated
     */
    private Integer allowHackerSoftware;

    /**
     * 允许脱机
     *
     * @mbg.generated
     */
    private Integer allowOffline;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String strategyRemark;

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

    public Integer getAllowCopy() {
        return allowCopy;
    }

    public void setAllowCopy(Integer allowCopy) {
        this.allowCopy = allowCopy;
    }

    public Integer getAllowScreen() {
        return allowScreen;
    }

    public void setAllowScreen(Integer allowScreen) {
        this.allowScreen = allowScreen;
    }

    public Integer getAllowPrint() {
        return allowPrint;
    }

    public void setAllowPrint(Integer allowPrint) {
        this.allowPrint = allowPrint;
    }

    public Integer getWatermark() {
        return watermark;
    }

    public void setWatermark(Integer watermark) {
        this.watermark = watermark;
    }

    public Integer getAllowSendout() {
        return allowSendout;
    }

    public void setAllowSendout(Integer allowSendout) {
        this.allowSendout = allowSendout;
    }

    public Integer getEncryptFlag() {
        return encryptFlag;
    }

    public void setEncryptFlag(Integer encryptFlag) {
        this.encryptFlag = encryptFlag;
    }

    public Integer getAllowHackerSoftware() {
        return allowHackerSoftware;
    }

    public void setAllowHackerSoftware(Integer allowHackerSoftware) {
        this.allowHackerSoftware = allowHackerSoftware;
    }

    public Integer getAllowOffline() {
        return allowOffline;
    }

    public void setAllowOffline(Integer allowOffline) {
        this.allowOffline = allowOffline;
    }

    public String getStrategyRemark() {
        return strategyRemark;
    }

    public void setStrategyRemark(String strategyRemark) {
        this.strategyRemark = strategyRemark;
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
        sb.append(", allowCopy=").append(allowCopy);
        sb.append(", allowScreen=").append(allowScreen);
        sb.append(", allowPrint=").append(allowPrint);
        sb.append(", watermark=").append(watermark);
        sb.append(", allowSendout=").append(allowSendout);
        sb.append(", encryptFlag=").append(encryptFlag);
        sb.append(", allowHackerSoftware=").append(allowHackerSoftware);
        sb.append(", allowOffline=").append(allowOffline);
        sb.append(", strategyRemark=").append(strategyRemark);
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
        TzStrategyEncrypt other = (TzStrategyEncrypt) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStrategyName() == null ? other.getStrategyName() == null : this.getStrategyName().equals(other.getStrategyName()))
            && (this.getAllowCopy() == null ? other.getAllowCopy() == null : this.getAllowCopy().equals(other.getAllowCopy()))
            && (this.getAllowScreen() == null ? other.getAllowScreen() == null : this.getAllowScreen().equals(other.getAllowScreen()))
            && (this.getAllowPrint() == null ? other.getAllowPrint() == null : this.getAllowPrint().equals(other.getAllowPrint()))
            && (this.getWatermark() == null ? other.getWatermark() == null : this.getWatermark().equals(other.getWatermark()))
            && (this.getAllowSendout() == null ? other.getAllowSendout() == null : this.getAllowSendout().equals(other.getAllowSendout()))
            && (this.getEncryptFlag() == null ? other.getEncryptFlag() == null : this.getEncryptFlag().equals(other.getEncryptFlag()))
            && (this.getAllowHackerSoftware() == null ? other.getAllowHackerSoftware() == null : this.getAllowHackerSoftware().equals(other.getAllowHackerSoftware()))
            && (this.getAllowOffline() == null ? other.getAllowOffline() == null : this.getAllowOffline().equals(other.getAllowOffline()))
            && (this.getStrategyRemark() == null ? other.getStrategyRemark() == null : this.getStrategyRemark().equals(other.getStrategyRemark()))
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
        result = prime * result + ((getAllowCopy() == null) ? 0 : getAllowCopy().hashCode());
        result = prime * result + ((getAllowScreen() == null) ? 0 : getAllowScreen().hashCode());
        result = prime * result + ((getAllowPrint() == null) ? 0 : getAllowPrint().hashCode());
        result = prime * result + ((getWatermark() == null) ? 0 : getWatermark().hashCode());
        result = prime * result + ((getAllowSendout() == null) ? 0 : getAllowSendout().hashCode());
        result = prime * result + ((getEncryptFlag() == null) ? 0 : getEncryptFlag().hashCode());
        result = prime * result + ((getAllowHackerSoftware() == null) ? 0 : getAllowHackerSoftware().hashCode());
        result = prime * result + ((getAllowOffline() == null) ? 0 : getAllowOffline().hashCode());
        result = prime * result + ((getStrategyRemark() == null) ? 0 : getStrategyRemark().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getRecStatus() == null) ? 0 : getRecStatus().hashCode());
        return result;
    }
}