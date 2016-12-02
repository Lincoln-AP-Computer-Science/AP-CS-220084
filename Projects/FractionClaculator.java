import java.util.*;

public class FractionCalculator {

    public static void main (String[] args) {
        FractionCalculator fc = new FractionCalculator();
        Scanner sc = new Scanner(System.in);
        String equation, answer;
        
        while (true) {
            System.out.println("Input an expression or type QUIT to quit:");
            equation = sc.nextLine();
            
            if (equation.equals("QUIT")) {
                break;
            }
            
            answer = fc.calculate(equation);
            if (answer != "FAIL") {
                System.out.println("The ouput is " + answer);
            } else {
                System.out.println("Invalid expression!");
            }
        }
    }
    
    public int[] improperFraction(int[] components) {
        int[] output = new int[2];
        boolean isNegative = false;
        for (int i : components) {
            if(i < 0) isNegative = true;
        }
        
        output[0] = Math.abs(components[0] * components[2]) + components[1];
        output[1] = Math.abs(components[2]);
        
        if (isNegative) output[0] = -output[0];
        return output;
    }
    
    public String multiply(String operand1, String operand2) {
        String parsed1, parsed2;
        int[] components1, components2;
        
        parsed1 = parseFraction(operand1);
        parsed2 = parseFraction(operand2);
        
        components1 = improperFraction(getComponents(parsed1));
        components2 = improperFraction(getComponents(parsed2));
        
        return parseFraction((components1[0] * components2[0]) + "/" + (components1[1] * components2[1]));
    }
    
    public String divide(String operand1, String operand2) {
        String parsed1, parsed2;
        int[] components2;
        
        components2 = improperFraction(getComponents(operand2));
        
        parsed1 = parseFraction(operand1);
        parsed2 = parseFraction(components2[1] + "/" + components2[0]);
        
        return multiply(parsed1, parsed2);
    }
    
    public String add(String operand1, String operand2) {
        String parsed1, parsed2;
        int[] components1, components2;
        int numerator, denominator;
        
        components1 = improperFraction(getComponents(operand1));
        components2 = improperFraction(getComponents(operand2));
        
        numerator = components1[0] * components2[1] + components2[0] * components1[1];
        denominator = components1[1] * components2[1];
        
        return parseFraction(numerator + "/" + denominator);
    }
    
    public String subtract(String operand1, String operand2) {
        String parsed1, parsed2;
        int[] components1, components2;
        int numerator, denominator;
        
        components1 = improperFraction(getComponents(operand1));
        components2 = improperFraction(getComponents(operand2));
        
        numerator = components1[0] * components2[1] - components2[0] * components1[1];
        denominator = components1[1] * components2[1];
        
        return parseFraction(numerator + "/" + denominator);
    }

    public String calculate(String expression){
        int firstBlank = expression.indexOf(' ');
        String answer = "";
        String operand1, operand2;
        char operator;
        
        if (firstBlank >= 0) {
            operand1 = expression.substring(0, firstBlank);
            operand2 = expression.substring(firstBlank + 3);
            operator = expression.charAt(firstBlank + 1);
            
            switch (operator) {
                case '*': answer = multiply(operand1, operand2); break;
                case '/': answer = divide(operand1, operand2); break;
                case '+': answer = add(operand1, operand2); break;
                case '-': answer = subtract(operand1, operand2); break;
            }
            
        } else {
            return "FAIL";
        }
        
        return answer;
    }
    
    public String parseFraction(String operand) {
        String output;
        int[] components = getComponents(operand);
        int wholeNumber, numerator, denominator;
        boolean isNegative = false;
        
        wholeNumber = components[0];
        numerator = components[1];
        denominator = components[2];
        
        if (wholeNumber < 0 || numerator < 0 || denominator < 0) {
            isNegative = true;
        }
        
        wholeNumber = Math.abs(wholeNumber);
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        
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
        
        numerator /= gcd;
        denominator /= gcd;
        
        if (isNegative) {
            output = "-";
        } else {
            output = "";
        }
        
        if (denominator != 0) {
            if (wholeNumber != 0) {
                output += Integer.toString(wholeNumber) + "_";
            }
            
            if (numerator != 0) {
                output += numerator + "/" + denominator;
            }
            
            return output;
        } else {
            return "undefined";
        }
    }
    
    public int[] getComponents(String operand) {
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
        
        return new int[] {wholeNumber, numerator, denominator};
    }
}
