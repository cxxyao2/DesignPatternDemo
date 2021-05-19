// 扩展抽象工厂类，基于给定信息创建实体类对象Shape
public class ShapeFactory extends AbstractFactory{
  @Override
  public Shape getShape(String shapeType){
    if(shapeType == null) {
      return null;
    }

    if(shapeType.equalsIgnoreCase("Rectangle")){
      return new Rectangle();
    }

     if(shapeType.equalsIgnoreCase("Square")){
      return new Square();
    }
    return null;
  }


  // 只实现抽象工厂的一个系列内容，其他系列可以为空null
  @Override
  public Color getColor(String color){
    return null;
  }

}
