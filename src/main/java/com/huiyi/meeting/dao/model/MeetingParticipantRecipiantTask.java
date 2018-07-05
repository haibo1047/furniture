package com.huiyi.meeting.dao.model;

import java.io.Serializable;

public class MeetingParticipantRecipiantTask implements Serializable {
    private Integer id;

    /**
     * 参会人员(MEETING_Participant)的id
     *
     * @mbg.generated
     */
    private Integer participantid;

    /**
     * 批次，来源于：MEETING_Participant_Recipiant_Batch_Task
     *
     * @mbg.generated
     */
    private Integer batchid;

    /**
     * 完成状态： 开始 | 进行中 | 结束
     *
     * @mbg.generated
     */
    private String completestatus;

    private Long creationtimestamp;

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

    public Integer getBatchid() {
        return batchid;
    }

    public void setBatchid(Integer batchid) {
        this.batchid = batchid;
    }

    public String getCompletestatus() {
        return completestatus;
    }

    public void setCompletestatus(String completestatus) {
        this.completestatus = completestatus;
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
        sb.append(", participantid=").append(participantid);
        sb.append(", batchid=").append(batchid);
        sb.append(", completestatus=").append(completestatus);
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
        MeetingParticipantRecipiantTask other = (MeetingParticipantRecipiantTask) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParticipantid() == null ? other.getParticipantid() == null : this.getParticipantid().equals(other.getParticipantid()))
            && (this.getBatchid() == null ? other.getBatchid() == null : this.getBatchid().equals(other.getBatchid()))
            && (this.getCompletestatus() == null ? other.getCompletestatus() == null : this.getCompletestatus().equals(other.getCompletestatus()))
            && (this.getCreationtimestamp() == null ? other.getCreationtimestamp() == null : this.getCreationtimestamp().equals(other.getCreationtimestamp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParticipantid() == null) ? 0 : getParticipantid().hashCode());
        result = prime * result + ((getBatchid() == null) ? 0 : getBatchid().hashCode());
        result = prime * result + ((getCompletestatus() == null) ? 0 : getCompletestatus().hashCode());
        result = prime * result + ((getCreationtimestamp() == null) ? 0 : getCreationtimestamp().hashCode());
        return result;
    }
}