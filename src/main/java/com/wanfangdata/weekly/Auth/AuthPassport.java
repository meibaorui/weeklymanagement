package com.wanfangdata.weekly.Auth;

import java.lang.annotation.*;

/**
 * 权限注解
 * 可以注解在类或方法上
 * 方法上的注解优先于类上的起作用
 */
@Documented
@Inherited
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthPassport {
    /**
     * 是否启用权限验证
     * @return true启用，false不启用
     */
    boolean validate() default true;

    /**
     * 使用某种身份验证
     * @return employee普通员工,admin管理员
     */
    Role role() default Role.EMPLOYEE;
}
