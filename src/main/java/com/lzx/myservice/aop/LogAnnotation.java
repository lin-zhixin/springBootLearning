package com.lzx.myservice.aop;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {
    String moduleName() default "";
    String operation() default "";

}
