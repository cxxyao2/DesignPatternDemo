// 扩展抽象工厂类，基于给定信息创建实体类对象Color
public class ColorFactory extends AbstractFactory {
  @Override
  public Shape getShape(String shapeType) {
    return null;
  }

  @Override
  public Color getColor(String color){
    if(color == null ){
      return null;
    }

    if(color.equalsIgnoreCase("RED")){
      return new Red();
    } else {
      return new Green();
    } 

  }
}

