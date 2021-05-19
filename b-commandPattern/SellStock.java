public class SellStock  implements Order{
  private Stock absStock;
  public SellStock(Stock absStock) {
    this.absStock = absStock;
  }

  public void execute() {
    absStock.sell();
  }
}
