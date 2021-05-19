// behavorial Pattern
// 顺序访问集合对象的元素，不需要知道集合对象的底层表示
// 代码关键：定义接口 hasNext,next
// e.g.JAVA中的iterator.
// 优点：1，支持以不同方式遍历一个聚合对象 2，迭代器简化了聚合类
// 3,一个聚合类上有多个遍历 4，增加聚合类和迭代器都很方便，无需修改原代码
public class Demo {
  public static void main(String[] args) {
    NameRepository nameRepository = new NameRepository();

    for(Iterator iter = nameRepository.getIterator(); iter.hasNext();) {
      String name = (String) iter.next();
      System.out.println("Name: " + name);
    }
  }
}
