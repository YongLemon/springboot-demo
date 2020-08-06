package top.xinzhang0618.springboot.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * TestMain
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/5/22
 */
public class TestMain {

  public static void main(String[] args) {
    // 创建日志对象
    Log log = LogFactory.getLog(TestMain.class);
    // 日志记录输出
    log.fatal("fatal");
    log.error("error");
    log.warn("warn");
    log.info("info");
    log.debug("debug");
  }
}
