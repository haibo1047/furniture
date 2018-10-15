package com.ylsq.frame.tianze.strategy.dao.model;

import com.ylsq.frame.common.base.BaseModel;
import java.io.Serializable;
import java.util.Date;

public class TzStrategyWatermark implements BaseModel, Serializable {
    /**
     * 编号
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 策略ID
     *
     * @mbg.generated
     */
    private Long strategyId;

    /**
     * 水印内容
     *
     * @mbg.generated
     */
    private String content;

    /**
     * 显示用户名
     *
     * @mbg.generated
     */
    private Integer displayUsrname;

    /**
     * 显示计算机名
     *
     * @mbg.generated
     */
    private Integer displayPcname;

    /**
     * 显示终端IP
     *
     * @mbg.generated
     */
    private Integer displayIp;

    /**
     * 显示登录时间
     *
     * @mbg.generated
     */
    private Integer displayLoginTime;

    /**
     * 位置-居中
     *
     * @mbg.generated
     */
    private Integer posCenter;

    /**
     * 位置-左上
     *
     * @mbg.generated
     */
    private Integer posLefttop;

    /**
     * 位置-左下
     *
     * @mbg.generated
     */
    private Integer posLeftbottom;

    /**
     * 位置-右上
     *
     * @mbg.generated
     */
    private Integer posRighttop;

    /**
     * 位置-右下
     *
     * @mbg.generated
     */
    private Integer posRightbottom;

    /**
     * 版式
     *
     * @mbg.generated
     */
    private String layout;

    /**
     * 显示条件
     *
     * @mbg.generated
     */
    private String displayCondition;

    /**
     * 透明度
     *
     * @mbg.generated
     */
    private Integer transparency;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 创建人
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * 记录状态
     *
     * @mbg.generated
     */
    private Integer recStatus;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getDisplayUsrname() {
        return displayUsrname;
    }

    public void setDisplayUsrname(Integer displayUsrname) {
        this.displayUsrname = displayUsrname;
    }

    public Integer getDisplayPcname() {
        return displayPcname;
    }

    public void setDisplayPcname(Integer displayPcname) {
        this.displayPcname = displayPcname;
    }

    public Integer getDisplayIp() {
        return displayIp;
    }

    public void setDisplayIp(Integer displayIp) {
        this.displayIp = displayIp;
    }

    public Integer getDisplayLoginTime() {
        return displayLoginTime;
    }

    public void setDisplayLoginTime(Integer displayLoginTime) {
        this.displayLoginTime = displayLoginTime;
    }

    public Integer getPosCenter() {
        return posCenter;
    }

    public void setPosCenter(Integer posCenter) {
        this.posCenter = posCenter;
    }

    public Integer getPosLefttop() {
        return posLefttop;
    }

    public void setPosLefttop(Integer posLefttop) {
        this.posLefttop = posLefttop;
    }

    public Integer getPosLeftbottom() {
        return posLeftbottom;
    }

    public void setPosLeftbottom(Integer posLeftbottom) {
        this.posLeftbottom = posLeftbottom;
    }

    public Integer getPosRighttop() {
        return posRighttop;
    }

    public void setPosRighttop(Integer posRighttop) {
        this.posRighttop = posRighttop;
    }

    public Integer getPosRightbottom() {
        return posRightbottom;
    }

