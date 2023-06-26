import java.util.ArrayList;

public class Player {
  
  private double spendingMoney;
  private ArrayList<String> prizesWon;

  public Player(double sm){
    spendingMoney = sm;
    prizesWon = new ArrayList<String>();
  }
  
  public void play(GamesBooth game) { //checks if player has enough money, then adds what game.start() returns to prizesWon
    double cost = game.getCost();
    if (this.spendingMoney >= cost){
      this.spendMoney(cost);
      String prizeWon = game.start();
      this.prizesWon.add(prizeWon);
    } else {
      System.out.println("\nYou don't have enough money to play this game!");
      if(this.spendingMoney < 1.5){
        GUI.outOfMoney();
      }
    }
  }

  public void spendMoney(double amt){
    spendingMoney -= amt;
  }

  public ArrayList<String> getPrizesWon() {
      return prizesWon;
    }

  public void addPrizeToList(String prize){
    this.prizesWon.add(prize);
  }

  public double getMoney(){
    return spendingMoney;
  }

  public String marblePlay(GamesBooth game) { //marbleGuess play, different because its start() method does not return a prize
    double cost = game.getCost();
    this.spendMoney(cost);
    return game.start();
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Money left: $ ").append(spendingMoney).append("\nPrizes won:\n");
    for (String prize : prizesWon) {
      if(!prize.equals("")){
        sb.append("- ").append(prize).append("\n");
      }
    }
    return sb.toString();
  }

  public String toStringBooth(GamesBooth game1, GamesBooth game2, GamesBooth game3, GamesBooth game4){
      StringBuilder sb = new StringBuilder();
      sb.append("Red or Black: ").append(game1.prizesAwarded()).append("\n");
      sb.append("Penny Toss: ").append(game2.prizesAwarded()).append("\n");
      sb.append("Ball Throw: ").append(game3.prizesAwarded()).append("\n");
      sb.append("Marble Guess: ").append(game4.prizesAwarded()).append("\n");
      return sb.toString();
  }
}