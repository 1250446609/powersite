package com.jialong.powersite.modular.system.model;

public class JlSiteOperation {
	   
    private  Integer id;
     
	 //站房id
    private  Integer siteId;

    private  String  uuid;

    private  Integer deviceId;
     
	 //参数id(关联jl_parameter_config表id)
    private  Integer paramId;
     
	 //参数名称对应的值
    private  String paramValue;
     
	 //参数值类型[0代表状态值 1代表数值类型]
    private  Integer paramValueType;
     
	 //参数值单位
    private  String paramValueUnit;

    private  Boolean alert;

    private  Integer alertType;

    private  String alertTypeName;

    //上临界值
    private  String alertUpperValue;

    //下临界值
    private  String alertLowerValue;

    //参数值单位
    private  String addTime;

    private Integer isOverdue;

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getParamId() {
        return paramId;
    }

    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public Integer getParamValueType() {
        return paramValueType;
    }

    public void setParamValueType(Integer paramValueType) {
        this.paramValueType = paramValueType;
    }

    public String getParamValueUnit() {
        return paramValueUnit;
    }

    public void setParamValueUnit(String paramValueUnit) {
        this.paramValueUnit = paramValueUnit;
    }

    public Integer getIsOverdue() {
        return isOverdue;
    }

    public void setIsOverdue(Integer isOverdue) {
        this.isOverdue = isOverdue;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getAlertUpperValue() {
        return alertUpperValue;
    }

    public void setAlertUpperValue(String alertUpperValue) {
        this.alertUpperValue = alertUpperValue;
    }

    public String getAlertLowerValue() {
        return alertLowerValue;
    }

    public void setAlertLowerValue(String alertLowerValue) {
        this.alertLowerValue = alertLowerValue;
    }

    public Boolean getAlert() {
        return alert;
    }

    public void setAlert(Boolean alert) {
        this.alert = alert;
    }

    public Integer getAlertType() {
        return alertType;
    }

    public void setAlertType(Integer alertType) {
        this.alertType = alertType;
    }

    public String getAlertTypeName() {
        return alertTypeName;
    }

    public void setAlertTypeName(String alertTypeName) {
        this.alertTypeName = alertTypeName;
    }
}