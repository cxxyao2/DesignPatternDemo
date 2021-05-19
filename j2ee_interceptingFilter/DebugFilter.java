package j2ee_interceptingFilter;

public class DebugFilter implements Filter {
  public void execute(String request) {
    System.out.println("request log:" + request);
  }
}
