public class Monomial {

    private double coefficient;
    private char variable;
    private int degree;
    
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
    
    public String toString() {
        String tempCoef = Double.toString(this.coefficient);
        if (tempCoef.substring(tempCoef.length() - 2).equals(".0")) {
            tempCoef = tempCoef.substring(0, tempCoef.length() - 2);
        }
        return tempCoef + (this.variable + "^") + degree;
    }
    
    private void parseCoefficient(String input, int caret) {
        String tempCoef = input.substring(0, caret - 1);
        int divSign = tempCoef.indexOf("/");
                    
        try {
            this.coefficient = Double.parseDouble(tempCoef);
        } catch (Exception e1) {
            try {
                this.coefficient = (double) Integer.parseInt(tempCoef);
            } catch (Exception e2) {
                this.coefficient = 1;
            }
        }
        
        if (divSign != -1) {
            try {
                double left = Double.parseDouble(tempCoef.substring(0, divSign));
                double right = Double.parseDouble(tempCoef.substring(divSign + 1));
                this.coefficient = left / right;
            } catch (Exception e1) {
                try {
                    double left = (double) Integer.parseInt(tempCoef.substring(0, divSign));
                    double right = (double) Integer.parseInt(tempCoef.substring(divSign + 1));
                    this.coefficient = left / right;
                } catch (Exception e2) {
                    this.coefficient = 1;
                }
            }
        }
    }
    
    private void parse(String input) {
        input = input.replaceAll("[ +]", "").trim();
        int caret = input.indexOf('^');
        if (caret > -1) {
            try {
                this.variable = input.charAt(caret - 1);
            } catch (Exception e) {
                this.variable = 'x';
            }
            
            parseCoefficient(input, caret);
                        
            try {
                this.degree = Integer.parseInt(input.substring(caret + 1));
            } catch (Exception e) {
                if (input.charAt(caret - 1) >= 'a' && input.charAt(caret - 1) <= 'z') {
                    this.degree = 1;
                } else {
                    this.degree = 0;
                }
            }
        } else {
            boolean hasVar = false;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                    this.variable = input.charAt(i);
                    parseCoefficient(input, i);
                                        
                    this.degree = 1;
                    
                    hasVar = true;
                }
            }
            if (!hasVar) {
                this.variable = 'x';
                
                parseCoefficient(input, input.length() + 1);
                
                this.degree = 0;
            }
        }
    }
}
