public class Monomial {

    private int coefficient;
    private char variable;
    private int degree;
    
    public Monomial() {
        this.coefficient = 1;
        this.variable = 'x';
        this.degree = 1;
    }
    
    public Monomial(int coefficient, char variable, int degree) {
        this.coefficient = coefficient;
        this.variable = variable;
        this.degree = degree;
    }
    
    public Monomial(String input) {
        this.parse(input);
    }
    
    public int getCoefficient() {
        return this.coefficient;
    }
    
    public void setCoefficient(int value) {
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
    
    public String toString() {
        return this.coefficient + (this.variable + "^") + degree;
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
            
            try {
                this.coefficient = Integer.parseInt(input.substring(0, caret - 1));
            } catch (Exception e) {
                this.coefficient = 1;
            }
            
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
                    
                    try {
                        this.coefficient = Integer.parseInt(input.substring(0, i));
                    } catch (Exception e) {
                        this.coefficient = 1;
                    }
                    
                    this.degree = 1;
                    
                    hasVar = true;
                }
            }
            if (!hasVar) {
                this.variable = 'x';
                
                try {
                    this.coefficient = Integer.parseInt(input);
                } catch (Exception e) {
                    this.coefficient = 1;
                }
                
                this.degree = 0;
            }
        }
    }
}
