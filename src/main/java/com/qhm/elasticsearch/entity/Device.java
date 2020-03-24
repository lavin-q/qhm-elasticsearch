package com.qhm.elasticsearch.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Device implements Serializable {
    private Integer id;

    private Integer developerId;

    private Integer productType;

    private String productName;

    private String deviceSn;

    private Integer heartWork;

    private Integer heartFree;

    private String monitorIds;

    private String deviceVendor;

    private String deviceBrand;

    private String specModel;

    private Date enterTime;

    private Date disableTime;

    private Byte status;

    private Integer createId;

    private Integer modifyId;

    private Date gmtCreate;

    private Date gmtModify;
}