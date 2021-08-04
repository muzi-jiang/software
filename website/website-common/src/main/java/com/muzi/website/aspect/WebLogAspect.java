//package com.muzi.website.aspect;
//
//import com.alibaba.fastjson.JSONObject;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import java.util.Arrays;
//
///**
// * Description : controller类的日志切面
// *
// * @author Zhao Ke
// * @since 2019/11/16.
// */
//@Aspect
//@Component
//public class WebLogAspect {
//    private final static Logger logger = LoggerFactory.getLogger(WebLogAspect.class);
//
//    /**
//     * 以 controller 包下定义的所有请求为切入点
//     */
//    @Pointcut("execution(public * cn.com.muzi.xcx.controller..*.*(..))")
//    public void webLog() {
//    }
//
//    /**
//     * 在切点之前织入
//     * @param joinPoint 切点
//     */
//    @Before("webLog()")
//    public void doBefore(JoinPoint joinPoint) {
//        // 开始打印请求日志
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//
//        Object[] args = joinPoint.getArgs();
//        Object[] arguments = new Object[args.length];
//        for (int i = 0; i < args.length; i++) {
//            if (args[i] instanceof ServletRequest || args[i] instanceof ServletResponse || args[i] instanceof MultipartFile) {
//                continue;
//            }
//            arguments[i] = args[i];
//        }
//        String paramter = "";
//        try {
//            paramter = JSONObject.toJSONString(arguments);
//        } catch (Exception e) {
//            paramter = Arrays.toString(arguments);
//        }
//        // 打印请求相关参数
//        logger.info("========================================== Start ==========================================");
//        // 打印请求 url
//        logger.info("URL            : [{}]", request.getRequestURL().toString());
//        // 打印 Http method
//        logger.info("HTTP Method    : [{}]", request.getMethod());
//        // 打印调用 controller 的全路径以及执行方法
//        logger.info("Class Method   : [{}].[{}]", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
//        // 打印请求的 IP
//        logger.info("IP             : [{}]", request.getRemoteAddr());
//        // 打印请求入参
//        logger.info("Request Args   : [{}]", paramter);
//    }
//
//
//    /**
//     * 环绕
//     * @param proceedingJoinPoint proceedingJoinPoint
//     * @return Object
//     */
//    @Around("webLog()")
//    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) {
//        long startTime = System.currentTimeMillis();
//        Object result = null;
//        try {
//            result = proceedingJoinPoint.proceed();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//            logger.debug(throwable.getMessage());
//        }
//        logger.info("Time-Consuming : {} ms", System.currentTimeMillis() - startTime);
//        logger.info("========================================== End ==========================================");
//        return result;
//    }
//}
