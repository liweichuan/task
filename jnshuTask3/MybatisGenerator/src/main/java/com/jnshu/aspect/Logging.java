package com.jnshu.aspect;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect //注解切面
@Component
public class Logging {
    private Logger logger = LogManager.getLogger(Logging.class);

    @Pointcut("execution(* com.jnshu.service.*.*(..))")
    public void loggerAspect() {}

    @Around(value = "loggerAspect()")
    public Object runLogger(ProceedingJoinPoint pjp) throws Throwable {
        String className = pjp.getTarget().getClass().getName();
        String methodName = pjp.getSignature().getName();
        Object[] args = pjp.getArgs();
        for (Object arg : args) {
            logger.info("参数为{"+ arg+"}");
        }

        logger.info("开始执行{"+className+"}的{"+methodName+"}方法");
        Long startTime = System.currentTimeMillis();
        Object obj = pjp.proceed();

        Long endTime = System.currentTimeMillis();

        logger.info("返回值是{"+obj+"}，执行时间{"+(endTime-startTime)+"}ms");

        return obj;
    }
}