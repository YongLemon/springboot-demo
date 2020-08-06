package top.xinzhang0618.springboot.demo;

/**
 * Singleton
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/5/22
 */
public class Singleton {


  private Singleton() {

  }

  private static class SingletonHelper {

    private static final Singleton INSTANCE = new Singleton();
  }

  public static Singleton getInstance() {
    return SingletonHelper.INSTANCE;
  }
}
