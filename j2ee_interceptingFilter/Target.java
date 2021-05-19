package j2ee_interceptingFilter;

public class Target {
  public void execute(String request) {
    System.out.println("Exeucet request:" + request);
  }
}
