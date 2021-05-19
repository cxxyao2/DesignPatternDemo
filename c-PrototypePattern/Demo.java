// 与通过对一个类进行实例化来构造新对象不同的是，原型模式是通过拷贝一个现有对象生成新对象的。
// Java浅拷贝实现 Cloneable，重写，深拷贝是通过实现 Serializable 读取二进制流。
// Java 中的Object clone（）方法
// 使用场合：资源优化场景，类初始化需要消耗较多资源，性能和安全高，new 需要繁多权限 ； 实际中很少单独出现，经常和工厂模式配套
// 关键点：shape接口--实现接口的不同类---保存到hashtable<id,shape>,请求时返回各个shape的克隆，还保存了不同类的接口实现
// bravo! 本例子实现浅拷贝,实现cloneable接口

public class Demo {
  public static void main(String[] args) {
    ShapeCache.loadCache();

    Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
    System.out.println("Shape: " + clonedShape1.getType());

    Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
    System.out.println("Shape: " + clonedShape2.getType());

    Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
    System.out.println("Shape: " + clonedShape3.getType());

    Shape clonedShape4 = (Shape) ShapeCache.getShape("4");
    System.out.println("Shape: " + clonedShape4.getType());

  }
}
