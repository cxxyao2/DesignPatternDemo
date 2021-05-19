// 跟command pattern很像
// 但是没有broker这个命令集中管理和分发器
// 需要创建表示各种状态的对象和一个行为随着状态对象改变而改变的context对象
// command pattern 中接口通常只有一个方法 ，如execute，
// 状态模式接口有一个或者多个方法，一般会返回值，改变实例变量的值
// 优点：1，封装了转换规则 2，枚举可能的状态 3，所有与某个状态的行为都可以放到一个类中
// 4,方便增加新的状态 5,可以让多个环境变量共享一个状态变量，减少系统中对象的个数
public class Demo {
  
  public static void main(String[] args) {
    Context context= new Context();

    StartState startState = new StartState();
    startState.doAction(context);
    System.out.println(context.getState().toString());

    StopState stopState = new StopState();
    stopState.doAction(context);
    System.out.println(context.getState().toString());

  }
}
