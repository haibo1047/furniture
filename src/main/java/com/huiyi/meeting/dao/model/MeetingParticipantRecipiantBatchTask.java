package com.huiyi.meeting.dao.model;

import java.io.Serializable;
import java.util.Date;

public class MeetingParticipantRecipiantBatchTask implements Serializable {
    private Integer id;

    /**
     * 任务类型，仅仅支持以下类型： 接机 | 安排酒店 | 安排会议室
     *
     * @mbg.generated
     */
    private String type;

    /**
     * 火车站，机场id
     *
     * @mbg.generated
     */
    private Integer stationid;

    /**
     * 酒店id
     *
     * @mbg.generated
     */
    private Integer hotelid;

    /**
     * 会议室id
     *
     * @mbg.generated
     */
    private Integer meetingroomid;

    /**
     * 有效截止期
     *
     * @mbg.generated
     */
    private Date starttime;

    /**
     * 有效截止期
     *
     * @mbg.generated
     */
    private Date endtime;

    /**
     * 负责人ID
     *
     * @mbg.generated
     */
    private String personincharge;

    /**
     * 相关附件
     *
     * @mbg.generated
     */
    private String attachment;

    private Long creationtimestamp;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStationid() {
        return stationid;
    }

    public void setStationid(Integer stationid) {
        this.stationid = stationid;
    }

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public Integer getMeetingroomid() {
        return meetingroomid;
    }

    public void setMeetingroomid(Integer meetingroomid) {
        this.meetingroomid = meetingroomid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getPersonincharge() {
        return personincharge;
    }

    public void setPersonincharge(String personincharge) {
        this.personincharge = personincharge;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
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
        sb.append(", type=").append(type);
        sb.append(", stationid=").append(stationid);
        sb.append(", hotelid=").append(hotelid);
        sb.append(", meetingroomid=").append(meetingroomid);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", personincharge=").append(personincharge);
        sb.append(", attachment=").append(attachment);
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
        MeetingParticipantRecipiantBatchTask other = (MeetingParticipantRecipiantBatchTask) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getStationid() == null ? other.getStationid() == null : this.getStationid().equals(other.getStationid()))
            && (this.getHotelid() == null ? other.getHotelid() == null : this.getHotelid().equals(other.getHotelid()))
            && (this.getMeetingroomid() == null ? other.getMeetingroomid() == null : this.getMeetingroomid().equals(other.getMeetingroomid()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getPersonincharge() == null ? other.getPersonincharge() == null : this.getPersonincharge().equals(other.getPersonincharge()))
            && (this.getAttachment() == null ? other.getAttachment() == null : this.getAttachment().equals(other.getAttachment()))
            && (this.getCreationtimestamp() == null ? other.getCreationtimestamp() == null : this.getCreationtimestamp().equals(other.getCreationtimestamp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getStationid() == null) ? 0 : getStationid().hashCode());
        result = prime * result + ((getHotelid() == null) ? 0 : getHotelid().hashCode());
        result = prime * result + ((getMeetingroomid() == null) ? 0 : getMeetingroomid().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getPersonincharge() == null) ? 0 : getPersonincharge().hashCode());
        result = prime * result + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        result = prime * result + ((getCreationtimestamp() == null) ? 0 : getCreationtimestamp().hashCode());
        return result;
    }
}