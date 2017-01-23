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
        }
    }
    
    public int getDegree() {
        return this.degree;
    }
    
    public void setDegree(int value) {
        this.degree = value;
    }
    
    @Override
    public String toString() {
        return this.coefficient + (this.variable + "^") + degree;
    }
    
    private void parse(String input) {
        int caret = input.indexOf('^');
        if (caret != -1) {
            this.coefficient = Integer.parseInt(input.substring(0, caret - 1));
            this.variable = input.charAt(caret - 1);
            this.degree = Integer.parseInt(input.substring(caret + 1));
        } else {
            try {
                this.coefficient = Integer.parseInt(input.substring(0, input.length() - 1));
                this.variable = input.charAt(input.length());
                this.degree = 1;
            } catch (Exception e) {
                this.coefficient = 1;
                this.variable = input.charAt(0);
                this.degree = 0;
            }
        }
    }
}
