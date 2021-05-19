package j2ee_frontcontroller;

// 用户认证，授权，调用分发器--》调用具体视图
public class FrontController {
  
  private Dispatcher dispatcher;

  public FrontController() {
    dispatcher = new Dispatcher();
  }

  private boolean isAuthenticUser() {
    System.out.println("User is authentic");
    return true;
  }

  private void trackRequest(String request) {
    System.out.println("page requested:" + request);
  }

  public void dispatchRequests(String request) {
    // record a request
    trackRequest(request);
    if(isAuthenticUser()) {
      dispatcher.dispatch(request);
    }
  }

}
