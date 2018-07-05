package com.huiyi.meeting.dao.model;

import java.io.Serializable;
import java.util.Date;

public class MeetingHotel implements Serializable {
    private Integer id;

    /**
     * 酒店名
     *
     * @mbg.generated
     */
    private String name;

    private String province;

    /**
     * city
     *
     * @mbg.generated
     */
    private String city;

    /**
     * town
     *
     * @mbg.generated
     */
    private String town;

    /**
     * address
     *
     * @mbg.generated
     */
    private String address;

    /**
     * telphone
     *
     * @mbg.generated
     */
    private String telephone;

    /**
     * 价格
     *
     * @mbg.generated
     */
    private Float price;

    /**
     * 是否有效 Y | N
     *
     * @mbg.generated
     */
    private String validflag;

    /**
     * 有效开始期
     *
     * @mbg.generated
     */
    private Date startvalid;

    /**
     * 有效截止期
     *
     * @mbg.generated
     */
    private Date endvalid;

    /**
     * 负责人ID
     *
     * @mbg.generated
     */
    private String personincharge;

    /**
     * 相关附件
     *
     * @mbg.generated
     */
    private String taskattachment;

    private Long creationtimestamp;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getValidflag() {
        return validflag;
    }

    public void setValidflag(String validflag) {
        this.validflag = validflag;
    }

    public Date getStartvalid() {
        return startvalid;
    }

    public void setStartvalid(Date startvalid) {
        this.startvalid = startvalid;
    }

    public Date getEndvalid() {
        return endvalid;
    }

    public void setEndvalid(Date endvalid) {
        this.endvalid = endvalid;
    }

    public String getPersonincharge() {
        return personincharge;
    }

    public void setPersonincharge(String personincharge) {
        this.personincharge = personincharge;
    }

    public String getTaskattachment() {
        return taskattachment;
    }

    public void setTaskattachment(String taskattachment) {
        this.taskattachment = taskattachment;
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
        sb.append(", name=").append(name);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", town=").append(town);
        sb.append(", address=").append(address);
        sb.append(", telephone=").append(telephone);
        sb.append(", price=").append(price);
        sb.append(", validflag=").append(validflag);
        sb.append(", startvalid=").append(startvalid);
        sb.append(", endvalid=").append(endvalid);
        sb.append(", personincharge=").append(personincharge);
        sb.append(", taskattachment=").append(taskattachment);
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
        MeetingHotel other = (MeetingHotel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getTown() == null ? other.getTown() == null : this.getTown().equals(other.getTown()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getValidflag() == null ? other.getValidflag() == null : this.getValidflag().equals(other.getValidflag()))
            && (this.getStartvalid() == null ? other.getStartvalid() == null : this.getStartvalid().equals(other.getStartvalid()))
            && (this.getEndvalid() == null ? other.getEndvalid() == null : this.getEndvalid().equals(other.getEndvalid()))
            && (this.getPersonincharge() == null ? other.getPersonincharge() == null : this.getPersonincharge().equals(other.getPersonincharge()))
            && (this.getTaskattachment() == null ? other.getTaskattachment() == null : this.getTaskattachment().equals(other.getTaskattachment()))
            && (this.getCreationtimestamp() == null ? other.getCreationtimestamp() == null : this.getCreationtimestamp().equals(other.getCreationtimestamp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getTown() == null) ? 0 : getTown().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getValidflag() == null) ? 0 : getValidflag().hashCode());
        result = prime * result + ((getStartvalid() == null) ? 0 : getStartvalid().hashCode());
        result = prime * result + ((getEndvalid() == null) ? 0 : getEndvalid().hashCode());
        result = prime * result + ((getPersonincharge() == null) ? 0 : getPersonincharge().hashCode());
        result = prime * result + ((getTaskattachment() == null) ? 0 : getTaskattachment().hashCode());
        result = prime * result + ((getCreationtimestamp() == null) ? 0 : getCreationtimestamp().hashCode());
        return result;
    }
}