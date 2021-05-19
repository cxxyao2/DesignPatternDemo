public class Cricket extends Game {
  @Override
  void endPlay() {
   System.out.println("Cricket  end..");
  }
  @Override
  void initialize(){
    System.out.println("Cricket  initialize..");
  }

  @Override
  void startPlay(){
    System.out.println("Cricket  start..");
  }


}
