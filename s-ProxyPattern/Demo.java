// 一个类代表另外一个类的功能
// 在直接访问对象时会有问题，比如，要访问的对象在远程机器上
// 或者对象创建开销很大,
// 我们增加访问层
// 对这个类进行一些控制
// 与adapter模式的差别：目的是控制，不改变代理类的接口
// 与decorator模式的差别：不是为了功能增加，而是控制
// eg.g 1,cache代理 2,防火墙 3,远程带来
// 优点：1，职责清晰 2，高扩展性, 3，智能化
// 当被请求时，使用ProxyImage 来获取RealImage类 的对象

public class Demo {
  public static void main(String[] args) {
    Image image = new ProxyImage("test_10.jpg");

    image.display();
    System.out.println("");
    image.display();
  }  
}
