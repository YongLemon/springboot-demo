package top.xinzhang0618.springboot.demo;

/**
 * BizException
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/5/19
 */
public class BizException extends RuntimeException {

  private Integer code;

  public BizException(Integer code, String message) {
    super(message);
    this.code = code;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }
}
