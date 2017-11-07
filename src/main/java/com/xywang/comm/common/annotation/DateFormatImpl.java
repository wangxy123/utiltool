package com.xywang.comm.common.annotation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @ClassName: DateFormatImpl
 * @Description:  时间格式校验注解
 * @author xywang
 * @date 2017年7月13日 下午1:41:51
 *
 */
public class DateFormatImpl implements ConstraintValidator<DateFormat, String>{
    private String format;
    /* (非 Javadoc)
    * <p>Title: initialize</p>
    * <p>Description: </p>
    * @param arg0
    * @see javax.validation.ConstraintValidator#initialize(java.lang.annotation.Annotation)
    */
    @Override
    public void initialize(DateFormat arg0) {

        this.format=arg0.format();
    }

    /* (非 Javadoc)
    * <p>Title: isValid</p>
    * <p>Description: </p>
    * @param arg0
    * @param arg1
    * @return
    * @see javax.validation.ConstraintValidator#isValid(java.lang.Object, javax.validation.ConstraintValidatorContext)
    */
    @SuppressWarnings("unused")
    @Override
    public boolean isValid(String arg0, ConstraintValidatorContext arg1) {

        SimpleDateFormat df = new SimpleDateFormat(format);
        try {
            Date date = df.parse(arg0);
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }
}
