package j2ee_servicelocator;

public class Service1 implements Service {
  public void execute() {
    System.out.println("Execute service1");
  }

  @Override
  public String getName() {
    return "Service1";
  }

}
  

