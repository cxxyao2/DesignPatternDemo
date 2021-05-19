// 隐藏系统的复杂性，为一组接口提供一个一致的界面
// 对外呈现一个单一的类，通过这个类来调用不同方法，实现对其他类的其他方法的委托调用
// 应用实例： 1,医院的接待员  2,JAVA的三层开发模式
// 优点：1，提高安全性 ，灵活，减少系统间相互依赖
// 缺点：不适合对修改闭合、多扩展开放原则，不适合继承及override
public class Demo {
  public static void main(String[] args) {
    ShapeMaker shapeMaker = new ShapeMaker();

    shapeMaker.drawCircle();
    shapeMaker.drawRectangle();
    shapeMaker.drawSquare();

  }
}
