package com.meiyou.usopp.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Author: lwh
 * Date: 17/8/18 12:40.
 */
@Target(METHOD)
@Retention(RUNTIME)
@Documented
public @interface AppBackground {
    public String value() default "";
}
