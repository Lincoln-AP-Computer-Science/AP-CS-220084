import java.util.*;

public class FractionCalculator {
    public final char[] operators = {'*', '/', '+', '-'};

    public static void main(String[] args) {
        FractionCalculator fc = new FractionCalculator();
        Scanner sc = new Scanner(System.in);
        String input;
        
        while (true) {
            System.out.print("Input an equation: ");
            input = sc.nextLine();
            
            if (input.equalsIgnoreCase("quit")) break;
            
            double result = fc.calculate(input);
            System.out.println(input + " = " + result);
        }
        
        System.out.println("Thank you for using my fractional calculator.");
    }
    
    public double calculate(String input) {
        input = input.replace(" ", "");
        char operator = ' ';
        double num1, num2;
        int opIndex = input.indexOf(operator);
        
        for (int i = 0; i < input.length(); i++) {
            for (char op : operators) {
                if (input.charAt(i) == op) {
                    operator = op;
                    opIndex = input.indexOf(operator);
                    break;
                }
            }
        }
        
        if (opIndex <= 0) {
            try {
                return Integer.parseInt(input);
            } catch (Exception e) {
                return 0;
            }
        }
        
        num1 = Integer.parseInt(input.substring(0, opIndex));
        num2 = Integer.parseInt(input.substring(opIndex + 1));
        
        switch (operator) {
            case '*': return num1 * num2;
            case '/': return num1 / num2;
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            default: return 0;
        }
    }
}
