// 优点：减少创建对象的数量，减少内存占用
// 缺点：提高了系统复杂度，需要分开外部状态与内部状态，外部状态不随内部状态变化而变化
// 实例：1，JAVA中的String,从字符串缓冲池中取 2,数据库的数据池
// e.g.用5个不同color的circle对象来画20个不同直径、不同位置的circle
// 技术点：1,使用功能 HashMap是存储不同颜色的circle,
//  2,cirlce的color不能变，但是x,y,radium通过公共属性方法可以改变
// fly weight轻量级, 运用共享技术有效支持大量细粒度对象
// 3,需要一个工厂类制造大量对象
public class Demo {

  private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

  public static void main(String[] args) {
    for (int i = 0; i < 20; i++) {
      Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
      circle.setX(getRandomX());
      circle.setY(getRandomY());
      circle.setRadius(100);
      circle.draw();

    }
  }

  private static String getRandomColor() {
    return colors[(int) (Math.random() * colors.length)];

  }

  private static int getRandomX() {
    return (int) (Math.random() * 100);

  }

  private static int getRandomY() {
    return (int) (Math.random() * 100);

  }
}
