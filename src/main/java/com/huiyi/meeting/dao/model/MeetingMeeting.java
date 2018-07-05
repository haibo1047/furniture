package com.huiyi.meeting.dao.model;

import java.io.Serializable;
import java.util.Date;

public class MeetingMeeting implements Serializable {
    private Integer id;

    private String meetingsubject;

    private String introduction;

    private Date beginat;

    private Date endat;

    private String organizer;

    private Integer participantnumber;

    private String address;

    private String contactinfo;

    private Long creationtimestamp;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeetingsubject() {
        return meetingsubject;
    }

    public void setMeetingsubject(String meetingsubject) {
        this.meetingsubject = meetingsubject;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Date getBeginat() {
        return beginat;
    }

    public void setBeginat(Date beginat) {
        this.beginat = beginat;
    }

    public Date getEndat() {
        return endat;
    }

    public void setEndat(Date endat) {
        this.endat = endat;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public Integer getParticipantnumber() {
        return participantnumber;
    }

    public void setParticipantnumber(Integer participantnumber) {
        this.participantnumber = participantnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(String contactinfo) {
        this.contactinfo = contactinfo;
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
        sb.append(", meetingsubject=").append(meetingsubject);
        sb.append(", introduction=").append(introduction);
        sb.append(", beginat=").append(beginat);
        sb.append(", endat=").append(endat);
        sb.append(", organizer=").append(organizer);
        sb.append(", participantnumber=").append(participantnumber);
        sb.append(", address=").append(address);
        sb.append(", contactinfo=").append(contactinfo);
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
        MeetingMeeting other = (MeetingMeeting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMeetingsubject() == null ? other.getMeetingsubject() == null : this.getMeetingsubject().equals(other.getMeetingsubject()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()))
            && (this.getBeginat() == null ? other.getBeginat() == null : this.getBeginat().equals(other.getBeginat()))
            && (this.getEndat() == null ? other.getEndat() == null : this.getEndat().equals(other.getEndat()))
            && (this.getOrganizer() == null ? other.getOrganizer() == null : this.getOrganizer().equals(other.getOrganizer()))
            && (this.getParticipantnumber() == null ? other.getParticipantnumber() == null : this.getParticipantnumber().equals(other.getParticipantnumber()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getContactinfo() == null ? other.getContactinfo() == null : this.getContactinfo().equals(other.getContactinfo()))
            && (this.getCreationtimestamp() == null ? other.getCreationtimestamp() == null : this.getCreationtimestamp().equals(other.getCreationtimestamp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMeetingsubject() == null) ? 0 : getMeetingsubject().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        result = prime * result + ((getBeginat() == null) ? 0 : getBeginat().hashCode());
        result = prime * result + ((getEndat() == null) ? 0 : getEndat().hashCode());
        result = prime * result + ((getOrganizer() == null) ? 0 : getOrganizer().hashCode());
        result = prime * result + ((getParticipantnumber() == null) ? 0 : getParticipantnumber().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getContactinfo() == null) ? 0 : getContactinfo().hashCode());
        result = prime * result + ((getCreationtimestamp() == null) ? 0 : getCreationtimestamp().hashCode());
        return result;
    }
}