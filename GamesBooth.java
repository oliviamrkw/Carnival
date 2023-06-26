import java.util.Scanner;

public abstract class GamesBooth {

  private double cost;
  private String smallPrize;
  private String largePrize;
  private int amtSmallPrize;
  private int amtLargePrize;

  public GamesBooth(double c, String sp, String lp) {
    cost = c;
    smallPrize = sp;
    largePrize = lp;
  }

  public abstract String start(); //abstract method because each game has a different start() method

  public abstract String getInstructions();

  public double getCost() {
    return cost;
  }

  public String getSmallPrize() {
    return smallPrize;
  }

  public String getLargePrize() {
    return largePrize;
  }

  public String winSmallPrize() {
    amtSmallPrize++;
    System.out.println("\t<< You won a " + smallPrize + "! >>");
    return smallPrize;
  }

  public String winLargePrize() {
    amtLargePrize++;
    System.out.println("\t<< You won a " + largePrize + "! >>");
    return largePrize;
  }

  public String winNoPrize() {
    System.out.println("\t<< You didn't win anything. Better luck next time! >>");
    return "";
  }

  public String prizesAwarded() {
    String smallPrizeOutput = " small prizes";
    if (amtSmallPrize == 1) {
      smallPrizeOutput = " small prize";
    }
    String largePrizeOutput = " large prizes";
    if (amtLargePrize == 1) {
      largePrizeOutput = " large prize";
    }
    return amtSmallPrize + smallPrizeOutput + ", " + amtLargePrize + largePrizeOutput;
  }
}