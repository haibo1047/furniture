package com.huiyi.meeting.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MeetingRoomExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public MeetingRoomExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andTownIsNull() {
            addCriterion("town is null");
            return (Criteria) this;
        }

        public Criteria andTownIsNotNull() {
            addCriterion("town is not null");
            return (Criteria) this;
        }

        public Criteria andTownEqualTo(String value) {
            addCriterion("town =", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotEqualTo(String value) {
            addCriterion("town <>", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThan(String value) {
            addCriterion("town >", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThanOrEqualTo(String value) {
            addCriterion("town >=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThan(String value) {
            addCriterion("town <", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThanOrEqualTo(String value) {
            addCriterion("town <=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLike(String value) {
            addCriterion("town like", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotLike(String value) {
            addCriterion("town not like", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownIn(List<String> values) {
            addCriterion("town in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotIn(List<String> values) {
            addCriterion("town not in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownBetween(String value1, String value2) {
            addCriterion("town between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotBetween(String value1, String value2) {
            addCriterion("town not between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andValidflagIsNull() {
            addCriterion("validFlag is null");
            return (Criteria) this;
        }

        public Criteria andValidflagIsNotNull() {
            addCriterion("validFlag is not null");
            return (Criteria) this;
        }

        public Criteria andValidflagEqualTo(String value) {
            addCriterion("validFlag =", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotEqualTo(String value) {
            addCriterion("validFlag <>", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagGreaterThan(String value) {
            addCriterion("validFlag >", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagGreaterThanOrEqualTo(String value) {
            addCriterion("validFlag >=", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagLessThan(String value) {
            addCriterion("validFlag <", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagLessThanOrEqualTo(String value) {
            addCriterion("validFlag <=", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagLike(String value) {
            addCriterion("validFlag like", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotLike(String value) {
            addCriterion("validFlag not like", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagIn(List<String> values) {
            addCriterion("validFlag in", values, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotIn(List<String> values) {
            addCriterion("validFlag not in", values, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagBetween(String value1, String value2) {
            addCriterion("validFlag between", value1, value2, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotBetween(String value1, String value2) {
            addCriterion("validFlag not between", value1, value2, "validflag");
            return (Criteria) this;
        }

        public Criteria andStartvalidIsNull() {
            addCriterion("startValid is null");
            return (Criteria) this;
        }

        public Criteria andStartvalidIsNotNull() {
            addCriterion("startValid is not null");
            return (Criteria) this;
        }

        public Criteria andStartvalidEqualTo(Date value) {
            addCriterionForJDBCDate("startValid =", value, "startvalid");
            return (Criteria) this;
        }

        public Criteria andStartvalidNotEqualTo(Date value) {
            addCriterionForJDBCDate("startValid <>", value, "startvalid");
            return (Criteria) this;
        }

        public Criteria andStartvalidGreaterThan(Date value) {
            addCriterionForJDBCDate("startValid >", value, "startvalid");
            return (Criteria) this;
        }

        public Criteria andStartvalidGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startValid >=", value, "startvalid");
            return (Criteria) this;
        }

        public Criteria andStartvalidLessThan(Date value) {
            addCriterionForJDBCDate("startValid <", value, "startvalid");
            return (Criteria) this;
        }

        public Criteria andStartvalidLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startValid <=", value, "startvalid");
            return (Criteria) this;
        }

        public Criteria andStartvalidIn(List<Date> values) {
            addCriterionForJDBCDate("startValid in", values, "startvalid");
            return (Criteria) this;
        }

        public Criteria andStartvalidNotIn(List<Date> values) {
            addCriterionForJDBCDate("startValid not in", values, "startvalid");
            return (Criteria) this;
        }

        public Criteria andStartvalidBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startValid between", value1, value2, "startvalid");
            return (Criteria) this;
        }

        public Criteria andStartvalidNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startValid not between", value1, value2, "startvalid");
            return (Criteria) this;
        }

        public Criteria andEndvalidIsNull() {
            addCriterion("endValid is null");
            return (Criteria) this;
        }

        public Criteria andEndvalidIsNotNull() {
            addCriterion("endValid is not null");
            return (Criteria) this;
        }

        public Criteria andEndvalidEqualTo(Date value) {
            addCriterionForJDBCDate("endValid =", value, "endvalid");
            return (Criteria) this;
        }

        public Criteria andEndvalidNotEqualTo(Date value) {
            addCriterionForJDBCDate("endValid <>", value, "endvalid");
            return (Criteria) this;
        }

        public Criteria andEndvalidGreaterThan(Date value) {
            addCriterionForJDBCDate("endValid >", value, "endvalid");
            return (Criteria) this;
        }

        public Criteria andEndvalidGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endValid >=", value, "endvalid");
            return (Criteria) this;
        }

        public Criteria andEndvalidLessThan(Date value) {
            addCriterionForJDBCDate("endValid <", value, "endvalid");
            return (Criteria) this;
        }

        public Criteria andEndvalidLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endValid <=", value, "endvalid");
            return (Criteria) this;
        }

        public Criteria andEndvalidIn(List<Date> values) {
            addCriterionForJDBCDate("endValid in", values, "endvalid");
            return (Criteria) this;
        }

        public Criteria andEndvalidNotIn(List<Date> values) {
            addCriterionForJDBCDate("endValid not in", values, "endvalid");
            return (Criteria) this;
        }

        public Criteria andEndvalidBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endValid between", value1, value2, "endvalid");
            return (Criteria) this;
        }

        public Criteria andEndvalidNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endValid not between", value1, value2, "endvalid");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeIsNull() {
            addCriterion("personInCharge is null");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeIsNotNull() {
            addCriterion("personInCharge is not null");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeEqualTo(String value) {
            addCriterion("personInCharge =", value, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeNotEqualTo(String value) {
            addCriterion("personInCharge <>", value, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeGreaterThan(String value) {
            addCriterion("personInCharge >", value, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeGreaterThanOrEqualTo(String value) {
            addCriterion("personInCharge >=", value, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeLessThan(String value) {
            addCriterion("personInCharge <", value, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeLessThanOrEqualTo(String value) {
            addCriterion("personInCharge <=", value, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeLike(String value) {
            addCriterion("personInCharge like", value, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeNotLike(String value) {
            addCriterion("personInCharge not like", value, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeIn(List<String> values) {
            addCriterion("personInCharge in", values, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeNotIn(List<String> values) {
            addCriterion("personInCharge not in", values, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeBetween(String value1, String value2) {
            addCriterion("personInCharge between", value1, value2, "personincharge");
            return (Criteria) this;
        }

        public Criteria andPersoninchargeNotBetween(String value1, String value2) {
            addCriterion("personInCharge not between", value1, value2, "personincharge");
            return (Criteria) this;
        }

        public Criteria andTaskattachmentIsNull() {
            addCriterion("taskAttachment is null");
            return (Criteria) this;
        }

        public Criteria andTaskattachmentIsNotNull() {
            addCriterion("taskAttachment is not null");
            return (Criteria) this;
        }

        public Criteria andTaskattachmentEqualTo(String value) {
            addCriterion("taskAttachment =", value, "taskattachment");
            return (Criteria) this;
        }

        public Criteria andTaskattachmentNotEqualTo(String value) {
            addCriterion("taskAttachment <>", value, "taskattachment");
            return (Criteria) this;
        }

        public Criteria andTaskattachmentGreaterThan(String value) {
            addCriterion("taskAttachment >", value, "taskattachment");
            return (Criteria) this;
        }

        public Criteria andTaskattachmentGreaterThanOrEqualTo(String value) {
            addCriterion("taskAttachment >=", value, "taskattachment");
            return (Criteria) this;
        }

        public Criteria andTaskattachmentLessThan(String value) {
            addCriterion("taskAttachment <", value, "taskattachment");
            return (Criteria) this;
        }

        public Criteria andTaskattachmentLessThanOrEqualTo(String value) {
            addCriterion("taskAttachment <=", value, "taskattachment");
            return (Criteria) this;
        }

        public Criteria andTaskattachmentLike(String value) {
            addCriterion("taskAttachment like", value, "taskattachment");
            return (Criteria) this;
        }

        public Criteria andTaskattachmentNotLike(String value) {
            addCriterion("taskAttachment not like", value, "taskattachment");
            return (Criteria) this;
        }

        public Criteria andTaskattachmentIn(List<String> values) {
            addCriterion("taskAttachment in", values, "taskattachment");
            return (Criteria) this;
        }

        public Criteria andTaskattachmentNotIn(List<String> values) {
            addCriterion("taskAttachment not in", values, "taskattachment");
            return (Criteria) this;
        }

        public Criteria andTaskattachmentBetween(String value1, String value2) {
            addCriterion("taskAttachment between", value1, value2, "taskattachment");
            return (Criteria) this;
        }

        public Criteria andTaskattachmentNotBetween(String value1, String value2) {
            addCriterion("taskAttachment not between", value1, value2, "taskattachment");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNull() {
            addCriterion("capacity is null");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNotNull() {
            addCriterion("capacity is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityEqualTo(Integer value) {
            addCriterion("capacity =", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotEqualTo(Integer value) {
            addCriterion("capacity <>", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThan(Integer value) {
            addCriterion("capacity >", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("capacity >=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThan(Integer value) {
            addCriterion("capacity <", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("capacity <=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityIn(List<Integer> values) {
            addCriterion("capacity in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotIn(List<Integer> values) {
            addCriterion("capacity not in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityBetween(Integer value1, Integer value2) {
            addCriterion("capacity between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("capacity not between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCreationtimestampIsNull() {
            addCriterion("creationTimestamp is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimestampIsNotNull() {
            addCriterion("creationTimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimestampEqualTo(Long value) {
            addCriterion("creationTimestamp =", value, "creationtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreationtimestampNotEqualTo(Long value) {
            addCriterion("creationTimestamp <>", value, "creationtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreationtimestampGreaterThan(Long value) {
            addCriterion("creationTimestamp >", value, "creationtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreationtimestampGreaterThanOrEqualTo(Long value) {
            addCriterion("creationTimestamp >=", value, "creationtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreationtimestampLessThan(Long value) {
            addCriterion("creationTimestamp <", value, "creationtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreationtimestampLessThanOrEqualTo(Long value) {
            addCriterion("creationTimestamp <=", value, "creationtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreationtimestampIn(List<Long> values) {
            addCriterion("creationTimestamp in", values, "creationtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreationtimestampNotIn(List<Long> values) {
            addCriterion("creationTimestamp not in", values, "creationtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreationtimestampBetween(Long value1, Long value2) {
            addCriterion("creationTimestamp between", value1, value2, "creationtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreationtimestampNotBetween(Long value1, Long value2) {
            addCriterion("creationTimestamp not between", value1, value2, "creationtimestamp");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}