package j2ee_business_delegate;

public class EJBService implements  BusinessService {
  @Override
  public void doProcessing() {
    System.out.println("Processing EJB");
  }
}
