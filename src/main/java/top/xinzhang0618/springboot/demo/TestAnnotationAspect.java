//package top.xinzhang0618.springboot.demo;
//
//import java.lang.reflect.Method;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.Signature;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.reflect.MethodSignature;
//import org.springframework.stereotype.Component;
//
///**
// * TestAnnotationAspect
// *
// * @author xinzhang
// * @author Shenzhen Greatonce Co Ltd
// * @version 2020/5/19
// */
//@Aspect
//@Component
//public class TestAnnotationAspect {
//
//  /**
//   * 拦截被MyTestAnnotation注解的方法, 如果需要拦截指定包, 指定规则名称的方法, 则可以使用表达式execution(..)
//   */
//  @Pointcut("@annotation(top.xinzhang0618.springboot.demo.MyTestAnnotation)")
//  public void myAnnotationPointCut() {
//
//  }
//
//  @Before("myAnnotationPointCut()")
//  public void before(JoinPoint joinPoint) throws Throwable {
//    MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//    Method method = signature.getMethod();
//    MyTestAnnotation annotation = method.getAnnotation(MyTestAnnotation.class);
//    System.out.println("注解参数为: " + annotation.value());
//  }
//}
