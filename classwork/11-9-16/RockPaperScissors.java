import java.util.*;

public class RockPaperScissors {
    public static final int ROCK = 0, PAPER = 1, SCISSORS = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RockPaperScissors rps = new RockPaperScissors();
        String in;
        
        System.out.println("Rock, Paper, or Scissors?");
        in = sc.next();
        
        switch (in.toLowerCase()) {
            case "rock": rps.win(rps.ROCK); break;
            case "paper": rps.win(rps.PAPER); break;
            case "scissors": rps.win(rps.SCISSORS); break;
            default: rps.win(rps.ROCK); break;
        }
    }
    
    public boolean win(int input) {
        int computer = (int) (Math.random() * 3);
        
        System.out.println("Computer: " + computer);
        
        switch (input) {
            case ROCK: if (computer == SCISSORS) return true; break;
            case PAPER: if (computer == ROCK) return true; break;
            case SCISSORS: if (computer == PAPER) return true; break;
        }
            
        return false;
    }
}
