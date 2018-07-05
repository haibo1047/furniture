package com.huiyi.meeting.dao.model;

import java.io.Serializable;
import java.util.Date;

public class MeetingParticipant implements Serializable {
    private Integer id;

    /**
     * 参加的是哪一届会议
     *
     * @mbg.generated
     */
    private Integer meetingid;

    /**
     * 人员名字
     *
     * @mbg.generated
     */
    private String name;

    /**
     * telphone
     *
     * @mbg.generated
     */
    private String telephone;

    /**
     * 所属的公司
     *
     * @mbg.generated
     */
    private String company;

    /**
     * 性别
     *
     * @mbg.generated
     */
    private String gender;

    /**
     * age
     *
     * @mbg.generated
     */
    private Integer age;

    /**
     * address
     *
     * @mbg.generated
     */
    private String address;

    /**
     * 注册时间
     *
     * @mbg.generated
     */
    private Date meetingregistertime;

    /**
     * 感兴趣的产品， 使用逗号分隔
     *
     * @mbg.generated
     */
    private String productofinterest;

    /**
     * 酒店名
     *
     * @mbg.generated
     */
    private String hotel;

    /**
     * 酒店地址
     *
     * @mbg.generated
     */
    private String hoteladdress;

    /**
     * 没有 | 进行中 | 结束
     *
     * @mbg.generated
     */
    private String hotelstatus;

    /**
     * 到达时间
     *
     * @mbg.generated
     */
    private Date arrivaltime;

    /**
     * 离开时间
     *
     * @mbg.generated
     */
    private Date leavetime;

    /**
     * 交通工具
     *
     * @mbg.generated
     */
    private String traffictool;

    /**
     * 接人状态：人员重复需确认 | 未指定 | 进行中 | 结束
     *
     * @mbg.generated
     */
    private String receptionstatus;

    /**
     * 会场座位是否已经安排：没有 | 进行中 | 结束
     *
     * @mbg.generated
     */
    private String seatstatus;

    /**
     * 会场中的位置  横纵坐标
     *
     * @mbg.generated
     */
    private String seat;

    /**
     * 参加那几场专题会, 专场会（forum)的id使用逗号分割，
     *
     * @mbg.generated
     */
    private String forumofinterest;

    /**
     * 是否付费: 付费|非付费
     *
     * @mbg.generated
     */
    private String charged;

    /**
     * 会务费
     *
     * @mbg.generated
     */
    private Float meetingfee;

    /**
     * 会务费付费时间
     *
     * @mbg.generated
     */
    private Date meetingfeepaidtime;

    /**
     * 是否开票: 已开票|未开票
     *
     * @mbg.generated
     */
    private String invoiced;

    /**
     * 嘉宾牌内容
     *
     * @mbg.generated
     */
    private String disguisedguestcardcontent;

    /**
     * 门票
     *
     * @mbg.generated
     */
    private String ticketid;

    /**
     * 赞助商
     *
     * @mbg.generated
     */
    private String sponsor;

    private Long creationtimestamp;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getMeetingregistertime() {
        return meetingregistertime;
    }

    public void setMeetingregistertime(Date meetingregistertime) {
        this.meetingregistertime = meetingregistertime;
    }

    public String getProductofinterest() {
        return productofinterest;
    }

