//  behavioral pattern
// 通过调用者调用接受者执行命令： 调用者--命令--接受者
// invoker--command--received真正的命令执行对象
// 优点：1，降低系统耦合度 2，新命令容易添加
// 缺点：过多具体实现类
// e.g. 操作系统下的termainal窗口，可以执行很多命令
// 代码核心： 1, stock--broker--order(BuyStocker,SellStock)
// 2, 所有命令实现类都有public execute() 方法
public class Demo {
  
  public static void main(String[] args) {
    Stock absStock = new Stock();

    BuyStock buyStockOrder = new BuyStock(absStock);
    SellStock sellStockOrder = new SellStock(absStock);

    Broker broker = new Broker();
    broker.takeOrder(buyStockOrder);
    broker.takeOrder(sellStockOrder);
    
    broker.placeOrders();


  }
}
