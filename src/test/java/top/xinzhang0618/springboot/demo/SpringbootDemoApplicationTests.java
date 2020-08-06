package top.xinzhang0618.springboot.demo;

import java.util.List;
import java.util.logging.Level;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.xinzhang0618.springboot.demo.mapper.UserMapper;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringbootDemoApplicationTests {

  @Value("${person.name:defaultName}")
  private String name;
  @Autowired
  private Person person;
  @Autowired
  private Info info;
  @Autowired
  private UserMapper userMapper;
  @Autowired
  private UserService userService;

  @Test
  public void test() {
    List<User> list = userService.listAll();
    System.out.println(list);
  }


  @Test
  public void testTransaction() throws Exception {
    int i = userService.insert();
  }

  private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootDemoApplicationTests.class);

  @Test
  public void testLogger() {
    LOGGER.error("error");
    LOGGER.warn("warn");
    LOGGER.info("info");
    LOGGER.debug("debug");
    LOGGER.trace("trace");
  }

}
