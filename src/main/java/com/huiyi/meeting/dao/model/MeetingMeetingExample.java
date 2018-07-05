package com.huiyi.meeting.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MeetingMeetingExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public MeetingMeetingExample() {
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

        public Criteria andMeetingsubjectIsNull() {
            addCriterion("meetingSubject is null");
            return (Criteria) this;
        }

        public Criteria andMeetingsubjectIsNotNull() {
            addCriterion("meetingSubject is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingsubjectEqualTo(String value) {
            addCriterion("meetingSubject =", value, "meetingsubject");
            return (Criteria) this;
        }

        public Criteria andMeetingsubjectNotEqualTo(String value) {
            addCriterion("meetingSubject <>", value, "meetingsubject");
            return (Criteria) this;
        }

        public Criteria andMeetingsubjectGreaterThan(String value) {
            addCriterion("meetingSubject >", value, "meetingsubject");
            return (Criteria) this;
        }

        public Criteria andMeetingsubjectGreaterThanOrEqualTo(String value) {
            addCriterion("meetingSubject >=", value, "meetingsubject");
            return (Criteria) this;
        }

        public Criteria andMeetingsubjectLessThan(String value) {
            addCriterion("meetingSubject <", value, "meetingsubject");
            return (Criteria) this;
        }

        public Criteria andMeetingsubjectLessThanOrEqualTo(String value) {
            addCriterion("meetingSubject <=", value, "meetingsubject");
            return (Criteria) this;
        }

        public Criteria andMeetingsubjectLike(String value) {
            addCriterion("meetingSubject like", value, "meetingsubject");
            return (Criteria) this;
        }

        public Criteria andMeetingsubjectNotLike(String value) {
            addCriterion("meetingSubject not like", value, "meetingsubject");
            return (Criteria) this;
        }

        public Criteria andMeetingsubjectIn(List<String> values) {
            addCriterion("meetingSubject in", values, "meetingsubject");
            return (Criteria) this;
        }

        public Criteria andMeetingsubjectNotIn(List<String> values) {
            addCriterion("meetingSubject not in", values, "meetingsubject");
            return (Criteria) this;
        }

        public Criteria andMeetingsubjectBetween(String value1, String value2) {
            addCriterion("meetingSubject between", value1, value2, "meetingsubject");
            return (Criteria) this;
        }

        public Criteria andMeetingsubjectNotBetween(String value1, String value2) {
            addCriterion("meetingSubject not between", value1, value2, "meetingsubject");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andBeginatIsNull() {
            addCriterion("beginAt is null");
            return (Criteria) this;
        }

        public Criteria andBeginatIsNotNull() {
            addCriterion("beginAt is not null");
            return (Criteria) this;
        }

        public Criteria andBeginatEqualTo(Date value) {
            addCriterionForJDBCDate("beginAt =", value, "beginat");
            return (Criteria) this;
        }

        public Criteria andBeginatNotEqualTo(Date value) {
            addCriterionForJDBCDate("beginAt <>", value, "beginat");
            return (Criteria) this;
        }

        public Criteria andBeginatGreaterThan(Date value) {
            addCriterionForJDBCDate("beginAt >", value, "beginat");
            return (Criteria) this;
        }

        public Criteria andBeginatGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("beginAt >=", value, "beginat");
            return (Criteria) this;
        }

        public Criteria andBeginatLessThan(Date value) {
            addCriterionForJDBCDate("beginAt <", value, "beginat");
            return (Criteria) this;
        }

        public Criteria andBeginatLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("beginAt <=", value, "beginat");
            return (Criteria) this;
        }

        public Criteria andBeginatIn(List<Date> values) {
            addCriterionForJDBCDate("beginAt in", values, "beginat");
            return (Criteria) this;
        }

        public Criteria andBeginatNotIn(List<Date> values) {
            addCriterionForJDBCDate("beginAt not in", values, "beginat");
            return (Criteria) this;
        }

        public Criteria andBeginatBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("beginAt between", value1, value2, "beginat");
            return (Criteria) this;
        }

        public Criteria andBeginatNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("beginAt not between", value1, value2, "beginat");
            return (Criteria) this;
        }

        public Criteria andEndatIsNull() {
            addCriterion("endAt is null");
            return (Criteria) this;
        }

        public Criteria andEndatIsNotNull() {
            addCriterion("endAt is not null");
            return (Criteria) this;
        }

        public Criteria andEndatEqualTo(Date value) {
            addCriterionForJDBCDate("endAt =", value, "endat");
            return (Criteria) this;
        }

        public Criteria andEndatNotEqualTo(Date value) {
            addCriterionForJDBCDate("endAt <>", value, "endat");
            return (Criteria) this;
        }

        public Criteria andEndatGreaterThan(Date value) {
            addCriterionForJDBCDate("endAt >", value, "endat");
            return (Criteria) this;
        }

        public Criteria andEndatGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endAt >=", value, "endat");
            return (Criteria) this;
        }

        public Criteria andEndatLessThan(Date value) {
            addCriterionForJDBCDate("endAt <", value, "endat");
            return (Criteria) this;
        }

        public Criteria andEndatLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endAt <=", value, "endat");
            return (Criteria) this;
        }

        public Criteria andEndatIn(List<Date> values) {
            addCriterionForJDBCDate("endAt in", values, "endat");
            return (Criteria) this;
        }

        public Criteria andEndatNotIn(List<Date> values) {
            addCriterionForJDBCDate("endAt not in", values, "endat");
            return (Criteria) this;
        }

        public Criteria andEndatBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endAt between", value1, value2, "endat");
            return (Criteria) this;
        }

        public Criteria andEndatNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endAt not between", value1, value2, "endat");
            return (Criteria) this;
        }

        public Criteria andOrganizerIsNull() {
            addCriterion("organizer is null");
            return (Criteria) this;
        }

        public Criteria andOrganizerIsNotNull() {
            addCriterion("organizer is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizerEqualTo(String value) {
            addCriterion("organizer =", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerNotEqualTo(String value) {
            addCriterion("organizer <>", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerGreaterThan(String value) {
            addCriterion("organizer >", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerGreaterThanOrEqualTo(String value) {
            addCriterion("organizer >=", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerLessThan(String value) {
            addCriterion("organizer <", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerLessThanOrEqualTo(String value) {
            addCriterion("organizer <=", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerLike(String value) {
            addCriterion("organizer like", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerNotLike(String value) {
            addCriterion("organizer not like", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerIn(List<String> values) {
            addCriterion("organizer in", values, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerNotIn(List<String> values) {
            addCriterion("organizer not in", values, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerBetween(String value1, String value2) {
            addCriterion("organizer between", value1, value2, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerNotBetween(String value1, String value2) {
            addCriterion("organizer not between", value1, value2, "organizer");
            return (Criteria) this;
        }

        public Criteria andParticipantnumberIsNull() {
            addCriterion("participantNumber is null");
            return (Criteria) this;
        }

        public Criteria andParticipantnumberIsNotNull() {
            addCriterion("participantNumber is not null");
            return (Criteria) this;
        }

        public Criteria andParticipantnumberEqualTo(Integer value) {
            addCriterion("participantNumber =", value, "participantnumber");
            return (Criteria) this;
        }

        public Criteria andParticipantnumberNotEqualTo(Integer value) {
            addCriterion("participantNumber <>", value, "participantnumber");
            return (Criteria) this;
        }

        public Criteria andParticipantnumberGreaterThan(Integer value) {
            addCriterion("participantNumber >", value, "participantnumber");
            return (Criteria) this;
        }

        public Criteria andParticipantnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("participantNumber >=", value, "participantnumber");
            return (Criteria) this;
        }

        public Criteria andParticipantnumberLessThan(Integer value) {
            addCriterion("participantNumber <", value, "participantnumber");
            return (Criteria) this;
        }

        public Criteria andParticipantnumberLessThanOrEqualTo(Integer value) {
            addCriterion("participantNumber <=", value, "participantnumber");
            return (Criteria) this;
        }

        public Criteria andParticipantnumberIn(List<Integer> values) {
            addCriterion("participantNumber in", values, "participantnumber");
            return (Criteria) this;
        }

        public Criteria andParticipantnumberNotIn(List<Integer> values) {
            addCriterion("participantNumber not in", values, "participantnumber");
            return (Criteria) this;
        }

        public Criteria andParticipantnumberBetween(Integer value1, Integer value2) {
            addCriterion("participantNumber between", value1, value2, "participantnumber");
            return (Criteria) this;
        }

        public Criteria andParticipantnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("participantNumber not between", value1, value2, "participantnumber");
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

        public Criteria andContactinfoIsNull() {
            addCriterion("contactInfo is null");
            return (Criteria) this;
        }

        public Criteria andContactinfoIsNotNull() {
            addCriterion("contactInfo is not null");
            return (Criteria) this;
        }

        public Criteria andContactinfoEqualTo(String value) {
            addCriterion("contactInfo =", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoNotEqualTo(String value) {
            addCriterion("contactInfo <>", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoGreaterThan(String value) {
            addCriterion("contactInfo >", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoGreaterThanOrEqualTo(String value) {
            addCriterion("contactInfo >=", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoLessThan(String value) {
            addCriterion("contactInfo <", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoLessThanOrEqualTo(String value) {
            addCriterion("contactInfo <=", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoLike(String value) {
            addCriterion("contactInfo like", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoNotLike(String value) {
            addCriterion("contactInfo not like", value, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoIn(List<String> values) {
            addCriterion("contactInfo in", values, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoNotIn(List<String> values) {
            addCriterion("contactInfo not in", values, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoBetween(String value1, String value2) {
            addCriterion("contactInfo between", value1, value2, "contactinfo");
            return (Criteria) this;
        }

        public Criteria andContactinfoNotBetween(String value1, String value2) {
            addCriterion("contactInfo not between", value1, value2, "contactinfo");
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