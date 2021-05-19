import java.util.HashMap;

public class ShapeFactory {
  // private 不能继承，final 不能修改存储的值, 但是HaspMap是指针类型，不是primitive类型，不重新new就可以了
  // final变量在定义时就要初始化
  private static final HashMap<String, Shape> circleMap = new HashMap<>();

  public static Shape getCircle(String color) {
    Circle circle = (Circle) circleMap.get(color);
    if (circle == null) {
      circle = new Circle(color);
      circleMap.put(color, circle);
      System.out.println("Creating circle of color " + color);
    }
    return circle;
  }

}
