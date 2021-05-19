// 基于给定信息的实体类对象
// creational pattern
// 1,接口
// 2,实现接口的多个类
// 3,工厂类，通过传递参数，返回不同类实例
// 4,调用工厂类
// 优点：调用者只关心产品接口/想创建一个对象,只要知道其名称
// 缺点：1，增加产品，要增加具体类,扩展实现工厂，增加了系统具体类的依赖，增加了系统更复杂性
// 简单对象，就直接new了。
// 具体例子：1，日志记录到本地硬盘、系统事件、远程服务器等 2，数据库访问,数据库有变化时 
// 3,如链接服务器的是是三个协议,POP3,IMAP,HTTP，可以用一个接口实现POP3 IMAP HTTP


public class ShapeFactory{

  // 使用getShape方法,获取形状类型的对象
  public Shape getShape(String shapeType){
    if(shapeType == null) {
      return null;
    }
    if(shapeType.equalsIgnoreCase("CIRCLE")){
      return new Circle();
    } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
      return new Rectangle();}
      if(shapeType.equalsIgnoreCase("SQUARE")){
      return new Square();
  }
  return null;
}
}