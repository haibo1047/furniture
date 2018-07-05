package com.huiyi.meeting.dao.model;

import java.io.Serializable;
import java.util.Date;

public class MeetingCommonTask implements Serializable {
    private Integer id;

    /**
     * 任务类型，应该包含固定个数的类型，比如准备材料， 上传问题到平台
     *
     * @mbg.generated
     */
    private String tasktype;

    /**
     * Activiti流程使用的id
     *
     * @mbg.generated
     */
    private String activititaskid;

    /**
     * formkey是工作流的一个字段，主要用于如何展示页面
     *
     * @mbg.generated
     */
    private String formkey;

    /**
     * 新建 | 进行中 | 待批准 | 结束
     *
     * @mbg.generated
     */
    private String taskstatus;

    /**
     * userId 使用逗号分割
     *
     * @mbg.generated
     */
    private String taskviewers;

    /**
     * 任务所有者 userId 使用逗号分割
     *
     * @mbg.generated
     */
    private String taskowner;

    /**
     * userId 使用逗号分割
     *
     * @mbg.generated
     */
    private String taskexecutors;

    /**
     * 任务详细描述
     *
     * @mbg.generated
     */
    private String taskdescription;

    /**
     * 任务简单描述
     *
     * @mbg.generated
     */
    private String tasktitle;

    /**
     * 任务附件，可以上传多个附件，他们被拼接为一个字符串
     *
     * @mbg.generated
     */
    private String taskattachment;

    /**
     * 开始时间
     *
     * @mbg.generated
     */
    private Date starttime;

    /**
     * 结束时间
     *
     * @mbg.generated
     */
    private Date endtime;

    /**
     * 会议的id  meetingId
     *
     * @mbg.generated
     */
    private Integer meetingid;

    /**
     * 任务需要审批者 userId 使用逗号分割
     *
     * @mbg.generated
     */
    private String taskapprover;

    /**
     * 任务需要审批否？  TRUE | FALSE
     *
     * @mbg.generated
     */
    private String needapproval;

    private Long creationtimestamp;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTasktype() {
        return tasktype;
    }

    public void setTasktype(String tasktype) {
        this.tasktype = tasktype;
    }

    public String getActivititaskid() {
        return activititaskid;
    }

    public void setActivititaskid(String activititaskid) {
        this.activititaskid = activititaskid;
    }

    public String getFormkey() {
        return formkey;
    }

    public void setFormkey(String formkey) {
        this.formkey = formkey;
    }

    public String getTaskstatus() {
        return taskstatus;
    }

    public void setTaskstatus(String taskstatus) {
        this.taskstatus = taskstatus;
    }

    public String getTaskviewers() {
        return taskviewers;
    }

    public void setTaskviewers(String taskviewers) {
        this.taskviewers = taskviewers;
    }

    public String getTaskowner() {
        return taskowner;
    }

    public void setTaskowner(String taskowner) {
        this.taskowner = taskowner;
    }

    public String getTaskexecutors() {
        return taskexecutors;
    }

    public void setTaskexecutors(String taskexecutors) {
        this.taskexecutors = taskexecutors;
    }

    public String getTaskdescription() {
        return taskdescription;
    }

    public void setTaskdescription(String taskdescription) {
        this.taskdescription = taskdescription;
    }

    public String getTasktitle() {
        return tasktitle;
    }

    public void setTasktitle(String tasktitle) {
        this.tasktitle = tasktitle;
    }

    public String getTaskattachment() {
        return taskattachment;
    }

