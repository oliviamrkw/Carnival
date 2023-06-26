public class PennyToss extends GamesBooth {

  public PennyToss() {
    super(3.0, "poster", "plush tiger");
  }

  @Override
  public String start(){
    String [][] board = {{"poster", "poster", "plush tiger", ""}, {"", "plush tiger", "poster", "poster"}, {"poster", "", "poster", ""}, {"poster", "poster", "", "plush tiger"}}; //changed the board to make it easier to win
    String[] squaresLandedOn = new String[3];
    int penniesOnBoard = 0;

    outerLoop:
    while (penniesOnBoard < squaresLandedOn.length){
      for(int i = 0; i < board.length; i++){ // random number from 0-15 (1/16 chance), cycles through the board via a 2d array, if the random number is 0, it places a penny on that space
        for (int j = 0; j < board[0].length; j++) {
          int rand = (int) Math.floor(Math.random() * 16);
          if (rand == 0) { 
            if (!board[i][j].equals("")){
              squaresLandedOn[penniesOnBoard] = board[i][j];
            } else {
              squaresLandedOn[penniesOnBoard] = "empty";
            }
            penniesOnBoard++;
            if (penniesOnBoard >= squaresLandedOn.length) {
              break outerLoop;
            }
          } 
        }
      }
    }

      System.out.println("\nYou landed on " + squaresLandedOn[0] + ", " + squaresLandedOn[1] + ", " + squaresLandedOn[2] + ".");

    if(squaresLandedOn[0].equals(squaresLandedOn[1]) && squaresLandedOn[0].equals(squaresLandedOn[2])){
      if(squaresLandedOn[0].equals("poster")){
        return winSmallPrize();
      } else if(squaresLandedOn[0].equals("plush tiger")){
        return winLargePrize();
      }
    }
    return winNoPrize();
  }

  @Override
  public String getInstructions() {
    return "Cost: $3.00 || You will toss THREE pennies on a 4x4 board. Some squares say 'poster', some say 'plush tiger' and some are empty. If the pennies cover three of the poster squares, you will win a SMALL prize. If they cover three plush tiger squares, you will win a LARGE prize. Anything else, and you won't win a prize!";
  }

}