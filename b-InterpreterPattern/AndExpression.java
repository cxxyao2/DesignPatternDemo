public class AndExpression implements Expression {
  
  private Expression expr1 = null;
  private Expression expr2 = null;

  public AndExpression(Expression exp1, Expression exp2 ){
    this.expr1 = exp1;
    this.expr2 = exp2;
  }

  @Override
  public boolean interpret(String context) {
    return expr1.interpret(context) && expr2.interpret(context);
  }
}
