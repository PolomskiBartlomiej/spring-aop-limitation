package spring.aoplimitation.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
class AddParamAspect {

    @Pointcut(value = "@annotation(spring.aoplimitation.aop.AddParam) && args(param)")
    void addParamPointcut(String param){}

    @Around(value = "addParamPointcut(param)", argNames = "joinPoint,param")
    Object addParam(ProceedingJoinPoint joinPoint , String param) throws Throwable {
       return joinPoint.proceed(new Object[] {param + "AndParam"});
    }

}
