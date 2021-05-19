// 创建实现了shape接口的抽象装饰类
public abstract class ShapeDecorator implements Shape{
  protected Shape decoratedShape; //关键点！类作为实例变量

  public ShapeDecorator(Shape decoratedShape){
    this.decoratedShape = decoratedShape;
  }

  public void draw(){
    decoratedShape.draw();
  }
}