    public void setProductofinterest(String productofinterest) {
        this.productofinterest = productofinterest;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getHoteladdress() {
        return hoteladdress;
    }

    public void setHoteladdress(String hoteladdress) {
        this.hoteladdress = hoteladdress;
    }

    public String getHotelstatus() {
        return hotelstatus;
    }

    public void setHotelstatus(String hotelstatus) {
        this.hotelstatus = hotelstatus;
    }

    public Date getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(Date arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public Date getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(Date leavetime) {
        this.leavetime = leavetime;
    }

    public String getTraffictool() {
        return traffictool;
    }

    public void setTraffictool(String traffictool) {
        this.traffictool = traffictool;
    }

    public String getReceptionstatus() {
        return receptionstatus;
    }

    public void setReceptionstatus(String receptionstatus) {
        this.receptionstatus = receptionstatus;
    }

    public String getSeatstatus() {
        return seatstatus;
    }

    public void setSeatstatus(String seatstatus) {
        this.seatstatus = seatstatus;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getForumofinterest() {
        return forumofinterest;
    }

    public void setForumofinterest(String forumofinterest) {
        this.forumofinterest = forumofinterest;
    }

    public String getCharged() {
        return charged;
    }

    public void setCharged(String charged) {
        this.charged = charged;
    }

    public Float getMeetingfee() {
        return meetingfee;
    }

    public void setMeetingfee(Float meetingfee) {
        this.meetingfee = meetingfee;
    }

    public Date getMeetingfeepaidtime() {
        return meetingfeepaidtime;
    }

    public void setMeetingfeepaidtime(Date meetingfeepaidtime) {
        this.meetingfeepaidtime = meetingfeepaidtime;
    }

    public String getInvoiced() {
        return invoiced;
    }

    public void setInvoiced(String invoiced) {
        this.invoiced = invoiced;
    }

    public String getDisguisedguestcardcontent() {
        return disguisedguestcardcontent;
    }

    public void setDisguisedguestcardcontent(String disguisedguestcardcontent) {
        this.disguisedguestcardcontent = disguisedguestcardcontent;
    }

    public String getTicketid() {
        return ticketid;
    }

    public void setTicketid(String ticketid) {
        this.ticketid = ticketid;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
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
        sb.append(", meetingid=").append(meetingid);
        sb.append(", name=").append(name);
        sb.append(", telephone=").append(telephone);
        sb.append(", company=").append(company);
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", address=").append(address);
        sb.append(", meetingregistertime=").append(meetingregistertime);
        sb.append(", productofinterest=").append(productofinterest);
        sb.append(", hotel=").append(hotel);
        sb.append(", hoteladdress=").append(hoteladdress);
        sb.append(", hotelstatus=").append(hotelstatus);
        sb.append(", arrivaltime=").append(arrivaltime);
        sb.append(", leavetime=").append(leavetime);
        sb.append(", traffictool=").append(traffictool);
        sb.append(", receptionstatus=").append(receptionstatus);
        sb.append(", seatstatus=").append(seatstatus);
        sb.append(", seat=").append(seat);
        sb.append(", forumofinterest=").append(forumofinterest);
        sb.append(", charged=").append(charged);
        sb.append(", meetingfee=").append(meetingfee);
        sb.append(", meetingfeepaidtime=").append(meetingfeepaidtime);
        sb.append(", invoiced=").append(invoiced);
        sb.append(", disguisedguestcardcontent=").append(disguisedguestcardcontent);
        sb.append(", ticketid=").append(ticketid);
        sb.append(", sponsor=").append(sponsor);
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
        MeetingParticipant other = (MeetingParticipant) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMeetingid() == null ? other.getMeetingid() == null : this.getMeetingid().equals(other.getMeetingid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getCompany() == null ? other.getCompany() == null : this.getCompany().equals(other.getCompany()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getMeetingregistertime() == null ? other.getMeetingregistertime() == null : this.getMeetingregistertime().equals(other.getMeetingregistertime()))
            && (this.getProductofinterest() == null ? other.getProductofinterest() == null : this.getProductofinterest().equals(other.getProductofinterest()))
            && (this.getHotel() == null ? other.getHotel() == null : this.getHotel().equals(other.getHotel()))
            && (this.getHoteladdress() == null ? other.getHoteladdress() == null : this.getHoteladdress().equals(other.getHoteladdress()))
            && (this.getHotelstatus() == null ? other.getHotelstatus() == null : this.getHotelstatus().equals(other.getHotelstatus()))
            && (this.getArrivaltime() == null ? other.getArrivaltime() == null : this.getArrivaltime().equals(other.getArrivaltime()))
            && (this.getLeavetime() == null ? other.getLeavetime() == null : this.getLeavetime().equals(other.getLeavetime()))
            && (this.getTraffictool() == null ? other.getTraffictool() == null : this.getTraffictool().equals(other.getTraffictool()))
            && (this.getReceptionstatus() == null ? other.getReceptionstatus() == null : this.getReceptionstatus().equals(other.getReceptionstatus()))
            && (this.getSeatstatus() == null ? other.getSeatstatus() == null : this.getSeatstatus().equals(other.getSeatstatus()))
            && (this.getSeat() == null ? other.getSeat() == null : this.getSeat().equals(other.getSeat()))
            && (this.getForumofinterest() == null ? other.getForumofinterest() == null : this.getForumofinterest().equals(other.getForumofinterest()))
            && (this.getCharged() == null ? other.getCharged() == null : this.getCharged().equals(other.getCharged()))
            && (this.getMeetingfee() == null ? other.getMeetingfee() == null : this.getMeetingfee().equals(other.getMeetingfee()))
            && (this.getMeetingfeepaidtime() == null ? other.getMeetingfeepaidtime() == null : this.getMeetingfeepaidtime().equals(other.getMeetingfeepaidtime()))
            && (this.getInvoiced() == null ? other.getInvoiced() == null : this.getInvoiced().equals(other.getInvoiced()))
            && (this.getDisguisedguestcardcontent() == null ? other.getDisguisedguestcardcontent() == null : this.getDisguisedguestcardcontent().equals(other.getDisguisedguestcardcontent()))
            && (this.getTicketid() == null ? other.getTicketid() == null : this.getTicketid().equals(other.getTicketid()))
            && (this.getSponsor() == null ? other.getSponsor() == null : this.getSponsor().equals(other.getSponsor()))
            && (this.getCreationtimestamp() == null ? other.getCreationtimestamp() == null : this.getCreationtimestamp().equals(other.getCreationtimestamp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMeetingid() == null) ? 0 : getMeetingid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getCompany() == null) ? 0 : getCompany().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getMeetingregistertime() == null) ? 0 : getMeetingregistertime().hashCode());
        result = prime * result + ((getProductofinterest() == null) ? 0 : getProductofinterest().hashCode());
        result = prime * result + ((getHotel() == null) ? 0 : getHotel().hashCode());
        result = prime * result + ((getHoteladdress() == null) ? 0 : getHoteladdress().hashCode());
        result = prime * result + ((getHotelstatus() == null) ? 0 : getHotelstatus().hashCode());
        result = prime * result + ((getArrivaltime() == null) ? 0 : getArrivaltime().hashCode());
        result = prime * result + ((getLeavetime() == null) ? 0 : getLeavetime().hashCode());
        result = prime * result + ((getTraffictool() == null) ? 0 : getTraffictool().hashCode());
        result = prime * result + ((getReceptionstatus() == null) ? 0 : getReceptionstatus().hashCode());
        result = prime * result + ((getSeatstatus() == null) ? 0 : getSeatstatus().hashCode());
        result = prime * result + ((getSeat() == null) ? 0 : getSeat().hashCode());
        result = prime * result + ((getForumofinterest() == null) ? 0 : getForumofinterest().hashCode());
        result = prime * result + ((getCharged() == null) ? 0 : getCharged().hashCode());
        result = prime * result + ((getMeetingfee() == null) ? 0 : getMeetingfee().hashCode());
        result = prime * result + ((getMeetingfeepaidtime() == null) ? 0 : getMeetingfeepaidtime().hashCode());
        result = prime * result + ((getInvoiced() == null) ? 0 : getInvoiced().hashCode());
        result = prime * result + ((getDisguisedguestcardcontent() == null) ? 0 : getDisguisedguestcardcontent().hashCode());
        result = prime * result + ((getTicketid() == null) ? 0 : getTicketid().hashCode());
        result = prime * result + ((getSponsor() == null) ? 0 : getSponsor().hashCode());
        result = prime * result + ((getCreationtimestamp() == null) ? 0 : getCreationtimestamp().hashCode());
        return result;
    }
}