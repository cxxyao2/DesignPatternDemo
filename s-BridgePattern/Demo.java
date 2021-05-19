// Structural Pattern
// Bridge Pattern 把抽象和具体实现解耦，两者独立变化
// 优点：1，抽象和实现分离 2，优秀扩展能力 3，实现细节对客户透明
// 关键：1， 抽象类依赖实现类，抽象类是实现类的成员变量  
//  2, 以下例子中 有实现接口(抽象) 和 扩展抽象类（实现）
// 缺点：增加系统设计和理解难度，聚合关联建立在抽象层
// 适用场景：1，不想多层继承 2，抽象角色和具体化角色中更多灵活性 3，一个类两个独立变化的维度
// e.g.墙上开关，可以当成一个抽象类
public class Demo {
  public static void main(String[] args) {
    Shape redCircle = new Circle(100, 100, 10, new RedCircle());
    Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

    redCircle.draw();
    greenCircle.draw();

  }
}
