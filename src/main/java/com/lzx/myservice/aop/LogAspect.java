package com.lzx.myservice.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
    @Pointcut("@annotation(com.lzx.myservice.aop.LogAnnotation)")
    public void pt(){

    }
    @Around("pt()")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("AOPAOP");
        return pjp.proceed();
    }
}
