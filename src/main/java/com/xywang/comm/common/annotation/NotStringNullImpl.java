package com.xywang.comm.common.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @ClassName: IsNullOrEmptyImpl
 * @Description: 字符串文本格式校验，不为“null”
 * @author xywang
 * @date 2017年7月13日 下午1:01:22
 *
 */
public class NotStringNullImpl implements ConstraintValidator<NotStringNull, String> {
    /* (非 Javadoc)
	* <p>Title: initialize</p>
	* <p>Description: </p>
	* @param arg0
	* @see javax.validation.ConstraintValidator#initialize(java.lang.annotation.Annotation)
	*/
    @Override
    public void initialize(NotStringNull arg0) {


    }

    /* (非 Javadoc)
    * <p>Title: isValid</p>
    * <p>Description: </p>
    * @param arg0
    * @param arg1
    * @return
    * @see javax.validation.ConstraintValidator#isValid(java.lang.Object, javax.validation.ConstraintValidatorContext)
    */
    @Override
    public boolean isValid(String arg0, ConstraintValidatorContext arg1) {

        if(arg0 == null)
            return true;
        return (!arg0.equals("null"))&&(!arg0.equals("NULL"));
    }
}
