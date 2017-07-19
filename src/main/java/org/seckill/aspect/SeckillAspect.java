package org.seckill.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by zzt on 2017/7/16.
 */
@Aspect
@Component
public class SeckillAspect {
    @Before("execution(public * org.seckill.web.SeckillController.*(..))")
    public  void log(){
        System.out.println("我是aspect");
    }
}
