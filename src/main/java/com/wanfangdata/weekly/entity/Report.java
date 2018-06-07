package com.wanfangdata.weekly.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author meibaorui
 * @since 2018-06-06
 */
public class Report implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 报告id
     */
    private String reportId;
    /**
     * 员工id
     */
    private String userId;
    /**
     * 工作内容总结
     */
    private String jobSummarize;
    /**
     * 自我总结进步
     */
    private String advanceSummarizeBySelf;
    /**
     * 不足及改善措施
     */
    private String improvement;
    /**
     * 所需帮助
     */
    private String needHelp;
    /**
     * 自评分数
     */
    private Double scoreBySelf;
    /**
     * 直属上级评分
     */
    private Double scoreByManager;
    /**
     * 直属上级对下级进步总结
     */
    private String advanceSummarizeByManager;
    /**
     * 上级对下级期望
     */
    private String expectation;
    /**
     * 所需帮助的反馈
     */
    private String reHelp;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 员工提交时间
     */
    private Date selfSubmitTime;
    /**
     * 直属领导反馈时间
     */
    private Date managerSubmitTime;


    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getJobSummarize() {
        return jobSummarize;
    }

    public void setJobSummarize(String jobSummarize) {
        this.jobSummarize = jobSummarize;
    }

    public String getAdvanceSummarizeBySelf() {
        return advanceSummarizeBySelf;
    }

    public void setAdvanceSummarizeBySelf(String advanceSummarizeBySelf) {
        this.advanceSummarizeBySelf = advanceSummarizeBySelf;
    }

    public String getImprovement() {
        return improvement;
    }

    public void setImprovement(String improvement) {
        this.improvement = improvement;
    }

    public String getNeedHelp() {
        return needHelp;
    }

    public void setNeedHelp(String needHelp) {
        this.needHelp = needHelp;
    }

    public Double getScoreBySelf() {
        return scoreBySelf;
    }

    public void setScoreBySelf(Double scoreBySelf) {
        this.scoreBySelf = scoreBySelf;
    }

    public Double getScoreByManager() {
        return scoreByManager;
    }

    public void setScoreByManager(Double scoreByManager) {
        this.scoreByManager = scoreByManager;
    }

    public String getAdvanceSummarizeByManager() {
        return advanceSummarizeByManager;
    }

    public void setAdvanceSummarizeByManager(String advanceSummarizeByManager) {
        this.advanceSummarizeByManager = advanceSummarizeByManager;
    }

    public String getExpectation() {
        return expectation;
    }

    public void setExpectation(String expectation) {
        this.expectation = expectation;
    }

    public String getReHelp() {
        return reHelp;
    }

    public void setReHelp(String reHelp) {
        this.reHelp = reHelp;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getSelfSubmitTime() {
        return selfSubmitTime;
    }

    public void setSelfSubmitTime(Date selfSubmitTime) {
        this.selfSubmitTime = selfSubmitTime;
    }

    public Date getManagerSubmitTime() {
        return managerSubmitTime;
    }

    public void setManagerSubmitTime(Date managerSubmitTime) {
        this.managerSubmitTime = managerSubmitTime;
    }

    @Override
    public String toString() {
        return "Report{" +
        ", reportId=" + reportId +
        ", userId=" + userId +
        ", jobSummarize=" + jobSummarize +
        ", advanceSummarizeBySelf=" + advanceSummarizeBySelf +
        ", improvement=" + improvement +
        ", needHelp=" + needHelp +
        ", scoreBySelf=" + scoreBySelf +
        ", scoreByManager=" + scoreByManager +
        ", advanceSummarizeByManager=" + advanceSummarizeByManager +
        ", expectation=" + expectation +
        ", reHelp=" + reHelp +
        ", createTime=" + createTime +
        ", selfSubmitTime=" + selfSubmitTime +
        ", managerSubmitTime=" + managerSubmitTime +
        "}";
    }
}
