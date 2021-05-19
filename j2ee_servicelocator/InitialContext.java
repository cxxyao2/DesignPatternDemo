package j2ee_servicelocator;

public class InitialContext {
  public Object lookup(String jndiName) {
    if(jndiName.equalsIgnoreCase("SERVICE1")) {
      System.out.println("Looking up and creating a new Service service1");
      return new Service1();
    } else if(jndiName.equalsIgnoreCase("SERVICE2")) {
      System.out.println("Looking up and creating a new Service service2");
      return new Service2();
    } 
    return null;
   }
}
