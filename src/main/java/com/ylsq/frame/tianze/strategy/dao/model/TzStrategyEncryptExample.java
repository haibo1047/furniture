package com.ylsq.frame.tianze.strategy.dao.model;

import com.ylsq.frame.common.base.BaseExample;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TzStrategyEncryptExample implements BaseExample, Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public TzStrategyEncryptExample() {
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

        public Criteria andAllowCopyIsNull() {
            addCriterion("allow_copy is null");
            return (Criteria) this;
        }

        public Criteria andAllowCopyIsNotNull() {
            addCriterion("allow_copy is not null");
            return (Criteria) this;
        }

        public Criteria andAllowCopyEqualTo(Integer value) {
            addCriterion("allow_copy =", value, "allowCopy");
            return (Criteria) this;
        }

        public Criteria andAllowCopyNotEqualTo(Integer value) {
            addCriterion("allow_copy <>", value, "allowCopy");
            return (Criteria) this;
        }

        public Criteria andAllowCopyGreaterThan(Integer value) {
            addCriterion("allow_copy >", value, "allowCopy");
            return (Criteria) this;
        }

        public Criteria andAllowCopyGreaterThanOrEqualTo(Integer value) {
            addCriterion("allow_copy >=", value, "allowCopy");
            return (Criteria) this;
        }

        public Criteria andAllowCopyLessThan(Integer value) {
            addCriterion("allow_copy <", value, "allowCopy");
            return (Criteria) this;
        }

        public Criteria andAllowCopyLessThanOrEqualTo(Integer value) {
            addCriterion("allow_copy <=", value, "allowCopy");
            return (Criteria) this;
        }

        public Criteria andAllowCopyIn(List<Integer> values) {
            addCriterion("allow_copy in", values, "allowCopy");
            return (Criteria) this;
        }

        public Criteria andAllowCopyNotIn(List<Integer> values) {
            addCriterion("allow_copy not in", values, "allowCopy");
            return (Criteria) this;
        }

        public Criteria andAllowCopyBetween(Integer value1, Integer value2) {
            addCriterion("allow_copy between", value1, value2, "allowCopy");
            return (Criteria) this;
        }

        public Criteria andAllowCopyNotBetween(Integer value1, Integer value2) {
            addCriterion("allow_copy not between", value1, value2, "allowCopy");
            return (Criteria) this;
        }

        public Criteria andAllowScreenIsNull() {
            addCriterion("allow_screen is null");
            return (Criteria) this;
        }

        public Criteria andAllowScreenIsNotNull() {
            addCriterion("allow_screen is not null");
            return (Criteria) this;
        }

        public Criteria andAllowScreenEqualTo(Integer value) {
            addCriterion("allow_screen =", value, "allowScreen");
            return (Criteria) this;
        }

        public Criteria andAllowScreenNotEqualTo(Integer value) {
            addCriterion("allow_screen <>", value, "allowScreen");
            return (Criteria) this;
        }

        public Criteria andAllowScreenGreaterThan(Integer value) {
            addCriterion("allow_screen >", value, "allowScreen");
            return (Criteria) this;
        }

        public Criteria andAllowScreenGreaterThanOrEqualTo(Integer value) {
            addCriterion("allow_screen >=", value, "allowScreen");
            return (Criteria) this;
        }

        public Criteria andAllowScreenLessThan(Integer value) {
            addCriterion("allow_screen <", value, "allowScreen");
            return (Criteria) this;
        }

        public Criteria andAllowScreenLessThanOrEqualTo(Integer value) {
            addCriterion("allow_screen <=", value, "allowScreen");
            return (Criteria) this;
        }

        public Criteria andAllowScreenIn(List<Integer> values) {
            addCriterion("allow_screen in", values, "allowScreen");
            return (Criteria) this;
        }

        public Criteria andAllowScreenNotIn(List<Integer> values) {
            addCriterion("allow_screen not in", values, "allowScreen");
            return (Criteria) this;
        }

        public Criteria andAllowScreenBetween(Integer value1, Integer value2) {
            addCriterion("allow_screen between", value1, value2, "allowScreen");
            return (Criteria) this;
        }

        public Criteria andAllowScreenNotBetween(Integer value1, Integer value2) {
            addCriterion("allow_screen not between", value1, value2, "allowScreen");
            return (Criteria) this;
        }

        public Criteria andAllowPrintIsNull() {
            addCriterion("allow_print is null");
            return (Criteria) this;
        }

        public Criteria andAllowPrintIsNotNull() {
            addCriterion("allow_print is not null");
            return (Criteria) this;
        }

        public Criteria andAllowPrintEqualTo(Integer value) {
            addCriterion("allow_print =", value, "allowPrint");
            return (Criteria) this;
        }

        public Criteria andAllowPrintNotEqualTo(Integer value) {
            addCriterion("allow_print <>", value, "allowPrint");
            return (Criteria) this;
        }

        public Criteria andAllowPrintGreaterThan(Integer value) {
            addCriterion("allow_print >", value, "allowPrint");
            return (Criteria) this;
        }

        public Criteria andAllowPrintGreaterThanOrEqualTo(Integer value) {
            addCriterion("allow_print >=", value, "allowPrint");
            return (Criteria) this;
        }

        public Criteria andAllowPrintLessThan(Integer value) {
            addCriterion("allow_print <", value, "allowPrint");
            return (Criteria) this;
        }

        public Criteria andAllowPrintLessThanOrEqualTo(Integer value) {
            addCriterion("allow_print <=", value, "allowPrint");
            return (Criteria) this;
        }

        public Criteria andAllowPrintIn(List<Integer> values) {
            addCriterion("allow_print in", values, "allowPrint");
            return (Criteria) this;
        }

        public Criteria andAllowPrintNotIn(List<Integer> values) {
            addCriterion("allow_print not in", values, "allowPrint");
            return (Criteria) this;
        }

        public Criteria andAllowPrintBetween(Integer value1, Integer value2) {
            addCriterion("allow_print between", value1, value2, "allowPrint");
            return (Criteria) this;
        }

        public Criteria andAllowPrintNotBetween(Integer value1, Integer value2) {
            addCriterion("allow_print not between", value1, value2, "allowPrint");
            return (Criteria) this;
        }

        public Criteria andWatermarkIsNull() {
            addCriterion("watermark is null");
            return (Criteria) this;
        }

        public Criteria andWatermarkIsNotNull() {
            addCriterion("watermark is not null");
            return (Criteria) this;
        }

        public Criteria andWatermarkEqualTo(Integer value) {
            addCriterion("watermark =", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkNotEqualTo(Integer value) {
            addCriterion("watermark <>", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkGreaterThan(Integer value) {
            addCriterion("watermark >", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("watermark >=", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkLessThan(Integer value) {
            addCriterion("watermark <", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkLessThanOrEqualTo(Integer value) {
            addCriterion("watermark <=", value, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkIn(List<Integer> values) {
            addCriterion("watermark in", values, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkNotIn(List<Integer> values) {
            addCriterion("watermark not in", values, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkBetween(Integer value1, Integer value2) {
            addCriterion("watermark between", value1, value2, "watermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkNotBetween(Integer value1, Integer value2) {
            addCriterion("watermark not between", value1, value2, "watermark");
            return (Criteria) this;
        }

        public Criteria andAllowSendoutIsNull() {
            addCriterion("allow_sendout is null");
            return (Criteria) this;
        }

        public Criteria andAllowSendoutIsNotNull() {
            addCriterion("allow_sendout is not null");
            return (Criteria) this;
        }

        public Criteria andAllowSendoutEqualTo(Integer value) {
            addCriterion("allow_sendout =", value, "allowSendout");
            return (Criteria) this;
        }

        public Criteria andAllowSendoutNotEqualTo(Integer value) {
            addCriterion("allow_sendout <>", value, "allowSendout");
            return (Criteria) this;
        }

        public Criteria andAllowSendoutGreaterThan(Integer value) {
            addCriterion("allow_sendout >", value, "allowSendout");
            return (Criteria) this;
        }

        public Criteria andAllowSendoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("allow_sendout >=", value, "allowSendout");
            return (Criteria) this;
        }

        public Criteria andAllowSendoutLessThan(Integer value) {
            addCriterion("allow_sendout <", value, "allowSendout");
            return (Criteria) this;
        }

        public Criteria andAllowSendoutLessThanOrEqualTo(Integer value) {
            addCriterion("allow_sendout <=", value, "allowSendout");
            return (Criteria) this;
        }

        public Criteria andAllowSendoutIn(List<Integer> values) {
            addCriterion("allow_sendout in", values, "allowSendout");
            return (Criteria) this;
        }

        public Criteria andAllowSendoutNotIn(List<Integer> values) {
            addCriterion("allow_sendout not in", values, "allowSendout");
            return (Criteria) this;
        }

        public Criteria andAllowSendoutBetween(Integer value1, Integer value2) {
            addCriterion("allow_sendout between", value1, value2, "allowSendout");
            return (Criteria) this;
        }

        public Criteria andAllowSendoutNotBetween(Integer value1, Integer value2) {
            addCriterion("allow_sendout not between", value1, value2, "allowSendout");
            return (Criteria) this;
        }

        public Criteria andEncryptFlagIsNull() {
            addCriterion("encrypt_flag is null");
            return (Criteria) this;
        }

        public Criteria andEncryptFlagIsNotNull() {
            addCriterion("encrypt_flag is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptFlagEqualTo(Integer value) {
            addCriterion("encrypt_flag =", value, "encryptFlag");
            return (Criteria) this;
        }

        public Criteria andEncryptFlagNotEqualTo(Integer value) {
            addCriterion("encrypt_flag <>", value, "encryptFlag");
            return (Criteria) this;
        }

        public Criteria andEncryptFlagGreaterThan(Integer value) {
            addCriterion("encrypt_flag >", value, "encryptFlag");
            return (Criteria) this;
        }

        public Criteria andEncryptFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("encrypt_flag >=", value, "encryptFlag");
            return (Criteria) this;
        }

        public Criteria andEncryptFlagLessThan(Integer value) {
            addCriterion("encrypt_flag <", value, "encryptFlag");
            return (Criteria) this;
        }

        public Criteria andEncryptFlagLessThanOrEqualTo(Integer value) {
            addCriterion("encrypt_flag <=", value, "encryptFlag");
            return (Criteria) this;
        }

        public Criteria andEncryptFlagIn(List<Integer> values) {
            addCriterion("encrypt_flag in", values, "encryptFlag");
            return (Criteria) this;
        }

        public Criteria andEncryptFlagNotIn(List<Integer> values) {
            addCriterion("encrypt_flag not in", values, "encryptFlag");
            return (Criteria) this;
        }

        public Criteria andEncryptFlagBetween(Integer value1, Integer value2) {
            addCriterion("encrypt_flag between", value1, value2, "encryptFlag");
            return (Criteria) this;
        }

        public Criteria andEncryptFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("encrypt_flag not between", value1, value2, "encryptFlag");
            return (Criteria) this;
        }

        public Criteria andAllowHackerSoftwareIsNull() {
            addCriterion("allow_hacker_software is null");
            return (Criteria) this;
        }

        public Criteria andAllowHackerSoftwareIsNotNull() {
            addCriterion("allow_hacker_software is not null");
            return (Criteria) this;
        }

        public Criteria andAllowHackerSoftwareEqualTo(Integer value) {
            addCriterion("allow_hacker_software =", value, "allowHackerSoftware");
            return (Criteria) this;
        }

        public Criteria andAllowHackerSoftwareNotEqualTo(Integer value) {
            addCriterion("allow_hacker_software <>", value, "allowHackerSoftware");
            return (Criteria) this;
        }

        public Criteria andAllowHackerSoftwareGreaterThan(Integer value) {
            addCriterion("allow_hacker_software >", value, "allowHackerSoftware");
            return (Criteria) this;
        }

        public Criteria andAllowHackerSoftwareGreaterThanOrEqualTo(Integer value) {
            addCriterion("allow_hacker_software >=", value, "allowHackerSoftware");
            return (Criteria) this;
        }

        public Criteria andAllowHackerSoftwareLessThan(Integer value) {
            addCriterion("allow_hacker_software <", value, "allowHackerSoftware");
            return (Criteria) this;
        }

        public Criteria andAllowHackerSoftwareLessThanOrEqualTo(Integer value) {
            addCriterion("allow_hacker_software <=", value, "allowHackerSoftware");
            return (Criteria) this;
        }

        public Criteria andAllowHackerSoftwareIn(List<Integer> values) {
            addCriterion("allow_hacker_software in", values, "allowHackerSoftware");
            return (Criteria) this;
        }

        public Criteria andAllowHackerSoftwareNotIn(List<Integer> values) {
            addCriterion("allow_hacker_software not in", values, "allowHackerSoftware");
            return (Criteria) this;
        }

        public Criteria andAllowHackerSoftwareBetween(Integer value1, Integer value2) {
            addCriterion("allow_hacker_software between", value1, value2, "allowHackerSoftware");
            return (Criteria) this;
        }

        public Criteria andAllowHackerSoftwareNotBetween(Integer value1, Integer value2) {
            addCriterion("allow_hacker_software not between", value1, value2, "allowHackerSoftware");
            return (Criteria) this;
        }

        public Criteria andAllowOfflineIsNull() {
            addCriterion("allow_offline is null");
            return (Criteria) this;
        }

        public Criteria andAllowOfflineIsNotNull() {
            addCriterion("allow_offline is not null");
            return (Criteria) this;
        }

        public Criteria andAllowOfflineEqualTo(Integer value) {
            addCriterion("allow_offline =", value, "allowOffline");
            return (Criteria) this;
        }

        public Criteria andAllowOfflineNotEqualTo(Integer value) {
            addCriterion("allow_offline <>", value, "allowOffline");
            return (Criteria) this;
        }

        public Criteria andAllowOfflineGreaterThan(Integer value) {
            addCriterion("allow_offline >", value, "allowOffline");
            return (Criteria) this;
        }

        public Criteria andAllowOfflineGreaterThanOrEqualTo(Integer value) {
            addCriterion("allow_offline >=", value, "allowOffline");
            return (Criteria) this;
        }

        public Criteria andAllowOfflineLessThan(Integer value) {
            addCriterion("allow_offline <", value, "allowOffline");
            return (Criteria) this;
        }

        public Criteria andAllowOfflineLessThanOrEqualTo(Integer value) {
            addCriterion("allow_offline <=", value, "allowOffline");
            return (Criteria) this;
        }

        public Criteria andAllowOfflineIn(List<Integer> values) {
            addCriterion("allow_offline in", values, "allowOffline");
            return (Criteria) this;
        }

        public Criteria andAllowOfflineNotIn(List<Integer> values) {
            addCriterion("allow_offline not in", values, "allowOffline");
            return (Criteria) this;
        }

        public Criteria andAllowOfflineBetween(Integer value1, Integer value2) {
            addCriterion("allow_offline between", value1, value2, "allowOffline");
            return (Criteria) this;
        }

        public Criteria andAllowOfflineNotBetween(Integer value1, Integer value2) {
            addCriterion("allow_offline not between", value1, value2, "allowOffline");
            return (Criteria) this;
        }

        public Criteria andStrategyRemarkIsNull() {
            addCriterion("strategy_remark is null");
            return (Criteria) this;
        }

        public Criteria andStrategyRemarkIsNotNull() {
            addCriterion("strategy_remark is not null");
            return (Criteria) this;
        }

        public Criteria andStrategyRemarkEqualTo(String value) {
            addCriterion("strategy_remark =", value, "strategyRemark");
            return (Criteria) this;
        }

        public Criteria andStrategyRemarkNotEqualTo(String value) {
            addCriterion("strategy_remark <>", value, "strategyRemark");
            return (Criteria) this;
        }

        public Criteria andStrategyRemarkGreaterThan(String value) {
            addCriterion("strategy_remark >", value, "strategyRemark");
            return (Criteria) this;
        }

        public Criteria andStrategyRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("strategy_remark >=", value, "strategyRemark");
            return (Criteria) this;
        }

        public Criteria andStrategyRemarkLessThan(String value) {
            addCriterion("strategy_remark <", value, "strategyRemark");
            return (Criteria) this;
        }

        public Criteria andStrategyRemarkLessThanOrEqualTo(String value) {
            addCriterion("strategy_remark <=", value, "strategyRemark");
            return (Criteria) this;
        }

        public Criteria andStrategyRemarkLike(String value) {
            addCriterion("strategy_remark like", value, "strategyRemark");
            return (Criteria) this;
        }

        public Criteria andStrategyRemarkNotLike(String value) {
            addCriterion("strategy_remark not like", value, "strategyRemark");
            return (Criteria) this;
        }

        public Criteria andStrategyRemarkIn(List<String> values) {
            addCriterion("strategy_remark in", values, "strategyRemark");
            return (Criteria) this;
        }

        public Criteria andStrategyRemarkNotIn(List<String> values) {
            addCriterion("strategy_remark not in", values, "strategyRemark");
            return (Criteria) this;
        }

        public Criteria andStrategyRemarkBetween(String value1, String value2) {
            addCriterion("strategy_remark between", value1, value2, "strategyRemark");
            return (Criteria) this;
        }

        public Criteria andStrategyRemarkNotBetween(String value1, String value2) {
            addCriterion("strategy_remark not between", value1, value2, "strategyRemark");
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