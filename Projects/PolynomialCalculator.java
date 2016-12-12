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
    
    public int[] parse(String polynomial) {
        int[] output;
        char variable = 'x';
        int caret = polynomial.indexOf('^'), degree = 0;
        String toParse = polynomial;
        if (caret != -1) {
            degree = Character.getNumericValue(toParse.charAt(caret + 1));
            variable = toParse.charAt(caret - 1);
        }
        output = new int[degree];
        String[] tmp = new String[degree];
        
        int start = 0, end = degree + 1;
        for (int i = 0; i < degree; i++) {
            tmp[i] = toParse.substring(start, end);
            toParse = toParse.substring(end);
            
            System.out.println(tmp[i]);
            
            start = end;
            if (toParse.indexOf('^') != -1) {
                end = toParse.indexOf('^') + 2;
            } else if (toParse.indexOf(variable) != -1) {
                end = toParse.indexOf(variable) + 1;
            }
        }
        
        return output;
    }
    
    public void run() {
        Scanner sc = new Scanner(System.in);
        String poly1, poly2;
        String operator;
        int[] parsed1, parsed2;
        
        parse("x^2 + x + 2");
        
        System.out.println("Input the first polynomial:");
        poly1 = sc.nextLine();
        System.out.println("Input the second polynomial:");
        poly2 = sc.nextLine();
        System.out.println("Input the operator (*, /, +, -)");
        operator = sc.next();
    }
}
