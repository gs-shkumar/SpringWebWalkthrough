package com.saksham.SpringBootWebWalkthrough.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutDemo {

    @Pointcut("execution(* com.saksham.SpringBootWebWalkthrough.controller.ServiceController.getPerson(..))")
    public void ServiceControllerPC() { }

    @Pointcut("execution(* com.saksham.SpringBootWebWalkthrough.utils.ServiceClass.*(..))")
    public void ServiceClassPC() { }

    @Pointcut("@annotation(com.saksham.SpringBootWebWalkthrough.annotation.TimeTaken)")
    public void TimeTakenPC() { }

}
