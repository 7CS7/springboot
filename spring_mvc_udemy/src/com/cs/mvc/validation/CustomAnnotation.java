package com.cs.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
//not completed
@Constraint(validatedBy=CustomAnnotationConstraintvalidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
public String value() default "jav";
public String message() default "must start with jav";
public class<?>[] groups() default{};
public class <? extends Payload>[] payload default{};
}
