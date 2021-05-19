package j2ee_business_delegate;

// 主要目的： 表示层和业务层解耦
// 减少通讯或者表示层代码中的业务层代码的远程查询功能
// 主要是实现
//  1 client : doTask()
//  2 Business Delegate : doTask() --> 3调用LookUp service的getBusinessServie（）来获得BusinessServe实体类
//  4, 实际执行的是BusinessService.doProcessing() 
//   3中解耦。 可以输入不同参数获得不同的BusinessService。

// 怎么使用java Demo ? :因为使用了package  j2ee_business_delegate.
// 需要 回到上一级目录，然后运行 java j2ee_business_delegate/Demo
public class Demo {
  public static void main(String[] args) {
    BusinessDelegate businessDelegate = new BusinessDelegate();
    businessDelegate.setServiceType("EJB");

    Client client = new Client(businessDelegate);
    client.doTask();

    businessDelegate.setServiceType("JMS");
    client.doTask();



  }
}
