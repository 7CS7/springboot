package com.cs.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
//not completed
public class CustomAnnotationConstraintvalidator implements ConstraintValidator<CustomAnnotation,String> {

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		// TODO Auto-generated method stub
		boolean result=theCode.startsWith(prefix)
		return result;
	}

}
