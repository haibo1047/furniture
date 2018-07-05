package com.huiyi.meeting.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MeetingForumExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public MeetingForumExample() {
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

        public Criteria andTopicIsNull() {
            addCriterion("topic is null");
            return (Criteria) this;
        }

        public Criteria andTopicIsNotNull() {
            addCriterion("topic is not null");
            return (Criteria) this;
        }

        public Criteria andTopicEqualTo(String value) {
            addCriterion("topic =", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotEqualTo(String value) {
            addCriterion("topic <>", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThan(String value) {
            addCriterion("topic >", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThanOrEqualTo(String value) {
            addCriterion("topic >=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThan(String value) {
            addCriterion("topic <", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThanOrEqualTo(String value) {
            addCriterion("topic <=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLike(String value) {
            addCriterion("topic like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotLike(String value) {
            addCriterion("topic not like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicIn(List<String> values) {
            addCriterion("topic in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotIn(List<String> values) {
            addCriterion("topic not in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicBetween(String value1, String value2) {
            addCriterion("topic between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotBetween(String value1, String value2) {
            addCriterion("topic not between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andAgendaIsNull() {
            addCriterion("agenda is null");
            return (Criteria) this;
        }

        public Criteria andAgendaIsNotNull() {
            addCriterion("agenda is not null");
            return (Criteria) this;
        }

        public Criteria andAgendaEqualTo(String value) {
            addCriterion("agenda =", value, "agenda");
            return (Criteria) this;
        }

        public Criteria andAgendaNotEqualTo(String value) {
            addCriterion("agenda <>", value, "agenda");
            return (Criteria) this;
        }

        public Criteria andAgendaGreaterThan(String value) {
            addCriterion("agenda >", value, "agenda");
            return (Criteria) this;
        }

        public Criteria andAgendaGreaterThanOrEqualTo(String value) {
            addCriterion("agenda >=", value, "agenda");
            return (Criteria) this;
        }

        public Criteria andAgendaLessThan(String value) {
            addCriterion("agenda <", value, "agenda");
            return (Criteria) this;
        }

        public Criteria andAgendaLessThanOrEqualTo(String value) {
            addCriterion("agenda <=", value, "agenda");
            return (Criteria) this;
        }

        public Criteria andAgendaLike(String value) {
            addCriterion("agenda like", value, "agenda");
            return (Criteria) this;
        }

        public Criteria andAgendaNotLike(String value) {
            addCriterion("agenda not like", value, "agenda");
            return (Criteria) this;
        }

        public Criteria andAgendaIn(List<String> values) {
            addCriterion("agenda in", values, "agenda");
            return (Criteria) this;
        }

        public Criteria andAgendaNotIn(List<String> values) {
            addCriterion("agenda not in", values, "agenda");
            return (Criteria) this;
        }

        public Criteria andAgendaBetween(String value1, String value2) {
            addCriterion("agenda between", value1, value2, "agenda");
            return (Criteria) this;
        }

        public Criteria andAgendaNotBetween(String value1, String value2) {
            addCriterion("agenda not between", value1, value2, "agenda");
            return (Criteria) this;
        }

        public Criteria andNumofquestionIsNull() {
            addCriterion("numOfQuestion is null");
            return (Criteria) this;
        }

        public Criteria andNumofquestionIsNotNull() {
            addCriterion("numOfQuestion is not null");
            return (Criteria) this;
        }

        public Criteria andNumofquestionEqualTo(Integer value) {
            addCriterion("numOfQuestion =", value, "numofquestion");
            return (Criteria) this;
        }

        public Criteria andNumofquestionNotEqualTo(Integer value) {
            addCriterion("numOfQuestion <>", value, "numofquestion");
            return (Criteria) this;
        }

        public Criteria andNumofquestionGreaterThan(Integer value) {
            addCriterion("numOfQuestion >", value, "numofquestion");
            return (Criteria) this;
        }

        public Criteria andNumofquestionGreaterThanOrEqualTo(Integer value) {
            addCriterion("numOfQuestion >=", value, "numofquestion");
            return (Criteria) this;
        }

        public Criteria andNumofquestionLessThan(Integer value) {
            addCriterion("numOfQuestion <", value, "numofquestion");
            return (Criteria) this;
        }

        public Criteria andNumofquestionLessThanOrEqualTo(Integer value) {
            addCriterion("numOfQuestion <=", value, "numofquestion");
            return (Criteria) this;
        }

        public Criteria andNumofquestionIn(List<Integer> values) {
            addCriterion("numOfQuestion in", values, "numofquestion");
            return (Criteria) this;
        }

        public Criteria andNumofquestionNotIn(List<Integer> values) {
            addCriterion("numOfQuestion not in", values, "numofquestion");
            return (Criteria) this;
        }

        public Criteria andNumofquestionBetween(Integer value1, Integer value2) {
            addCriterion("numOfQuestion between", value1, value2, "numofquestion");
            return (Criteria) this;
        }

        public Criteria andNumofquestionNotBetween(Integer value1, Integer value2) {
            addCriterion("numOfQuestion not between", value1, value2, "numofquestion");
            return (Criteria) this;
        }

        public Criteria andRoundnameIsNull() {
            addCriterion("roundName is null");
            return (Criteria) this;
        }

        public Criteria andRoundnameIsNotNull() {
            addCriterion("roundName is not null");
            return (Criteria) this;
        }

        public Criteria andRoundnameEqualTo(String value) {
            addCriterion("roundName =", value, "roundname");
            return (Criteria) this;
        }

        public Criteria andRoundnameNotEqualTo(String value) {
            addCriterion("roundName <>", value, "roundname");
            return (Criteria) this;
        }

        public Criteria andRoundnameGreaterThan(String value) {
            addCriterion("roundName >", value, "roundname");
            return (Criteria) this;
        }

        public Criteria andRoundnameGreaterThanOrEqualTo(String value) {
            addCriterion("roundName >=", value, "roundname");
            return (Criteria) this;
        }

        public Criteria andRoundnameLessThan(String value) {
            addCriterion("roundName <", value, "roundname");
            return (Criteria) this;
        }

        public Criteria andRoundnameLessThanOrEqualTo(String value) {
            addCriterion("roundName <=", value, "roundname");
            return (Criteria) this;
        }

        public Criteria andRoundnameLike(String value) {
            addCriterion("roundName like", value, "roundname");
            return (Criteria) this;
        }

        public Criteria andRoundnameNotLike(String value) {
            addCriterion("roundName not like", value, "roundname");
            return (Criteria) this;
        }

        public Criteria andRoundnameIn(List<String> values) {
            addCriterion("roundName in", values, "roundname");
            return (Criteria) this;
        }

        public Criteria andRoundnameNotIn(List<String> values) {
            addCriterion("roundName not in", values, "roundname");
            return (Criteria) this;
        }

        public Criteria andRoundnameBetween(String value1, String value2) {
            addCriterion("roundName between", value1, value2, "roundname");
            return (Criteria) this;
        }

        public Criteria andRoundnameNotBetween(String value1, String value2) {
            addCriterion("roundName not between", value1, value2, "roundname");
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