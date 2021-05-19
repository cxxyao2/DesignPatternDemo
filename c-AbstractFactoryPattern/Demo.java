// creational Pattern
// Abstract Factory Pattern
// 解决场景：解决接口选择问题。系列产品有多于一个的产品族，系统只消费其中某一族的产品
// 优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端只使用同一个产品族的对象
// 缺点：产品扩展困难，要增加一个系列中的一个产品，既要在抽象的creator中加代码，又要在具体的实现里面加代码
// e.g.生成不同操作系统的程序
// 核心： 示例代码核心，抽象工厂根据参数能创建两个工厂，颜色工厂和形状工厂，这两个工厂再根据参数，生成不同
// 具体颜色和具体形状，抽象工厂-工厂-具体示例。  比factory pattern 多一层
public class Demo {

  public static void main(String[] args) {

    // ok
    /*
     * ColorFactory xx = new ColorFactory(); Color yy = xx.getColor("RED");
     * yy.fill();
     */

    AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

    Shape shape1 = shapeFactory.getShape("Square");
    shape1.draw();

    Shape shape2 = shapeFactory.getShape("Rectangle");
    shape2.draw();

    AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

    Color color1 = colorFactory.getColor("Red");
    color1.fill();

    Color color2 = colorFactory.getColor("Green");
    color2.fill();

  }

}