    public void setTaskattachment(String taskattachment) {
        this.taskattachment = taskattachment;
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

    public Integer getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(Integer meetingid) {
        this.meetingid = meetingid;
    }

    public String getTaskapprover() {
        return taskapprover;
    }

    public void setTaskapprover(String taskapprover) {
        this.taskapprover = taskapprover;
    }

    public String getNeedapproval() {
        return needapproval;
    }

    public void setNeedapproval(String needapproval) {
        this.needapproval = needapproval;
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
        sb.append(", tasktype=").append(tasktype);
        sb.append(", activititaskid=").append(activititaskid);
        sb.append(", formkey=").append(formkey);
        sb.append(", taskstatus=").append(taskstatus);
        sb.append(", taskviewers=").append(taskviewers);
        sb.append(", taskowner=").append(taskowner);
        sb.append(", taskexecutors=").append(taskexecutors);
        sb.append(", taskdescription=").append(taskdescription);
        sb.append(", tasktitle=").append(tasktitle);
        sb.append(", taskattachment=").append(taskattachment);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", meetingid=").append(meetingid);
        sb.append(", taskapprover=").append(taskapprover);
        sb.append(", needapproval=").append(needapproval);
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
        MeetingCommonTask other = (MeetingCommonTask) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTasktype() == null ? other.getTasktype() == null : this.getTasktype().equals(other.getTasktype()))
            && (this.getActivititaskid() == null ? other.getActivititaskid() == null : this.getActivititaskid().equals(other.getActivititaskid()))
            && (this.getFormkey() == null ? other.getFormkey() == null : this.getFormkey().equals(other.getFormkey()))
            && (this.getTaskstatus() == null ? other.getTaskstatus() == null : this.getTaskstatus().equals(other.getTaskstatus()))
            && (this.getTaskviewers() == null ? other.getTaskviewers() == null : this.getTaskviewers().equals(other.getTaskviewers()))
            && (this.getTaskowner() == null ? other.getTaskowner() == null : this.getTaskowner().equals(other.getTaskowner()))
            && (this.getTaskexecutors() == null ? other.getTaskexecutors() == null : this.getTaskexecutors().equals(other.getTaskexecutors()))
            && (this.getTaskdescription() == null ? other.getTaskdescription() == null : this.getTaskdescription().equals(other.getTaskdescription()))
            && (this.getTasktitle() == null ? other.getTasktitle() == null : this.getTasktitle().equals(other.getTasktitle()))
            && (this.getTaskattachment() == null ? other.getTaskattachment() == null : this.getTaskattachment().equals(other.getTaskattachment()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getMeetingid() == null ? other.getMeetingid() == null : this.getMeetingid().equals(other.getMeetingid()))
            && (this.getTaskapprover() == null ? other.getTaskapprover() == null : this.getTaskapprover().equals(other.getTaskapprover()))
            && (this.getNeedapproval() == null ? other.getNeedapproval() == null : this.getNeedapproval().equals(other.getNeedapproval()))
            && (this.getCreationtimestamp() == null ? other.getCreationtimestamp() == null : this.getCreationtimestamp().equals(other.getCreationtimestamp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTasktype() == null) ? 0 : getTasktype().hashCode());
        result = prime * result + ((getActivititaskid() == null) ? 0 : getActivititaskid().hashCode());
        result = prime * result + ((getFormkey() == null) ? 0 : getFormkey().hashCode());
        result = prime * result + ((getTaskstatus() == null) ? 0 : getTaskstatus().hashCode());
        result = prime * result + ((getTaskviewers() == null) ? 0 : getTaskviewers().hashCode());
        result = prime * result + ((getTaskowner() == null) ? 0 : getTaskowner().hashCode());
        result = prime * result + ((getTaskexecutors() == null) ? 0 : getTaskexecutors().hashCode());
        result = prime * result + ((getTaskdescription() == null) ? 0 : getTaskdescription().hashCode());
        result = prime * result + ((getTasktitle() == null) ? 0 : getTasktitle().hashCode());
        result = prime * result + ((getTaskattachment() == null) ? 0 : getTaskattachment().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getMeetingid() == null) ? 0 : getMeetingid().hashCode());
        result = prime * result + ((getTaskapprover() == null) ? 0 : getTaskapprover().hashCode());
        result = prime * result + ((getNeedapproval() == null) ? 0 : getNeedapproval().hashCode());
        result = prime * result + ((getCreationtimestamp() == null) ? 0 : getCreationtimestamp().hashCode());
        return result;
    }
}