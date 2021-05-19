// 实现了Order接口的实体命令类
public class BuyStock  implements Order{
  private Stock absStock;
  public BuyStock(Stock absStock) {
    this.absStock = absStock;
  }

  public void execute() {
    absStock.buy();
  }
}
