package com.nsv.jsmbaba.teamapp.aspect;

import com.nsv.jsmbaba.teamapp.domain.Team;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private Logger log = Logger.getLogger(LoggingAspect.class);

    @Around("execution(* com.nsv.jsmbaba.teamapp.service.TeamServiceImpl.*(..))")
    public Object printMethodName(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] args = proceedingJoinPoint.getArgs();
        if(args.length>0 && args[0] instanceof Team){
            log.info("Executing the method"+ methodName + "with arguments "+ ((Team)args[0]).toString());
        }else{
            log.info("Executing the method"+methodName);
        }
        Object proceed = proceedingJoinPoint.proceed();
        if(args.length>0 && args[0] instanceof Team){
            log.info("Executed the method"+ methodName + "with arguments "+ ((Team)args[0]).toString());
        }else{
            log.info("Executed the method"+methodName);
        }
        return proceed;
    }
}
