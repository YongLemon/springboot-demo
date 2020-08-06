package top.xinzhang0618.springboot.demo;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestErrorController
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/5/19
 */
@RestController
public class TestErrorController implements ErrorController {

  @Override
  public String getErrorPath() {
    return null;
  }

  /**
   * 要覆盖error映射
   */
  @RequestMapping("/error")
  public Map<String, Object> handleError() {
    HashMap<String, Object> map = new HashMap<>(2);
    map.put("code", 404);
    map.put("msg", "不存在");
    return map;
  }
}
