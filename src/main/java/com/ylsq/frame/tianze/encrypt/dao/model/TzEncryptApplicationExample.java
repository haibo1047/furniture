package com.ylsq.frame.tianze.encrypt.dao.model;

import com.ylsq.frame.common.base.BaseExample;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TzEncryptApplicationExample implements BaseExample, Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public TzEncryptApplicationExample() {
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

        public Criteria andProcessNameIsNull() {
            addCriterion("process_name is null");
            return (Criteria) this;
        }

        public Criteria andProcessNameIsNotNull() {
            addCriterion("process_name is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNameEqualTo(String value) {
            addCriterion("process_name =", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotEqualTo(String value) {
            addCriterion("process_name <>", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameGreaterThan(String value) {
            addCriterion("process_name >", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameGreaterThanOrEqualTo(String value) {
            addCriterion("process_name >=", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLessThan(String value) {
            addCriterion("process_name <", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLessThanOrEqualTo(String value) {
            addCriterion("process_name <=", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLike(String value) {
            addCriterion("process_name like", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotLike(String value) {
            addCriterion("process_name not like", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameIn(List<String> values) {
            addCriterion("process_name in", values, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotIn(List<String> values) {
            addCriterion("process_name not in", values, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameBetween(String value1, String value2) {
            addCriterion("process_name between", value1, value2, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotBetween(String value1, String value2) {
            addCriterion("process_name not between", value1, value2, "processName");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeIsNull() {
            addCriterion("application_type is null");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeIsNotNull() {
            addCriterion("application_type is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeEqualTo(Integer value) {
            addCriterion("application_type =", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeNotEqualTo(Integer value) {
            addCriterion("application_type <>", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeGreaterThan(Integer value) {
            addCriterion("application_type >", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("application_type >=", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeLessThan(Integer value) {
            addCriterion("application_type <", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("application_type <=", value, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeIn(List<Integer> values) {
            addCriterion("application_type in", values, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeNotIn(List<Integer> values) {
            addCriterion("application_type not in", values, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeBetween(Integer value1, Integer value2) {
            addCriterion("application_type between", value1, value2, "applicationType");
            return (Criteria) this;
        }

        public Criteria andApplicationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("application_type not between", value1, value2, "applicationType");
            return (Criteria) this;
        }

        public Criteria andProcessPathIsNull() {
            addCriterion("process_path is null");
            return (Criteria) this;
        }

        public Criteria andProcessPathIsNotNull() {
            addCriterion("process_path is not null");
            return (Criteria) this;
        }

        public Criteria andProcessPathEqualTo(String value) {
            addCriterion("process_path =", value, "processPath");
            return (Criteria) this;
        }

        public Criteria andProcessPathNotEqualTo(String value) {
            addCriterion("process_path <>", value, "processPath");
            return (Criteria) this;
        }

        public Criteria andProcessPathGreaterThan(String value) {
            addCriterion("process_path >", value, "processPath");
            return (Criteria) this;
        }

        public Criteria andProcessPathGreaterThanOrEqualTo(String value) {
            addCriterion("process_path >=", value, "processPath");
            return (Criteria) this;
        }

        public Criteria andProcessPathLessThan(String value) {
            addCriterion("process_path <", value, "processPath");
            return (Criteria) this;
        }

        public Criteria andProcessPathLessThanOrEqualTo(String value) {
            addCriterion("process_path <=", value, "processPath");
            return (Criteria) this;
        }

        public Criteria andProcessPathLike(String value) {
            addCriterion("process_path like", value, "processPath");
            return (Criteria) this;
        }

        public Criteria andProcessPathNotLike(String value) {
            addCriterion("process_path not like", value, "processPath");
            return (Criteria) this;
        }

        public Criteria andProcessPathIn(List<String> values) {
            addCriterion("process_path in", values, "processPath");
            return (Criteria) this;
        }

        public Criteria andProcessPathNotIn(List<String> values) {
            addCriterion("process_path not in", values, "processPath");
            return (Criteria) this;
        }

        public Criteria andProcessPathBetween(String value1, String value2) {
            addCriterion("process_path between", value1, value2, "processPath");
            return (Criteria) this;
        }

        public Criteria andProcessPathNotBetween(String value1, String value2) {
            addCriterion("process_path not between", value1, value2, "processPath");
            return (Criteria) this;
        }

        public Criteria andEncryptExtensionIsNull() {
            addCriterion("encrypt_extension is null");
            return (Criteria) this;
        }

        public Criteria andEncryptExtensionIsNotNull() {
            addCriterion("encrypt_extension is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptExtensionEqualTo(String value) {
            addCriterion("encrypt_extension =", value, "encryptExtension");
            return (Criteria) this;
        }

        public Criteria andEncryptExtensionNotEqualTo(String value) {
            addCriterion("encrypt_extension <>", value, "encryptExtension");
            return (Criteria) this;
        }

        public Criteria andEncryptExtensionGreaterThan(String value) {
            addCriterion("encrypt_extension >", value, "encryptExtension");
            return (Criteria) this;
        }

        public Criteria andEncryptExtensionGreaterThanOrEqualTo(String value) {
            addCriterion("encrypt_extension >=", value, "encryptExtension");
            return (Criteria) this;
        }

        public Criteria andEncryptExtensionLessThan(String value) {
            addCriterion("encrypt_extension <", value, "encryptExtension");
            return (Criteria) this;
        }

        public Criteria andEncryptExtensionLessThanOrEqualTo(String value) {
            addCriterion("encrypt_extension <=", value, "encryptExtension");
            return (Criteria) this;
        }

        public Criteria andEncryptExtensionLike(String value) {
            addCriterion("encrypt_extension like", value, "encryptExtension");
            return (Criteria) this;
        }

        public Criteria andEncryptExtensionNotLike(String value) {
            addCriterion("encrypt_extension not like", value, "encryptExtension");
            return (Criteria) this;
        }

        public Criteria andEncryptExtensionIn(List<String> values) {
            addCriterion("encrypt_extension in", values, "encryptExtension");
            return (Criteria) this;
        }

        public Criteria andEncryptExtensionNotIn(List<String> values) {
            addCriterion("encrypt_extension not in", values, "encryptExtension");
            return (Criteria) this;
        }

        public Criteria andEncryptExtensionBetween(String value1, String value2) {
            addCriterion("encrypt_extension between", value1, value2, "encryptExtension");
            return (Criteria) this;
        }

        public Criteria andEncryptExtensionNotBetween(String value1, String value2) {
            addCriterion("encrypt_extension not between", value1, value2, "encryptExtension");
            return (Criteria) this;
        }

        public Criteria andMonitorExtensionIsNull() {
            addCriterion("monitor_extension is null");
            return (Criteria) this;
        }

        public Criteria andMonitorExtensionIsNotNull() {
            addCriterion("monitor_extension is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorExtensionEqualTo(String value) {
            addCriterion("monitor_extension =", value, "monitorExtension");
            return (Criteria) this;
        }

        public Criteria andMonitorExtensionNotEqualTo(String value) {
            addCriterion("monitor_extension <>", value, "monitorExtension");
            return (Criteria) this;
        }

        public Criteria andMonitorExtensionGreaterThan(String value) {
            addCriterion("monitor_extension >", value, "monitorExtension");
            return (Criteria) this;
        }

        public Criteria andMonitorExtensionGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_extension >=", value, "monitorExtension");
            return (Criteria) this;
        }

        public Criteria andMonitorExtensionLessThan(String value) {
            addCriterion("monitor_extension <", value, "monitorExtension");
            return (Criteria) this;
        }

        public Criteria andMonitorExtensionLessThanOrEqualTo(String value) {
            addCriterion("monitor_extension <=", value, "monitorExtension");
            return (Criteria) this;
        }

        public Criteria andMonitorExtensionLike(String value) {
            addCriterion("monitor_extension like", value, "monitorExtension");
            return (Criteria) this;
        }

        public Criteria andMonitorExtensionNotLike(String value) {
            addCriterion("monitor_extension not like", value, "monitorExtension");
            return (Criteria) this;
        }

        public Criteria andMonitorExtensionIn(List<String> values) {
            addCriterion("monitor_extension in", values, "monitorExtension");
            return (Criteria) this;
        }

        public Criteria andMonitorExtensionNotIn(List<String> values) {
            addCriterion("monitor_extension not in", values, "monitorExtension");
            return (Criteria) this;
        }

        public Criteria andMonitorExtensionBetween(String value1, String value2) {
            addCriterion("monitor_extension between", value1, value2, "monitorExtension");
            return (Criteria) this;
        }

        public Criteria andMonitorExtensionNotBetween(String value1, String value2) {
            addCriterion("monitor_extension not between", value1, value2, "monitorExtension");
            return (Criteria) this;
        }

        public Criteria andSmartExtensionIsNull() {
            addCriterion("smart_extension is null");
            return (Criteria) this;
        }

        public Criteria andSmartExtensionIsNotNull() {
            addCriterion("smart_extension is not null");
            return (Criteria) this;
        }

        public Criteria andSmartExtensionEqualTo(String value) {
            addCriterion("smart_extension =", value, "smartExtension");
            return (Criteria) this;
        }

        public Criteria andSmartExtensionNotEqualTo(String value) {
            addCriterion("smart_extension <>", value, "smartExtension");
            return (Criteria) this;
        }

        public Criteria andSmartExtensionGreaterThan(String value) {
            addCriterion("smart_extension >", value, "smartExtension");
            return (Criteria) this;
        }

        public Criteria andSmartExtensionGreaterThanOrEqualTo(String value) {
            addCriterion("smart_extension >=", value, "smartExtension");
            return (Criteria) this;
        }

        public Criteria andSmartExtensionLessThan(String value) {
            addCriterion("smart_extension <", value, "smartExtension");
            return (Criteria) this;
        }

        public Criteria andSmartExtensionLessThanOrEqualTo(String value) {
            addCriterion("smart_extension <=", value, "smartExtension");
            return (Criteria) this;
        }

        public Criteria andSmartExtensionLike(String value) {
            addCriterion("smart_extension like", value, "smartExtension");
            return (Criteria) this;
        }

        public Criteria andSmartExtensionNotLike(String value) {
            addCriterion("smart_extension not like", value, "smartExtension");
            return (Criteria) this;
        }

        public Criteria andSmartExtensionIn(List<String> values) {
            addCriterion("smart_extension in", values, "smartExtension");
            return (Criteria) this;
        }

        public Criteria andSmartExtensionNotIn(List<String> values) {
            addCriterion("smart_extension not in", values, "smartExtension");
            return (Criteria) this;
        }

        public Criteria andSmartExtensionBetween(String value1, String value2) {
            addCriterion("smart_extension between", value1, value2, "smartExtension");
            return (Criteria) this;
        }

        public Criteria andSmartExtensionNotBetween(String value1, String value2) {
            addCriterion("smart_extension not between", value1, value2, "smartExtension");
            return (Criteria) this;
        }

        public Criteria andSpecialFilenameIsNull() {
            addCriterion("special_filename is null");
            return (Criteria) this;
        }

        public Criteria andSpecialFilenameIsNotNull() {
            addCriterion("special_filename is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialFilenameEqualTo(String value) {
            addCriterion("special_filename =", value, "specialFilename");
            return (Criteria) this;
        }

        public Criteria andSpecialFilenameNotEqualTo(String value) {
            addCriterion("special_filename <>", value, "specialFilename");
            return (Criteria) this;
        }

        public Criteria andSpecialFilenameGreaterThan(String value) {
            addCriterion("special_filename >", value, "specialFilename");
            return (Criteria) this;
        }

        public Criteria andSpecialFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("special_filename >=", value, "specialFilename");
            return (Criteria) this;
        }

        public Criteria andSpecialFilenameLessThan(String value) {
            addCriterion("special_filename <", value, "specialFilename");
            return (Criteria) this;
        }

        public Criteria andSpecialFilenameLessThanOrEqualTo(String value) {
            addCriterion("special_filename <=", value, "specialFilename");
            return (Criteria) this;
        }

        public Criteria andSpecialFilenameLike(String value) {
            addCriterion("special_filename like", value, "specialFilename");
            return (Criteria) this;
        }

        public Criteria andSpecialFilenameNotLike(String value) {
            addCriterion("special_filename not like", value, "specialFilename");
            return (Criteria) this;
        }

        public Criteria andSpecialFilenameIn(List<String> values) {
            addCriterion("special_filename in", values, "specialFilename");
            return (Criteria) this;
        }

        public Criteria andSpecialFilenameNotIn(List<String> values) {
            addCriterion("special_filename not in", values, "specialFilename");
            return (Criteria) this;
        }

        public Criteria andSpecialFilenameBetween(String value1, String value2) {
            addCriterion("special_filename between", value1, value2, "specialFilename");
            return (Criteria) this;
        }

        public Criteria andSpecialFilenameNotBetween(String value1, String value2) {
            addCriterion("special_filename not between", value1, value2, "specialFilename");
            return (Criteria) this;
        }

        public Criteria andSpecialPathIsNull() {
            addCriterion("special_path is null");
            return (Criteria) this;
        }

        public Criteria andSpecialPathIsNotNull() {
            addCriterion("special_path is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialPathEqualTo(String value) {
            addCriterion("special_path =", value, "specialPath");
            return (Criteria) this;
        }

        public Criteria andSpecialPathNotEqualTo(String value) {
            addCriterion("special_path <>", value, "specialPath");
            return (Criteria) this;
        }

        public Criteria andSpecialPathGreaterThan(String value) {
            addCriterion("special_path >", value, "specialPath");
            return (Criteria) this;
        }

        public Criteria andSpecialPathGreaterThanOrEqualTo(String value) {
            addCriterion("special_path >=", value, "specialPath");
            return (Criteria) this;
        }

        public Criteria andSpecialPathLessThan(String value) {
            addCriterion("special_path <", value, "specialPath");
            return (Criteria) this;
        }

        public Criteria andSpecialPathLessThanOrEqualTo(String value) {
            addCriterion("special_path <=", value, "specialPath");
            return (Criteria) this;
        }

        public Criteria andSpecialPathLike(String value) {
            addCriterion("special_path like", value, "specialPath");
            return (Criteria) this;
        }

        public Criteria andSpecialPathNotLike(String value) {
            addCriterion("special_path not like", value, "specialPath");
            return (Criteria) this;
        }

        public Criteria andSpecialPathIn(List<String> values) {
            addCriterion("special_path in", values, "specialPath");
            return (Criteria) this;
        }

        public Criteria andSpecialPathNotIn(List<String> values) {
            addCriterion("special_path not in", values, "specialPath");
            return (Criteria) this;
        }

        public Criteria andSpecialPathBetween(String value1, String value2) {
            addCriterion("special_path between", value1, value2, "specialPath");
            return (Criteria) this;
        }

        public Criteria andSpecialPathNotBetween(String value1, String value2) {
            addCriterion("special_path not between", value1, value2, "specialPath");
            return (Criteria) this;
        }

        public Criteria andPePathIsNull() {
            addCriterion("pe_path is null");
            return (Criteria) this;
        }

        public Criteria andPePathIsNotNull() {
            addCriterion("pe_path is not null");
            return (Criteria) this;
        }

        public Criteria andPePathEqualTo(String value) {
            addCriterion("pe_path =", value, "pePath");
            return (Criteria) this;
        }

        public Criteria andPePathNotEqualTo(String value) {
            addCriterion("pe_path <>", value, "pePath");
            return (Criteria) this;
        }

        public Criteria andPePathGreaterThan(String value) {
            addCriterion("pe_path >", value, "pePath");
            return (Criteria) this;
        }

        public Criteria andPePathGreaterThanOrEqualTo(String value) {
            addCriterion("pe_path >=", value, "pePath");
            return (Criteria) this;
        }

        public Criteria andPePathLessThan(String value) {
            addCriterion("pe_path <", value, "pePath");
            return (Criteria) this;
        }

        public Criteria andPePathLessThanOrEqualTo(String value) {
            addCriterion("pe_path <=", value, "pePath");
            return (Criteria) this;
        }

        public Criteria andPePathLike(String value) {
            addCriterion("pe_path like", value, "pePath");
            return (Criteria) this;
        }

        public Criteria andPePathNotLike(String value) {
            addCriterion("pe_path not like", value, "pePath");
            return (Criteria) this;
        }

        public Criteria andPePathIn(List<String> values) {
            addCriterion("pe_path in", values, "pePath");
            return (Criteria) this;
        }

        public Criteria andPePathNotIn(List<String> values) {
            addCriterion("pe_path not in", values, "pePath");
            return (Criteria) this;
        }

        public Criteria andPePathBetween(String value1, String value2) {
            addCriterion("pe_path between", value1, value2, "pePath");
            return (Criteria) this;
        }

        public Criteria andPePathNotBetween(String value1, String value2) {
            addCriterion("pe_path not between", value1, value2, "pePath");
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