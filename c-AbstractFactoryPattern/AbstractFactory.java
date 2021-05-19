// 抽象工厂类，为color和shape对象
public abstract class AbstractFactory{
  public abstract Color getColor(String color);
  public abstract Shape getShape(String shape);
}