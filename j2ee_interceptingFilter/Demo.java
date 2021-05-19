package j2ee_interceptingFilter;
// 拦截，过滤器模式
// 对应用程序的请求或者响应做一些预处理/后处理。定义过滤器，并在把请求传给实际目标应用程序之前应用在请求上
// 过滤器做认证，授权，记录日志，或者跟踪请求，然后把请求传给响应的处理程序
// 1 client--2 filter manager--3 filter chain --4 filter --5 target

public class Demo {
  public static void main(String[] args) {
    FilterManager filterManager = new FilterManager(new Target());
    filterManager.setFilter(new AuthenticationFilter());
    filterManager.setFilter(new DebugFilter());

    Client client = new Client();
    client.setFiltermanager(filterManager);
    client.sendRequest("HOME");
  }
}
