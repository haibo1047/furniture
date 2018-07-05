package com.huiyi.meeting.dao.model;

import java.io.Serializable;

public class MeetingStation implements Serializable {
    private Integer id;

    /**
     * 机场车站名
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 目前支持一下几种：  机场 | 火车站 
     *
     * @mbg.generated
     */
    private String stationtype;

    /**
     * province
     *
     * @mbg.generated
     */
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

    public String getStationtype() {
        return stationtype;
    }

    public void setStationtype(String stationtype) {
        this.stationtype = stationtype;
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
        sb.append(", stationtype=").append(stationtype);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", town=").append(town);
        sb.append(", address=").append(address);
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
        MeetingStation other = (MeetingStation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getStationtype() == null ? other.getStationtype() == null : this.getStationtype().equals(other.getStationtype()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getTown() == null ? other.getTown() == null : this.getTown().equals(other.getTown()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
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
        result = prime * result + ((getStationtype() == null) ? 0 : getStationtype().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getTown() == null) ? 0 : getTown().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getPersonincharge() == null) ? 0 : getPersonincharge().hashCode());
        result = prime * result + ((getTaskattachment() == null) ? 0 : getTaskattachment().hashCode());
        result = prime * result + ((getCreationtimestamp() == null) ? 0 : getCreationtimestamp().hashCode());
        return result;
    }
}