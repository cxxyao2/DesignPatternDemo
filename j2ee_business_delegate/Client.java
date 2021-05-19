package j2ee_business_delegate;

public class Client {
  BusinessDelegate  businessService;

  public Client(BusinessDelegate businessService) {
    this.businessService = businessService;
  }

  public void doTask() {
    businessService.doTask();
  }

}
