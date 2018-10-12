package com.example.demo.validation;

import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Author：v
 * @Description：
 * @Date: 2018/10/12
 * @Modified By:
 */
public class MobileValidator implements ConstraintValidator<Mobile, String> {
    private boolean required = false;

    /**
     * 初始化
     */
    public void initialize(Mobile constraintAnnotation) {
        required = constraintAnnotation.required();
    }

    /**
     * 校验
     */
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (required) {
            return ValidatorUtil.isMobile(value);
        } else {
            if (StringUtils.isEmpty(value)) {
                return true;
            } else {
                return ValidatorUtil.isMobile(value);
            }
        }
    }
}
