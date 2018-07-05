package com.huiyi.meeting.dao.model;

import java.io.Serializable;

public class MeetingScriptmanual implements Serializable {
    private Integer id;

    private String title;

    private String subtitle;

    /**
     * 该稿件的类别，比如是什么产品的
     *
     * @mbg.generated
     */
    private String category;

    /**
     * 该ID应该是participant的
     *
     * @mbg.generated
     */
    private Integer ownerid;

    private Integer seminarid;

    /**
     * 该ID就是会议的BussinessKey的后半部分
     *
     * @mbg.generated
     */
    private Integer meetingid;

    /**
     * 演讲稿
     *
     * @mbg.generated
     */
    private String attachmentmanual;

    /**
     * 演讲稿翻译版
     *
     * @mbg.generated
     */
    private String attachmenttranslated;

    private Long creationtimestamp;

    /**
     * 状态包括：新建，催稿中，翻译中，检查中，排版中，印刷中，回发中，完毕
     *
     * @mbg.generated
     */
    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

    public Integer getSeminarid() {
        return seminarid;
    }

    public void setSeminarid(Integer seminarid) {
        this.seminarid = seminarid;
    }

    public Integer getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(Integer meetingid) {
        this.meetingid = meetingid;
    }

    public String getAttachmentmanual() {
        return attachmentmanual;
    }

    public void setAttachmentmanual(String attachmentmanual) {
        this.attachmentmanual = attachmentmanual;
    }

    public String getAttachmenttranslated() {
        return attachmenttranslated;
    }

    public void setAttachmenttranslated(String attachmenttranslated) {
        this.attachmenttranslated = attachmenttranslated;
    }

    public Long getCreationtimestamp() {
        return creationtimestamp;
    }

    public void setCreationtimestamp(Long creationtimestamp) {
        this.creationtimestamp = creationtimestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", subtitle=").append(subtitle);
        sb.append(", category=").append(category);
        sb.append(", ownerid=").append(ownerid);
        sb.append(", seminarid=").append(seminarid);
        sb.append(", meetingid=").append(meetingid);
        sb.append(", attachmentmanual=").append(attachmentmanual);
        sb.append(", attachmenttranslated=").append(attachmenttranslated);
        sb.append(", creationtimestamp=").append(creationtimestamp);
        sb.append(", status=").append(status);
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
        MeetingScriptmanual other = (MeetingScriptmanual) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getSubtitle() == null ? other.getSubtitle() == null : this.getSubtitle().equals(other.getSubtitle()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getOwnerid() == null ? other.getOwnerid() == null : this.getOwnerid().equals(other.getOwnerid()))
            && (this.getSeminarid() == null ? other.getSeminarid() == null : this.getSeminarid().equals(other.getSeminarid()))
            && (this.getMeetingid() == null ? other.getMeetingid() == null : this.getMeetingid().equals(other.getMeetingid()))
            && (this.getAttachmentmanual() == null ? other.getAttachmentmanual() == null : this.getAttachmentmanual().equals(other.getAttachmentmanual()))
            && (this.getAttachmenttranslated() == null ? other.getAttachmenttranslated() == null : this.getAttachmenttranslated().equals(other.getAttachmenttranslated()))
            && (this.getCreationtimestamp() == null ? other.getCreationtimestamp() == null : this.getCreationtimestamp().equals(other.getCreationtimestamp()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getSubtitle() == null) ? 0 : getSubtitle().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getOwnerid() == null) ? 0 : getOwnerid().hashCode());
        result = prime * result + ((getSeminarid() == null) ? 0 : getSeminarid().hashCode());
        result = prime * result + ((getMeetingid() == null) ? 0 : getMeetingid().hashCode());
        result = prime * result + ((getAttachmentmanual() == null) ? 0 : getAttachmentmanual().hashCode());
        result = prime * result + ((getAttachmenttranslated() == null) ? 0 : getAttachmenttranslated().hashCode());
        result = prime * result + ((getCreationtimestamp() == null) ? 0 : getCreationtimestamp().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}