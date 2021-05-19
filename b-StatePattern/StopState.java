public class StopState implements State {

  public void doAction(Context context) {
    System.out.println("player is in Stop state ");
    context.setState(this);
  }

  public String toString() {
    return "Stop State";
  }
}
