package com.lzj_seckill.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by 小冯 on 2023/1/10 20:13
 */
@Retention(RetentionPolicy.RUNTIME)//运行时的
@Target(ElementType.METHOD)//放在方法上
public @interface AccessLimit {
    int second();

    int maxCount();

    boolean needLogin() default true;
}
