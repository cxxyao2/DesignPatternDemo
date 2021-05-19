// invoker class
public class Stock {
  private String name = "ABC";
  private int quantity = 10;

  public void buy() {
    System.out.println("Stock name " + name + " quantity is " + quantity + " buy");
  }

  public void sell() {
    System.out.println("Stock name " + name + " quantity is " + quantity + " sell");
  }
}
