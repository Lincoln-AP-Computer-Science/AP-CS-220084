import java.util.*;

public class RockPaperScissors {
    public static final int ROCK = 0, PAPER = 1, SCISSORS = 2;
    public static final String[] OPTIONS = {"rock", "paper", "scissors"};

    public static void main(String[] args) {
        RockPaperScissors rps = new RockPaperScissors();
        rps.run();
    }
    
    public void run() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Rock, Paper, or Scissors? (Type quit or exit to end the game)");
        String input = sc.next().toLowerCase();
        
        for (int i = 0; i < OPTIONS.length; i++) {
            if (input.equals(OPTIONS[i])) {
                play(i);
            }
        }
         
        if (input.equals("quit") || input.equals("exit")) {
            System.out.println("Ended.");
            return;
        }
        
        System.out.println("Invalid input.");
        run();
    }
    
    public void play(int input) {
        int computer = (int) (Math.random() * 3);
        boolean playerWin = false;
        
        System.out.println("Player: " + OPTIONS[input]);
        System.out.println("Computer: " + OPTIONS[computer]);
        
        if (input == computer) {
            System.out.println("It's a tie!");
            run();
            return;
        }
        
        if (input == ROCK) {
            if (computer == PAPER) {
                playerWin = false;
            } else if (computer == SCISSORS) {
                playerWin = true;
            }
        } else if (input == PAPER) {
            if (computer == ROCK) {
                playerWin = true;
            } else if (computer == SCISSORS) {
                playerWin = false;
            }
        } else if (input == SCISSORS) {
            if (computer == ROCK) {
                playerWin = false; 
            } else if (computer == PAPER) {
                playerWin = true;
            }
        }
        
        if (playerWin) {
            System.out.println("The player wins!");
        } else {
            System.out.println("The computer wins!");            
        }
            
        run();
    }
}
