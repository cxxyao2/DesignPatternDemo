package j2ee_business_delegate;

// 服务具体实现
public class JMSService implements  BusinessService {
  @Override
  public void doProcessing() {
    System.out.println("Processing JMS");
  }
}
