// behavorial Pattern
// 提供了评估语言的语法或者表达式的方式
// 用在SQL解析、符号处理引擎等
// 优点：1，扩张性好 2，容易实现简单文法
// 缺点：1，递归调用 2，复杂文法难于维护 3，解释器模式容易引起类膨胀
// e.g.把一个需要解释执行的句子表示为一个抽象语法树 ,一些重复出现的问题可以用一种简答
// 重点：1，Expression接口， OrExpression\AndExpression两个具体实现类来组合表达式
// 2,主要解释器TerminalExpression
public class Demo {
  
  // rule : Robert and John are boys
  public static Expression getMaleExpression() {
    Expression robert = new TerminalExpression("Robert");
    Expression john = new TerminalExpression("John");
    return new OrExpression(robert, john);

  }

  // rule : Julie is a married woman
  public static Expression getMarriedWomanExpression() {
    Expression julie = new TerminalExpression("Julie");
    Expression married = new TerminalExpression("Married");
    return new AndExpression(julie, married);
  }

  public static void main(String[] args) {
    Expression isMale = getMaleExpression();
    Expression isMarriedWoman = getMarriedWomanExpression();

    System.out.println("John is male?" + isMale.interpret("John"));

    System.out.println("Julie is married?" + isMarriedWoman.interpret("Married Julie"));
  }


}
