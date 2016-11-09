import java.util.*;

public class PP_5_4 {

    public static void main(String[] args) {
        PP_5_4 pp = new PP_5_4();
        Scanner sc = new Scanner(System.in);
        
        int tries = 0;
        
        System.out.println("Pick a number 1-10.");
        while (true) {
            char input;
            System.out.println("Is it " + (int) (Math.random() * 9) + "? (y/n)");
            input = sc.next().charAt(0);
            if (input == 'n') {
                tries++;
            } else {
                break;
            }
        }
        
        System.out.println("Took " + tries + " tries");
    }
}
