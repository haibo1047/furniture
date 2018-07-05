package com.huiyi.meeting.dao.model;

import java.io.Serializable;

public class MeetingForum implements Serializable {
    private Integer id;

    private String topic;

    /**
     * 征询嘉宾的到的问题汇总
     *
     * @mbg.generated
     */
    private String agenda;

    /**
     * 问题的个数
     *
     * @mbg.generated
     */
    private Integer numofquestion;

    /**
     * 专题讨论会的场次
     *
     * @mbg.generated
     */
    private String roundname;

    /**
     * 该ID应该是一届会议的
     *
     * @mbg.generated
     */
    private Integer meetingid;

    private Long creationtimestamp;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public Integer getNumofquestion() {
        return numofquestion;
    }

    public void setNumofquestion(Integer numofquestion) {
        this.numofquestion = numofquestion;
    }

    public String getRoundname() {
        return roundname;
    }

    public void setRoundname(String roundname) {
        this.roundname = roundname;
    }

    public Integer getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(Integer meetingid) {
        this.meetingid = meetingid;
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
        sb.append(", topic=").append(topic);
        sb.append(", agenda=").append(agenda);
        sb.append(", numofquestion=").append(numofquestion);
        sb.append(", roundname=").append(roundname);
        sb.append(", meetingid=").append(meetingid);
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
        MeetingForum other = (MeetingForum) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTopic() == null ? other.getTopic() == null : this.getTopic().equals(other.getTopic()))
            && (this.getAgenda() == null ? other.getAgenda() == null : this.getAgenda().equals(other.getAgenda()))
            && (this.getNumofquestion() == null ? other.getNumofquestion() == null : this.getNumofquestion().equals(other.getNumofquestion()))
            && (this.getRoundname() == null ? other.getRoundname() == null : this.getRoundname().equals(other.getRoundname()))
            && (this.getMeetingid() == null ? other.getMeetingid() == null : this.getMeetingid().equals(other.getMeetingid()))
            && (this.getCreationtimestamp() == null ? other.getCreationtimestamp() == null : this.getCreationtimestamp().equals(other.getCreationtimestamp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTopic() == null) ? 0 : getTopic().hashCode());
        result = prime * result + ((getAgenda() == null) ? 0 : getAgenda().hashCode());
        result = prime * result + ((getNumofquestion() == null) ? 0 : getNumofquestion().hashCode());
        result = prime * result + ((getRoundname() == null) ? 0 : getRoundname().hashCode());
        result = prime * result + ((getMeetingid() == null) ? 0 : getMeetingid().hashCode());
        result = prime * result + ((getCreationtimestamp() == null) ? 0 : getCreationtimestamp().hashCode());
        return result;
    }
}