package com.huiyi.meeting.dao.model;

import java.io.Serializable;

public class MeetingPreparationItem implements Serializable {
    private Integer id;

    /**
     * 事项
     *
     * @mbg.generated
     */
    private String item;

    /**
     * 事项说明
     *
     * @mbg.generated
     */
    private String itemdescription;

    /**
     * 物品数量
     *
     * @mbg.generated
     */
    private Integer amount;

    /**
     * 物品单价
     *
     * @mbg.generated
     */
    private Float price;

    /**
     * 单位
     *
     * @mbg.generated
     */
    private String unit;

    /**
     * 附件
     *
     * @mbg.generated
     */
    private String attachment;

    private Long creationtimestamp;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItemdescription() {
        return itemdescription;
    }

    public void setItemdescription(String itemdescription) {
        this.itemdescription = itemdescription;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
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
        sb.append(", item=").append(item);
        sb.append(", itemdescription=").append(itemdescription);
        sb.append(", amount=").append(amount);
        sb.append(", price=").append(price);
        sb.append(", unit=").append(unit);
        sb.append(", attachment=").append(attachment);
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
        MeetingPreparationItem other = (MeetingPreparationItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getItem() == null ? other.getItem() == null : this.getItem().equals(other.getItem()))
            && (this.getItemdescription() == null ? other.getItemdescription() == null : this.getItemdescription().equals(other.getItemdescription()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getAttachment() == null ? other.getAttachment() == null : this.getAttachment().equals(other.getAttachment()))
            && (this.getCreationtimestamp() == null ? other.getCreationtimestamp() == null : this.getCreationtimestamp().equals(other.getCreationtimestamp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getItem() == null) ? 0 : getItem().hashCode());
        result = prime * result + ((getItemdescription() == null) ? 0 : getItemdescription().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        result = prime * result + ((getCreationtimestamp() == null) ? 0 : getCreationtimestamp().hashCode());
        return result;
    }
}