// strucutral pattern的一种。
// 为一个现有对象增加新功能，但是不改变其结构
// 创建一个装饰类，包装原类，保持类方法签名完整性的情况下，提供额外功能呢
// e.g.不改变形状，添加颜色
// 继承方式来扩展功能，会导致子类膨胀
// 装饰器扩展，动态增加功能，动态撤销
// 核心：1,shape接口，实现了shape接口的实体类，
// 2,实现了shape接口的抽象装饰类ShapeDecorator,把shape 当成了它的实例变量，
public class Demo {
  public static void main(String[] args) {
    Shape circle = new Circle();
    
    ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
    ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());


    System.out.println("Circle with normal border");
    circle.draw();

    System.out.println("Circle with red border");
    redCircle.draw();

    System.out.println("Rectangle with red border");
    redRectangle.draw();

  }
}

