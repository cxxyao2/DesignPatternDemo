public class RealCustomer extends AbstractorCustomer {

  public RealCustomer(String name) {
    this.name = name;
  }
  
  @Override 
  public String getName() {
    return name;
  }

  @Override
  public boolean isNil() {
    return false;
  }
}
