package top.xinzhang0618.springboot.demo;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import org.springframework.core.annotation.Order;

/**
 * FilterDemo
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/5/19
 */
// 如果有多个filter, 则order越小越早被执行
@Order(1)
@WebFilter(filterName = "FilterDemo", urlPatterns = "/*")
public class FilterDemo implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {

  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
      throws IOException, ServletException {
    System.out.println("测试过滤器");
    filterChain.doFilter(servletRequest, servletResponse);
  }

  @Override
  public void destroy() {

  }
}
