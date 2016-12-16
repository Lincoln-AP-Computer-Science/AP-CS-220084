import java.util.*;

public class PolynomialCalculator {
    
    public static void main(String[] args) {
        PolynomialCalculator pc = new PolynomialCalculator();
        
        pc.run();
    }
    
    public String[] matchDegree(String[] poly, String[] toMatch) {
        if (toMatch.length > poly.length) {
            char variable = 'x';
            String[] temp = new String[toMatch.length];
            
            String degreeOne = toMatch[toMatch.length - 2];
            if (degreeOne.indexOf('^') != -1) {
                variable = degreeOne.charAt(degreeOne.length() - 3);
            } else {
                variable = degreeOne.charAt(degreeOne.length() - 1);
            }
            
            for (int i = poly.length - 1; i >= 0; i--) {
                temp[i] = poly[i];
            }
            for (int i = 0; i < temp.length; i++) {
                if (temp[i] == null || temp[i] == "") temp[i] = "0" + variable + "^" + i;
            }
            return temp;
        } else {
            return poly;
        }
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
        String[] ret;
        char variable = 'x';
        int caret = 0, degree = 0;
        String toParse = polynomial.replaceAll(" ", "");
        String temp = toParse;
        while (true) {
            temp = temp.substring(caret);
            caret = temp.indexOf('^');
            if (caret > 0) {
                String tmp = toParse.substring(caret + 1);
                int end;
                if (tmp.indexOf('+') != -1) {
                    end = tmp.indexOf('+');
                } else if (tmp.indexOf('-') != -1) {
                    end = tmp.indexOf('-');
                } else {
                    end = tmp.length();
                }
                
                int currentDegree = Integer.parseInt(tmp.substring(0, end));
                if (currentDegree > degree) degree = currentDegree;
                variable = toParse.charAt(caret - 1);
            } else {
                if (toParse.indexOf(variable) > -1 && degree == 0) degree = 1;
                break;
            }
        }
        output = new String[degree + 1];
        ret = new String[degree + 1];
        
        int start, end = 0, index = 0;
        boolean isNegative = false;
        while (toParse.length() > 0) {
            if (toParse.indexOf('+') > 0) {
                end = toParse.indexOf('+');
            } else if (toParse.indexOf('-') > 0) {
                end = toParse.indexOf('-');
            } else {
                end = toParse.length();
            }
            
            temp = toParse.substring(0, end);
            for (int i = 0; i < degree + 1; i++) {
                if (temp.indexOf('^') != -1) {
                    int tempDeg = Integer.parseInt(temp.substring(temp.indexOf('^') + 1));
                    if (temp.indexOf('^') > -1 && tempDeg == i) {
                        output[i] = temp;
                    }
                } else if (temp.indexOf(variable) > -1) {
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
            if (output[i] == null || output[i] == "") output[i] = "0" + variable + "^" + i;
            if (output[i].indexOf("+") > -1) output[i] = output[i].replace("+", "");
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
        
        parsed2 = matchDegree(parsed2, parsed1);
        parsed1 = matchDegree(parsed1, parsed2);
        
        for (int i = 0; i < parsed1.length; i++) {
            System.out.print("(" + parsed1[i] + ")");
            if (i < parsed1.length - 1) System.out.print(" + ");
        }
        
        System.out.print(" " + operator + " ");
        
        for (int i = 0; i < parsed2.length; i++) {
            System.out.print("(" + parsed2[i] + ")");
            if (i < parsed2.length - 1) System.out.print(" + ");
        }
    }
}
