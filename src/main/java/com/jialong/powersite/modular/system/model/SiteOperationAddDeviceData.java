package com.jialong.powersite.modular.system.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jialong.powersite.modular.system.model.request.SiteOperationAddParamData;

import java.util.List;

public class SiteOperationAddDeviceData {

    @JsonProperty(value = "deviceType")
    private Integer deviceId;

    private String deviceName;

    private Integer deviceStatus;

    private List<SiteOperationAddParamData> paramDataList;

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Integer getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(Integer deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public List<SiteOperationAddParamData> getParamDataList() {
        return paramDataList;
    }

    public void setParamDataList(List<SiteOperationAddParamData> paramDataList) {
        this.paramDataList = paramDataList;
    }

}
