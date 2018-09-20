package com.ylsq.frame.tianze.strategy.dao.model;

import com.ylsq.frame.common.base.BaseExample;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TzStrategyWatermarkExample implements BaseExample, Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public TzStrategyWatermarkExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStrategyNameIsNull() {
            addCriterion("strategy_name is null");
            return (Criteria) this;
        }

        public Criteria andStrategyNameIsNotNull() {
            addCriterion("strategy_name is not null");
            return (Criteria) this;
        }

        public Criteria andStrategyNameEqualTo(String value) {
            addCriterion("strategy_name =", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameNotEqualTo(String value) {
            addCriterion("strategy_name <>", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameGreaterThan(String value) {
            addCriterion("strategy_name >", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameGreaterThanOrEqualTo(String value) {
            addCriterion("strategy_name >=", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameLessThan(String value) {
            addCriterion("strategy_name <", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameLessThanOrEqualTo(String value) {
            addCriterion("strategy_name <=", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameLike(String value) {
            addCriterion("strategy_name like", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameNotLike(String value) {
            addCriterion("strategy_name not like", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameIn(List<String> values) {
            addCriterion("strategy_name in", values, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameNotIn(List<String> values) {
            addCriterion("strategy_name not in", values, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameBetween(String value1, String value2) {
            addCriterion("strategy_name between", value1, value2, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameNotBetween(String value1, String value2) {
            addCriterion("strategy_name not between", value1, value2, "strategyName");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andDisplayUsrnameIsNull() {
            addCriterion("display_usrname is null");
            return (Criteria) this;
        }

        public Criteria andDisplayUsrnameIsNotNull() {
            addCriterion("display_usrname is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayUsrnameEqualTo(Integer value) {
            addCriterion("display_usrname =", value, "displayUsrname");
            return (Criteria) this;
        }

        public Criteria andDisplayUsrnameNotEqualTo(Integer value) {
            addCriterion("display_usrname <>", value, "displayUsrname");
            return (Criteria) this;
        }

        public Criteria andDisplayUsrnameGreaterThan(Integer value) {
            addCriterion("display_usrname >", value, "displayUsrname");
            return (Criteria) this;
        }

        public Criteria andDisplayUsrnameGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_usrname >=", value, "displayUsrname");
            return (Criteria) this;
        }

        public Criteria andDisplayUsrnameLessThan(Integer value) {
            addCriterion("display_usrname <", value, "displayUsrname");
            return (Criteria) this;
        }

        public Criteria andDisplayUsrnameLessThanOrEqualTo(Integer value) {
            addCriterion("display_usrname <=", value, "displayUsrname");
            return (Criteria) this;
        }

        public Criteria andDisplayUsrnameIn(List<Integer> values) {
            addCriterion("display_usrname in", values, "displayUsrname");
            return (Criteria) this;
        }

        public Criteria andDisplayUsrnameNotIn(List<Integer> values) {
            addCriterion("display_usrname not in", values, "displayUsrname");
            return (Criteria) this;
        }

        public Criteria andDisplayUsrnameBetween(Integer value1, Integer value2) {
            addCriterion("display_usrname between", value1, value2, "displayUsrname");
            return (Criteria) this;
        }

        public Criteria andDisplayUsrnameNotBetween(Integer value1, Integer value2) {
            addCriterion("display_usrname not between", value1, value2, "displayUsrname");
            return (Criteria) this;
        }

        public Criteria andDisplayPcnameIsNull() {
            addCriterion("display_pcname is null");
            return (Criteria) this;
        }

        public Criteria andDisplayPcnameIsNotNull() {
            addCriterion("display_pcname is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayPcnameEqualTo(Integer value) {
            addCriterion("display_pcname =", value, "displayPcname");
            return (Criteria) this;
        }

        public Criteria andDisplayPcnameNotEqualTo(Integer value) {
            addCriterion("display_pcname <>", value, "displayPcname");
            return (Criteria) this;
        }

        public Criteria andDisplayPcnameGreaterThan(Integer value) {
            addCriterion("display_pcname >", value, "displayPcname");
            return (Criteria) this;
        }

        public Criteria andDisplayPcnameGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_pcname >=", value, "displayPcname");
            return (Criteria) this;
        }

        public Criteria andDisplayPcnameLessThan(Integer value) {
            addCriterion("display_pcname <", value, "displayPcname");
            return (Criteria) this;
        }

        public Criteria andDisplayPcnameLessThanOrEqualTo(Integer value) {
            addCriterion("display_pcname <=", value, "displayPcname");
            return (Criteria) this;
        }

        public Criteria andDisplayPcnameIn(List<Integer> values) {
            addCriterion("display_pcname in", values, "displayPcname");
            return (Criteria) this;
        }

        public Criteria andDisplayPcnameNotIn(List<Integer> values) {
            addCriterion("display_pcname not in", values, "displayPcname");
            return (Criteria) this;
        }

        public Criteria andDisplayPcnameBetween(Integer value1, Integer value2) {
            addCriterion("display_pcname between", value1, value2, "displayPcname");
            return (Criteria) this;
        }

        public Criteria andDisplayPcnameNotBetween(Integer value1, Integer value2) {
            addCriterion("display_pcname not between", value1, value2, "displayPcname");
            return (Criteria) this;
        }

        public Criteria andDisplayIpIsNull() {
            addCriterion("display_ip is null");
            return (Criteria) this;
        }

        public Criteria andDisplayIpIsNotNull() {
            addCriterion("display_ip is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayIpEqualTo(Integer value) {
            addCriterion("display_ip =", value, "displayIp");
            return (Criteria) this;
        }

        public Criteria andDisplayIpNotEqualTo(Integer value) {
            addCriterion("display_ip <>", value, "displayIp");
            return (Criteria) this;
        }

        public Criteria andDisplayIpGreaterThan(Integer value) {
            addCriterion("display_ip >", value, "displayIp");
            return (Criteria) this;
        }

        public Criteria andDisplayIpGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_ip >=", value, "displayIp");
            return (Criteria) this;
        }

        public Criteria andDisplayIpLessThan(Integer value) {
            addCriterion("display_ip <", value, "displayIp");
            return (Criteria) this;
        }

        public Criteria andDisplayIpLessThanOrEqualTo(Integer value) {
            addCriterion("display_ip <=", value, "displayIp");
            return (Criteria) this;
        }

        public Criteria andDisplayIpIn(List<Integer> values) {
            addCriterion("display_ip in", values, "displayIp");
            return (Criteria) this;
        }

        public Criteria andDisplayIpNotIn(List<Integer> values) {
            addCriterion("display_ip not in", values, "displayIp");
            return (Criteria) this;
        }

        public Criteria andDisplayIpBetween(Integer value1, Integer value2) {
            addCriterion("display_ip between", value1, value2, "displayIp");
            return (Criteria) this;
        }

        public Criteria andDisplayIpNotBetween(Integer value1, Integer value2) {
            addCriterion("display_ip not between", value1, value2, "displayIp");
            return (Criteria) this;
        }

        public Criteria andDisplayLoginTimeIsNull() {
            addCriterion("display_login_time is null");
            return (Criteria) this;
        }

        public Criteria andDisplayLoginTimeIsNotNull() {
            addCriterion("display_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayLoginTimeEqualTo(Integer value) {
            addCriterion("display_login_time =", value, "displayLoginTime");
            return (Criteria) this;
        }

        public Criteria andDisplayLoginTimeNotEqualTo(Integer value) {
            addCriterion("display_login_time <>", value, "displayLoginTime");
            return (Criteria) this;
        }

        public Criteria andDisplayLoginTimeGreaterThan(Integer value) {
            addCriterion("display_login_time >", value, "displayLoginTime");
            return (Criteria) this;
        }

        public Criteria andDisplayLoginTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_login_time >=", value, "displayLoginTime");
            return (Criteria) this;
        }

        public Criteria andDisplayLoginTimeLessThan(Integer value) {
            addCriterion("display_login_time <", value, "displayLoginTime");
            return (Criteria) this;
        }

        public Criteria andDisplayLoginTimeLessThanOrEqualTo(Integer value) {
            addCriterion("display_login_time <=", value, "displayLoginTime");
            return (Criteria) this;
        }

        public Criteria andDisplayLoginTimeIn(List<Integer> values) {
            addCriterion("display_login_time in", values, "displayLoginTime");
            return (Criteria) this;
        }

        public Criteria andDisplayLoginTimeNotIn(List<Integer> values) {
            addCriterion("display_login_time not in", values, "displayLoginTime");
            return (Criteria) this;
        }

        public Criteria andDisplayLoginTimeBetween(Integer value1, Integer value2) {
            addCriterion("display_login_time between", value1, value2, "displayLoginTime");
            return (Criteria) this;
        }

        public Criteria andDisplayLoginTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("display_login_time not between", value1, value2, "displayLoginTime");
            return (Criteria) this;
        }

        public Criteria andPosCenterIsNull() {
            addCriterion("pos_center is null");
            return (Criteria) this;
        }

        public Criteria andPosCenterIsNotNull() {
            addCriterion("pos_center is not null");
            return (Criteria) this;
        }

        public Criteria andPosCenterEqualTo(Integer value) {
            addCriterion("pos_center =", value, "posCenter");
            return (Criteria) this;
        }

        public Criteria andPosCenterNotEqualTo(Integer value) {
            addCriterion("pos_center <>", value, "posCenter");
            return (Criteria) this;
        }

        public Criteria andPosCenterGreaterThan(Integer value) {
            addCriterion("pos_center >", value, "posCenter");
            return (Criteria) this;
        }

        public Criteria andPosCenterGreaterThanOrEqualTo(Integer value) {
            addCriterion("pos_center >=", value, "posCenter");
            return (Criteria) this;
        }

        public Criteria andPosCenterLessThan(Integer value) {
            addCriterion("pos_center <", value, "posCenter");
            return (Criteria) this;
        }

        public Criteria andPosCenterLessThanOrEqualTo(Integer value) {
            addCriterion("pos_center <=", value, "posCenter");
            return (Criteria) this;
        }

        public Criteria andPosCenterIn(List<Integer> values) {
            addCriterion("pos_center in", values, "posCenter");
            return (Criteria) this;
        }

        public Criteria andPosCenterNotIn(List<Integer> values) {
            addCriterion("pos_center not in", values, "posCenter");
            return (Criteria) this;
        }

        public Criteria andPosCenterBetween(Integer value1, Integer value2) {
            addCriterion("pos_center between", value1, value2, "posCenter");
            return (Criteria) this;
        }

        public Criteria andPosCenterNotBetween(Integer value1, Integer value2) {
            addCriterion("pos_center not between", value1, value2, "posCenter");
            return (Criteria) this;
        }

        public Criteria andPosLefttopIsNull() {
            addCriterion("pos_lefttop is null");
            return (Criteria) this;
        }

        public Criteria andPosLefttopIsNotNull() {
            addCriterion("pos_lefttop is not null");
            return (Criteria) this;
        }

        public Criteria andPosLefttopEqualTo(Integer value) {
            addCriterion("pos_lefttop =", value, "posLefttop");
            return (Criteria) this;
        }

        public Criteria andPosLefttopNotEqualTo(Integer value) {
            addCriterion("pos_lefttop <>", value, "posLefttop");
            return (Criteria) this;
        }

        public Criteria andPosLefttopGreaterThan(Integer value) {
            addCriterion("pos_lefttop >", value, "posLefttop");
            return (Criteria) this;
        }

        public Criteria andPosLefttopGreaterThanOrEqualTo(Integer value) {
            addCriterion("pos_lefttop >=", value, "posLefttop");
            return (Criteria) this;
        }

        public Criteria andPosLefttopLessThan(Integer value) {
            addCriterion("pos_lefttop <", value, "posLefttop");
            return (Criteria) this;
        }

        public Criteria andPosLefttopLessThanOrEqualTo(Integer value) {
            addCriterion("pos_lefttop <=", value, "posLefttop");
            return (Criteria) this;
        }

        public Criteria andPosLefttopIn(List<Integer> values) {
            addCriterion("pos_lefttop in", values, "posLefttop");
            return (Criteria) this;
        }

        public Criteria andPosLefttopNotIn(List<Integer> values) {
            addCriterion("pos_lefttop not in", values, "posLefttop");
            return (Criteria) this;
        }

        public Criteria andPosLefttopBetween(Integer value1, Integer value2) {
            addCriterion("pos_lefttop between", value1, value2, "posLefttop");
            return (Criteria) this;
        }

        public Criteria andPosLefttopNotBetween(Integer value1, Integer value2) {
            addCriterion("pos_lefttop not between", value1, value2, "posLefttop");
            return (Criteria) this;
        }

        public Criteria andPosLeftbottomIsNull() {
            addCriterion("pos_leftbottom is null");
            return (Criteria) this;
        }

        public Criteria andPosLeftbottomIsNotNull() {
            addCriterion("pos_leftbottom is not null");
            return (Criteria) this;
        }

        public Criteria andPosLeftbottomEqualTo(Integer value) {
            addCriterion("pos_leftbottom =", value, "posLeftbottom");
            return (Criteria) this;
        }

        public Criteria andPosLeftbottomNotEqualTo(Integer value) {
            addCriterion("pos_leftbottom <>", value, "posLeftbottom");
            return (Criteria) this;
        }

        public Criteria andPosLeftbottomGreaterThan(Integer value) {
            addCriterion("pos_leftbottom >", value, "posLeftbottom");
            return (Criteria) this;
        }

        public Criteria andPosLeftbottomGreaterThanOrEqualTo(Integer value) {
            addCriterion("pos_leftbottom >=", value, "posLeftbottom");
            return (Criteria) this;
        }

        public Criteria andPosLeftbottomLessThan(Integer value) {
            addCriterion("pos_leftbottom <", value, "posLeftbottom");
            return (Criteria) this;
        }

        public Criteria andPosLeftbottomLessThanOrEqualTo(Integer value) {
            addCriterion("pos_leftbottom <=", value, "posLeftbottom");
            return (Criteria) this;
        }

        public Criteria andPosLeftbottomIn(List<Integer> values) {
            addCriterion("pos_leftbottom in", values, "posLeftbottom");
            return (Criteria) this;
        }

        public Criteria andPosLeftbottomNotIn(List<Integer> values) {
            addCriterion("pos_leftbottom not in", values, "posLeftbottom");
            return (Criteria) this;
        }

        public Criteria andPosLeftbottomBetween(Integer value1, Integer value2) {
            addCriterion("pos_leftbottom between", value1, value2, "posLeftbottom");
            return (Criteria) this;
        }

        public Criteria andPosLeftbottomNotBetween(Integer value1, Integer value2) {
            addCriterion("pos_leftbottom not between", value1, value2, "posLeftbottom");
            return (Criteria) this;
        }

        public Criteria andPosRighttopIsNull() {
            addCriterion("pos_righttop is null");
            return (Criteria) this;
        }

        public Criteria andPosRighttopIsNotNull() {
            addCriterion("pos_righttop is not null");
            return (Criteria) this;
        }

        public Criteria andPosRighttopEqualTo(Integer value) {
            addCriterion("pos_righttop =", value, "posRighttop");
            return (Criteria) this;
        }

        public Criteria andPosRighttopNotEqualTo(Integer value) {
            addCriterion("pos_righttop <>", value, "posRighttop");
            return (Criteria) this;
        }

        public Criteria andPosRighttopGreaterThan(Integer value) {
            addCriterion("pos_righttop >", value, "posRighttop");
            return (Criteria) this;
        }

        public Criteria andPosRighttopGreaterThanOrEqualTo(Integer value) {
            addCriterion("pos_righttop >=", value, "posRighttop");
            return (Criteria) this;
        }

        public Criteria andPosRighttopLessThan(Integer value) {
            addCriterion("pos_righttop <", value, "posRighttop");
            return (Criteria) this;
        }

        public Criteria andPosRighttopLessThanOrEqualTo(Integer value) {
            addCriterion("pos_righttop <=", value, "posRighttop");
            return (Criteria) this;
        }

        public Criteria andPosRighttopIn(List<Integer> values) {
            addCriterion("pos_righttop in", values, "posRighttop");
            return (Criteria) this;
        }

        public Criteria andPosRighttopNotIn(List<Integer> values) {
            addCriterion("pos_righttop not in", values, "posRighttop");
            return (Criteria) this;
        }

        public Criteria andPosRighttopBetween(Integer value1, Integer value2) {
            addCriterion("pos_righttop between", value1, value2, "posRighttop");
            return (Criteria) this;
        }

        public Criteria andPosRighttopNotBetween(Integer value1, Integer value2) {
            addCriterion("pos_righttop not between", value1, value2, "posRighttop");
            return (Criteria) this;
        }

        public Criteria andPosRightbottomIsNull() {
            addCriterion("pos_rightbottom is null");
            return (Criteria) this;
        }

        public Criteria andPosRightbottomIsNotNull() {
            addCriterion("pos_rightbottom is not null");
            return (Criteria) this;
        }

        public Criteria andPosRightbottomEqualTo(Integer value) {
            addCriterion("pos_rightbottom =", value, "posRightbottom");
            return (Criteria) this;
        }

        public Criteria andPosRightbottomNotEqualTo(Integer value) {
            addCriterion("pos_rightbottom <>", value, "posRightbottom");
            return (Criteria) this;
        }

        public Criteria andPosRightbottomGreaterThan(Integer value) {
            addCriterion("pos_rightbottom >", value, "posRightbottom");
            return (Criteria) this;
        }

        public Criteria andPosRightbottomGreaterThanOrEqualTo(Integer value) {
            addCriterion("pos_rightbottom >=", value, "posRightbottom");
            return (Criteria) this;
        }

        public Criteria andPosRightbottomLessThan(Integer value) {
            addCriterion("pos_rightbottom <", value, "posRightbottom");
            return (Criteria) this;
        }

        public Criteria andPosRightbottomLessThanOrEqualTo(Integer value) {
            addCriterion("pos_rightbottom <=", value, "posRightbottom");
            return (Criteria) this;
        }

        public Criteria andPosRightbottomIn(List<Integer> values) {
            addCriterion("pos_rightbottom in", values, "posRightbottom");
            return (Criteria) this;
        }

        public Criteria andPosRightbottomNotIn(List<Integer> values) {
            addCriterion("pos_rightbottom not in", values, "posRightbottom");
            return (Criteria) this;
        }

        public Criteria andPosRightbottomBetween(Integer value1, Integer value2) {
            addCriterion("pos_rightbottom between", value1, value2, "posRightbottom");
            return (Criteria) this;
        }

        public Criteria andPosRightbottomNotBetween(Integer value1, Integer value2) {
            addCriterion("pos_rightbottom not between", value1, value2, "posRightbottom");
            return (Criteria) this;
        }

        public Criteria andLayoutIsNull() {
            addCriterion("layout is null");
            return (Criteria) this;
        }

        public Criteria andLayoutIsNotNull() {
            addCriterion("layout is not null");
            return (Criteria) this;
        }

        public Criteria andLayoutEqualTo(String value) {
            addCriterion("layout =", value, "layout");
            return (Criteria) this;
        }

        public Criteria andLayoutNotEqualTo(String value) {
            addCriterion("layout <>", value, "layout");
            return (Criteria) this;
        }

        public Criteria andLayoutGreaterThan(String value) {
            addCriterion("layout >", value, "layout");
            return (Criteria) this;
        }

        public Criteria andLayoutGreaterThanOrEqualTo(String value) {
            addCriterion("layout >=", value, "layout");
            return (Criteria) this;
        }

        public Criteria andLayoutLessThan(String value) {
            addCriterion("layout <", value, "layout");
            return (Criteria) this;
        }

        public Criteria andLayoutLessThanOrEqualTo(String value) {
            addCriterion("layout <=", value, "layout");
            return (Criteria) this;
        }

        public Criteria andLayoutLike(String value) {
            addCriterion("layout like", value, "layout");
            return (Criteria) this;
        }

        public Criteria andLayoutNotLike(String value) {
            addCriterion("layout not like", value, "layout");
            return (Criteria) this;
        }

        public Criteria andLayoutIn(List<String> values) {
            addCriterion("layout in", values, "layout");
            return (Criteria) this;
        }

        public Criteria andLayoutNotIn(List<String> values) {
            addCriterion("layout not in", values, "layout");
            return (Criteria) this;
        }

        public Criteria andLayoutBetween(String value1, String value2) {
            addCriterion("layout between", value1, value2, "layout");
            return (Criteria) this;
        }

        public Criteria andLayoutNotBetween(String value1, String value2) {
            addCriterion("layout not between", value1, value2, "layout");
            return (Criteria) this;
        }

        public Criteria andDisplayConditionIsNull() {
            addCriterion("display_condition is null");
            return (Criteria) this;
        }

        public Criteria andDisplayConditionIsNotNull() {
            addCriterion("display_condition is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayConditionEqualTo(String value) {
            addCriterion("display_condition =", value, "displayCondition");
            return (Criteria) this;
        }

        public Criteria andDisplayConditionNotEqualTo(String value) {
            addCriterion("display_condition <>", value, "displayCondition");
            return (Criteria) this;
        }

        public Criteria andDisplayConditionGreaterThan(String value) {
            addCriterion("display_condition >", value, "displayCondition");
            return (Criteria) this;
        }

        public Criteria andDisplayConditionGreaterThanOrEqualTo(String value) {
            addCriterion("display_condition >=", value, "displayCondition");
            return (Criteria) this;
        }

        public Criteria andDisplayConditionLessThan(String value) {
            addCriterion("display_condition <", value, "displayCondition");
            return (Criteria) this;
        }

        public Criteria andDisplayConditionLessThanOrEqualTo(String value) {
            addCriterion("display_condition <=", value, "displayCondition");
            return (Criteria) this;
        }

        public Criteria andDisplayConditionLike(String value) {
            addCriterion("display_condition like", value, "displayCondition");
            return (Criteria) this;
        }

        public Criteria andDisplayConditionNotLike(String value) {
            addCriterion("display_condition not like", value, "displayCondition");
            return (Criteria) this;
        }

        public Criteria andDisplayConditionIn(List<String> values) {
            addCriterion("display_condition in", values, "displayCondition");
            return (Criteria) this;
        }

        public Criteria andDisplayConditionNotIn(List<String> values) {
            addCriterion("display_condition not in", values, "displayCondition");
            return (Criteria) this;
        }

        public Criteria andDisplayConditionBetween(String value1, String value2) {
            addCriterion("display_condition between", value1, value2, "displayCondition");
            return (Criteria) this;
        }

        public Criteria andDisplayConditionNotBetween(String value1, String value2) {
            addCriterion("display_condition not between", value1, value2, "displayCondition");
            return (Criteria) this;
        }

        public Criteria andTransparencyIsNull() {
            addCriterion("transparency is null");
            return (Criteria) this;
        }

        public Criteria andTransparencyIsNotNull() {
            addCriterion("transparency is not null");
            return (Criteria) this;
        }

        public Criteria andTransparencyEqualTo(Integer value) {
            addCriterion("transparency =", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyNotEqualTo(Integer value) {
            addCriterion("transparency <>", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyGreaterThan(Integer value) {
            addCriterion("transparency >", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("transparency >=", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyLessThan(Integer value) {
            addCriterion("transparency <", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyLessThanOrEqualTo(Integer value) {
            addCriterion("transparency <=", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyIn(List<Integer> values) {
            addCriterion("transparency in", values, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyNotIn(List<Integer> values) {
            addCriterion("transparency not in", values, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyBetween(Integer value1, Integer value2) {
            addCriterion("transparency between", value1, value2, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyNotBetween(Integer value1, Integer value2) {
            addCriterion("transparency not between", value1, value2, "transparency");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andRecStatusIsNull() {
            addCriterion("rec_status is null");
            return (Criteria) this;
        }

        public Criteria andRecStatusIsNotNull() {
            addCriterion("rec_status is not null");
            return (Criteria) this;
        }

        public Criteria andRecStatusEqualTo(Integer value) {
            addCriterion("rec_status =", value, "recStatus");
            return (Criteria) this;
        }

        public Criteria andRecStatusNotEqualTo(Integer value) {
            addCriterion("rec_status <>", value, "recStatus");
            return (Criteria) this;
        }

        public Criteria andRecStatusGreaterThan(Integer value) {
            addCriterion("rec_status >", value, "recStatus");
            return (Criteria) this;
        }

        public Criteria andRecStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_status >=", value, "recStatus");
            return (Criteria) this;
        }

        public Criteria andRecStatusLessThan(Integer value) {
            addCriterion("rec_status <", value, "recStatus");
            return (Criteria) this;
        }

        public Criteria andRecStatusLessThanOrEqualTo(Integer value) {
            addCriterion("rec_status <=", value, "recStatus");
            return (Criteria) this;
        }

        public Criteria andRecStatusIn(List<Integer> values) {
            addCriterion("rec_status in", values, "recStatus");
            return (Criteria) this;
        }

        public Criteria andRecStatusNotIn(List<Integer> values) {
            addCriterion("rec_status not in", values, "recStatus");
            return (Criteria) this;
        }

        public Criteria andRecStatusBetween(Integer value1, Integer value2) {
            addCriterion("rec_status between", value1, value2, "recStatus");
            return (Criteria) this;
        }

        public Criteria andRecStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_status not between", value1, value2, "recStatus");
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