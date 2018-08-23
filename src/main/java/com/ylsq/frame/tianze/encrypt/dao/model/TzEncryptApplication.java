package com.ylsq.frame.tianze.encrypt.dao.model;

import com.ylsq.frame.common.base.BaseModel;
import java.io.Serializable;
import java.util.Date;

public class TzEncryptApplication implements BaseModel, Serializable {
    /**
     * 编号
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 进程名
     *
     * @mbg.generated
     */
    private String processName;

    /**
     * 应用类别
     *
     * @mbg.generated
     */
    private Integer applicationType;

    /**
     * 进程路径
     *
     * @mbg.generated
     */
    private String processPath;

    /**
     * 加密扩展名
     *
     * @mbg.generated
     */
    private String encryptExtension;

    /**
     * 监控扩展名
     *
     * @mbg.generated
     */
    private String monitorExtension;

    /**
     * 智能扩展名
     *
     * @mbg.generated
     */
    private String smartExtension;

    /**
     * 特殊文件名
     *
     * @mbg.generated
     */
    private String specialFilename;

    /**
     * 特殊路径
     *
     * @mbg.generated
     */
    private String specialPath;

    /**
     * PE路径
     *
     * @mbg.generated
     */
    private String pePath;

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

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public Integer getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(Integer applicationType) {
        this.applicationType = applicationType;
    }

    public String getProcessPath() {
        return processPath;
    }

    public void setProcessPath(String processPath) {
        this.processPath = processPath;
    }

    public String getEncryptExtension() {
        return encryptExtension;
    }

    public void setEncryptExtension(String encryptExtension) {
        this.encryptExtension = encryptExtension;
    }

    public String getMonitorExtension() {
        return monitorExtension;
    }

    public void setMonitorExtension(String monitorExtension) {
        this.monitorExtension = monitorExtension;
    }

    public String getSmartExtension() {
        return smartExtension;
    }

    public void setSmartExtension(String smartExtension) {
        this.smartExtension = smartExtension;
    }

    public String getSpecialFilename() {
        return specialFilename;
    }

    public void setSpecialFilename(String specialFilename) {
        this.specialFilename = specialFilename;
    }

    public String getSpecialPath() {
        return specialPath;
    }

    public void setSpecialPath(String specialPath) {
        this.specialPath = specialPath;
    }

    public String getPePath() {
        return pePath;
    }

    public void setPePath(String pePath) {
        this.pePath = pePath;
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
        sb.append(", processName=").append(processName);
        sb.append(", applicationType=").append(applicationType);
        sb.append(", processPath=").append(processPath);
        sb.append(", encryptExtension=").append(encryptExtension);
        sb.append(", monitorExtension=").append(monitorExtension);
        sb.append(", smartExtension=").append(smartExtension);
        sb.append(", specialFilename=").append(specialFilename);
        sb.append(", specialPath=").append(specialPath);
        sb.append(", pePath=").append(pePath);
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
        TzEncryptApplication other = (TzEncryptApplication) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProcessName() == null ? other.getProcessName() == null : this.getProcessName().equals(other.getProcessName()))
            && (this.getApplicationType() == null ? other.getApplicationType() == null : this.getApplicationType().equals(other.getApplicationType()))
            && (this.getProcessPath() == null ? other.getProcessPath() == null : this.getProcessPath().equals(other.getProcessPath()))
            && (this.getEncryptExtension() == null ? other.getEncryptExtension() == null : this.getEncryptExtension().equals(other.getEncryptExtension()))
            && (this.getMonitorExtension() == null ? other.getMonitorExtension() == null : this.getMonitorExtension().equals(other.getMonitorExtension()))
            && (this.getSmartExtension() == null ? other.getSmartExtension() == null : this.getSmartExtension().equals(other.getSmartExtension()))
            && (this.getSpecialFilename() == null ? other.getSpecialFilename() == null : this.getSpecialFilename().equals(other.getSpecialFilename()))
            && (this.getSpecialPath() == null ? other.getSpecialPath() == null : this.getSpecialPath().equals(other.getSpecialPath()))
            && (this.getPePath() == null ? other.getPePath() == null : this.getPePath().equals(other.getPePath()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getRecStatus() == null ? other.getRecStatus() == null : this.getRecStatus().equals(other.getRecStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProcessName() == null) ? 0 : getProcessName().hashCode());
        result = prime * result + ((getApplicationType() == null) ? 0 : getApplicationType().hashCode());
        result = prime * result + ((getProcessPath() == null) ? 0 : getProcessPath().hashCode());
        result = prime * result + ((getEncryptExtension() == null) ? 0 : getEncryptExtension().hashCode());
        result = prime * result + ((getMonitorExtension() == null) ? 0 : getMonitorExtension().hashCode());
        result = prime * result + ((getSmartExtension() == null) ? 0 : getSmartExtension().hashCode());
        result = prime * result + ((getSpecialFilename() == null) ? 0 : getSpecialFilename().hashCode());
        result = prime * result + ((getSpecialPath() == null) ? 0 : getSpecialPath().hashCode());
        result = prime * result + ((getPePath() == null) ? 0 : getPePath().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getRecStatus() == null) ? 0 : getRecStatus().hashCode());
        return result;
    }
}