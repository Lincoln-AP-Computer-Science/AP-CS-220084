import java.util.*;

public class FractionCalculator {

    public static void main(String[] args) {
        FractionCalculator fc = new FractionCalculator();
        Scanner sc = new Scanner(System.in);
        String input;
        
        while (true) {
            System.out.print("Input an equation: ");
            input = sc.nextLine();
            
            if (input.equalsIgnoreCase("quit")) break;
            
            fc.calculate(input);
        }
        
        System.out.println("Thank you for using my fractional calculator.");
    }
    
    public int calculate(String input) {
        return 0;
    }
}
