package com.learning.spring_ecommerce.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    //return type, class-name.method-name(args)
    @Before("execution(* com.learning.spring_ecommerce.service.ProductService.*(..))")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Method Called: " + jp.getSignature().getName() );
    }
}
