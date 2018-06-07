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
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * admin用户名
     */
    private String adminId;
    /**
     * 管理员密码
     */
    private String adminPassword;
    /**
     * 是否为超级管理员（1-是，0-否）
     */
    private Boolean isSuperAdmin;


    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Boolean getSuperAdmin() {
        return isSuperAdmin;
    }

    public void setSuperAdmin(Boolean isSuperAdmin) {
        this.isSuperAdmin = isSuperAdmin;
    }

    @Override
    public String toString() {
        return "Admin{" +
        ", adminId=" + adminId +
        ", adminPassword=" + adminPassword +
        ", isSuperAdmin=" + isSuperAdmin +
        "}";
    }
}
