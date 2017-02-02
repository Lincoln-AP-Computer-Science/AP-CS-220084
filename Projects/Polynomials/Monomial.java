public class Monomial {

    // INSTANCE VARIABLES

    private double coefficient;
    private char variable;
    private int degree;
    
    // CONSTRUCTORS
    
    public Monomial() {
        this.coefficient = 1;
        this.variable = 'x';
        this.degree = 1;
    }
    
    public Monomial(double coefficient, char variable, int degree) {
        this.coefficient = coefficient;
        this.variable = variable;
        this.degree = degree;
    }
    
    public Monomial(String input) {
        this.parse(input);
    }
    
    // PUBLIC METHODS
    
    public double getCoefficient() {
        return this.coefficient;
    }
    
    public void setCoefficient(double value) {
        this.coefficient = value;
    }
    
    public char getVariable() {
        return this.variable;
    }
    
    public void setVariable(char variable) {
        if (variable >= 'a' && variable <= 'z') {
            this.variable = variable;
        } else {
            this.variable = 'x';
        }
    }
    
    public void matchVariable(Monomial mono) {
        this.setVariable(mono.getVariable());
    }
    
    public int getDegree() {
        return this.degree;
    }
    
    public void setDegree(int value) {
        this.degree = value;
    }
    
    public boolean isNegative() {
        return this.coefficient < 0;
    }
    
    public void add(Monomial mono) {
        if (mono.getDegree() == this.getDegree()) {
            this.setCoefficient(this.getCoefficient() + mono.getCoefficient());
        }
    }
    
    public void subtract(Monomial mono) {
        if (mono.getDegree() == this.getDegree()) {
            this.setCoefficient(this.getCoefficient() - mono.getCoefficient());
        }
    }
    
    public void multiply(Monomial mono) {
        this.setCoefficient(this.getCoefficient() * mono.getCoefficient());
        this.setDegree(this.getDegree() + mono.getDegree());
    }
    
    public void divide(Monomial mono) {
        this.setCoefficient(this.getCoefficient() / mono.getCoefficient());
        this.setDegree(this.getDegree() - mono.getDegree());
    }
    
    // OVERRIDE METHODS
    
    @Override
    public String toString() {
        String tempCoef = Double.toString(this.coefficient);
        if (tempCoef.substring(tempCoef.length() - 2).equals(".0")) {
            tempCoef = tempCoef.substring(0, tempCoef.length() - 2);
        }
        return tempCoef + (this.variable + "^") + degree;
    }
    
    // PRIVATE METHODS
    
    private boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    private boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    private void parseCoefficient(String input, int caret) {
        String tempCoef = input.substring(0, caret - 1);
        int divSign = tempCoef.indexOf("/");
        
        if (divSign != -1) {
            String left = tempCoef.substring(0, divSign);
            String right = tempCoef.substring(divSign + 1);
            double l, r;
            if (this.isDouble(left)) {
                l = Double.parseDouble(left);
            } else if (this.isInteger(left)) {
                l = (double) Integer.parseInt(left);
            } else {
                l = 1;
            }
            
            if (this.isDouble(right)) {
                r = Double.parseDouble(right);
            } else if (this.isInteger(right)) {
                r = (double) Integer.parseInt(right);
            } else {
                r = 1;
            }
            
            this.coefficient = l / r;
        } else {
            if (this.isDouble(tempCoef)) {
                this.coefficient = Double.parseDouble(tempCoef);
                return;
            } else if (this.isInteger(tempCoef)) {
                this.coefficient = (double) Integer.parseInt(tempCoef);
                return;
            } else {
                this.coefficient = 1;
                return;
            }
        }
    }
    
    private void parse(String input) {
        input = input.replaceAll("[ +]", "").trim();
        int caret = input.indexOf('^');
        if (caret > -1) {
            
            this.setVariable(input.charAt(caret - 1));
            
            this.parseCoefficient(input, caret);
                        
            try {
                this.setDegree(Integer.parseInt(input.substring(caret + 1)));
            } catch (Exception e) {
                if (input.charAt(caret - 1) >= 'a' && input.charAt(caret - 1) <= 'z') {
                    this.setDegree(1);
                } else {
                    this.setDegree(1);
                }
            }
        } else {
            boolean hasVar = false;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                    this.setVariable(input.charAt(i));
                    
                    this.parseCoefficient(input, i + 1);
                                        
                    this.setDegree(1);
                    
                    hasVar = true;
                }
            }
            if (!hasVar) {
                this.setVariable('x');
                
                parseCoefficient(input, input.length() + 1);
                
                this.setDegree(0);
            }
        }
    }
}
