package com.lzj_seckill.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * 公共返回对象枚举
 * Created by 小冯 on 2022/12/31 15:44
 */
@Getter
@ToString
@AllArgsConstructor
public enum RespBeanEnum {
    //通用
    SUCCESS(200,"SUCCESS"),
    ERROR(500,"服务端异常"),
    //登录模块
    LOGIN_ERROR(500210,"用户名或密码不正确"),
    MOBILE_ERROR(500211,"手机号码格式不正确"),
    BIND_ERROR(500212,"参数校验异常")
    ;
    //状态码
    private final Integer code;
    //信息
    private final String message;
}
