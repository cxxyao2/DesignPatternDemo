public class OctalObserver extends Observer {

  public OctalObserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);

  }
  
  @Override
  public void update() {
    System.out.println(" is " + Integer.toOctalString(subject.getState()));
  }
}
