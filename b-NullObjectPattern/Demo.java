// 一个空对象取代NULL对象实例的检查
// 反应一个不做任何动作的关系
// 这个NUll对象也可以在数据不可用的时候提供默认的行为
// 代码关键：1，一个指定要执行各种操作的抽象类 ,一个实体类 2，一个未实现任何操作的空对象类

public class Demo {
  public static void main(String[] args) {

    AbstractorCustomer customer1 = CustomerFactory.getCustomer("Rob");
    AbstractorCustomer customer2 = CustomerFactory.getCustomer("Bob");
    AbstractorCustomer customer3 = CustomerFactory.getCustomer("Julie");
    AbstractorCustomer customer4 = CustomerFactory.getCustomer("Laura");

    System.out.println("Customers");
    System.out.println(customer1.getName());
    System.out.println(customer2.getName());
    System.out.println(customer3.getName());
    System.out.println(customer4.getName());

  }
}
