import java.util.*;

public class PolynomialCalculator {
    
    public static void main(String[] args) {
        PolynomialCalculator pc = new PolynomialCalculator();
        
        pc.run();
    }
    
    public int[] add(int[] poly1, int[] poly2) {
        int[] output = new int[poly1.length];
        for (int i = 0; i < output.length; i++) {
            output[i] = poly1[i] + poly2[i];
        }
        return output;
    }
    
    public int[] subtract(int[] poly1, int[] poly2) {
        for (int i = 0; i < poly2.length; i++) {
            poly2[i] = -poly2[i];
        }
        return add(poly1, poly2);
    }
    
    public String[] parse(String polynomial) {
        String[] output;
        char variable = 'x';
        int caret = 0, degree = 0;
        String toParse = polynomial.replaceAll(" ", "");
        String temp = toParse;
        while (true) {
            temp = temp.substring(caret);
            caret = temp.indexOf('^');
            if (caret > 0) {
                int currentDegree = Character.getNumericValue(toParse.charAt(caret + 1));
                if (currentDegree > degree) degree = currentDegree;
                variable = toParse.charAt(caret - 1);
            } else {
                if (toParse.indexOf(variable) > -1 && degree == 0) degree = 1;
                break;
            }
        }
        output = new String[degree + 1];
        
        int start, end = 0, index = 0;
        boolean isNegative = false;
        while (toParse.length() > 0) {
            if (toParse.indexOf('+') > 0) {
                end = toParse.indexOf('+');
            } else if (toParse.indexOf('-') > 0) {
                end = toParse.indexOf('-');
                isNegative = true;
            } else {
                end = toParse.length();
            }
            
            temp = toParse.substring(0, end);
            for (int i = 0; i < degree + 1; i++) {
                int tempDeg = Character.getNumericValue(temp.charAt(temp.indexOf('^') + 1));
                if (isNegative) temp = "-" + temp;
                isNegative = false;
                if (temp.indexOf('^') > -1 && tempDeg == i && i >= 2) {
                    output[i] = temp;
                } else if (temp.indexOf(variable) > -1 && temp.indexOf('^') == -1) {
                    output[1] = temp;
                } else {
                    output[0] = temp;
                }
            }
            try {
                toParse = toParse.substring(end + 1);
            } catch (Exception e) {
                break;
            }
        }
        
        for (int i = 0; i < output.length; i++) {
            if (output[i] == null) output[i] = "0" + variable + "^" + i;
        }
        
        return output;
    }
    
    public void run() {
        Scanner sc = new Scanner(System.in);
        String poly1, poly2;
        String operator;
        String[] parsed1, parsed2;
        
        System.out.println("Input the first polynomial:");
        poly1 = sc.nextLine();
        parsed1 = parse(poly1);
        System.out.println("Input the second polynomial:");
        poly2 = sc.nextLine();
        parsed2 = parse(poly2);
        System.out.println("Input the operator (*, /, +, -)");
        operator = sc.next();
        
        if (parsed1.length > parsed2.length) {
            String[] temp = new String[parsed1.length];
            for (int i = 0; i < parsed2.length; i++) {
                
            }
        } else if (parsed2.length > parsed1.length) {
        
        }
        
        for (int i = parsed1.length - 1; i >= 0; i--) {
            System.out.print("(" + parsed1[i] + ")");
            if (i > 0) System.out.print(" + ");
        }
        
        for (int i = parsed2.length - 1; i >= 0; i--) {
            System.out.print("(" + parsed2[i] + ")");
            if (i > 0) System.out.print(" + ");
        }
    }
}
