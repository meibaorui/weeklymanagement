package com.wanfangdata.weekly.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author meibaorui
 * @since 2018-06-06
 */
public class JobContent implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 工作内容id
     */
    private String jobContentId;
    /**
     * 所属报告id
     */
    private String reportId;
    /**
     * 项目编号
     */
    private String projectCode;
    /**
     * 项目内容
     */
    private String projectName;
    /**
     * 天数
     */
    private Double days;


    public String getJobContentId() {
        return jobContentId;
    }

    public void setJobContentId(String jobContentId) {
        this.jobContentId = jobContentId;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Double getDays() {
        return days;
    }

    public void setDays(Double days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "JobContent{" +
        ", jobContentId=" + jobContentId +
        ", reportId=" + reportId +
        ", projectCode=" + projectCode +
        ", projectName=" + projectName +
        ", days=" + days +
        "}";
    }
}
