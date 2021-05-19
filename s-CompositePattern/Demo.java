// 把一组相似对象作为一个单一对象处理，树形结构来组合对象，来表示部分和整体
// 解决问题：客户程序可以像处理简单元素一样来处理复杂元素，从而使客户程序与复杂元素的内部结构解耦
// 关键：1，树枝和叶子实现统一接口 2，内部属性List，放Component
// e.g. 1,算数表达式的操作符与操作数，操作符也可以是操作数与操作符组成 2，JAVA的AWT 和SWING中,
// e.g. 3，树形菜单和文件夹等。
// Button, Checkbox是树叶,Container是树枝 
// 优点：1，高层模块调用简单2，节点自由增加
// 缺点：组合模式中，叶子和树枝都是实现类，而不是接口，违反了依赖倒置原则
public class Demo {
  public static void main(String[] args) {
    Employee CEO = new Employee("John", "CEO", 20000);

    Employee saleHead = new Employee("Sally", "saleHead", 10000);
    Employee techHead = new Employee("Marie", "techHead", 10000);

    Employee salesman1 = new Employee("sally1-1", "salesman", 5000);
    Employee salesman2 = new Employee("sally1-2", "salesman", 5000);

    Employee technician1 = new Employee("Marie2-1", "technician", 2000);
    Employee technician2 = new Employee("Marie2-2", "technician", 2000);

    CEO.add(saleHead);
    CEO.add(techHead);

    saleHead.add(salesman1);
    saleHead.add(salesman2);

    techHead.add(technician1);
    techHead.add(technician2);

    // print emloyes
    System.out.println(CEO);
    recursion1(CEO);
    /* System.out.println(CEO);
    for (Employee headE : CEO.getSubordinates()) {
      System.out.println(headE);
      for (Employee employee : headE.getSubordinates()) {
        System.out.println(employee);
      }
    } */

  }

  // 改成递归模式
  public static void recursion1(Employee em) {
    
    if(em.getSubordinates() == null) {
      System.out.println(em);
      return ;
    }
    for(Employee sub : em.getSubordinates() ) {
      System.out.println(sub);
      recursion1(sub);
    }
   
  }
}
