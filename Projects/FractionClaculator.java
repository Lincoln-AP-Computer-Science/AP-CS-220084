import java.util.*;

public class FractionCalculator {

    public static void main (String[] args) {
        FractionCalculator fc = new FractionCalculator();
        Scanner sc = new Scanner(System.in);
        String equation, answer;
        
        System.out.println("Input an equation:");
        equation = sc.nextLine();
        
        answer = fc.calculate(equation);
        System.out.print("The ouput is " + answer);
    }
    
    public String multiply(String operand1, String operand2) {
        return new String();
    }
    
    public String divide(String operand1, String operand2) {
        return new String();
    }
    
    public String add(String operand1, String operand2) {
        return new String();
    }
    
    public String subtract(String operand1, String operand2) {
        return new String();
    }

    public String calculate(String expression){
        int firstBlank = expression.indexOf(' ');
        String operand1, operand2;
        String parsed1, parsed2;
        char operator;
        
        if (firstBlank >= 0) {
            operand1 = expression.substring(0, firstBlank);
            operand2 = expression.substring(firstBlank + 3);
            operator = expression.charAt(firstBlank + 1);
            
            parsed2 = parseOperand(operand2);
            
            switch (operator) {
                case '*':
                case '/':
                case '+':
                case '-':
            }
            
        } else {
            operand1 = expression;
            operand2 = "0";
            operator = ' ';
            
            parsed2 = "";
        }
        
        parsed1 = parseOperand(operand1);
        
        return parsed1 + operator + parsed2;
    }
    
    public String parseOperand(String operand) {
        String fraction;
        int wholeNumber, numerator, denominator;
        int fractionBar, underline = operand.indexOf('_');
        
        if (underline >= 0) {
            wholeNumber = Integer.parseInt(operand.substring(0, underline));
            fraction = operand.substring(underline + 1);
        } else {
            wholeNumber = 0;
            fraction = operand;
        }
        
        fractionBar = fraction.indexOf('/');
        
        if (fractionBar >= 0) {
            numerator = Integer.parseInt(fraction.substring(0, fractionBar));
            denominator = Integer.parseInt(fraction.substring(fractionBar + 1));
        } else {
            numerator = Integer.parseInt(fraction);
            denominator = 1;
        }
        
        wholeNumber += (int) (numerator / denominator);
        numerator %= denominator;
        
        double n, d;
        int gcd = 1;
        
        if (numerator >= denominator) {
            for (int i = 1; i <= denominator; i++) {
                n = (double) numerator / i;
                d = (double) denominator / i;
                if ((int) n == numerator / i && (int) d == denominator / i) {
                    gcd = i;
                }
            }
        } else {
            for (int i = 1; i <= numerator; i++) {
                n = (double) numerator / i;
                d = (double) denominator / i;
                if (n == (double) (numerator / i) && d == (double) (denominator / i)) {
                    gcd = i;
                }
            }
        }
        
        System.out.println(gcd);
        System.out.println(numerator / gcd);
        System.out.println(denominator / gcd);
        
        numerator /= gcd;
        denominator /= gcd;
        
        
        
        if (numerator != 0) {
            return wholeNumber + "_" + numerator + "/" + denominator;
        } else {
            return Integer.toString(wholeNumber);
        }
    }
}
