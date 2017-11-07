package com.xywang.comm.common.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: DateFormat
 * @Description: 时间格式校验注解
 * @author xywang
 * @date 2017年7月13日 下午1:40:07
 *
 */
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DateFormatImpl.class)
public @interface DateFormat {
    String format();

    String message() default "时间格式不正确";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
