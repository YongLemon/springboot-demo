package top.xinzhang0618.springboot.demo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * ListenerDemo
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/5/19
 */
@WebListener
public class ListenerDemo implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    System.out.println("ServletContext初始化");
    System.out.println(sce.getServletContext().getServerInfo());
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    System.out.println("ServletContext销毁");
  }
}
