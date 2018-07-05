package com.huiyi.meeting.dao.model;

import java.io.Serializable;
import java.util.Date;

public class MeetingStatement implements Serializable {
    private Integer id;

    /**
     * 公司名字
     *
     * @mbg.generated
     */
    private String companyname;

    /**
     * 公司付款金额
     *
     * @mbg.generated
     */
    private Float fee;

    /**
     * 上传时间
     *
     * @mbg.generated
     */
    private Date uploadeddatetime;

    /**
     * 是否确认过  YES | NO
     *
     * @mbg.generated
     */
    private String isdisable;

    private Long creationtimestamp;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public Float getFee() {
        return fee;
    }

    public void setFee(Float fee) {
        this.fee = fee;
    }

    public Date getUploadeddatetime() {
        return uploadeddatetime;
    }

    public void setUploadeddatetime(Date uploadeddatetime) {
        this.uploadeddatetime = uploadeddatetime;
    }

    public String getIsdisable() {
        return isdisable;
    }

    public void setIsdisable(String isdisable) {
        this.isdisable = isdisable;
    }

    public Long getCreationtimestamp() {
        return creationtimestamp;
    }

    public void setCreationtimestamp(Long creationtimestamp) {
        this.creationtimestamp = creationtimestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyname=").append(companyname);
        sb.append(", fee=").append(fee);
        sb.append(", uploadeddatetime=").append(uploadeddatetime);
        sb.append(", isdisable=").append(isdisable);
        sb.append(", creationtimestamp=").append(creationtimestamp);
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
        MeetingStatement other = (MeetingStatement) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyname() == null ? other.getCompanyname() == null : this.getCompanyname().equals(other.getCompanyname()))
            && (this.getFee() == null ? other.getFee() == null : this.getFee().equals(other.getFee()))
            && (this.getUploadeddatetime() == null ? other.getUploadeddatetime() == null : this.getUploadeddatetime().equals(other.getUploadeddatetime()))
            && (this.getIsdisable() == null ? other.getIsdisable() == null : this.getIsdisable().equals(other.getIsdisable()))
            && (this.getCreationtimestamp() == null ? other.getCreationtimestamp() == null : this.getCreationtimestamp().equals(other.getCreationtimestamp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyname() == null) ? 0 : getCompanyname().hashCode());
        result = prime * result + ((getFee() == null) ? 0 : getFee().hashCode());
        result = prime * result + ((getUploadeddatetime() == null) ? 0 : getUploadeddatetime().hashCode());
        result = prime * result + ((getIsdisable() == null) ? 0 : getIsdisable().hashCode());
        result = prime * result + ((getCreationtimestamp() == null) ? 0 : getCreationtimestamp().hashCode());
        return result;
    }
}