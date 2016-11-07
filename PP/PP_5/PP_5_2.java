import java.util.*;

public class PP_5_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fails_left = 6, letterCount, correct = 0;
        char[] letters_left = {
            'e', 't', 'a', 'o', 'i', 'n', 's', 'r', 'h', 'l', 'd', 'c', 'u',
            'm', 'f', 'p', 'g', 'w', 'y', 'b', 'v', 'k', 'x', 'j', 'q', 'z'
        }; // Most to least common
        
        System.out.println("How many letters are in the word?");
        letterCount = sc.nextInt();
        
        
        while (fails_left > 0 && correct < letterCount) {
            char input = ' ';
            int guess;
            if (fails_left >= 3) {
                guess = (int) (Math.random() * 12);
            } else {
                guess = (int) (Math.random() * letters_left.length);
            }
            while (input != 'y' && input != 'n') {
                System.out.println("Is there a " + letters_left[guess] + "? (Y/N)");
                input = sc.next().charAt(0);
            }
            
            char[] temp = new char[letters_left.length - 1];
            for (int i = 0, j = 0; i < letters_left.length; i++) {
                if (i != guess) {
                    temp[j++] = letters_left[i];
                }
            }
            letters_left = temp;
           
            if (input == 'y' || input == 'Y') {
                System.out.println("How many?");
                correct += sc.nextInt();
            } else {
                fails_left--;
                System.out.println(fails_left + " tries left");
            }
        }
    }
}
