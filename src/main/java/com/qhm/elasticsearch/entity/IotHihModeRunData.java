package com.qhm.elasticsearch.entity;

import java.util.Date;

public class IotHihModeRunData {
    private Integer id;

    private String deviceSn;

    private String deviceName;

    private Float electricQuantity;

    private Float xAngle;

    private Float yAngle;

    private Float pressure;

    private Float sedimentation;

    private Byte deviceStatus;

    private Byte alarmStatus;

    private Integer alarm0;

    private Integer alarm1;

    private Integer dataSourceType;

    private Date deviceTime;

    private Date gmtCreate;

    private Date gmtStart;

    private Date gmtEnd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn == null ? null : deviceSn.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public Float getElectricQuantity() {
        return electricQuantity;
    }

    public void setElectricQuantity(Float electricQuantity) {
        this.electricQuantity = electricQuantity;
    }

    public Float getxAngle() {
        return xAngle;
    }

    public void setxAngle(Float xAngle) {
        this.xAngle = xAngle;
    }

    public Float getyAngle() {
        return yAngle;
    }

    public void setyAngle(Float yAngle) {
        this.yAngle = yAngle;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    public Float getSedimentation() {
        return sedimentation;
    }

    public void setSedimentation(Float sedimentation) {
        this.sedimentation = sedimentation;
    }

    public Byte getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(Byte deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public Byte getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(Byte alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public Integer getAlarm0() {
        return alarm0;
    }

    public void setAlarm0(Integer alarm0) {
        this.alarm0 = alarm0;
    }

    public Integer getAlarm1() {
        return alarm1;
    }

    public void setAlarm1(Integer alarm1) {
        this.alarm1 = alarm1;
    }

    public Integer getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(Integer dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    public Date getDeviceTime() {
        return deviceTime;
    }

    public void setDeviceTime(Date deviceTime) {
        this.deviceTime = deviceTime;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtStart() {
        return gmtStart;
    }

    public void setGmtStart(Date gmtStart) {
        this.gmtStart = gmtStart;
    }

    public Date getGmtEnd() {
        return gmtEnd;
    }

    public void setGmtEnd(Date gmtEnd) {
        this.gmtEnd = gmtEnd;
    }
}