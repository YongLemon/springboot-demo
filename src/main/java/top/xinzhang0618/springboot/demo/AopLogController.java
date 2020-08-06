package top.xinzhang0618.springboot.demo;

import java.util.List;
import javax.annotation.Resource;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AopLogController
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/5/19
 */
@RequestMapping("/log")
@RestController
public class AopLogController {

  @GetMapping("/test")
  public String testLog() {
    return "hello! aoplog!";
  }

  @GetMapping("/test2")
  public String testLog2() {
    return "hello! aoplog2!";
  }

  @GetMapping("/test3")
  public String testLog3() throws Exception {
    throw new Exception("测试日志抛异常");
  }

  @GetMapping("/annotation")
  @MyTestAnnotation("注解参数测试")
  public String testAnnotation() {
    return "hello! annotation!";
  }

  @GetMapping("/exception")
  public String testExceptionHandler() throws Exception {
    throw new BizException(11, "测试异常全局处理");
  }
}
