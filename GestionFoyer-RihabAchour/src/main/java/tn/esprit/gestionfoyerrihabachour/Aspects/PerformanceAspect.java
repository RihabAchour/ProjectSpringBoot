package tn.esprit.gestionfoyerrihabachour.Aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
@Slf4j


public class PerformanceAspect {

    @Around("execution(public *  tn.esprit.gestionfoyerrihabachour.Service.*.add*(..))")
    public Object executionTime(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object obj = pjp.proceed();
        stopWatch.stop();
        String methodName = pjp.getSignature().getName();
        log.info("The runtime of the method ( {} ) =  {}  milliseconds.", methodName, stopWatch.getTotalTimeMillis());
        return obj;

    }
}
