package com.qhm.elasticsearch.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceExample() {
        oredCriteria = new ArrayList<>();
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

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andDeveloperIdIsNull() {
            addCriterion("developer_id is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIsNotNull() {
            addCriterion("developer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdEqualTo(Integer value) {
            addCriterion("developer_id =", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotEqualTo(Integer value) {
            addCriterion("developer_id <>", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdGreaterThan(Integer value) {
            addCriterion("developer_id >", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("developer_id >=", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLessThan(Integer value) {
            addCriterion("developer_id <", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLessThanOrEqualTo(Integer value) {
            addCriterion("developer_id <=", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIn(List<Integer> values) {
            addCriterion("developer_id in", values, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotIn(List<Integer> values) {
            addCriterion("developer_id not in", values, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdBetween(Integer value1, Integer value2) {
            addCriterion("developer_id between", value1, value2, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("developer_id not between", value1, value2, "developerId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(Integer value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(Integer value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(Integer value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(Integer value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(Integer value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<Integer> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<Integer> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(Integer value1, Integer value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andDeviceSnIsNull() {
            addCriterion("device_sn is null");
            return (Criteria) this;
        }

        public Criteria andDeviceSnIsNotNull() {
            addCriterion("device_sn is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceSnEqualTo(String value) {
            addCriterion("device_sn =", value, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnNotEqualTo(String value) {
            addCriterion("device_sn <>", value, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnGreaterThan(String value) {
            addCriterion("device_sn >", value, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnGreaterThanOrEqualTo(String value) {
            addCriterion("device_sn >=", value, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnLessThan(String value) {
            addCriterion("device_sn <", value, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnLessThanOrEqualTo(String value) {
            addCriterion("device_sn <=", value, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnLike(String value) {
            addCriterion("device_sn like", value, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnNotLike(String value) {
            addCriterion("device_sn not like", value, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnIn(List<String> values) {
            addCriterion("device_sn in", values, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnNotIn(List<String> values) {
            addCriterion("device_sn not in", values, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnBetween(String value1, String value2) {
            addCriterion("device_sn between", value1, value2, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andDeviceSnNotBetween(String value1, String value2) {
            addCriterion("device_sn not between", value1, value2, "deviceSn");
            return (Criteria) this;
        }

        public Criteria andHeartWorkIsNull() {
            addCriterion("heart_work is null");
            return (Criteria) this;
        }

        public Criteria andHeartWorkIsNotNull() {
            addCriterion("heart_work is not null");
            return (Criteria) this;
        }

        public Criteria andHeartWorkEqualTo(Integer value) {
            addCriterion("heart_work =", value, "heartWork");
            return (Criteria) this;
        }

        public Criteria andHeartWorkNotEqualTo(Integer value) {
            addCriterion("heart_work <>", value, "heartWork");
            return (Criteria) this;
        }

        public Criteria andHeartWorkGreaterThan(Integer value) {
            addCriterion("heart_work >", value, "heartWork");
            return (Criteria) this;
        }

        public Criteria andHeartWorkGreaterThanOrEqualTo(Integer value) {
            addCriterion("heart_work >=", value, "heartWork");
            return (Criteria) this;
        }

        public Criteria andHeartWorkLessThan(Integer value) {
            addCriterion("heart_work <", value, "heartWork");
            return (Criteria) this;
        }

        public Criteria andHeartWorkLessThanOrEqualTo(Integer value) {
            addCriterion("heart_work <=", value, "heartWork");
            return (Criteria) this;
        }

        public Criteria andHeartWorkIn(List<Integer> values) {
            addCriterion("heart_work in", values, "heartWork");
            return (Criteria) this;
        }

        public Criteria andHeartWorkNotIn(List<Integer> values) {
            addCriterion("heart_work not in", values, "heartWork");
            return (Criteria) this;
        }

        public Criteria andHeartWorkBetween(Integer value1, Integer value2) {
            addCriterion("heart_work between", value1, value2, "heartWork");
            return (Criteria) this;
        }

        public Criteria andHeartWorkNotBetween(Integer value1, Integer value2) {
            addCriterion("heart_work not between", value1, value2, "heartWork");
            return (Criteria) this;
        }

        public Criteria andHeartFreeIsNull() {
            addCriterion("heart_free is null");
            return (Criteria) this;
        }

        public Criteria andHeartFreeIsNotNull() {
            addCriterion("heart_free is not null");
            return (Criteria) this;
        }

        public Criteria andHeartFreeEqualTo(Integer value) {
            addCriterion("heart_free =", value, "heartFree");
            return (Criteria) this;
        }

        public Criteria andHeartFreeNotEqualTo(Integer value) {
            addCriterion("heart_free <>", value, "heartFree");
            return (Criteria) this;
        }

        public Criteria andHeartFreeGreaterThan(Integer value) {
            addCriterion("heart_free >", value, "heartFree");
            return (Criteria) this;
        }

        public Criteria andHeartFreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("heart_free >=", value, "heartFree");
            return (Criteria) this;
        }

        public Criteria andHeartFreeLessThan(Integer value) {
            addCriterion("heart_free <", value, "heartFree");
            return (Criteria) this;
        }

        public Criteria andHeartFreeLessThanOrEqualTo(Integer value) {
            addCriterion("heart_free <=", value, "heartFree");
            return (Criteria) this;
        }

        public Criteria andHeartFreeIn(List<Integer> values) {
            addCriterion("heart_free in", values, "heartFree");
            return (Criteria) this;
        }

        public Criteria andHeartFreeNotIn(List<Integer> values) {
            addCriterion("heart_free not in", values, "heartFree");
            return (Criteria) this;
        }

        public Criteria andHeartFreeBetween(Integer value1, Integer value2) {
            addCriterion("heart_free between", value1, value2, "heartFree");
            return (Criteria) this;
        }

        public Criteria andHeartFreeNotBetween(Integer value1, Integer value2) {
            addCriterion("heart_free not between", value1, value2, "heartFree");
            return (Criteria) this;
        }

        public Criteria andMonitorIdsIsNull() {
            addCriterion("monitor_ids is null");
            return (Criteria) this;
        }

        public Criteria andMonitorIdsIsNotNull() {
            addCriterion("monitor_ids is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorIdsEqualTo(String value) {
            addCriterion("monitor_ids =", value, "monitorIds");
            return (Criteria) this;
        }

        public Criteria andMonitorIdsNotEqualTo(String value) {
            addCriterion("monitor_ids <>", value, "monitorIds");
            return (Criteria) this;
        }

        public Criteria andMonitorIdsGreaterThan(String value) {
            addCriterion("monitor_ids >", value, "monitorIds");
            return (Criteria) this;
        }

        public Criteria andMonitorIdsGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_ids >=", value, "monitorIds");
            return (Criteria) this;
        }

        public Criteria andMonitorIdsLessThan(String value) {
            addCriterion("monitor_ids <", value, "monitorIds");
            return (Criteria) this;
        }

        public Criteria andMonitorIdsLessThanOrEqualTo(String value) {
            addCriterion("monitor_ids <=", value, "monitorIds");
            return (Criteria) this;
        }

        public Criteria andMonitorIdsLike(String value) {
            addCriterion("monitor_ids like", value, "monitorIds");
            return (Criteria) this;
        }

        public Criteria andMonitorIdsNotLike(String value) {
            addCriterion("monitor_ids not like", value, "monitorIds");
            return (Criteria) this;
        }

        public Criteria andMonitorIdsIn(List<String> values) {
            addCriterion("monitor_ids in", values, "monitorIds");
            return (Criteria) this;
        }

        public Criteria andMonitorIdsNotIn(List<String> values) {
            addCriterion("monitor_ids not in", values, "monitorIds");
            return (Criteria) this;
        }

        public Criteria andMonitorIdsBetween(String value1, String value2) {
            addCriterion("monitor_ids between", value1, value2, "monitorIds");
            return (Criteria) this;
        }

        public Criteria andMonitorIdsNotBetween(String value1, String value2) {
            addCriterion("monitor_ids not between", value1, value2, "monitorIds");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorIsNull() {
            addCriterion("device_vendor is null");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorIsNotNull() {
            addCriterion("device_vendor is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorEqualTo(String value) {
            addCriterion("device_vendor =", value, "deviceVendor");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorNotEqualTo(String value) {
            addCriterion("device_vendor <>", value, "deviceVendor");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorGreaterThan(String value) {
            addCriterion("device_vendor >", value, "deviceVendor");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorGreaterThanOrEqualTo(String value) {
            addCriterion("device_vendor >=", value, "deviceVendor");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorLessThan(String value) {
            addCriterion("device_vendor <", value, "deviceVendor");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorLessThanOrEqualTo(String value) {
            addCriterion("device_vendor <=", value, "deviceVendor");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorLike(String value) {
            addCriterion("device_vendor like", value, "deviceVendor");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorNotLike(String value) {
            addCriterion("device_vendor not like", value, "deviceVendor");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorIn(List<String> values) {
            addCriterion("device_vendor in", values, "deviceVendor");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorNotIn(List<String> values) {
            addCriterion("device_vendor not in", values, "deviceVendor");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorBetween(String value1, String value2) {
            addCriterion("device_vendor between", value1, value2, "deviceVendor");
            return (Criteria) this;
        }

        public Criteria andDeviceVendorNotBetween(String value1, String value2) {
            addCriterion("device_vendor not between", value1, value2, "deviceVendor");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandIsNull() {
            addCriterion("device_brand is null");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandIsNotNull() {
            addCriterion("device_brand is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandEqualTo(String value) {
            addCriterion("device_brand =", value, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandNotEqualTo(String value) {
            addCriterion("device_brand <>", value, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandGreaterThan(String value) {
            addCriterion("device_brand >", value, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandGreaterThanOrEqualTo(String value) {
            addCriterion("device_brand >=", value, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandLessThan(String value) {
            addCriterion("device_brand <", value, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandLessThanOrEqualTo(String value) {
            addCriterion("device_brand <=", value, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandLike(String value) {
            addCriterion("device_brand like", value, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandNotLike(String value) {
            addCriterion("device_brand not like", value, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandIn(List<String> values) {
            addCriterion("device_brand in", values, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandNotIn(List<String> values) {
            addCriterion("device_brand not in", values, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandBetween(String value1, String value2) {
            addCriterion("device_brand between", value1, value2, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandNotBetween(String value1, String value2) {
            addCriterion("device_brand not between", value1, value2, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andSpecModelIsNull() {
            addCriterion("spec_model is null");
            return (Criteria) this;
        }

        public Criteria andSpecModelIsNotNull() {
            addCriterion("spec_model is not null");
            return (Criteria) this;
        }

        public Criteria andSpecModelEqualTo(String value) {
            addCriterion("spec_model =", value, "specModel");
            return (Criteria) this;
        }

        public Criteria andSpecModelNotEqualTo(String value) {
            addCriterion("spec_model <>", value, "specModel");
            return (Criteria) this;
        }

        public Criteria andSpecModelGreaterThan(String value) {
            addCriterion("spec_model >", value, "specModel");
            return (Criteria) this;
        }

        public Criteria andSpecModelGreaterThanOrEqualTo(String value) {
            addCriterion("spec_model >=", value, "specModel");
            return (Criteria) this;
        }

        public Criteria andSpecModelLessThan(String value) {
            addCriterion("spec_model <", value, "specModel");
            return (Criteria) this;
        }

        public Criteria andSpecModelLessThanOrEqualTo(String value) {
            addCriterion("spec_model <=", value, "specModel");
            return (Criteria) this;
        }

        public Criteria andSpecModelLike(String value) {
            addCriterion("spec_model like", value, "specModel");
            return (Criteria) this;
        }

        public Criteria andSpecModelNotLike(String value) {
            addCriterion("spec_model not like", value, "specModel");
            return (Criteria) this;
        }

        public Criteria andSpecModelIn(List<String> values) {
            addCriterion("spec_model in", values, "specModel");
            return (Criteria) this;
        }

        public Criteria andSpecModelNotIn(List<String> values) {
            addCriterion("spec_model not in", values, "specModel");
            return (Criteria) this;
        }

        public Criteria andSpecModelBetween(String value1, String value2) {
            addCriterion("spec_model between", value1, value2, "specModel");
            return (Criteria) this;
        }

        public Criteria andSpecModelNotBetween(String value1, String value2) {
            addCriterion("spec_model not between", value1, value2, "specModel");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIsNull() {
            addCriterion("enter_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIsNotNull() {
            addCriterion("enter_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterTimeEqualTo(Date value) {
            addCriterion("enter_time =", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotEqualTo(Date value) {
            addCriterion("enter_time <>", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeGreaterThan(Date value) {
            addCriterion("enter_time >", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enter_time >=", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeLessThan(Date value) {
            addCriterion("enter_time <", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeLessThanOrEqualTo(Date value) {
            addCriterion("enter_time <=", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIn(List<Date> values) {
            addCriterion("enter_time in", values, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotIn(List<Date> values) {
            addCriterion("enter_time not in", values, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeBetween(Date value1, Date value2) {
            addCriterion("enter_time between", value1, value2, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotBetween(Date value1, Date value2) {
            addCriterion("enter_time not between", value1, value2, "enterTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeIsNull() {
            addCriterion("disable_time is null");
            return (Criteria) this;
        }

        public Criteria andDisableTimeIsNotNull() {
            addCriterion("disable_time is not null");
            return (Criteria) this;
        }

        public Criteria andDisableTimeEqualTo(Date value) {
            addCriterion("disable_time =", value, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeNotEqualTo(Date value) {
            addCriterion("disable_time <>", value, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeGreaterThan(Date value) {
            addCriterion("disable_time >", value, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("disable_time >=", value, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeLessThan(Date value) {
            addCriterion("disable_time <", value, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeLessThanOrEqualTo(Date value) {
            addCriterion("disable_time <=", value, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeIn(List<Date> values) {
            addCriterion("disable_time in", values, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeNotIn(List<Date> values) {
            addCriterion("disable_time not in", values, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeBetween(Date value1, Date value2) {
            addCriterion("disable_time between", value1, value2, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeNotBetween(Date value1, Date value2) {
            addCriterion("disable_time not between", value1, value2, "disableTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Integer value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Integer value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Integer value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Integer value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Integer> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Integer> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Integer value1, Integer value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andModifyIdIsNull() {
            addCriterion("modify_id is null");
            return (Criteria) this;
        }

        public Criteria andModifyIdIsNotNull() {
            addCriterion("modify_id is not null");
            return (Criteria) this;
        }

        public Criteria andModifyIdEqualTo(Integer value) {
            addCriterion("modify_id =", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdNotEqualTo(Integer value) {
            addCriterion("modify_id <>", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdGreaterThan(Integer value) {
            addCriterion("modify_id >", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("modify_id >=", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdLessThan(Integer value) {
            addCriterion("modify_id <", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdLessThanOrEqualTo(Integer value) {
            addCriterion("modify_id <=", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdIn(List<Integer> values) {
            addCriterion("modify_id in", values, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdNotIn(List<Integer> values) {
            addCriterion("modify_id not in", values, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdBetween(Integer value1, Integer value2) {
            addCriterion("modify_id between", value1, value2, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("modify_id not between", value1, value2, "modifyId");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNull() {
            addCriterion("gmt_modify is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNotNull() {
            addCriterion("gmt_modify is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyEqualTo(Date value) {
            addCriterion("gmt_modify =", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotEqualTo(Date value) {
            addCriterion("gmt_modify <>", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThan(Date value) {
            addCriterion("gmt_modify >", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modify >=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThan(Date value) {
            addCriterion("gmt_modify <", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modify <=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIn(List<Date> values) {
            addCriterion("gmt_modify in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotIn(List<Date> values) {
            addCriterion("gmt_modify not in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyBetween(Date value1, Date value2) {
            addCriterion("gmt_modify between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modify not between", value1, value2, "gmtModify");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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