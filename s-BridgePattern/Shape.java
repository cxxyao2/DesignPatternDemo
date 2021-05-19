// the Class Shape will use the interface DrawAPI

public abstract class Shape {
  protected DrawAPI drawAPI;

  protected Shape(DrawAPI drawAPI) {
    this.drawAPI = drawAPI;
  }

  public abstract void draw();

}
