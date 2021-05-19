// behavorial pattern
// 有一些通用的方法，用final固定，在抽象类实现； 其他在子类具体实现
// e.g. 1，西游记中菩萨定好的81难的大框架  2，事务开启、获取、关闭session等
// 优点: 封装不同不变，扩展可变部分  2，提取公共代码，便于维护
// 缺点：每一个不同的实现都需要一个子类来实现，导致系统庞大
public class Demo {
  
  public static void main(String[] args) {
    Game game = new Cricket();
    game.play();

    game = new Football();
    game.play();

}
}
