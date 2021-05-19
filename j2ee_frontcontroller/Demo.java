package j2ee_frontcontroller;

// Front Controller Pattern 提供一个应用程序所有类型集中的请求处理机制。
// 应用程序可以是基于WEB的应用，也可以是基于桌面的应用
// 所有请求由一个单一程序处理。该程序做认证、授权或者跟踪，然后把请求转给调度器dispatcher，
// 调度器创建视图view对象

public class Demo {
  public static void main(String[] args) {
    FrontController frontController = new FrontController();
    frontController.dispatchRequests("HOME");
    frontController.dispatchRequests("STUDENT");
  }
}
