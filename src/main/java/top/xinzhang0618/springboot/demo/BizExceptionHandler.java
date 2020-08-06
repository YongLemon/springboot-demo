package top.xinzhang0618.springboot.demo;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * BizExceptionHandler
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/5/19
 */
//@ControllerAdvice(annotations = RestController.class)
//@ControllerAdvice("top.xinzhang0618.springboot.demo")
@ControllerAdvice(assignableTypes = {AopLogController.class})
public class BizExceptionHandler {

  @ResponseBody
  @ExceptionHandler(BizException.class)
  public Map<String, Object> bizExceptionHandle(BizException e) {
    HashMap<String, Object> map = new HashMap<>(2);
    map.put("code", e.getCode());
    map.put("msg", e.getMessage());
    // 此处可以添加日志记录等等
    return map;
  }
}
