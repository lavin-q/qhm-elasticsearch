package com.qhm.elasticsearch.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IotHihModeRunDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IotHihModeRunDataExample() {
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

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityIsNull() {
            addCriterion("electric_quantity is null");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityIsNotNull() {
            addCriterion("electric_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityEqualTo(Float value) {
            addCriterion("electric_quantity =", value, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityNotEqualTo(Float value) {
            addCriterion("electric_quantity <>", value, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityGreaterThan(Float value) {
            addCriterion("electric_quantity >", value, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityGreaterThanOrEqualTo(Float value) {
            addCriterion("electric_quantity >=", value, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityLessThan(Float value) {
            addCriterion("electric_quantity <", value, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityLessThanOrEqualTo(Float value) {
            addCriterion("electric_quantity <=", value, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityIn(List<Float> values) {
            addCriterion("electric_quantity in", values, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityNotIn(List<Float> values) {
            addCriterion("electric_quantity not in", values, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityBetween(Float value1, Float value2) {
            addCriterion("electric_quantity between", value1, value2, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityNotBetween(Float value1, Float value2) {
            addCriterion("electric_quantity not between", value1, value2, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andXAngleIsNull() {
            addCriterion("x_angle is null");
            return (Criteria) this;
        }

        public Criteria andXAngleIsNotNull() {
            addCriterion("x_angle is not null");
            return (Criteria) this;
        }

        public Criteria andXAngleEqualTo(Float value) {
            addCriterion("x_angle =", value, "xAngle");
            return (Criteria) this;
        }

        public Criteria andXAngleNotEqualTo(Float value) {
            addCriterion("x_angle <>", value, "xAngle");
            return (Criteria) this;
        }

        public Criteria andXAngleGreaterThan(Float value) {
            addCriterion("x_angle >", value, "xAngle");
            return (Criteria) this;
        }

        public Criteria andXAngleGreaterThanOrEqualTo(Float value) {
            addCriterion("x_angle >=", value, "xAngle");
            return (Criteria) this;
        }

        public Criteria andXAngleLessThan(Float value) {
            addCriterion("x_angle <", value, "xAngle");
            return (Criteria) this;
        }

        public Criteria andXAngleLessThanOrEqualTo(Float value) {
            addCriterion("x_angle <=", value, "xAngle");
            return (Criteria) this;
        }

        public Criteria andXAngleIn(List<Float> values) {
            addCriterion("x_angle in", values, "xAngle");
            return (Criteria) this;
        }

        public Criteria andXAngleNotIn(List<Float> values) {
            addCriterion("x_angle not in", values, "xAngle");
            return (Criteria) this;
        }

        public Criteria andXAngleBetween(Float value1, Float value2) {
            addCriterion("x_angle between", value1, value2, "xAngle");
            return (Criteria) this;
        }

        public Criteria andXAngleNotBetween(Float value1, Float value2) {
            addCriterion("x_angle not between", value1, value2, "xAngle");
            return (Criteria) this;
        }

        public Criteria andYAngleIsNull() {
            addCriterion("y_angle is null");
            return (Criteria) this;
        }

        public Criteria andYAngleIsNotNull() {
            addCriterion("y_angle is not null");
            return (Criteria) this;
        }

        public Criteria andYAngleEqualTo(Float value) {
            addCriterion("y_angle =", value, "yAngle");
            return (Criteria) this;
        }

        public Criteria andYAngleNotEqualTo(Float value) {
            addCriterion("y_angle <>", value, "yAngle");
            return (Criteria) this;
        }

        public Criteria andYAngleGreaterThan(Float value) {
            addCriterion("y_angle >", value, "yAngle");
            return (Criteria) this;
        }

        public Criteria andYAngleGreaterThanOrEqualTo(Float value) {
            addCriterion("y_angle >=", value, "yAngle");
            return (Criteria) this;
        }

        public Criteria andYAngleLessThan(Float value) {
            addCriterion("y_angle <", value, "yAngle");
            return (Criteria) this;
        }

        public Criteria andYAngleLessThanOrEqualTo(Float value) {
            addCriterion("y_angle <=", value, "yAngle");
            return (Criteria) this;
        }

        public Criteria andYAngleIn(List<Float> values) {
            addCriterion("y_angle in", values, "yAngle");
            return (Criteria) this;
        }

        public Criteria andYAngleNotIn(List<Float> values) {
            addCriterion("y_angle not in", values, "yAngle");
            return (Criteria) this;
        }

        public Criteria andYAngleBetween(Float value1, Float value2) {
            addCriterion("y_angle between", value1, value2, "yAngle");
            return (Criteria) this;
        }

        public Criteria andYAngleNotBetween(Float value1, Float value2) {
            addCriterion("y_angle not between", value1, value2, "yAngle");
            return (Criteria) this;
        }

        public Criteria andPressureIsNull() {
            addCriterion("pressure is null");
            return (Criteria) this;
        }

        public Criteria andPressureIsNotNull() {
            addCriterion("pressure is not null");
            return (Criteria) this;
        }

        public Criteria andPressureEqualTo(Float value) {
            addCriterion("pressure =", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotEqualTo(Float value) {
            addCriterion("pressure <>", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureGreaterThan(Float value) {
            addCriterion("pressure >", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureGreaterThanOrEqualTo(Float value) {
            addCriterion("pressure >=", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureLessThan(Float value) {
            addCriterion("pressure <", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureLessThanOrEqualTo(Float value) {
            addCriterion("pressure <=", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureIn(List<Float> values) {
            addCriterion("pressure in", values, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotIn(List<Float> values) {
            addCriterion("pressure not in", values, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureBetween(Float value1, Float value2) {
            addCriterion("pressure between", value1, value2, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotBetween(Float value1, Float value2) {
            addCriterion("pressure not between", value1, value2, "pressure");
            return (Criteria) this;
        }

        public Criteria andSedimentationIsNull() {
            addCriterion("sedimentation is null");
            return (Criteria) this;
        }

        public Criteria andSedimentationIsNotNull() {
            addCriterion("sedimentation is not null");
            return (Criteria) this;
        }

        public Criteria andSedimentationEqualTo(Float value) {
            addCriterion("sedimentation =", value, "sedimentation");
            return (Criteria) this;
        }

        public Criteria andSedimentationNotEqualTo(Float value) {
            addCriterion("sedimentation <>", value, "sedimentation");
            return (Criteria) this;
        }

        public Criteria andSedimentationGreaterThan(Float value) {
            addCriterion("sedimentation >", value, "sedimentation");
            return (Criteria) this;
        }

        public Criteria andSedimentationGreaterThanOrEqualTo(Float value) {
            addCriterion("sedimentation >=", value, "sedimentation");
            return (Criteria) this;
        }

        public Criteria andSedimentationLessThan(Float value) {
            addCriterion("sedimentation <", value, "sedimentation");
            return (Criteria) this;
        }

        public Criteria andSedimentationLessThanOrEqualTo(Float value) {
            addCriterion("sedimentation <=", value, "sedimentation");
            return (Criteria) this;
        }

        public Criteria andSedimentationIn(List<Float> values) {
            addCriterion("sedimentation in", values, "sedimentation");
            return (Criteria) this;
        }

        public Criteria andSedimentationNotIn(List<Float> values) {
            addCriterion("sedimentation not in", values, "sedimentation");
            return (Criteria) this;
        }

        public Criteria andSedimentationBetween(Float value1, Float value2) {
            addCriterion("sedimentation between", value1, value2, "sedimentation");
            return (Criteria) this;
        }

        public Criteria andSedimentationNotBetween(Float value1, Float value2) {
            addCriterion("sedimentation not between", value1, value2, "sedimentation");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusIsNull() {
            addCriterion("device_status is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusIsNotNull() {
            addCriterion("device_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusEqualTo(Byte value) {
            addCriterion("device_status =", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusNotEqualTo(Byte value) {
            addCriterion("device_status <>", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusGreaterThan(Byte value) {
            addCriterion("device_status >", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("device_status >=", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusLessThan(Byte value) {
            addCriterion("device_status <", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusLessThanOrEqualTo(Byte value) {
            addCriterion("device_status <=", value, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusIn(List<Byte> values) {
            addCriterion("device_status in", values, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusNotIn(List<Byte> values) {
            addCriterion("device_status not in", values, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusBetween(Byte value1, Byte value2) {
            addCriterion("device_status between", value1, value2, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("device_status not between", value1, value2, "deviceStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusIsNull() {
            addCriterion("alarm_status is null");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusIsNotNull() {
            addCriterion("alarm_status is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusEqualTo(Byte value) {
            addCriterion("alarm_status =", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusNotEqualTo(Byte value) {
            addCriterion("alarm_status <>", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusGreaterThan(Byte value) {
            addCriterion("alarm_status >", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("alarm_status >=", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusLessThan(Byte value) {
            addCriterion("alarm_status <", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusLessThanOrEqualTo(Byte value) {
            addCriterion("alarm_status <=", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusIn(List<Byte> values) {
            addCriterion("alarm_status in", values, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusNotIn(List<Byte> values) {
            addCriterion("alarm_status not in", values, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusBetween(Byte value1, Byte value2) {
            addCriterion("alarm_status between", value1, value2, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("alarm_status not between", value1, value2, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarm0IsNull() {
            addCriterion("alarm0 is null");
            return (Criteria) this;
        }

        public Criteria andAlarm0IsNotNull() {
            addCriterion("alarm0 is not null");
            return (Criteria) this;
        }

        public Criteria andAlarm0EqualTo(Integer value) {
            addCriterion("alarm0 =", value, "alarm0");
            return (Criteria) this;
        }

        public Criteria andAlarm0NotEqualTo(Integer value) {
            addCriterion("alarm0 <>", value, "alarm0");
            return (Criteria) this;
        }

        public Criteria andAlarm0GreaterThan(Integer value) {
            addCriterion("alarm0 >", value, "alarm0");
            return (Criteria) this;
        }

        public Criteria andAlarm0GreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm0 >=", value, "alarm0");
            return (Criteria) this;
        }

        public Criteria andAlarm0LessThan(Integer value) {
            addCriterion("alarm0 <", value, "alarm0");
            return (Criteria) this;
        }

        public Criteria andAlarm0LessThanOrEqualTo(Integer value) {
            addCriterion("alarm0 <=", value, "alarm0");
            return (Criteria) this;
        }

        public Criteria andAlarm0In(List<Integer> values) {
            addCriterion("alarm0 in", values, "alarm0");
            return (Criteria) this;
        }

        public Criteria andAlarm0NotIn(List<Integer> values) {
            addCriterion("alarm0 not in", values, "alarm0");
            return (Criteria) this;
        }

        public Criteria andAlarm0Between(Integer value1, Integer value2) {
            addCriterion("alarm0 between", value1, value2, "alarm0");
            return (Criteria) this;
        }

        public Criteria andAlarm0NotBetween(Integer value1, Integer value2) {
            addCriterion("alarm0 not between", value1, value2, "alarm0");
            return (Criteria) this;
        }

        public Criteria andAlarm1IsNull() {
            addCriterion("alarm1 is null");
            return (Criteria) this;
        }

        public Criteria andAlarm1IsNotNull() {
            addCriterion("alarm1 is not null");
            return (Criteria) this;
        }

        public Criteria andAlarm1EqualTo(Integer value) {
            addCriterion("alarm1 =", value, "alarm1");
            return (Criteria) this;
        }

        public Criteria andAlarm1NotEqualTo(Integer value) {
            addCriterion("alarm1 <>", value, "alarm1");
            return (Criteria) this;
        }

        public Criteria andAlarm1GreaterThan(Integer value) {
            addCriterion("alarm1 >", value, "alarm1");
            return (Criteria) this;
        }

        public Criteria andAlarm1GreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm1 >=", value, "alarm1");
            return (Criteria) this;
        }

        public Criteria andAlarm1LessThan(Integer value) {
            addCriterion("alarm1 <", value, "alarm1");
            return (Criteria) this;
        }

        public Criteria andAlarm1LessThanOrEqualTo(Integer value) {
            addCriterion("alarm1 <=", value, "alarm1");
            return (Criteria) this;
        }

        public Criteria andAlarm1In(List<Integer> values) {
            addCriterion("alarm1 in", values, "alarm1");
            return (Criteria) this;
        }

        public Criteria andAlarm1NotIn(List<Integer> values) {
            addCriterion("alarm1 not in", values, "alarm1");
            return (Criteria) this;
        }

        public Criteria andAlarm1Between(Integer value1, Integer value2) {
            addCriterion("alarm1 between", value1, value2, "alarm1");
            return (Criteria) this;
        }

        public Criteria andAlarm1NotBetween(Integer value1, Integer value2) {
            addCriterion("alarm1 not between", value1, value2, "alarm1");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeIsNull() {
            addCriterion("data_source_type is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeIsNotNull() {
            addCriterion("data_source_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeEqualTo(Integer value) {
            addCriterion("data_source_type =", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeNotEqualTo(Integer value) {
            addCriterion("data_source_type <>", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeGreaterThan(Integer value) {
            addCriterion("data_source_type >", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_source_type >=", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeLessThan(Integer value) {
            addCriterion("data_source_type <", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("data_source_type <=", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeIn(List<Integer> values) {
            addCriterion("data_source_type in", values, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeNotIn(List<Integer> values) {
            addCriterion("data_source_type not in", values, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("data_source_type between", value1, value2, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("data_source_type not between", value1, value2, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeIsNull() {
            addCriterion("device_time is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeIsNotNull() {
            addCriterion("device_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeEqualTo(Date value) {
            addCriterion("device_time =", value, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeNotEqualTo(Date value) {
            addCriterion("device_time <>", value, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeGreaterThan(Date value) {
            addCriterion("device_time >", value, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("device_time >=", value, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeLessThan(Date value) {
            addCriterion("device_time <", value, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeLessThanOrEqualTo(Date value) {
            addCriterion("device_time <=", value, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeIn(List<Date> values) {
            addCriterion("device_time in", values, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeNotIn(List<Date> values) {
            addCriterion("device_time not in", values, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeBetween(Date value1, Date value2) {
            addCriterion("device_time between", value1, value2, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeNotBetween(Date value1, Date value2) {
            addCriterion("device_time not between", value1, value2, "deviceTime");
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

        public Criteria andGmtStartIsNull() {
            addCriterion("gmt_start is null");
            return (Criteria) this;
        }

        public Criteria andGmtStartIsNotNull() {
            addCriterion("gmt_start is not null");
            return (Criteria) this;
        }

        public Criteria andGmtStartEqualTo(Date value) {
            addCriterion("gmt_start =", value, "gmtStart");
            return (Criteria) this;
        }

        public Criteria andGmtStartNotEqualTo(Date value) {
            addCriterion("gmt_start <>", value, "gmtStart");
            return (Criteria) this;
        }

        public Criteria andGmtStartGreaterThan(Date value) {
            addCriterion("gmt_start >", value, "gmtStart");
            return (Criteria) this;
        }

        public Criteria andGmtStartGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_start >=", value, "gmtStart");
            return (Criteria) this;
        }

        public Criteria andGmtStartLessThan(Date value) {
            addCriterion("gmt_start <", value, "gmtStart");
            return (Criteria) this;
        }

        public Criteria andGmtStartLessThanOrEqualTo(Date value) {
            addCriterion("gmt_start <=", value, "gmtStart");
            return (Criteria) this;
        }

        public Criteria andGmtStartIn(List<Date> values) {
            addCriterion("gmt_start in", values, "gmtStart");
            return (Criteria) this;
        }

        public Criteria andGmtStartNotIn(List<Date> values) {
            addCriterion("gmt_start not in", values, "gmtStart");
            return (Criteria) this;
        }

        public Criteria andGmtStartBetween(Date value1, Date value2) {
            addCriterion("gmt_start between", value1, value2, "gmtStart");
            return (Criteria) this;
        }

        public Criteria andGmtStartNotBetween(Date value1, Date value2) {
            addCriterion("gmt_start not between", value1, value2, "gmtStart");
            return (Criteria) this;
        }

        public Criteria andGmtEndIsNull() {
            addCriterion("gmt_end is null");
            return (Criteria) this;
        }

        public Criteria andGmtEndIsNotNull() {
            addCriterion("gmt_end is not null");
            return (Criteria) this;
        }

        public Criteria andGmtEndEqualTo(Date value) {
            addCriterion("gmt_end =", value, "gmtEnd");
            return (Criteria) this;
        }

        public Criteria andGmtEndNotEqualTo(Date value) {
            addCriterion("gmt_end <>", value, "gmtEnd");
            return (Criteria) this;
        }

        public Criteria andGmtEndGreaterThan(Date value) {
            addCriterion("gmt_end >", value, "gmtEnd");
            return (Criteria) this;
        }

        public Criteria andGmtEndGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_end >=", value, "gmtEnd");
            return (Criteria) this;
        }

        public Criteria andGmtEndLessThan(Date value) {
            addCriterion("gmt_end <", value, "gmtEnd");
            return (Criteria) this;
        }

        public Criteria andGmtEndLessThanOrEqualTo(Date value) {
            addCriterion("gmt_end <=", value, "gmtEnd");
            return (Criteria) this;
        }

        public Criteria andGmtEndIn(List<Date> values) {
            addCriterion("gmt_end in", values, "gmtEnd");
            return (Criteria) this;
        }

        public Criteria andGmtEndNotIn(List<Date> values) {
            addCriterion("gmt_end not in", values, "gmtEnd");
            return (Criteria) this;
        }

        public Criteria andGmtEndBetween(Date value1, Date value2) {
            addCriterion("gmt_end between", value1, value2, "gmtEnd");
            return (Criteria) this;
        }

        public Criteria andGmtEndNotBetween(Date value1, Date value2) {
            addCriterion("gmt_end not between", value1, value2, "gmtEnd");
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