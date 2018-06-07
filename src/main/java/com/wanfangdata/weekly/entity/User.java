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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private String userId;
    /**
     * 密码
     */
    private String password;
    /**
     * 公司邮箱
     */
    private String companyEmail;
    /**
     * 直属上级id
     */
    private String directManagerUserId;
    /**
     * 职位id
     */
    private String positionId;
    /**
     * 用户姓名
     */
    private String userName;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getDirectManagerUserId() {
        return directManagerUserId;
    }

    public void setDirectManagerUserId(String directManagerUserId) {
        this.directManagerUserId = directManagerUserId;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
        ", userId=" + userId +
        ", password=" + password +
        ", companyEmail=" + companyEmail +
        ", directManagerUserId=" + directManagerUserId +
        ", positionId=" + positionId +
        ", userName=" + userName +
        "}";
    }
}
