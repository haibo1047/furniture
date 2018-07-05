package com.huiyi.meeting.dao.model;

import java.io.Serializable;

public class MeetingPartiForum implements Serializable {
    private Integer id;

    private Integer participantid;

    private Integer forumid;

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

    public Integer getForumid() {
        return forumid;
    }

    public void setForumid(Integer forumid) {
        this.forumid = forumid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", participantid=").append(participantid);
        sb.append(", forumid=").append(forumid);
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
        MeetingPartiForum other = (MeetingPartiForum) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParticipantid() == null ? other.getParticipantid() == null : this.getParticipantid().equals(other.getParticipantid()))
            && (this.getForumid() == null ? other.getForumid() == null : this.getForumid().equals(other.getForumid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParticipantid() == null) ? 0 : getParticipantid().hashCode());
        result = prime * result + ((getForumid() == null) ? 0 : getForumid().hashCode());
        return result;
    }
}