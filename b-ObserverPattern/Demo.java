// behavorial pattern
// 定义对象间1对多的依赖关系，其中1个方面依赖另外一个方面，
// 将这些方面封装在独立的对象中使得它们可以独立地改变和复用
// 可以创建一个触发链，A的行为影响B，B也可以影响C
// 降低对象之间的耦合度
// 代码核心： Subject有一个private List<Observer> observers，
// public 方法 notifyAllObservers
// interface Observer 有一个public Update（）来更新Subject的状态

public class Demo {
  public static void main(String[] args) {
    Subject subject = new Subject();

    new HexaObserver(subject);
    new OctalObserver(subject);
    new BinaryObserver(subject);

    System.out.println("First state is : ");
    subject.setState(15);
    System.out.println("Second state is : ");
    subject.setState(16);

  }
}
