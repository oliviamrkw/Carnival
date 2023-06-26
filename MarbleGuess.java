public class MarbleGuess extends GamesBooth {

  public MarbleGuess() {
    super(3.0, "marble", "plush groundhog");
  }

  @Override
  public String start(){
    int rand = (int) Math.floor(Math.random() * 3);
    
    if(rand == 0){ //returns cup number, game code is in GUI class because the buttons' actionListeners are needed
      return "1";
    } else if (rand == 1){
      return "2";
    } else if (rand == 2){
      return "3";
    }
    return "";
  }
  

  @Override
  public String getInstructions() {
    return "Cost: $3.00 || There will be THREE cups, ONE of them has a marble under it. Guess correctly and you win a LARGE prize. Anything else and you win a SMALL prize!";
  }

}