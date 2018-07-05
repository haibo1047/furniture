package com.huiyi.meeting.dao.model;

import java.io.Serializable;

public class MeetingPartiRegist implements Serializable {
    private Integer id;

    private Integer participantid;

    private Integer registid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParticipantid() {
        return participantid;
    }

    public void setParticipantid(Integer participantid) {
        this.participantid = participantid;
    }

    public Integer getRegistid() {
        return registid;
    }

    public void setRegistid(Integer registid) {
        this.registid = registid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", participantid=").append(participantid);
        sb.append(", registid=").append(registid);
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
        MeetingPartiRegist other = (MeetingPartiRegist) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParticipantid() == null ? other.getParticipantid() == null : this.getParticipantid().equals(other.getParticipantid()))
            && (this.getRegistid() == null ? other.getRegistid() == null : this.getRegistid().equals(other.getRegistid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParticipantid() == null) ? 0 : getParticipantid().hashCode());
        result = prime * result + ((getRegistid() == null) ? 0 : getRegistid().hashCode());
        return result;
    }
}