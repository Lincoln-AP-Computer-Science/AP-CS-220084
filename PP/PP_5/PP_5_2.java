import java.util.*;

public class PP_5_2 {
    
    public static void main(String[] args) {
        PP_5_2 pp = new PP_5_2();
        Scanner sc = new Scanner(System.in);
        int fails_left = 6, letterCount, correct = 0;
        char[] letters_left = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };
        
        System.out.println("How many letters are in the word?");
        letterCount = sc.nextInt();
        
        while (fails_left > 0 && correct < letterCount) {
            if(!pp.run()) {
                fails_left--;
            }
        }
        
    }
    
    public boolean run(char[] letters) {
        Scanner sc = new Scanner(System.in);
        String input;
        int rand = Math.random() * letters_left.length();
        while (input != "y" && input != "n") {
            System.out.println("Is there a " + letters[rand] + "? (Y/N)");
            input = sc.nextString().toLowerCase();
        }
        
        if (input = "y") {
            return true;
        }
        return false;
    }
}
