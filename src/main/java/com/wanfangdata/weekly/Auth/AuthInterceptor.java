package com.wanfangdata.weekly.Auth;

import com.wanfangdata.weekly.Auth.pojo.AuthUser;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户角色权限过滤器
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!handler.getClass().isAssignableFrom(HandlerMethod.class)) {
            return true;
        }
        AuthPassport authPassport = ((HandlerMethod) handler).getMethodAnnotation(AuthPassport.class);

        if (authPassport == null) {
            authPassport = ((HandlerMethod) handler).getMethod().getDeclaringClass().getAnnotation(AuthPassport.class);
            if (authPassport == null) {
                return true;
            }
        }
        if (authPassport.validate() == false) {
            return true;
        }
        AuthUser authUser = AuthUser.authUserFactory(request);
        if (authUser!=null&&authUser.getUserRole().equals(authPassport.role())) {
            return true;
        }
        if (authPassport.role().equals(Role.EMPLOYEE)) {
            response.sendRedirect("/");
        }
        if (authPassport.role().equals(Role.ADMIN)) {
            response.sendRedirect("/admin");
        }
        return false;
    }
}
