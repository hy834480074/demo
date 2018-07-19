package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
//导入依赖加入注解Component
@Aspect
@Component
public class HttpAspect {
//    使用的logger日志类来搞事情
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    //@Before的注解在方法执行之前执行
    //拦截该路径下studentList()方法，两个点表示任何参数
//    @Before("execution(public * com.example.controller.StudentController.studentList(..))")
//    public void log(){
//        System.out.println("Test before");
//    }
//
//    @After("execution(public * com.example.controller.StudentController.studentList(..))")
//    public void doAfter(){
//        System.out.println("Test after");
//    }

    //定义一个公用方法
    @Pointcut("execution(public * com.example.demo.service.impl.AreaServiceImpl.*(..))")
    public void log(){
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //url请求路径
        logger.info("url={}", request.getRequestURI());

        //method请求方式post 还是get
        logger.info("method={}", request.getMethod());

        //ip客户端ip
        logger.info("ip={}", request.getRemoteAddr());

        //method请求方法
        // joinPoint.getSignature().getDeclaringTypeName()类名
        // joinPoint.getSignature().getName()类方法
        logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());

        //param请求参数
        logger.info("args={}", joinPoint.getArgs());
    }
    @After("log()")

    public void doAfter(){
    }
//    获取的是返回内容
    @AfterReturning(returning="obj", pointcut = "log()")
    public void doAfterReturnig(Object obj){
        logger.info("reponse={}", obj);
    }

}
