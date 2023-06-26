import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double money = getValidInput("How much money do you have?: $");

    System.out.println("Look at the screen!");
    Player user = new Player(money);
    GUI.createAndShowGUI(user);
  }

  private static double getValidInput(String m) { //makes sure user inputs a double, reprompts if not
    Scanner sc = new Scanner(System.in);
    double money = 0;
    boolean validInput = false;

    while (!validInput) {
      System.out.print(m);

      if (sc.hasNextDouble()) {
        money = sc.nextDouble();
        validInput = true;
      } else {
        System.out.println("Please enter a valid number.");
        sc.next();
      }
    }
    
    return money;
  }
}