    public void setPosRightbottom(Integer posRightbottom) {
        this.posRightbottom = posRightbottom;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getDisplayCondition() {
        return displayCondition;
    }

    public void setDisplayCondition(String displayCondition) {
        this.displayCondition = displayCondition;
    }

    public Integer getTransparency() {
        return transparency;
    }

    public void setTransparency(Integer transparency) {
        this.transparency = transparency;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Integer getRecStatus() {
        return recStatus;
    }

    public void setRecStatus(Integer recStatus) {
        this.recStatus = recStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", strategyId=").append(strategyId);
        sb.append(", content=").append(content);
        sb.append(", displayUsrname=").append(displayUsrname);
        sb.append(", displayPcname=").append(displayPcname);
        sb.append(", displayIp=").append(displayIp);
        sb.append(", displayLoginTime=").append(displayLoginTime);
        sb.append(", posCenter=").append(posCenter);
        sb.append(", posLefttop=").append(posLefttop);
        sb.append(", posLeftbottom=").append(posLeftbottom);
        sb.append(", posRighttop=").append(posRighttop);
        sb.append(", posRightbottom=").append(posRightbottom);
        sb.append(", layout=").append(layout);
        sb.append(", displayCondition=").append(displayCondition);
        sb.append(", transparency=").append(transparency);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", recStatus=").append(recStatus);
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
        TzStrategyWatermark other = (TzStrategyWatermark) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStrategyId() == null ? other.getStrategyId() == null : this.getStrategyId().equals(other.getStrategyId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getDisplayUsrname() == null ? other.getDisplayUsrname() == null : this.getDisplayUsrname().equals(other.getDisplayUsrname()))
            && (this.getDisplayPcname() == null ? other.getDisplayPcname() == null : this.getDisplayPcname().equals(other.getDisplayPcname()))
            && (this.getDisplayIp() == null ? other.getDisplayIp() == null : this.getDisplayIp().equals(other.getDisplayIp()))
            && (this.getDisplayLoginTime() == null ? other.getDisplayLoginTime() == null : this.getDisplayLoginTime().equals(other.getDisplayLoginTime()))
            && (this.getPosCenter() == null ? other.getPosCenter() == null : this.getPosCenter().equals(other.getPosCenter()))
            && (this.getPosLefttop() == null ? other.getPosLefttop() == null : this.getPosLefttop().equals(other.getPosLefttop()))
            && (this.getPosLeftbottom() == null ? other.getPosLeftbottom() == null : this.getPosLeftbottom().equals(other.getPosLeftbottom()))
            && (this.getPosRighttop() == null ? other.getPosRighttop() == null : this.getPosRighttop().equals(other.getPosRighttop()))
            && (this.getPosRightbottom() == null ? other.getPosRightbottom() == null : this.getPosRightbottom().equals(other.getPosRightbottom()))
            && (this.getLayout() == null ? other.getLayout() == null : this.getLayout().equals(other.getLayout()))
            && (this.getDisplayCondition() == null ? other.getDisplayCondition() == null : this.getDisplayCondition().equals(other.getDisplayCondition()))
            && (this.getTransparency() == null ? other.getTransparency() == null : this.getTransparency().equals(other.getTransparency()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getRecStatus() == null ? other.getRecStatus() == null : this.getRecStatus().equals(other.getRecStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStrategyId() == null) ? 0 : getStrategyId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getDisplayUsrname() == null) ? 0 : getDisplayUsrname().hashCode());
        result = prime * result + ((getDisplayPcname() == null) ? 0 : getDisplayPcname().hashCode());
        result = prime * result + ((getDisplayIp() == null) ? 0 : getDisplayIp().hashCode());
        result = prime * result + ((getDisplayLoginTime() == null) ? 0 : getDisplayLoginTime().hashCode());
        result = prime * result + ((getPosCenter() == null) ? 0 : getPosCenter().hashCode());
        result = prime * result + ((getPosLefttop() == null) ? 0 : getPosLefttop().hashCode());
        result = prime * result + ((getPosLeftbottom() == null) ? 0 : getPosLeftbottom().hashCode());
        result = prime * result + ((getPosRighttop() == null) ? 0 : getPosRighttop().hashCode());
        result = prime * result + ((getPosRightbottom() == null) ? 0 : getPosRightbottom().hashCode());
        result = prime * result + ((getLayout() == null) ? 0 : getLayout().hashCode());
        result = prime * result + ((getDisplayCondition() == null) ? 0 : getDisplayCondition().hashCode());
        result = prime * result + ((getTransparency() == null) ? 0 : getTransparency().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getRecStatus() == null) ? 0 : getRecStatus().hashCode());
        return result;
    }
}