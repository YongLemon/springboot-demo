package top.xinzhang0618.springboot.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * DemoConfiguration
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/5/18
 */
@Configuration
public class DemoConfiguration {

  @Bean
  @ConfigurationProperties(prefix = "info")
  public Info getInfo() {
    return new Info();
  }
}
