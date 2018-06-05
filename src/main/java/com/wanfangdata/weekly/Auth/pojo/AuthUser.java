package com.wanfangdata.weekly.Auth.pojo;

import com.wanfangdata.weekly.Auth.Role;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 认证用户类，用于存储在session
 */
public class AuthUser {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户角色
     */
    private Role userRole;

    /**
     * session name
     */
    private static final String SESSION_AUTH_USER = "authUser";

    public AuthUser(String userId, String userName, Role userRole) {
        this.userId = userId;
        this.userName = userName;
        this.userRole = userRole;
    }

    /**
     * 从session中获取authUser
     * @param request
     * @return
     */
    public static AuthUser authUserFactory(HttpServletRequest request) {
        Object authUserObject = request.getSession().getAttribute(SESSION_AUTH_USER);
        if (authUserObject == null) {
            return null;
        }
        if (!(authUserObject instanceof AuthUser)) {
            return null;
        }
        AuthUser authUser = (AuthUser) authUserObject;
        return authUser;
    }

    /**
     * 向session中设置authUser
     * @param request
     * @param authUser
     * @return 成功返回true，否则false
     */
    public static boolean setAuthUserToSession(HttpServletRequest request, AuthUser authUser) {
        try {
            HttpSession session = request.getSession(true);
            session.setAttribute(SESSION_AUTH_USER, authUser);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }
}
