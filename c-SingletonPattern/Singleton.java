// 私有构造器
// 公有一个函数，直接返回实例
public class Singleton{
  private static Singleton instance = new Singleton();
  private Singleton (){}
  public static Singleton getInstance(){
    return instance;
  }
  public void showMessage(){
    System.out.println("Hello world!");
  }
}