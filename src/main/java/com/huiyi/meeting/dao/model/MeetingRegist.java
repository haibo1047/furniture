package com.huiyi.meeting.dao.model;

import java.io.Serializable;
import java.util.Date;

public class MeetingRegist implements Serializable {
    private Integer id;

    /**
     * 款项确认到账时间
     *
     * @mbg.generated
     */
    private Date feeconfirmtime;

    /**
     * 是否开票  YES | NO
     *
     * @mbg.generated
     */
    private String isinvoiced;

    private Long creationtimestamp;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFeeconfirmtime() {
        return feeconfirmtime;
    }

    public void setFeeconfirmtime(Date feeconfirmtime) {
        this.feeconfirmtime = feeconfirmtime;
    }

    public String getIsinvoiced() {
        return isinvoiced;
    }

    public void setIsinvoiced(String isinvoiced) {
        this.isinvoiced = isinvoiced;
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
        sb.append(", feeconfirmtime=").append(feeconfirmtime);
        sb.append(", isinvoiced=").append(isinvoiced);
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
        MeetingRegist other = (MeetingRegist) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFeeconfirmtime() == null ? other.getFeeconfirmtime() == null : this.getFeeconfirmtime().equals(other.getFeeconfirmtime()))
            && (this.getIsinvoiced() == null ? other.getIsinvoiced() == null : this.getIsinvoiced().equals(other.getIsinvoiced()))
            && (this.getCreationtimestamp() == null ? other.getCreationtimestamp() == null : this.getCreationtimestamp().equals(other.getCreationtimestamp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFeeconfirmtime() == null) ? 0 : getFeeconfirmtime().hashCode());
        result = prime * result + ((getIsinvoiced() == null) ? 0 : getIsinvoiced().hashCode());
        result = prime * result + ((getCreationtimestamp() == null) ? 0 : getCreationtimestamp().hashCode());
        return result;
    }
}