import java.util.*;

public class FractionCalculator {

    public static void main (String[] args) {
        FractionCalculator fc = new FractionCalculator();
        Scanner sc = new Scanner(System.in);
        String equation, answer;
        
        while (true) {
            System.out.println("Input an expression or type QUIT to quit:");
            equation = sc.nextLine();
            
            if (equation.equals("QUIT")) break;
            
            answer = fc.calculate(equation);
            
            if (answer != "FAIL") System.out.println("The ouput is " + answer);
            else System.out.println("Invalid expression!");
        }
    }
    
    public int[] improperFraction(int[] components) {
        int[] output = new int[2];
        boolean isNegative = false;
        for (int i : components) if(i < 0) isNegative = true;
        
        output[0] = Math.abs(components[0] * components[2]) + components[1];
        output[1] = Math.abs(components[2]);
        
        if (isNegative) output[0] = -output[0];
        return output;
    }
    
    public int[] improperFraction(String operand) {
        return improperFraction(getComponents(operand));
    }
    
    public String multiply(String operand1, String operand2) {
        int[] output = new int[2];
        String[] parsed = new String[2], operand = {operand1, operand2};
        int[][] components = new int[2][2];
        
        for (int i = 0; i < 2; i++) {
            parsed[i] = parseFraction(operand[i]);
            components[i] = improperFraction(parsed[i]);
        }
        
        for (int i = 0, j = 0; i < 2; i++) output[i] = components[0][i] * components[1][i];
        
        return parseFraction(output[0] + "/" + output[1]);
    }
    
    public String divide(String operand1, String operand2) {
        String[] parsed = new String[2], operand = {operand1, operand2};
        int[] components;
        
        components = improperFraction(operand[1]);
        
        parsed[0] = parseFraction(operand[0]);
        parsed[1] = parseFraction(components[1] + "/" + components[0]);
        
        return multiply(parsed[0], parsed[1]);
    }
    
    public int[] crossMultiply(String operand1, String operand2) {
        String[] parsed = new String[2], operand = {operand1, operand2};
        int[][] components = new int[2][2];
        int[] n = {1, 1};
        int d = 1;
        
        for (int i = 0; i < 2; i++)  components[i] = improperFraction(operand[i]);
        
        for (int i = 0; i < 2; i++) {
            n[0] *= components[i][i];
            d *= components[i][1];
        }
        
        for (int i = 0, j = 1; i < 2 && j >= 0; i++, j--) n[1] *= components[j][i];
        
        return new int[] {n[0], n[1], d};
    }
    
    public String add(String operand1, String operand2) {
        int[] output = crossMultiply(operand1, operand2);
        return parseFraction((output[0] + output[1]) + "/" + output[2]);
    }
    
    public String subtract(String operand1, String operand2) {
        int[] output = crossMultiply(operand1, operand2);
        return parseFraction((output[0] - output[1]) + "/" + output[2]);
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
            
        } else return "FAIL";
        
        return answer;
    }
    
    public int gcd(int a, int b) {
        int greater, lesser, output = 1;
        
        if (a >= b) {
            greater = a;
            lesser = b;
        } else {
            greater = b;
            lesser = a;
        }
        
        for (int i = 1; i <= lesser; i++) {
            if ((double) (lesser / i) % 1 == 0 && (double) (greater / i) % 1 == 0) output = i;
        }
        
        return output;
    }
    
    public String parseFraction(String operand) {
        String output;
        int[] components = getComponents(operand);
        boolean isNegative = false;
        
        for (int i = 0; i < components.length; i++) {
            if (components[i] < 0) {
                isNegative = true;
            }
            components[i] = Math.abs(components[i]);
        }
        
        components[0] += (int) (components[1] / components[2]);
        components[1] %= components[2];
        
        components[1] /= gcd(components[1], components[2]);
        components[2] /= gcd(components[1], components[2]);
        
        if (isNegative) {
            output = "-";
        } else {
            output = "";
        }
        
        if (components[2] != 0) {
            if (components[0] != 0) {
                output += Integer.toString(components[0]);
            }
            
            if (components[0] != 0 && components[1] != 0) {
                output += "_";
            }
            
            if (components[1] != 0) {
                output += components[1] + "/" + components[2];
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
