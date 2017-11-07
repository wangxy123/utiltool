package com.xywang.comm.common.annotation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: IsNullOrEmpty
 * @Description: 字符串文本格式校验，不为“null”
 * @author xywang
 * @date 2017年7月13日 下午12:58:37
 *
 */
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NotStringNullImpl.class)
public @interface NotStringNull {
    String message() default "参数为'null'或'NULL'";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
