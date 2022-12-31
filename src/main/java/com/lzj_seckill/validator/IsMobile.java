package com.lzj_seckill.validator;

import com.lzj_seckill.vo.IsMobileValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 验证手机号注解
 * Created by 小冯 on 2022/12/31 17:49
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(
        validatedBy = {IsMobileValidator.class}
)
public @interface IsMobile {
    boolean required() default true;

    String message() default "手机号码格式错误}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
