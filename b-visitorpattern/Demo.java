// behavorial pattern
// 对一个对象结构中的对象进行很多不同的操作，为了避免这些操作勿扰这些对象的类，
// 访问者模式将这些分装到类中
//  被访问的类提供给一个接待访问者的接口
// 访问者可以访问不同的类
//  优点：1，符合单一职责原则 2，灵活性，扩展性
// 缺点： 1，具体元素对访问者公布细节  2，具体元素变更比较困难
// e.g.需要定义新操作,
public class Demo {
  public static void main(String[] args) {
    ComputerPart computer = new Computer();
    computer.accept(new ComputerPartDisplayVisitor());

  }
}
