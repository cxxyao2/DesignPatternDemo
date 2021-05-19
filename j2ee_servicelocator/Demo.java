package j2ee_servicelocator;

// Service Locator Pattern 使用JNDI查询定位各种服务时，使用缓存技术。
// 再次请求同样服务时，服务定位器在缓存中寻找。从而提高应用程序性能
// ServiceLoator 使用Cache(缓存服务寻找结果)  和 context(创建服务)
public class Demo {
    
    public static void main(String[] args) {
      Service service = ServiceLocator.getService("Service1");
      service.execute();
      service = ServiceLocator.getService("Service2");
      service.execute();

      service = ServiceLocator.getService("Service1");
      service.execute();
      service = ServiceLocator.getService("Service2");
      service.execute();
      
    }
}
