// 需要保存状态的类，触发器
public class Originator {
  private String state;

  public void setState(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public Memento saveStateToMemento() {
    return new Memento(state);
  }

  public void getStateFromMemento(Memento memento) {
    state = memento.getState();
  }


}