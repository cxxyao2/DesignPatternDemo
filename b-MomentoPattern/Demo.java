// 目的：保存状态，提供一个可以恢复状态的机制
// 使用场景：1，windows中的ctrl+z  2, 数据库的事务管理
// 实现： 1，增加一个备忘录管理类，通过ID可以取得某个点的状态,用ArrayList
// 2,可以与Prototype Pattern想结合
public class Demo{
  public static void main(String[] args){
    Originator originator = new Originator();
    CareTaker careTaker = new CareTaker();
    originator.setState("State #1");
    originator.setState("State #2");
    careTaker.add(originator.saveStateToMemento()); //保存一个状态实例
      originator.setState("State #3");
    careTaker.add(originator.saveStateToMemento()); //保存一个状态实例
      originator.setState("State #4");
    careTaker.add(originator.saveStateToMemento()); //保存一个状态实例


    System.out.println("Current State:" + originator.getState());
    originator.getStateFromMemento(careTaker.get(0));

  System.out.println("Current State:" + originator.getState());

  }
}
