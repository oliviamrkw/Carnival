public class BallThrow extends GamesBooth {

  public BallThrow() {
    super(2.50, "bouncy ball", "plush squirrel");
  }

  @Override
  public String start(){ 
    int[] points = new int[3];

    for(int i = 0; i < 3; i++){ // adds three 10 balls, two 25 balls, one 50 ball
      int rand = (int) Math.floor(Math.random() * 6);

      if (rand <= 2){
        points[i] = 10;
      } else if (rand <= 4){
        points[i] = 25;
      } else {
        points[i] = 50;
      }
    }

    int sum = points[0] + points[1] + points[2]; 
    System.out.println("\nYou landed in: " + points[0] + ", " + points[1] + ", " + points[2] + "! That's " + sum + " points!");
    if (sum >= 70){
      return winLargePrize();
    } else if (sum >= 45){
      return winSmallPrize();
    } else {
      return winNoPrize();
    }
  }

  @Override
  public String getInstructions() {
    return "Cost: $2.50 || You will throw THREE balls into baskets that give you either 10, 25, or 50 points. 70+ points = LARGE prize, 45+ points = SMALL prize, anything else = NO prize!";
  }
}