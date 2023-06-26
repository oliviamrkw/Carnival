import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI implements ActionListener {

  private Player player;

  public GUI(Player player) {
    this.player = player;
  }

  // Initial labels, buttons and panels
  private static JLabel welcomeLabel = new JLabel("Welcome to the Carnival!");
  private static JLabel chooseOptionsLabel = new JLabel("Choose one of the options:");
  private static JLabel whichGameLabel = new JLabel("Which game would you like to play?");
  private static JLabel instructionsLabel = new JLabel();
  private static JLabel prizesLabel = new JLabel("Here are the prizes you have won!");
  private static JLabel l6 = new JLabel();
  private static JLabel lookAtConsoleLabel = new JLabel("Look at the console!");
  private static JLabel l8 = new JLabel();
  private static JLabel marbleGuessLabel = new JLabel("Which cup will you guess?");
  private static JButton playGameButton = new JButton("Play a Game");
  private static JButton seePrizesButton = new JButton("See Prizes");
  private static JButton quitButton = new JButton("Quit");
  private static JPanel panel1 = new JPanel(); // play a game / see prizes
  private static JPanel panel2 = new JPanel(); // games
  private static JPanel panel3 = new JPanel(); // back button
  private static JPanel panel4 = new JPanel(); // empty
  private static JPanel panel5 = new JPanel(); // redOrBlack play
  private static JPanel panel6 = new JPanel(); // pennyToss play
  private static JPanel panel7 = new JPanel(); // ballThrow play button
  private static JPanel panel8 = new JPanel(); // marbleGuess play button
  private static JPanel panel9 = new JPanel(); // marbleGuess buttons

  private static JFrame frame = new JFrame("Carnival Game");

  // Game buttons
  private static JButton redOrBlackStartButton = new JButton("Red or Black");
  private static JButton pennyTossStartButton = new JButton("Penny Throw");
  private static JButton ballThrowStartButton = new JButton("Ball Throw");
  private static JButton marbleGuessStartButton = new JButton("Marble Guess");
  private static JButton redOrBlackPlayButton = new JButton("Play");
  private static JButton pennyTossPlayButton = new JButton("Play");
  private static JButton ballThrowPlayButton = new JButton("Play");
  private static JButton marbleGuessPlayButton = new JButton("Play");
  private static JButton quitButton2 = new JButton("Quit");
  private static JButton backButton = new JButton("Go Back");

  //Marble guess buttons
  private static JButton marbleGuessButton1 = new JButton("Guess cup 1");
  private static JButton marbleGuessButton2 = new JButton("Guess cup 2");
  private static JButton marbleGuessButton3 = new JButton("Guess cup 3");

  private GamesBooth game1 = new RedOrBlack();
  private GamesBooth game2 = new PennyToss();
  private GamesBooth game3 = new BallThrow();
  private GamesBooth game4 = new MarbleGuess();

  public static void createAndShowGUI(Player player) {
    GUI gui = new GUI(player);

    frame.setSize(550, 360);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
    panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
    panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
    panel9.setLayout(new BoxLayout(panel9, BoxLayout.X_AXIS));

    Rectangle r = frame.getBounds();

    welcomeLabel.setBounds(r.x + 100, r.y + 50, r.width - 200, r.height - 300);
    chooseOptionsLabel.setBounds(r.x + 100, r.y + 100, r.width - 100, r.height - 300);
    whichGameLabel.setBounds(r.x + 100, r.y + 100, r.width - 100, r.height - 300);
    instructionsLabel.setBounds(r.x, r.y, r.width, r.height - 50);
    prizesLabel.setBounds(r.x + 100, r.y + 25, r.width - 100, r.height - 300);
    l6.setBounds(r.x + 50, r.y - 20, r.width - 100, r.height);
    lookAtConsoleLabel.setBounds(r.x + 50, r.y + 50, r.width - 100, r.height - 200);
    l8.setBounds(r.x + 150, r.y + 50, r.width - 100, r.height - 200);
    marbleGuessLabel.setBounds(r.x + 100, r.y + 25, r.width - 100, r.height - 300);
    panel1.setBounds(r.x + 300, r.y + 100, r.width - 100, r.height - 300);
    panel2.setBounds(r.x + 100, r.y + 20, r.width - 200, r.height - 400);
    panel3.setBounds(r.x + 100, r.y + 300, r.width - 400, r.height - 340);
    panel4.setBounds(r.x + 100, r.y + 300, r.width - 400, r.height - 340);
    panel5.setBounds(r.x + 100, r.y + 300, r.width - 400, r.height - 340);
    panel9.setBounds(r.x + 100, r.y + 20, r.width - 200, r.height - 400);

    //adding everything to screen
    panel1.add(playGameButton);
    panel1.add(seePrizesButton);
    panel1.add(quitButton);
    panel3.add(backButton);
    panel5.add(redOrBlackPlayButton);
    panel5.add(pennyTossPlayButton);
    panel5.add(ballThrowPlayButton);
    panel5.add(marbleGuessPlayButton);
    redOrBlackPlayButton.setVisible(false);
    pennyTossPlayButton.setVisible(false);
    ballThrowPlayButton.setVisible(false);
    marbleGuessPlayButton.setVisible(false);
    frame.add(welcomeLabel);
    frame.add(chooseOptionsLabel);
    frame.add(whichGameLabel);
    whichGameLabel.setVisible(false);
    frame.add(instructionsLabel);
    instructionsLabel.setVisible(false);
    frame.add(prizesLabel);
    prizesLabel.setVisible(false);
    frame.add(l6);
    l6.setVisible(false);
    frame.add(lookAtConsoleLabel);
    lookAtConsoleLabel.setVisible(false);
    frame.add(l8);
    l8.setVisible(false);
    frame.add(marbleGuessLabel);
    marbleGuessLabel.setVisible(false);
    frame.add(panel1, BorderLayout.CENTER);
    frame.add(panel3, BorderLayout.PAGE_END);
    panel3.setVisible(false);
    panel5.setVisible(false);
    frame.setVisible(true);

    //making sure buttons can be clicked
    playGameButton.addActionListener(gui);
    seePrizesButton.addActionListener(gui);
    quitButton.addActionListener(gui);
    backButton.addActionListener(gui);
    redOrBlackStartButton.addActionListener(gui);
    pennyTossStartButton.addActionListener(gui);
    ballThrowStartButton.addActionListener(gui);
    marbleGuessStartButton.addActionListener(gui);
    redOrBlackPlayButton.addActionListener(gui);
    pennyTossPlayButton.addActionListener(gui);
    ballThrowPlayButton.addActionListener(gui);
    marbleGuessPlayButton.addActionListener(gui);
    quitButton2.addActionListener(gui);
    marbleGuessButton1.addActionListener(gui);
    marbleGuessButton2.addActionListener(gui);
    marbleGuessButton3.addActionListener(gui);
  }

  //actions for each button
  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == playGameButton) {
      hideComponents();
      gameGUI();
    } else if (e.getSource() == seePrizesButton) {
      hideComponents();
      seePrizes();
    } else if (e.getSource() == quitButton || e.getSource() == quitButton2) { // quit
      System.exit(0);
    } else if (e.getSource() == backButton) { // go back
      back();
    } else if (e.getSource() == redOrBlackStartButton || e.getSource() == pennyTossStartButton || e.getSource() == ballThrowStartButton || e.getSource() == marbleGuessStartButton) { // play a specific game
      hideComponents();
      if (e.getSource() == redOrBlackStartButton) {
        redOrBlackPlayButton.setVisible(true);
        gameStart(game1);
      } else if (e.getSource() == pennyTossStartButton) {
        pennyTossPlayButton.setVisible(true);
        gameStart(game2);
      } else if (e.getSource() == ballThrowStartButton) {
        ballThrowPlayButton.setVisible(true);
        gameStart(game3);
      } else if (e.getSource() == marbleGuessStartButton) {
        if (player.getMoney() >= game4.getCost()){ //code from player class here, because otherwise the game will run without checking the player's funds
          marbleGuessPlayButton.setVisible(true);
          gameStart(game4);
        } else {
          System.out.println("\nYou don't have enough money to play this game!");
          lookAtConsoleLabel.setVisible(true);
          panel3.setVisible(true);
          if(player.getMoney() < 1.5){
            GUI.outOfMoney();
          }
        }
      }
      
    }
    if (e.getSource() == redOrBlackPlayButton) {
      redOrBlackPlayButton.setVisible(false);
      hideComponents();
      player.play(game1);
      gameFinish();
    } else if (e.getSource() == pennyTossPlayButton) {
      pennyTossPlayButton.setVisible(false);
      hideComponents();
      player.play(game2);
      gameFinish();
    } else if (e.getSource() == ballThrowPlayButton) {
      ballThrowPlayButton.setVisible(false);
      hideComponents();
      player.play(game3);
      gameFinish();
    } else if (e.getSource() == marbleGuessPlayButton) {
      marbleGuessPlayButton.setVisible(false);
      hideComponents();
      panel9.add(marbleGuessButton1);
      panel9.add(marbleGuessButton2);
      panel9.add(marbleGuessButton3);
      marbleGuessLabel.setVisible(true);
      panel9.setVisible(true);
      frame.add(panel9);
    }
    //marbleGuess
    if (e.getSource() == marbleGuessButton1 || e.getSource() == marbleGuessButton2 || e.getSource() == marbleGuessButton3) {
      String correctCup = player.marblePlay(game4);
      int guessedCup = 0;
    
      if (e.getSource() == marbleGuessButton1) {
        guessedCup = 1;
      } else if (e.getSource() == marbleGuessButton2) {
        guessedCup = 2;
      } else if (e.getSource() == marbleGuessButton3) {
        guessedCup = 3;
      }
    
      if (correctCup.equals(String.valueOf(guessedCup))) {
        System.out.println("\nIt was in cup " + correctCup + ", you guessed correctly!");
        game4.winLargePrize();
        player.addPrizeToList(game4.getLargePrize());
      } else {
        System.out.println("\nNope, it was in cup " + correctCup + "!");
        game4.winSmallPrize();
        player.addPrizeToList(game4.getSmallPrize());
      }
    
      hideComponents();
      gameFinish();
    }

  }

  public void hideComponents() {
    Container contentPane = frame.getContentPane();

    Component[] components = contentPane.getComponents();
    for (Component component : components) {
      component.setVisible(false);
    }
    frame.revalidate();
  }

  public void mainWindow() {
    welcomeLabel.setVisible(true);
    chooseOptionsLabel.setVisible(true);
    panel1.setVisible(true);
    frame.revalidate();
  }

  public void back() {
    hideComponents();
    mainWindow();
  }

  public void gameStart(GamesBooth game) {
    instructionsLabel.setText("<html>"+ game.getInstructions() +"</html>");
    instructionsLabel.setVisible(true);
    frame.add(panel5, BorderLayout.PAGE_END);
    panel5.setVisible(true);
    frame.revalidate();
  }
  
  public void gameFinish() {
    instructionsLabel.setVisible(false);
    lookAtConsoleLabel.setVisible(true);
    panel3.setVisible(true);
    frame.revalidate();
  }

  public void gameGUI() {
    panel2.add(redOrBlackStartButton);
    panel2.add(pennyTossStartButton);
    panel2.add(ballThrowStartButton);
    panel2.add(marbleGuessStartButton);
    panel2.add(quitButton2);
    panel2.setVisible(true);
    frame.add(panel4, BorderLayout.PAGE_START);
    panel2.add(panel4, BorderLayout.PAGE_END);
    whichGameLabel.setVisible(true);
    panel3.setVisible(true);
    frame.revalidate();

    panel4.setPreferredSize(new Dimension(50, 300));
    panel2.add(panel4);

    frame.add(panel2, BorderLayout.PAGE_END);
    frame.revalidate();
  }
  
  public static void outOfMoney(){
    playGameButton.setVisible(false);
  }

  public void seePrizes() {
    prizesLabel.setVisible(true);
    l6.setVisible(true);
    l8.setVisible(true);
    l6.setText("<html><pre>" + player.toString() + "</pre></html>");
    l8.setText("<html><pre>" + player.toStringBooth(game1, game2, game3, game4) + "</pre></html>");
    l6.setHorizontalAlignment(SwingConstants.LEFT);
    l8.setVerticalAlignment(SwingConstants.CENTER);
    l8.setHorizontalAlignment(SwingConstants.CENTER);
    panel3.setVisible(true);
    frame.revalidate();
  }

}