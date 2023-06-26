public class RedOrBlack extends GamesBooth {

  public RedOrBlack() {
    super(1.5, "keychain", "plush fish");
  }

  @Override
  public String start() {
    String[] tokens = new String[3];
    for (int i = 0; i < 3; i++) {
      int rand = (int) Math.floor(Math.random() * 2);
      if (rand == 0) {
        tokens[i] = "red";
      } else {
        tokens[i] = "black";
      }
    }
    System.out.println("\nYou rolled: " + tokens[0] + ", " + tokens[1] + ", " + tokens[2]);
    if(tokens[0].equals(tokens[1]) && tokens[0].equals(tokens[2])){
      return winLargePrize();
    }
    return winSmallPrize();
  }

  @Override
  public String getInstructions() {
    return "Cost: $1.50 || You will draw THREE tokens, each one being either red or black. If ALL THREE are the same, you will win a LARGE prize! Any other combination, and you will win a SMALL prize!";
  }

}