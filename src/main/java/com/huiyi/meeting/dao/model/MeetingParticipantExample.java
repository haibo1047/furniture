package com.huiyi.meeting.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MeetingParticipantExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public MeetingParticipantExample() {
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

        public Criteria andMeetingidIsNull() {
            addCriterion("meetingId is null");
            return (Criteria) this;
        }

        public Criteria andMeetingidIsNotNull() {
            addCriterion("meetingId is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingidEqualTo(Integer value) {
            addCriterion("meetingId =", value, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingidNotEqualTo(Integer value) {
            addCriterion("meetingId <>", value, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingidGreaterThan(Integer value) {
            addCriterion("meetingId >", value, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("meetingId >=", value, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingidLessThan(Integer value) {
            addCriterion("meetingId <", value, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingidLessThanOrEqualTo(Integer value) {
            addCriterion("meetingId <=", value, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingidIn(List<Integer> values) {
            addCriterion("meetingId in", values, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingidNotIn(List<Integer> values) {
            addCriterion("meetingId not in", values, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingidBetween(Integer value1, Integer value2) {
            addCriterion("meetingId between", value1, value2, "meetingid");
            return (Criteria) this;
        }

        public Criteria andMeetingidNotBetween(Integer value1, Integer value2) {
            addCriterion("meetingId not between", value1, value2, "meetingid");
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

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
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

        public Criteria andMeetingregistertimeIsNull() {
            addCriterion("meetingRegisterTime is null");
            return (Criteria) this;
        }

        public Criteria andMeetingregistertimeIsNotNull() {
            addCriterion("meetingRegisterTime is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingregistertimeEqualTo(Date value) {
            addCriterionForJDBCDate("meetingRegisterTime =", value, "meetingregistertime");
            return (Criteria) this;
        }

        public Criteria andMeetingregistertimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("meetingRegisterTime <>", value, "meetingregistertime");
            return (Criteria) this;
        }

        public Criteria andMeetingregistertimeGreaterThan(Date value) {
            addCriterionForJDBCDate("meetingRegisterTime >", value, "meetingregistertime");
            return (Criteria) this;
        }

        public Criteria andMeetingregistertimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("meetingRegisterTime >=", value, "meetingregistertime");
            return (Criteria) this;
        }

        public Criteria andMeetingregistertimeLessThan(Date value) {
            addCriterionForJDBCDate("meetingRegisterTime <", value, "meetingregistertime");
            return (Criteria) this;
        }

        public Criteria andMeetingregistertimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("meetingRegisterTime <=", value, "meetingregistertime");
            return (Criteria) this;
        }

        public Criteria andMeetingregistertimeIn(List<Date> values) {
            addCriterionForJDBCDate("meetingRegisterTime in", values, "meetingregistertime");
            return (Criteria) this;
        }

        public Criteria andMeetingregistertimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("meetingRegisterTime not in", values, "meetingregistertime");
            return (Criteria) this;
        }

        public Criteria andMeetingregistertimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("meetingRegisterTime between", value1, value2, "meetingregistertime");
            return (Criteria) this;
        }

        public Criteria andMeetingregistertimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("meetingRegisterTime not between", value1, value2, "meetingregistertime");
            return (Criteria) this;
        }

        public Criteria andProductofinterestIsNull() {
            addCriterion("productOfInterest is null");
            return (Criteria) this;
        }

        public Criteria andProductofinterestIsNotNull() {
            addCriterion("productOfInterest is not null");
            return (Criteria) this;
        }

        public Criteria andProductofinterestEqualTo(String value) {
            addCriterion("productOfInterest =", value, "productofinterest");
            return (Criteria) this;
        }

        public Criteria andProductofinterestNotEqualTo(String value) {
            addCriterion("productOfInterest <>", value, "productofinterest");
            return (Criteria) this;
        }

        public Criteria andProductofinterestGreaterThan(String value) {
            addCriterion("productOfInterest >", value, "productofinterest");
            return (Criteria) this;
        }

        public Criteria andProductofinterestGreaterThanOrEqualTo(String value) {
            addCriterion("productOfInterest >=", value, "productofinterest");
            return (Criteria) this;
        }

        public Criteria andProductofinterestLessThan(String value) {
            addCriterion("productOfInterest <", value, "productofinterest");
            return (Criteria) this;
        }

        public Criteria andProductofinterestLessThanOrEqualTo(String value) {
            addCriterion("productOfInterest <=", value, "productofinterest");
            return (Criteria) this;
        }

        public Criteria andProductofinterestLike(String value) {
            addCriterion("productOfInterest like", value, "productofinterest");
            return (Criteria) this;
        }

        public Criteria andProductofinterestNotLike(String value) {
            addCriterion("productOfInterest not like", value, "productofinterest");
            return (Criteria) this;
        }

        public Criteria andProductofinterestIn(List<String> values) {
            addCriterion("productOfInterest in", values, "productofinterest");
            return (Criteria) this;
        }

        public Criteria andProductofinterestNotIn(List<String> values) {
            addCriterion("productOfInterest not in", values, "productofinterest");
            return (Criteria) this;
        }

        public Criteria andProductofinterestBetween(String value1, String value2) {
            addCriterion("productOfInterest between", value1, value2, "productofinterest");
            return (Criteria) this;
        }

        public Criteria andProductofinterestNotBetween(String value1, String value2) {
            addCriterion("productOfInterest not between", value1, value2, "productofinterest");
            return (Criteria) this;
        }

        public Criteria andHotelIsNull() {
            addCriterion("hotel is null");
            return (Criteria) this;
        }

        public Criteria andHotelIsNotNull() {
            addCriterion("hotel is not null");
            return (Criteria) this;
        }

        public Criteria andHotelEqualTo(String value) {
            addCriterion("hotel =", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotEqualTo(String value) {
            addCriterion("hotel <>", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelGreaterThan(String value) {
            addCriterion("hotel >", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelGreaterThanOrEqualTo(String value) {
            addCriterion("hotel >=", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelLessThan(String value) {
            addCriterion("hotel <", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelLessThanOrEqualTo(String value) {
            addCriterion("hotel <=", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelLike(String value) {
            addCriterion("hotel like", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotLike(String value) {
            addCriterion("hotel not like", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelIn(List<String> values) {
            addCriterion("hotel in", values, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotIn(List<String> values) {
            addCriterion("hotel not in", values, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelBetween(String value1, String value2) {
            addCriterion("hotel between", value1, value2, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotBetween(String value1, String value2) {
            addCriterion("hotel not between", value1, value2, "hotel");
            return (Criteria) this;
        }

        public Criteria andHoteladdressIsNull() {
            addCriterion("hotelAddress is null");
            return (Criteria) this;
        }

        public Criteria andHoteladdressIsNotNull() {
            addCriterion("hotelAddress is not null");
            return (Criteria) this;
        }

        public Criteria andHoteladdressEqualTo(String value) {
            addCriterion("hotelAddress =", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressNotEqualTo(String value) {
            addCriterion("hotelAddress <>", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressGreaterThan(String value) {
            addCriterion("hotelAddress >", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressGreaterThanOrEqualTo(String value) {
            addCriterion("hotelAddress >=", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressLessThan(String value) {
            addCriterion("hotelAddress <", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressLessThanOrEqualTo(String value) {
            addCriterion("hotelAddress <=", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressLike(String value) {
            addCriterion("hotelAddress like", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressNotLike(String value) {
            addCriterion("hotelAddress not like", value, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressIn(List<String> values) {
            addCriterion("hotelAddress in", values, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressNotIn(List<String> values) {
            addCriterion("hotelAddress not in", values, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressBetween(String value1, String value2) {
            addCriterion("hotelAddress between", value1, value2, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHoteladdressNotBetween(String value1, String value2) {
            addCriterion("hotelAddress not between", value1, value2, "hoteladdress");
            return (Criteria) this;
        }

        public Criteria andHotelstatusIsNull() {
            addCriterion("hotelStatus is null");
            return (Criteria) this;
        }

        public Criteria andHotelstatusIsNotNull() {
            addCriterion("hotelStatus is not null");
            return (Criteria) this;
        }

        public Criteria andHotelstatusEqualTo(String value) {
            addCriterion("hotelStatus =", value, "hotelstatus");
            return (Criteria) this;
        }

        public Criteria andHotelstatusNotEqualTo(String value) {
            addCriterion("hotelStatus <>", value, "hotelstatus");
            return (Criteria) this;
        }

        public Criteria andHotelstatusGreaterThan(String value) {
            addCriterion("hotelStatus >", value, "hotelstatus");
            return (Criteria) this;
        }

        public Criteria andHotelstatusGreaterThanOrEqualTo(String value) {
            addCriterion("hotelStatus >=", value, "hotelstatus");
            return (Criteria) this;
        }

        public Criteria andHotelstatusLessThan(String value) {
            addCriterion("hotelStatus <", value, "hotelstatus");
            return (Criteria) this;
        }

        public Criteria andHotelstatusLessThanOrEqualTo(String value) {
            addCriterion("hotelStatus <=", value, "hotelstatus");
            return (Criteria) this;
        }

        public Criteria andHotelstatusLike(String value) {
            addCriterion("hotelStatus like", value, "hotelstatus");
            return (Criteria) this;
        }

        public Criteria andHotelstatusNotLike(String value) {
            addCriterion("hotelStatus not like", value, "hotelstatus");
            return (Criteria) this;
        }

        public Criteria andHotelstatusIn(List<String> values) {
            addCriterion("hotelStatus in", values, "hotelstatus");
            return (Criteria) this;
        }

        public Criteria andHotelstatusNotIn(List<String> values) {
            addCriterion("hotelStatus not in", values, "hotelstatus");
            return (Criteria) this;
        }

        public Criteria andHotelstatusBetween(String value1, String value2) {
            addCriterion("hotelStatus between", value1, value2, "hotelstatus");
            return (Criteria) this;
        }

        public Criteria andHotelstatusNotBetween(String value1, String value2) {
            addCriterion("hotelStatus not between", value1, value2, "hotelstatus");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeIsNull() {
            addCriterion("arrivalTime is null");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeIsNotNull() {
            addCriterion("arrivalTime is not null");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeEqualTo(Date value) {
            addCriterionForJDBCDate("arrivalTime =", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("arrivalTime <>", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeGreaterThan(Date value) {
            addCriterionForJDBCDate("arrivalTime >", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("arrivalTime >=", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeLessThan(Date value) {
            addCriterionForJDBCDate("arrivalTime <", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("arrivalTime <=", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeIn(List<Date> values) {
            addCriterionForJDBCDate("arrivalTime in", values, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("arrivalTime not in", values, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("arrivalTime between", value1, value2, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("arrivalTime not between", value1, value2, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeIsNull() {
            addCriterion("leaveTime is null");
            return (Criteria) this;
        }

        public Criteria andLeavetimeIsNotNull() {
            addCriterion("leaveTime is not null");
            return (Criteria) this;
        }

        public Criteria andLeavetimeEqualTo(Date value) {
            addCriterionForJDBCDate("leaveTime =", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("leaveTime <>", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("leaveTime >", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leaveTime >=", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeLessThan(Date value) {
            addCriterionForJDBCDate("leaveTime <", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leaveTime <=", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeIn(List<Date> values) {
            addCriterionForJDBCDate("leaveTime in", values, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("leaveTime not in", values, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leaveTime between", value1, value2, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leaveTime not between", value1, value2, "leavetime");
            return (Criteria) this;
        }

        public Criteria andTraffictoolIsNull() {
            addCriterion("trafficTool is null");
            return (Criteria) this;
        }

        public Criteria andTraffictoolIsNotNull() {
            addCriterion("trafficTool is not null");
            return (Criteria) this;
        }

        public Criteria andTraffictoolEqualTo(String value) {
            addCriterion("trafficTool =", value, "traffictool");
            return (Criteria) this;
        }

        public Criteria andTraffictoolNotEqualTo(String value) {
            addCriterion("trafficTool <>", value, "traffictool");
            return (Criteria) this;
        }

        public Criteria andTraffictoolGreaterThan(String value) {
            addCriterion("trafficTool >", value, "traffictool");
            return (Criteria) this;
        }

        public Criteria andTraffictoolGreaterThanOrEqualTo(String value) {
            addCriterion("trafficTool >=", value, "traffictool");
            return (Criteria) this;
        }

        public Criteria andTraffictoolLessThan(String value) {
            addCriterion("trafficTool <", value, "traffictool");
            return (Criteria) this;
        }

        public Criteria andTraffictoolLessThanOrEqualTo(String value) {
            addCriterion("trafficTool <=", value, "traffictool");
            return (Criteria) this;
        }

        public Criteria andTraffictoolLike(String value) {
            addCriterion("trafficTool like", value, "traffictool");
            return (Criteria) this;
        }

        public Criteria andTraffictoolNotLike(String value) {
            addCriterion("trafficTool not like", value, "traffictool");
            return (Criteria) this;
        }

        public Criteria andTraffictoolIn(List<String> values) {
            addCriterion("trafficTool in", values, "traffictool");
            return (Criteria) this;
        }

        public Criteria andTraffictoolNotIn(List<String> values) {
            addCriterion("trafficTool not in", values, "traffictool");
            return (Criteria) this;
        }

        public Criteria andTraffictoolBetween(String value1, String value2) {
            addCriterion("trafficTool between", value1, value2, "traffictool");
            return (Criteria) this;
        }

        public Criteria andTraffictoolNotBetween(String value1, String value2) {
            addCriterion("trafficTool not between", value1, value2, "traffictool");
            return (Criteria) this;
        }

        public Criteria andReceptionstatusIsNull() {
            addCriterion("receptionStatus is null");
            return (Criteria) this;
        }

        public Criteria andReceptionstatusIsNotNull() {
            addCriterion("receptionStatus is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionstatusEqualTo(String value) {
            addCriterion("receptionStatus =", value, "receptionstatus");
            return (Criteria) this;
        }

        public Criteria andReceptionstatusNotEqualTo(String value) {
            addCriterion("receptionStatus <>", value, "receptionstatus");
            return (Criteria) this;
        }

        public Criteria andReceptionstatusGreaterThan(String value) {
            addCriterion("receptionStatus >", value, "receptionstatus");
            return (Criteria) this;
        }

        public Criteria andReceptionstatusGreaterThanOrEqualTo(String value) {
            addCriterion("receptionStatus >=", value, "receptionstatus");
            return (Criteria) this;
        }

        public Criteria andReceptionstatusLessThan(String value) {
            addCriterion("receptionStatus <", value, "receptionstatus");
            return (Criteria) this;
        }

        public Criteria andReceptionstatusLessThanOrEqualTo(String value) {
            addCriterion("receptionStatus <=", value, "receptionstatus");
            return (Criteria) this;
        }

        public Criteria andReceptionstatusLike(String value) {
            addCriterion("receptionStatus like", value, "receptionstatus");
            return (Criteria) this;
        }

        public Criteria andReceptionstatusNotLike(String value) {
            addCriterion("receptionStatus not like", value, "receptionstatus");
            return (Criteria) this;
        }

        public Criteria andReceptionstatusIn(List<String> values) {
            addCriterion("receptionStatus in", values, "receptionstatus");
            return (Criteria) this;
        }

        public Criteria andReceptionstatusNotIn(List<String> values) {
            addCriterion("receptionStatus not in", values, "receptionstatus");
            return (Criteria) this;
        }

        public Criteria andReceptionstatusBetween(String value1, String value2) {
            addCriterion("receptionStatus between", value1, value2, "receptionstatus");
            return (Criteria) this;
        }

        public Criteria andReceptionstatusNotBetween(String value1, String value2) {
            addCriterion("receptionStatus not between", value1, value2, "receptionstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusIsNull() {
            addCriterion("seatStatus is null");
            return (Criteria) this;
        }

        public Criteria andSeatstatusIsNotNull() {
            addCriterion("seatStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSeatstatusEqualTo(String value) {
            addCriterion("seatStatus =", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusNotEqualTo(String value) {
            addCriterion("seatStatus <>", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusGreaterThan(String value) {
            addCriterion("seatStatus >", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusGreaterThanOrEqualTo(String value) {
            addCriterion("seatStatus >=", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusLessThan(String value) {
            addCriterion("seatStatus <", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusLessThanOrEqualTo(String value) {
            addCriterion("seatStatus <=", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusLike(String value) {
            addCriterion("seatStatus like", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusNotLike(String value) {
            addCriterion("seatStatus not like", value, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusIn(List<String> values) {
            addCriterion("seatStatus in", values, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusNotIn(List<String> values) {
            addCriterion("seatStatus not in", values, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusBetween(String value1, String value2) {
            addCriterion("seatStatus between", value1, value2, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatstatusNotBetween(String value1, String value2) {
            addCriterion("seatStatus not between", value1, value2, "seatstatus");
            return (Criteria) this;
        }

        public Criteria andSeatIsNull() {
            addCriterion("seat is null");
            return (Criteria) this;
        }

        public Criteria andSeatIsNotNull() {
            addCriterion("seat is not null");
            return (Criteria) this;
        }

        public Criteria andSeatEqualTo(String value) {
            addCriterion("seat =", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotEqualTo(String value) {
            addCriterion("seat <>", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThan(String value) {
            addCriterion("seat >", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThanOrEqualTo(String value) {
            addCriterion("seat >=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThan(String value) {
            addCriterion("seat <", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThanOrEqualTo(String value) {
            addCriterion("seat <=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLike(String value) {
            addCriterion("seat like", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotLike(String value) {
            addCriterion("seat not like", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatIn(List<String> values) {
            addCriterion("seat in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotIn(List<String> values) {
            addCriterion("seat not in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatBetween(String value1, String value2) {
            addCriterion("seat between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotBetween(String value1, String value2) {
            addCriterion("seat not between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andForumofinterestIsNull() {
            addCriterion("forumOfInterest is null");
            return (Criteria) this;
        }

        public Criteria andForumofinterestIsNotNull() {
            addCriterion("forumOfInterest is not null");
            return (Criteria) this;
        }

        public Criteria andForumofinterestEqualTo(String value) {
            addCriterion("forumOfInterest =", value, "forumofinterest");
            return (Criteria) this;
        }

        public Criteria andForumofinterestNotEqualTo(String value) {
            addCriterion("forumOfInterest <>", value, "forumofinterest");
            return (Criteria) this;
        }

        public Criteria andForumofinterestGreaterThan(String value) {
            addCriterion("forumOfInterest >", value, "forumofinterest");
            return (Criteria) this;
        }

        public Criteria andForumofinterestGreaterThanOrEqualTo(String value) {
            addCriterion("forumOfInterest >=", value, "forumofinterest");
            return (Criteria) this;
        }

        public Criteria andForumofinterestLessThan(String value) {
            addCriterion("forumOfInterest <", value, "forumofinterest");
            return (Criteria) this;
        }

        public Criteria andForumofinterestLessThanOrEqualTo(String value) {
            addCriterion("forumOfInterest <=", value, "forumofinterest");
            return (Criteria) this;
        }

        public Criteria andForumofinterestLike(String value) {
            addCriterion("forumOfInterest like", value, "forumofinterest");
            return (Criteria) this;
        }

        public Criteria andForumofinterestNotLike(String value) {
            addCriterion("forumOfInterest not like", value, "forumofinterest");
            return (Criteria) this;
        }

        public Criteria andForumofinterestIn(List<String> values) {
            addCriterion("forumOfInterest in", values, "forumofinterest");
            return (Criteria) this;
        }

        public Criteria andForumofinterestNotIn(List<String> values) {
            addCriterion("forumOfInterest not in", values, "forumofinterest");
            return (Criteria) this;
        }

        public Criteria andForumofinterestBetween(String value1, String value2) {
            addCriterion("forumOfInterest between", value1, value2, "forumofinterest");
            return (Criteria) this;
        }

        public Criteria andForumofinterestNotBetween(String value1, String value2) {
            addCriterion("forumOfInterest not between", value1, value2, "forumofinterest");
            return (Criteria) this;
        }

        public Criteria andChargedIsNull() {
            addCriterion("charged is null");
            return (Criteria) this;
        }

        public Criteria andChargedIsNotNull() {
            addCriterion("charged is not null");
            return (Criteria) this;
        }

        public Criteria andChargedEqualTo(String value) {
            addCriterion("charged =", value, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedNotEqualTo(String value) {
            addCriterion("charged <>", value, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedGreaterThan(String value) {
            addCriterion("charged >", value, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedGreaterThanOrEqualTo(String value) {
            addCriterion("charged >=", value, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedLessThan(String value) {
            addCriterion("charged <", value, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedLessThanOrEqualTo(String value) {
            addCriterion("charged <=", value, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedLike(String value) {
            addCriterion("charged like", value, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedNotLike(String value) {
            addCriterion("charged not like", value, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedIn(List<String> values) {
            addCriterion("charged in", values, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedNotIn(List<String> values) {
            addCriterion("charged not in", values, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedBetween(String value1, String value2) {
            addCriterion("charged between", value1, value2, "charged");
            return (Criteria) this;
        }

        public Criteria andChargedNotBetween(String value1, String value2) {
            addCriterion("charged not between", value1, value2, "charged");
            return (Criteria) this;
        }

        public Criteria andMeetingfeeIsNull() {
            addCriterion("meetingFee is null");
            return (Criteria) this;
        }

        public Criteria andMeetingfeeIsNotNull() {
            addCriterion("meetingFee is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingfeeEqualTo(Float value) {
            addCriterion("meetingFee =", value, "meetingfee");
            return (Criteria) this;
        }

        public Criteria andMeetingfeeNotEqualTo(Float value) {
            addCriterion("meetingFee <>", value, "meetingfee");
            return (Criteria) this;
        }

        public Criteria andMeetingfeeGreaterThan(Float value) {
            addCriterion("meetingFee >", value, "meetingfee");
            return (Criteria) this;
        }

        public Criteria andMeetingfeeGreaterThanOrEqualTo(Float value) {
            addCriterion("meetingFee >=", value, "meetingfee");
            return (Criteria) this;
        }

        public Criteria andMeetingfeeLessThan(Float value) {
            addCriterion("meetingFee <", value, "meetingfee");
            return (Criteria) this;
        }

        public Criteria andMeetingfeeLessThanOrEqualTo(Float value) {
            addCriterion("meetingFee <=", value, "meetingfee");
            return (Criteria) this;
        }

        public Criteria andMeetingfeeIn(List<Float> values) {
            addCriterion("meetingFee in", values, "meetingfee");
            return (Criteria) this;
        }

        public Criteria andMeetingfeeNotIn(List<Float> values) {
            addCriterion("meetingFee not in", values, "meetingfee");
            return (Criteria) this;
        }

        public Criteria andMeetingfeeBetween(Float value1, Float value2) {
            addCriterion("meetingFee between", value1, value2, "meetingfee");
            return (Criteria) this;
        }

        public Criteria andMeetingfeeNotBetween(Float value1, Float value2) {
            addCriterion("meetingFee not between", value1, value2, "meetingfee");
            return (Criteria) this;
        }

        public Criteria andMeetingfeepaidtimeIsNull() {
            addCriterion("meetingFeePaidTime is null");
            return (Criteria) this;
        }

        public Criteria andMeetingfeepaidtimeIsNotNull() {
            addCriterion("meetingFeePaidTime is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingfeepaidtimeEqualTo(Date value) {
            addCriterionForJDBCDate("meetingFeePaidTime =", value, "meetingfeepaidtime");
            return (Criteria) this;
        }

        public Criteria andMeetingfeepaidtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("meetingFeePaidTime <>", value, "meetingfeepaidtime");
            return (Criteria) this;
        }

        public Criteria andMeetingfeepaidtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("meetingFeePaidTime >", value, "meetingfeepaidtime");
            return (Criteria) this;
        }

        public Criteria andMeetingfeepaidtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("meetingFeePaidTime >=", value, "meetingfeepaidtime");
            return (Criteria) this;
        }

        public Criteria andMeetingfeepaidtimeLessThan(Date value) {
            addCriterionForJDBCDate("meetingFeePaidTime <", value, "meetingfeepaidtime");
            return (Criteria) this;
        }

        public Criteria andMeetingfeepaidtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("meetingFeePaidTime <=", value, "meetingfeepaidtime");
            return (Criteria) this;
        }

        public Criteria andMeetingfeepaidtimeIn(List<Date> values) {
            addCriterionForJDBCDate("meetingFeePaidTime in", values, "meetingfeepaidtime");
            return (Criteria) this;
        }

        public Criteria andMeetingfeepaidtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("meetingFeePaidTime not in", values, "meetingfeepaidtime");
            return (Criteria) this;
        }

        public Criteria andMeetingfeepaidtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("meetingFeePaidTime between", value1, value2, "meetingfeepaidtime");
            return (Criteria) this;
        }

        public Criteria andMeetingfeepaidtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("meetingFeePaidTime not between", value1, value2, "meetingfeepaidtime");
            return (Criteria) this;
        }

        public Criteria andInvoicedIsNull() {
            addCriterion("invoiced is null");
            return (Criteria) this;
        }

        public Criteria andInvoicedIsNotNull() {
            addCriterion("invoiced is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicedEqualTo(String value) {
            addCriterion("invoiced =", value, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedNotEqualTo(String value) {
            addCriterion("invoiced <>", value, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedGreaterThan(String value) {
            addCriterion("invoiced >", value, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedGreaterThanOrEqualTo(String value) {
            addCriterion("invoiced >=", value, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedLessThan(String value) {
            addCriterion("invoiced <", value, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedLessThanOrEqualTo(String value) {
            addCriterion("invoiced <=", value, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedLike(String value) {
            addCriterion("invoiced like", value, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedNotLike(String value) {
            addCriterion("invoiced not like", value, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedIn(List<String> values) {
            addCriterion("invoiced in", values, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedNotIn(List<String> values) {
            addCriterion("invoiced not in", values, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedBetween(String value1, String value2) {
            addCriterion("invoiced between", value1, value2, "invoiced");
            return (Criteria) this;
        }

        public Criteria andInvoicedNotBetween(String value1, String value2) {
            addCriterion("invoiced not between", value1, value2, "invoiced");
            return (Criteria) this;
        }

        public Criteria andDisguisedguestcardcontentIsNull() {
            addCriterion("disguisedGuestCardContent is null");
            return (Criteria) this;
        }

        public Criteria andDisguisedguestcardcontentIsNotNull() {
            addCriterion("disguisedGuestCardContent is not null");
            return (Criteria) this;
        }

        public Criteria andDisguisedguestcardcontentEqualTo(String value) {
            addCriterion("disguisedGuestCardContent =", value, "disguisedguestcardcontent");
            return (Criteria) this;
        }

        public Criteria andDisguisedguestcardcontentNotEqualTo(String value) {
            addCriterion("disguisedGuestCardContent <>", value, "disguisedguestcardcontent");
            return (Criteria) this;
        }

        public Criteria andDisguisedguestcardcontentGreaterThan(String value) {
            addCriterion("disguisedGuestCardContent >", value, "disguisedguestcardcontent");
            return (Criteria) this;
        }

        public Criteria andDisguisedguestcardcontentGreaterThanOrEqualTo(String value) {
            addCriterion("disguisedGuestCardContent >=", value, "disguisedguestcardcontent");
            return (Criteria) this;
        }

        public Criteria andDisguisedguestcardcontentLessThan(String value) {
            addCriterion("disguisedGuestCardContent <", value, "disguisedguestcardcontent");
            return (Criteria) this;
        }

        public Criteria andDisguisedguestcardcontentLessThanOrEqualTo(String value) {
            addCriterion("disguisedGuestCardContent <=", value, "disguisedguestcardcontent");
            return (Criteria) this;
        }

        public Criteria andDisguisedguestcardcontentLike(String value) {
            addCriterion("disguisedGuestCardContent like", value, "disguisedguestcardcontent");
            return (Criteria) this;
        }

        public Criteria andDisguisedguestcardcontentNotLike(String value) {
            addCriterion("disguisedGuestCardContent not like", value, "disguisedguestcardcontent");
            return (Criteria) this;
        }

        public Criteria andDisguisedguestcardcontentIn(List<String> values) {
            addCriterion("disguisedGuestCardContent in", values, "disguisedguestcardcontent");
            return (Criteria) this;
        }

        public Criteria andDisguisedguestcardcontentNotIn(List<String> values) {
            addCriterion("disguisedGuestCardContent not in", values, "disguisedguestcardcontent");
            return (Criteria) this;
        }

        public Criteria andDisguisedguestcardcontentBetween(String value1, String value2) {
            addCriterion("disguisedGuestCardContent between", value1, value2, "disguisedguestcardcontent");
            return (Criteria) this;
        }

        public Criteria andDisguisedguestcardcontentNotBetween(String value1, String value2) {
            addCriterion("disguisedGuestCardContent not between", value1, value2, "disguisedguestcardcontent");
            return (Criteria) this;
        }

        public Criteria andTicketidIsNull() {
            addCriterion("ticketId is null");
            return (Criteria) this;
        }

        public Criteria andTicketidIsNotNull() {
            addCriterion("ticketId is not null");
            return (Criteria) this;
        }

        public Criteria andTicketidEqualTo(String value) {
            addCriterion("ticketId =", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotEqualTo(String value) {
            addCriterion("ticketId <>", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidGreaterThan(String value) {
            addCriterion("ticketId >", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidGreaterThanOrEqualTo(String value) {
            addCriterion("ticketId >=", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidLessThan(String value) {
            addCriterion("ticketId <", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidLessThanOrEqualTo(String value) {
            addCriterion("ticketId <=", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidLike(String value) {
            addCriterion("ticketId like", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotLike(String value) {
            addCriterion("ticketId not like", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidIn(List<String> values) {
            addCriterion("ticketId in", values, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotIn(List<String> values) {
            addCriterion("ticketId not in", values, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidBetween(String value1, String value2) {
            addCriterion("ticketId between", value1, value2, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotBetween(String value1, String value2) {
            addCriterion("ticketId not between", value1, value2, "ticketid");
            return (Criteria) this;
        }

        public Criteria andSponsorIsNull() {
            addCriterion("sponsor is null");
            return (Criteria) this;
        }

        public Criteria andSponsorIsNotNull() {
            addCriterion("sponsor is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorEqualTo(String value) {
            addCriterion("sponsor =", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotEqualTo(String value) {
            addCriterion("sponsor <>", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorGreaterThan(String value) {
            addCriterion("sponsor >", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorGreaterThanOrEqualTo(String value) {
            addCriterion("sponsor >=", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLessThan(String value) {
            addCriterion("sponsor <", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLessThanOrEqualTo(String value) {
            addCriterion("sponsor <=", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLike(String value) {
            addCriterion("sponsor like", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotLike(String value) {
            addCriterion("sponsor not like", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorIn(List<String> values) {
            addCriterion("sponsor in", values, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotIn(List<String> values) {
            addCriterion("sponsor not in", values, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorBetween(String value1, String value2) {
            addCriterion("sponsor between", value1, value2, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotBetween(String value1, String value2) {
            addCriterion("sponsor not between", value1, value2, "sponsor");
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