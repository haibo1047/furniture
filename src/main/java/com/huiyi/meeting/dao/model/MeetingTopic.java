package com.huiyi.meeting.dao.model;

import java.io.Serializable;

public class MeetingTopic implements Serializable {
    private Integer id;

    /**
     * 话题
     *
     * @mbg.generated
     */
    private String topic;

    private String details;

    /**
     * 提出者
     *
     * @mbg.generated
     */
    private Integer proposer;

    /**
     * 状态：提出 | 审核通过 | 审核不通过 | 上传至问答平台
     *
     * @mbg.generated
     */
    private String status;

    /**
     * 与该界会议关联
     *
     * @mbg.generated
     */
    private Integer meetingid;

    /**
     * 与该专题研讨会关联
     *
     * @mbg.generated
     */
    private Integer forumid;

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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getProposer() {
        return proposer;
    }

    public void setProposer(Integer proposer) {
        this.proposer = proposer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(Integer meetingid) {
        this.meetingid = meetingid;
    }

    public Integer getForumid() {
        return forumid;
    }

    public void setForumid(Integer forumid) {
        this.forumid = forumid;
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
        sb.append(", details=").append(details);
        sb.append(", proposer=").append(proposer);
        sb.append(", status=").append(status);
        sb.append(", meetingid=").append(meetingid);
        sb.append(", forumid=").append(forumid);
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
        MeetingTopic other = (MeetingTopic) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTopic() == null ? other.getTopic() == null : this.getTopic().equals(other.getTopic()))
            && (this.getDetails() == null ? other.getDetails() == null : this.getDetails().equals(other.getDetails()))
            && (this.getProposer() == null ? other.getProposer() == null : this.getProposer().equals(other.getProposer()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getMeetingid() == null ? other.getMeetingid() == null : this.getMeetingid().equals(other.getMeetingid()))
            && (this.getForumid() == null ? other.getForumid() == null : this.getForumid().equals(other.getForumid()))
            && (this.getCreationtimestamp() == null ? other.getCreationtimestamp() == null : this.getCreationtimestamp().equals(other.getCreationtimestamp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTopic() == null) ? 0 : getTopic().hashCode());
        result = prime * result + ((getDetails() == null) ? 0 : getDetails().hashCode());
        result = prime * result + ((getProposer() == null) ? 0 : getProposer().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getMeetingid() == null) ? 0 : getMeetingid().hashCode());
        result = prime * result + ((getForumid() == null) ? 0 : getForumid().hashCode());
        result = prime * result + ((getCreationtimestamp() == null) ? 0 : getCreationtimestamp().hashCode());
        return result;
    }
}