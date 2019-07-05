package com.itcast.testAnnotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 横切面关注组件
 */
@Aspect
@Component("s ecurityAdvice")
public class SecurityAdvice {

    /**
     * 织入点Joinpoint
     */
    @Pointcut("execution(* com.itcast.testAnnotation..*.*(..)))")
    //@Pointcut("execution(* add*(..))")
    public void pointcut(){}

    /**
     * 执行时机
     * 具体实现Advice
     */
    @After("pointcut()")
    public void execute(){
        System.out.println("安全检查s");
    }

}
