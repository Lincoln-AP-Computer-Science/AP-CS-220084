import java.util.*;

public class PolynomialCalculator {
    public String variable = "x";
    
    public static void main(String[] args) {
        PolynomialCalculator pc = new PolynomialCalculator();
        
        pc.run();
    }
    
    public String[] toPolynomial(int[] nums) {
        String[] output = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = nums[i] + variable + "^" + (nums.length - 1 - i);
        }
        return output;
    }
    
    public String[] matchDegree(String[] poly, String[] toMatch) {
        if (toMatch.length > poly.length) {
            String[] temp = new String[toMatch.length];
            
            String degreeOne = toMatch[toMatch.length - 2];
            if (degreeOne.indexOf('^') != -1) {
                variable = String.valueOf(degreeOne.charAt(degreeOne.length() - 3));
            } else {
                variable = String.valueOf(degreeOne.charAt(degreeOne.length() - 1));
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
    
    public int[] add(String[] poly1, String[] poly2) {
        return add(toInts(poly1), toInts(poly2));
    }
    
    public int[] subtract(int[] poly1, int[] poly2) {
        for (int i = 0; i < poly2.length; i++) {
            poly2[i] = -poly2[i];
        }
        return add(poly1, poly2);
    }
    
    public int[] subtract(String[] poly1, String[] poly2) {
        return subtract(toInts(poly1), toInts(poly2));
    }
    
    public String[] parse(String polynomial) {
        String[] output;
        String[] ret;
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
                variable = String.valueOf(toParse.charAt(caret - 1));
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
        
        for (int i = 0; i < output.length; i++) {
            if (output[i].indexOf(variable + "^0") > -1) {
                output[i] = output[i].substring(0, output[i].indexOf(variable + "^0"));
            }
            if (output[i].indexOf(variable + "^1") > -1) {
                output[i] = output[i].substring(0, output[i].indexOf("^1"));
            }
        }
        
        return output;
    }
    
    public int[] toInts(String[] poly) {
        int[] output = new int[poly.length];
        for (int i = poly.length - 1, j = 0; i >= 0 && j < output.length; i--, j++) {
            output[(poly.length - 1) - i] = getInt(poly[i]);
        }
        return output;
    }
    
    public int getInt(String num) {
        String tmp = num;
        int tmpix = tmp.indexOf(variable);
        if (tmpix > -1) {
            if (tmpix == 0) {
                return 1;
            }
            return Character.getNumericValue(tmp.charAt(tmpix - 1));
        } else {
            return Integer.parseInt(tmp);
        }
    }
    
    public String formatPolynomial(String[] poly) {
        String output = "(";
        for (int i = 0; i < poly.length; i++) {
            output += "(" + poly[i] + ")";
            if (i < poly.length - 1) output += " + ";
        }
        return output + ")";
    }
    
    public String formatPolynomial(int[] poly) {
        return formatPolynomial(toPolynomial(poly));
    }
    
    public void run() {
        Scanner sc = new Scanner(System.in);
        String[] poly1, poly2;
        char operator;
        String answer = "";
        
        System.out.println("Input the first polynomial:");
        poly1 = parse(sc.nextLine());
        System.out.println("Input the second polynomial:");
        poly2 = parse(sc.nextLine());
        System.out.println("Input the operator (*, /, +, -)");
        operator = sc.next().charAt(0);
        
        poly1 = matchDegree(poly1, poly2);
        poly2 = matchDegree(poly2, poly1);
        
        switch (operator) {
            case '+': answer = formatPolynomial(add(poly1, poly2));
            case '-': answer = formatPolynomial(subtract(poly1, poly2));
        }
        
        System.out.println(answer);
    }
}
