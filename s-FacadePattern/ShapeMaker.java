// 多个类是它的私有成员
// 对外呈现统一接口
public class ShapeMaker {
  private Shape circle;
  private Shape rectangle;
  private Shape square;

  public ShapeMaker() {
    circle = new Circle();
    rectangle = new Rectangle();
    square = new Square();

  }

  public void drawCircle() {
    circle.draw();
  }

  public void drawRectangle() {
    rectangle.draw();
  }

  public void drawSquare() {
    square.draw();
  }

}
