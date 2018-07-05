package com.huiyi.meeting.dao.model;

import java.io.Serializable;

public class MeetingTaskCandidate implements Serializable {
    private Integer id;

    /**
     * 与该界会议关联
     *
     * @mbg.generated
     */
    private Integer meetingid;

    /**
     * 流程名
     *
     * @mbg.generated
     */
    private String processname;

    /**
     * 流程任务ID
     *
     * @mbg.generated
     */
    private String taskid;

    /**
     * 用户ID
     *
     * @mbg.generated
     */
    private Integer userid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(Integer meetingid) {
        this.meetingid = meetingid;
    }

    public String getProcessname() {
        return processname;
    }

    public void setProcessname(String processname) {
        this.processname = processname;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", meetingid=").append(meetingid);
        sb.append(", processname=").append(processname);
        sb.append(", taskid=").append(taskid);
        sb.append(", userid=").append(userid);
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
        MeetingTaskCandidate other = (MeetingTaskCandidate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMeetingid() == null ? other.getMeetingid() == null : this.getMeetingid().equals(other.getMeetingid()))
            && (this.getProcessname() == null ? other.getProcessname() == null : this.getProcessname().equals(other.getProcessname()))
            && (this.getTaskid() == null ? other.getTaskid() == null : this.getTaskid().equals(other.getTaskid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMeetingid() == null) ? 0 : getMeetingid().hashCode());
        result = prime * result + ((getProcessname() == null) ? 0 : getProcessname().hashCode());
        result = prime * result + ((getTaskid() == null) ? 0 : getTaskid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        return result;
    }
}