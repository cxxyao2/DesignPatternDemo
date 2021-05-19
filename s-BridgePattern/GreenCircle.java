public class GreenCircle implements DrawAPI {
  @Override
  public void drawCircle(int radius, int x, int y) {
    System.out.println("Draw GreenCircle [ " + radius + "  x is " + x + " + y is  " + y + " ]");
  }
}
