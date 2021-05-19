// 代码核心：1，一个strategy接口和实体策略类 2，一个context,使用策略类
// context在它配置或者使用的策略改变时的行为变化
// 优点：灵活，扩展方便
//  跟状态模式成对比，不是状态控制类state.doAction(context)，而是类使用策略context.executeStrategy
// 策略类都要向外暴露，就是公共类
public class Demo {
  public static void main(String[] args) {
    Context context = new Context(new OperationAdd());
    System.out.println("10 + 5 " + context.executeStrategy(10,5));


     context = new Context(new OperationSubtract());
    System.out.println("10 - 5 " + context.executeStrategy(10,5));

     context = new Context(new OperationMultiply());
    System.out.println("10 * 5 " + context.executeStrategy(10,5));



  }
}
