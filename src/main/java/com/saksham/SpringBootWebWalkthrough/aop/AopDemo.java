package com.saksham.SpringBootWebWalkthrough.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

@Aspect
@Configuration
public class AopDemo {
    Logger logger = LoggerFactory.getLogger(AopDemo.class);

    @Before("com.saksham.SpringBootWebWalkthrough.aop.PointCutDemo.ServiceControllerPC()")
    public void beforeServiceController() {
        logger.info("Intercepted ServiceController class");

    }

    @Before("com.saksham.SpringBootWebWalkthrough.aop.PointCutDemo.ServiceClassPC()")
    public void beforeServiceClass() {
        logger.info("Intercepted ServiceClass");

    }

    @Around("com.saksham.SpringBootWebWalkthrough.aop.PointCutDemo.TimeTakenPC()")
    public Object aroundDaoClass(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long startTime = threadMXBean.getCurrentThreadCpuTime();
        Object result = proceedingJoinPoint.proceed();
        long endTime = threadMXBean.getCurrentThreadCpuTime();
        logger.info("{}: startTime: {}, endTime: {} netTime: {}", Thread.currentThread().getName(),startTime, endTime, endTime-startTime);
        return result;
    }
}
