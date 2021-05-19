public class NullCustomer extends AbstractorCustomer {

  @Override 
  public String getName() {
    return "Not Available in Customer Database";
  }

  @Override
  public boolean isNil() {
    return true;
  }
}
