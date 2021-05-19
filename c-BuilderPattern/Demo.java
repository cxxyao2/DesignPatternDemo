// 一个复杂对象，部件会经常变化，将他们组合在一起的算法却相对稳定
// e.g.肯德基的套餐，通过汉堡、可乐、薯条、鸡翅等产品进行组合
// e.g.JAVA中的StringBuilder
// 使用场景：1，对象内部构造复杂 2，对象的内部属性相互依赖
// 优点：1，建造者独立，容易扩展  2，便于控制细节
// 缺点：1，产品必须有共同点 2，如内部复杂，会有很多Builer类
// 与工厂模式的差别是：建造者更关注与零件装配的顺序
// steps. 
// interface: Packing, Item(-->Packing)
// class: Wrapper, Bottle --->Packing
// abstract class: Burger--->Item
// abstract class: ColdDrink-->Item
// 分别实现Burger,ColdDrink
// Meat 增加条目item
// MeatBuilder类中有不同方法， 通过不同item（Burger, ColdDrink)的组合，实现不同种类的Meat
// 从以上步骤来看，BuilderPattern相对复杂
public class Demo {
  public static void main(String[] args){
    MealBuilder mealBuilder = new MealBuilder();

    Meal vegMeal = mealBuilder.prepareVegMeal();
    System.out.println("Veg meal");
    vegMeal.showItems();
    System.out.println("Total Cost:" + vegMeal.getCost());


    Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
    System.out.println("\n\n Non-Veg meal");
    nonVegMeal.showItems();
    System.out.println("Total Cost:" + nonVegMeal.getCost());




  }
}