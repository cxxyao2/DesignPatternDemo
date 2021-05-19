package je22_compositeEntity;
// Composite Entity Pattern
// 用在EJB持久机制中. 一个组合实体更新时，其内部依赖对象beans会自动更新，
// 因为是被EJB实体BEAN管理的。下面是参与对象
// 组合实体  Composite Entity：主要实体bean，包含一个粗粒度或者自己就是粗粒度
// 粗粒度对象 coarse-grained object： 包含依赖对象，
// 依赖对象 dependent object ：持续生命周期依赖于粗粒度对象
// 策略 strategies - 表示如何实现组合实体

public class Demo {
  public static void main(String[] args) {
    Client client = new Client();
    client.setData("Test", "Data");
    client.printData();
    client.setData("Second test","Data1");
    client.printData();
  }
}
