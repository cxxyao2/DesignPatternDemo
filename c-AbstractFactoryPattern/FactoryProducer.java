// 通过颜色或者形状参数来获取工厂
// 工厂生成器
public class FactoryProducer {

  public static AbstractFactory getFactory(String choice){
    if(choice.equalsIgnoreCase("SHAPE")){
      return new ShapeFactory();
    } else if(choice.equalsIgnoreCase("COLOR")){
      return new ColorFactory();
  }
  return null; 
}

}
