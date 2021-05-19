//  behavioral pattern
// Chain of Responsibility Pattern
// 创建了一个接受者对象的链.这种模式给与请求的类型,对请求的发送者和接收者进行解耦
// 通常每个接收者都包含了对另外一个接收者的引用。如果不能处理请求，就把相同请求传给下一个接收者
// e.g.1,js中的事件冒泡
// 优点：1，降低耦合度， 2，简化了对象 3，增强了给对象指派职责的灵活度
// 缺点： 1，不能保证请求一定被接收 2,系统性能受一定影响，代码调试不方便
// 代码核心： 1，抽象类AbstractLogger.java ，包含责任链中的方法nextLogger，设置下一个抽象类.AbstractLogger.
public class Demo {
  
  private static AbstractLogger getChainOfLoggers() {
    AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
    AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
    AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

    errorLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(consoleLogger);

    return errorLogger;
  }

  public static void main(String[] args ) {
    AbstractLogger loggerChain = getChainOfLoggers();
    loggerChain.logMessage(AbstractLogger.INFO, "this is a info");

    loggerChain.logMessage(AbstractLogger.DEBUG, "this is a debug");

    loggerChain.logMessage(AbstractLogger.ERROR, "this is a error");
  }
}
