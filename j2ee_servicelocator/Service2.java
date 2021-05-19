package j2ee_servicelocator;

public class Service2 implements Service {
  public void execute() {
    System.out.println("Execute service2");
  }

  @Override
  public String getName() {
    return "Service2";
  }

}
  

