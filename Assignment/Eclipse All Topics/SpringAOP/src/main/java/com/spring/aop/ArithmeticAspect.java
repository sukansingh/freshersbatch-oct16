package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


public class ArithmeticAspect {

    @Pointcut("execution(* Arithmetic.divide(..))")
    public void parameter_pointcut(){}//pointcut name
    
    @Before("parameter_pointcut()")//applying pointcut on before advice  
    public void checkParameters(JoinPoint jp)//it is advice (before advice)  
    {  
    	Object args[] = jp.getArgs();
        System.out.println("checking parameters: " + args[0] + " -- " + args[1]);
    }
    
}
