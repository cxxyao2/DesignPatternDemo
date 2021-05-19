package j2ee_interceptingFilter;

public class Client {
  FilterManager filterManager;

  public void setFiltermanager( FilterManager filterManager) {
    this.filterManager = filterManager;
  }

  public void sendRequest(String request) {
    filterManager.filterRequest(request);
  }
}
