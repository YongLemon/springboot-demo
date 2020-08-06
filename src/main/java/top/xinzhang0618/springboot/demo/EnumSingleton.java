package top.xinzhang0618.springboot.demo;

public enum EnumSingleton {
  INSTANCE {
    @Override
    protected void test() {
      System.out.println("单例测试");
    }
  };

  protected abstract void test();

  public static EnumSingleton getInstance() {
    return INSTANCE;
  }
}
