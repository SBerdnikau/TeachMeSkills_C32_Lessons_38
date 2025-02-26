package com.teachmeskills.lesson_38.aspect;

import com.teachmeskills.lesson_38.annatation.Timed;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimedAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(TimedAspect.class);

    @Around("@annotation(timed)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint, Timed timed) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - startTime;

        if (executionTime > 1000) {
            LOGGER.warn("Method {} completed in {} milliseconds.}", joinPoint.getSignature(), executionTime);
        }else {
            LOGGER.info("Method {} completed in {} milliseconds.", joinPoint.getSignature(), executionTime);
        }

        return proceed;
    }

}
