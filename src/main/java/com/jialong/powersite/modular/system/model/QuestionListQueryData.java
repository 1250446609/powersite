package com.jialong.powersite.modular.system.model;

import com.jialong.powersite.core.utils.Pagination;

public class QuestionListQueryData extends Pagination {

    private  Integer level;

    private  Integer siteId;

    private  Integer reportor;

    private  String reportStartTime;

    private  String reportEndTime;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getReportor() {
        return reportor;
    }

    public void setReportor(Integer reportor) {
        this.reportor = reportor;
    }

    public String getReportStartTime() {
        return reportStartTime;
    }

    public void setReportStartTime(String reportStartTime) {
        this.reportStartTime = reportStartTime;
    }

    public String getReportEndTime() {
        return reportEndTime;
    }

    public void setReportEndTime(String reportEndTime) {
        this.reportEndTime = reportEndTime;
    }
}
