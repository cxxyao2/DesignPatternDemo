// behavorial pattern
// 用一个中介对象来封装一系列的对象交互，使得对象之间不再需要显示相互引用，使得耦合松散
// 使用场合： 多个类相互耦合，形成网状结构
// e.g. 1,WTO: 各个国家通过WTO来贸易  2,聊天室：对话者之间不再直接传递消息，通过聊天室
// 优点：1，1对多变成了1对1 2，类之间解耦 3，符合demeter原则（1个类对其他类的最少知道原则）
public class Demo {
  public static void main(String[] args) {
    User robert = new User("Robert");
    User john = new User("John");

    robert.sendMessage("Hi,John");
    john.sendMessage("Hello,Robert");
  }
}
