//package top.xinzhang0618.springboot.demo;
//
//import javax.servlet.http.HttpServletRequest;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestAttributes;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
///**
// * AopLog
// *
// * @author xinzhang
// * @author Shenzhen Greatonce Co Ltd
// * @version 2020/5/19
// */
//@Aspect
//@Component
//public class AopLog {
//
//  private Logger logger = LoggerFactory.getLogger(AopLog.class);
//  ThreadLocal<Long> startTime = new ThreadLocal<>();
//
//  /**
//   * 定义切点
//   */
//  @Pointcut("execution(* top.xinzhang0618.springboot.demo.AopLogController.testLog(..)) ||"
//      + "execution(* top.xinzhang0618.springboot.demo.AopLogController.testLog2(..)) ||"
//      + "execution(* top.xinzhang0618.springboot.demo.AopLogController.testLog3(..))")
//  public void aopWebLog() {
//
//  }
//
//  @Before("aopWebLog()")
//  public void doBefore(JoinPoint joinPoint) throws Throwable {
//    startTime.set(System.currentTimeMillis());
//    ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//    HttpServletRequest request = attributes.getRequest();
//    logger.info("URL: " + request.getRequestURI().toString());
//    logger.info("HTTP方法: " + request.getMethod());
//    logger.info("IP地址: " + request.getRemoteAddr());
//    logger.info("类的方法: " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
//    logger.info("参数: " + request.getQueryString());
//  }
//
//  @AfterReturning(pointcut = "aopWebLog()", returning = "retObject")
//  public void doAfterReturning(Object retObject) throws Throwable {
//    logger.info("应答值: " + retObject);
//    logger.info("费时: " + (System.currentTimeMillis() - startTime.get()));
//  }
//
//  @AfterThrowing(pointcut = "aopWebLog()", throwing = "ex")
//  public void addAfterThrowingLogger(JoinPoint joinPoint, Exception ex) {
//    logger.error("执行抛异常", ex);
//  }
//}
