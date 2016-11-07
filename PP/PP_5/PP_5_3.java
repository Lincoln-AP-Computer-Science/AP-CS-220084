import java.util.*;

public class PP_5_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, guess, guesses = 0, plays = 0;
        double avgGuesses = 0;
        int[] allGuesses = new int[0];
        char tryAgain = 'y';
        boolean correct = false;
        
        while (tryAgain == 'y') {
            num = (int) (Math.random() * 100);
            plays++;
            int[] temp = new int[plays];
            for (int i = 0; i < allGuesses.length; i++) {
                temp[i] = allGuesses[i];
            }
            temp[plays - 1] = 0;
            allGuesses = temp;
            
            while (!correct) {
                System.out.println("Guess a number 0 through 100:");
                guess = sc.nextInt();
                
                if (guess > num) {
                    System.out.println("Your guess is greater than my number.");
                } else if (guess < num) {
                    System.out.println("Your guess is less than my number.");
                } else {
                    System.out.println("You guessed my number!");
                    correct = true;
                    break;
                }
                guesses++;
            }
            
            System.out.println("You took " + guesses + " guesses to guess my number (" + num + ")");
            
            allGuesses[plays - 1] = guesses;
            guesses = 0;
            
            System.out.println("Try again? (y/n)");
            tryAgain = sc.next().charAt(0);
            
            correct = false;
        }
        
        int sum = 0;
        for (int i = 0; i < plays; i++) {
            sum += allGuesses[i];
        }
        
        avgGuesses = (double) sum / (double) plays;
        
        System.out.println("Average guesses per game: " + avgGuesses);
    }
}
