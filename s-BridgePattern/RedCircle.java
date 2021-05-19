public class RedCircle implements DrawAPI {
  @Override
  public void drawCircle(int radius, int x, int y) {
    System.out.println("Draw RedCircle [ " + radius + "  x is " + x + " + y is  " + y + " ]");
  }
}
