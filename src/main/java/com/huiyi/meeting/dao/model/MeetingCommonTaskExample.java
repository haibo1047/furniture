package com.huiyi.meeting.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MeetingCommonTaskExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public MeetingCommonTaskExample() {
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

        public Criteria andTasktypeIsNull() {
            addCriterion("taskType is null");
            return (Criteria) this;
        }

        public Criteria andTasktypeIsNotNull() {
            addCriterion("taskType is not null");
            return (Criteria) this;
        }

        public Criteria andTasktypeEqualTo(String value) {
            addCriterion("taskType =", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotEqualTo(String value) {
            addCriterion("taskType <>", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThan(String value) {
            addCriterion("taskType >", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThanOrEqualTo(String value) {
            addCriterion("taskType >=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThan(String value) {
            addCriterion("taskType <", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThanOrEqualTo(String value) {
            addCriterion("taskType <=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLike(String value) {
            addCriterion("taskType like", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotLike(String value) {
            addCriterion("taskType not like", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeIn(List<String> values) {
            addCriterion("taskType in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotIn(List<String> values) {
            addCriterion("taskType not in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeBetween(String value1, String value2) {
            addCriterion("taskType between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotBetween(String value1, String value2) {
            addCriterion("taskType not between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andActivititaskidIsNull() {
            addCriterion("activitiTaskId is null");
            return (Criteria) this;
        }

        public Criteria andActivititaskidIsNotNull() {
            addCriterion("activitiTaskId is not null");
            return (Criteria) this;
        }

        public Criteria andActivititaskidEqualTo(String value) {
            addCriterion("activitiTaskId =", value, "activititaskid");
            return (Criteria) this;
        }

        public Criteria andActivititaskidNotEqualTo(String value) {
            addCriterion("activitiTaskId <>", value, "activititaskid");
            return (Criteria) this;
        }

        public Criteria andActivititaskidGreaterThan(String value) {
            addCriterion("activitiTaskId >", value, "activititaskid");
            return (Criteria) this;
        }

        public Criteria andActivititaskidGreaterThanOrEqualTo(String value) {
            addCriterion("activitiTaskId >=", value, "activititaskid");
            return (Criteria) this;
        }

        public Criteria andActivititaskidLessThan(String value) {
            addCriterion("activitiTaskId <", value, "activititaskid");
            return (Criteria) this;
        }

        public Criteria andActivititaskidLessThanOrEqualTo(String value) {
            addCriterion("activitiTaskId <=", value, "activititaskid");
            return (Criteria) this;
        }

        public Criteria andActivititaskidLike(String value) {
            addCriterion("activitiTaskId like", value, "activititaskid");
            return (Criteria) this;
        }

        public Criteria andActivititaskidNotLike(String value) {
            addCriterion("activitiTaskId not like", value, "activititaskid");
            return (Criteria) this;
        }

        public Criteria andActivititaskidIn(List<String> values) {
            addCriterion("activitiTaskId in", values, "activititaskid");
            return (Criteria) this;
        }

        public Criteria andActivititaskidNotIn(List<String> values) {
            addCriterion("activitiTaskId not in", values, "activititaskid");
            return (Criteria) this;
        }

        public Criteria andActivititaskidBetween(String value1, String value2) {
            addCriterion("activitiTaskId between", value1, value2, "activititaskid");
            return (Criteria) this;
        }

        public Criteria andActivititaskidNotBetween(String value1, String value2) {
            addCriterion("activitiTaskId not between", value1, value2, "activititaskid");
            return (Criteria) this;
        }

        public Criteria andFormkeyIsNull() {
            addCriterion("formkey is null");
            return (Criteria) this;
        }

        public Criteria andFormkeyIsNotNull() {
            addCriterion("formkey is not null");
            return (Criteria) this;
        }

        public Criteria andFormkeyEqualTo(String value) {
            addCriterion("formkey =", value, "formkey");
            return (Criteria) this;
        }

        public Criteria andFormkeyNotEqualTo(String value) {
            addCriterion("formkey <>", value, "formkey");
            return (Criteria) this;
        }

        public Criteria andFormkeyGreaterThan(String value) {
            addCriterion("formkey >", value, "formkey");
            return (Criteria) this;
        }

        public Criteria andFormkeyGreaterThanOrEqualTo(String value) {
            addCriterion("formkey >=", value, "formkey");
            return (Criteria) this;
        }

        public Criteria andFormkeyLessThan(String value) {
            addCriterion("formkey <", value, "formkey");
            return (Criteria) this;
        }

        public Criteria andFormkeyLessThanOrEqualTo(String value) {
            addCriterion("formkey <=", value, "formkey");
            return (Criteria) this;
        }

        public Criteria andFormkeyLike(String value) {
            addCriterion("formkey like", value, "formkey");
            return (Criteria) this;
        }

        public Criteria andFormkeyNotLike(String value) {
            addCriterion("formkey not like", value, "formkey");
            return (Criteria) this;
        }

        public Criteria andFormkeyIn(List<String> values) {
            addCriterion("formkey in", values, "formkey");
            return (Criteria) this;
        }

        public Criteria andFormkeyNotIn(List<String> values) {
            addCriterion("formkey not in", values, "formkey");
            return (Criteria) this;
        }

        public Criteria andFormkeyBetween(String value1, String value2) {
            addCriterion("formkey between", value1, value2, "formkey");
            return (Criteria) this;
        }

        public Criteria andFormkeyNotBetween(String value1, String value2) {
            addCriterion("formkey not between", value1, value2, "formkey");
            return (Criteria) this;
        }

        public Criteria andTaskstatusIsNull() {
            addCriterion("taskStatus is null");
            return (Criteria) this;
        }

        public Criteria andTaskstatusIsNotNull() {
            addCriterion("taskStatus is not null");
            return (Criteria) this;
        }

        public Criteria andTaskstatusEqualTo(String value) {
            addCriterion("taskStatus =", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusNotEqualTo(String value) {
            addCriterion("taskStatus <>", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusGreaterThan(String value) {
            addCriterion("taskStatus >", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusGreaterThanOrEqualTo(String value) {
            addCriterion("taskStatus >=", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusLessThan(String value) {
            addCriterion("taskStatus <", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusLessThanOrEqualTo(String value) {
            addCriterion("taskStatus <=", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusLike(String value) {
            addCriterion("taskStatus like", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusNotLike(String value) {
            addCriterion("taskStatus not like", value, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusIn(List<String> values) {
            addCriterion("taskStatus in", values, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusNotIn(List<String> values) {
            addCriterion("taskStatus not in", values, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusBetween(String value1, String value2) {
            addCriterion("taskStatus between", value1, value2, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskstatusNotBetween(String value1, String value2) {
            addCriterion("taskStatus not between", value1, value2, "taskstatus");
            return (Criteria) this;
        }

        public Criteria andTaskviewersIsNull() {
            addCriterion("taskViewers is null");
            return (Criteria) this;
        }

        public Criteria andTaskviewersIsNotNull() {
            addCriterion("taskViewers is not null");
            return (Criteria) this;
        }

        public Criteria andTaskviewersEqualTo(String value) {
            addCriterion("taskViewers =", value, "taskviewers");
            return (Criteria) this;
        }

        public Criteria andTaskviewersNotEqualTo(String value) {
            addCriterion("taskViewers <>", value, "taskviewers");
            return (Criteria) this;
        }

        public Criteria andTaskviewersGreaterThan(String value) {
            addCriterion("taskViewers >", value, "taskviewers");
            return (Criteria) this;
        }

        public Criteria andTaskviewersGreaterThanOrEqualTo(String value) {
            addCriterion("taskViewers >=", value, "taskviewers");
            return (Criteria) this;
        }

        public Criteria andTaskviewersLessThan(String value) {
            addCriterion("taskViewers <", value, "taskviewers");
            return (Criteria) this;
        }

        public Criteria andTaskviewersLessThanOrEqualTo(String value) {
            addCriterion("taskViewers <=", value, "taskviewers");
            return (Criteria) this;
        }

        public Criteria andTaskviewersLike(String value) {
            addCriterion("taskViewers like", value, "taskviewers");
            return (Criteria) this;
        }

        public Criteria andTaskviewersNotLike(String value) {
            addCriterion("taskViewers not like", value, "taskviewers");
            return (Criteria) this;
        }

        public Criteria andTaskviewersIn(List<String> values) {
            addCriterion("taskViewers in", values, "taskviewers");
            return (Criteria) this;
        }

        public Criteria andTaskviewersNotIn(List<String> values) {
            addCriterion("taskViewers not in", values, "taskviewers");
            return (Criteria) this;
        }

        public Criteria andTaskviewersBetween(String value1, String value2) {
            addCriterion("taskViewers between", value1, value2, "taskviewers");
            return (Criteria) this;
        }

        public Criteria andTaskviewersNotBetween(String value1, String value2) {
            addCriterion("taskViewers not between", value1, value2, "taskviewers");
            return (Criteria) this;
        }

        public Criteria andTaskownerIsNull() {
            addCriterion("taskOwner is null");
            return (Criteria) this;
        }

        public Criteria andTaskownerIsNotNull() {
            addCriterion("taskOwner is not null");
            return (Criteria) this;
        }

        public Criteria andTaskownerEqualTo(String value) {
            addCriterion("taskOwner =", value, "taskowner");
            return (Criteria) this;
        }

        public Criteria andTaskownerNotEqualTo(String value) {
            addCriterion("taskOwner <>", value, "taskowner");
            return (Criteria) this;
        }

        public Criteria andTaskownerGreaterThan(String value) {
            addCriterion("taskOwner >", value, "taskowner");
            return (Criteria) this;
        }

        public Criteria andTaskownerGreaterThanOrEqualTo(String value) {
            addCriterion("taskOwner >=", value, "taskowner");
            return (Criteria) this;
        }

        public Criteria andTaskownerLessThan(String value) {
            addCriterion("taskOwner <", value, "taskowner");
            return (Criteria) this;
        }

        public Criteria andTaskownerLessThanOrEqualTo(String value) {
            addCriterion("taskOwner <=", value, "taskowner");
            return (Criteria) this;
        }

        public Criteria andTaskownerLike(String value) {
            addCriterion("taskOwner like", value, "taskowner");
            return (Criteria) this;
        }

        public Criteria andTaskownerNotLike(String value) {
            addCriterion("taskOwner not like", value, "taskowner");
            return (Criteria) this;
        }

        public Criteria andTaskownerIn(List<String> values) {
            addCriterion("taskOwner in", values, "taskowner");
            return (Criteria) this;
        }

        public Criteria andTaskownerNotIn(List<String> values) {
            addCriterion("taskOwner not in", values, "taskowner");
            return (Criteria) this;
        }

        public Criteria andTaskownerBetween(String value1, String value2) {
            addCriterion("taskOwner between", value1, value2, "taskowner");
            return (Criteria) this;
        }

        public Criteria andTaskownerNotBetween(String value1, String value2) {
            addCriterion("taskOwner not between", value1, value2, "taskowner");
            return (Criteria) this;
        }

        public Criteria andTaskexecutorsIsNull() {
            addCriterion("taskExecutors is null");
            return (Criteria) this;
        }

        public Criteria andTaskexecutorsIsNotNull() {
            addCriterion("taskExecutors is not null");
            return (Criteria) this;
        }

        public Criteria andTaskexecutorsEqualTo(String value) {
            addCriterion("taskExecutors =", value, "taskexecutors");
            return (Criteria) this;
        }

        public Criteria andTaskexecutorsNotEqualTo(String value) {
            addCriterion("taskExecutors <>", value, "taskexecutors");
            return (Criteria) this;
        }

        public Criteria andTaskexecutorsGreaterThan(String value) {
            addCriterion("taskExecutors >", value, "taskexecutors");
            return (Criteria) this;
        }

        public Criteria andTaskexecutorsGreaterThanOrEqualTo(String value) {
            addCriterion("taskExecutors >=", value, "taskexecutors");
            return (Criteria) this;
        }

        public Criteria andTaskexecutorsLessThan(String value) {
            addCriterion("taskExecutors <", value, "taskexecutors");
            return (Criteria) this;
        }

        public Criteria andTaskexecutorsLessThanOrEqualTo(String value) {
            addCriterion("taskExecutors <=", value, "taskexecutors");
            return (Criteria) this;
        }

        public Criteria andTaskexecutorsLike(String value) {
            addCriterion("taskExecutors like", value, "taskexecutors");
            return (Criteria) this;
        }

        public Criteria andTaskexecutorsNotLike(String value) {
            addCriterion("taskExecutors not like", value, "taskexecutors");
            return (Criteria) this;
        }

        public Criteria andTaskexecutorsIn(List<String> values) {
            addCriterion("taskExecutors in", values, "taskexecutors");
            return (Criteria) this;
        }

        public Criteria andTaskexecutorsNotIn(List<String> values) {
            addCriterion("taskExecutors not in", values, "taskexecutors");
            return (Criteria) this;
        }

        public Criteria andTaskexecutorsBetween(String value1, String value2) {
            addCriterion("taskExecutors between", value1, value2, "taskexecutors");
            return (Criteria) this;
        }

        public Criteria andTaskexecutorsNotBetween(String value1, String value2) {
            addCriterion("taskExecutors not between", value1, value2, "taskexecutors");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionIsNull() {
            addCriterion("taskDescription is null");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionIsNotNull() {
            addCriterion("taskDescription is not null");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionEqualTo(String value) {
            addCriterion("taskDescription =", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionNotEqualTo(String value) {
            addCriterion("taskDescription <>", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionGreaterThan(String value) {
            addCriterion("taskDescription >", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("taskDescription >=", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionLessThan(String value) {
            addCriterion("taskDescription <", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionLessThanOrEqualTo(String value) {
            addCriterion("taskDescription <=", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionLike(String value) {
            addCriterion("taskDescription like", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionNotLike(String value) {
            addCriterion("taskDescription not like", value, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionIn(List<String> values) {
            addCriterion("taskDescription in", values, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionNotIn(List<String> values) {
            addCriterion("taskDescription not in", values, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionBetween(String value1, String value2) {
            addCriterion("taskDescription between", value1, value2, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTaskdescriptionNotBetween(String value1, String value2) {
            addCriterion("taskDescription not between", value1, value2, "taskdescription");
            return (Criteria) this;
        }

        public Criteria andTasktitleIsNull() {
            addCriterion("taskTitle is null");
            return (Criteria) this;
        }

        public Criteria andTasktitleIsNotNull() {
            addCriterion("taskTitle is not null");
            return (Criteria) this;
        }

        public Criteria andTasktitleEqualTo(String value) {
            addCriterion("taskTitle =", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotEqualTo(String value) {
            addCriterion("taskTitle <>", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleGreaterThan(String value) {
            addCriterion("taskTitle >", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleGreaterThanOrEqualTo(String value) {
            addCriterion("taskTitle >=", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleLessThan(String value) {
            addCriterion("taskTitle <", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleLessThanOrEqualTo(String value) {
            addCriterion("taskTitle <=", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleLike(String value) {
            addCriterion("taskTitle like", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotLike(String value) {
            addCriterion("taskTitle not like", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleIn(List<String> values) {
            addCriterion("taskTitle in", values, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotIn(List<String> values) {
            addCriterion("taskTitle not in", values, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleBetween(String value1, String value2) {
            addCriterion("taskTitle between", value1, value2, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotBetween(String value1, String value2) {
            addCriterion("taskTitle not between", value1, value2, "tasktitle");
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

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endTime not between", value1, value2, "endtime");
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

        public Criteria andTaskapproverIsNull() {
            addCriterion("taskApprover is null");
            return (Criteria) this;
        }

        public Criteria andTaskapproverIsNotNull() {
            addCriterion("taskApprover is not null");
            return (Criteria) this;
        }

        public Criteria andTaskapproverEqualTo(String value) {
            addCriterion("taskApprover =", value, "taskapprover");
            return (Criteria) this;
        }

        public Criteria andTaskapproverNotEqualTo(String value) {
            addCriterion("taskApprover <>", value, "taskapprover");
            return (Criteria) this;
        }

        public Criteria andTaskapproverGreaterThan(String value) {
            addCriterion("taskApprover >", value, "taskapprover");
            return (Criteria) this;
        }

        public Criteria andTaskapproverGreaterThanOrEqualTo(String value) {
            addCriterion("taskApprover >=", value, "taskapprover");
            return (Criteria) this;
        }

        public Criteria andTaskapproverLessThan(String value) {
            addCriterion("taskApprover <", value, "taskapprover");
            return (Criteria) this;
        }

        public Criteria andTaskapproverLessThanOrEqualTo(String value) {
            addCriterion("taskApprover <=", value, "taskapprover");
            return (Criteria) this;
        }

        public Criteria andTaskapproverLike(String value) {
            addCriterion("taskApprover like", value, "taskapprover");
            return (Criteria) this;
        }

        public Criteria andTaskapproverNotLike(String value) {
            addCriterion("taskApprover not like", value, "taskapprover");
            return (Criteria) this;
        }

        public Criteria andTaskapproverIn(List<String> values) {
            addCriterion("taskApprover in", values, "taskapprover");
            return (Criteria) this;
        }

        public Criteria andTaskapproverNotIn(List<String> values) {
            addCriterion("taskApprover not in", values, "taskapprover");
            return (Criteria) this;
        }

        public Criteria andTaskapproverBetween(String value1, String value2) {
            addCriterion("taskApprover between", value1, value2, "taskapprover");
            return (Criteria) this;
        }

        public Criteria andTaskapproverNotBetween(String value1, String value2) {
            addCriterion("taskApprover not between", value1, value2, "taskapprover");
            return (Criteria) this;
        }

        public Criteria andNeedapprovalIsNull() {
            addCriterion("needApproval is null");
            return (Criteria) this;
        }

        public Criteria andNeedapprovalIsNotNull() {
            addCriterion("needApproval is not null");
            return (Criteria) this;
        }

        public Criteria andNeedapprovalEqualTo(String value) {
            addCriterion("needApproval =", value, "needapproval");
            return (Criteria) this;
        }

        public Criteria andNeedapprovalNotEqualTo(String value) {
            addCriterion("needApproval <>", value, "needapproval");
            return (Criteria) this;
        }

        public Criteria andNeedapprovalGreaterThan(String value) {
            addCriterion("needApproval >", value, "needapproval");
            return (Criteria) this;
        }

        public Criteria andNeedapprovalGreaterThanOrEqualTo(String value) {
            addCriterion("needApproval >=", value, "needapproval");
            return (Criteria) this;
        }

        public Criteria andNeedapprovalLessThan(String value) {
            addCriterion("needApproval <", value, "needapproval");
            return (Criteria) this;
        }

        public Criteria andNeedapprovalLessThanOrEqualTo(String value) {
            addCriterion("needApproval <=", value, "needapproval");
            return (Criteria) this;
        }

        public Criteria andNeedapprovalLike(String value) {
            addCriterion("needApproval like", value, "needapproval");
            return (Criteria) this;
        }

        public Criteria andNeedapprovalNotLike(String value) {
            addCriterion("needApproval not like", value, "needapproval");
            return (Criteria) this;
        }

        public Criteria andNeedapprovalIn(List<String> values) {
            addCriterion("needApproval in", values, "needapproval");
            return (Criteria) this;
        }

        public Criteria andNeedapprovalNotIn(List<String> values) {
            addCriterion("needApproval not in", values, "needapproval");
            return (Criteria) this;
        }

        public Criteria andNeedapprovalBetween(String value1, String value2) {
            addCriterion("needApproval between", value1, value2, "needapproval");
            return (Criteria) this;
        }

        public Criteria andNeedapprovalNotBetween(String value1, String value2) {
            addCriterion("needApproval not between", value1, value2, "needapproval");
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