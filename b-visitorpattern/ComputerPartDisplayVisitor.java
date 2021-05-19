public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
  @Override
  public void visit(Monitor monitor) {
    System.out.println("visiting monitor");
  }
  @Override
  public void visit(Keyboard keyboard) {
    System.out.println("visiting keyboard");
  }

  @Override
  public void visit(Computer computer) {
    System.out.println("visiting computer");
  }
}

