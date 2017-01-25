public class Polynomial {
    
    private int size;
    private Monomial[] polynomial;
    private char variable;
    
    public Polynomial() {
        this.size = 0;
        this.polynomial = new Monomial[this.size];
        this.variable = 'x';
    }
    
    public Polynomial(Polynomial poly) {
        this.size = poly.getSize();
        this.polynomial = poly.get();
        this.variable = poly.getVariable();
    }
    
    public Polynomial(int size) {
        this.size = size;
        this.polynomial = new Monomial[this.size];
        this.variable = 'x';
    }
    
    public Polynomial(String input) {
        parse(input);
    }
    
    public Monomial[] get() {
        return this.polynomial;
    }
    
    public int[] getInts() {
        return new int[0]; // TODO
    }
    
    public Monomial get(int index) {
        if (index >= 0 && index < this.getSize()) {
            return this.polynomial[index];
        } else if (index >= -this.getSize() && index < 0) {
            return this.polynomial[this.getSize() + index];
        }
        return null;
    }
    
    public void set(int index, Monomial value) {
        if (index >= 0 && index < this.getSize()) {
            this.polynomial[index] = value;
        } else if (index >= -this.getSize() && index < 0) {
            this.polynomial[this.getSize() + index] = value;
        }
    }
    
    public void set(int index, String value) {
        Monomial mono = new Monomial(value);
        if (index >= 0 && index < this.getSize()) {
            this.polynomial[index] = mono;
        } else if (index >= -this.getSize() && index < 0) {
            this.polynomial[this.getSize() + index] = mono;
        }
    }
    
    public char getVariable() {
        return this.variable;
    }
    
    public void setVariable(char variable) {
        if (variable >= 'a' && variable <= 'z') {
            this.variable = variable;
            for (int i = 0; i < this.getSize(); i++) {
                this.polynomial[i].setVariable(this.getVariable());
            }
        }
    }
    
    public int getSize() {
        return this.size;
    }
    
    public void setSize(int size) {
        this.size = size;
        Polynomial tmp = new Polynomial(this.size);
        for (int i = 0; i < this.size; i++) {
            tmp.set(i, this.get(i));
        }
        this.polynomial = tmp.get();
    }
    
    private void swap(int index1, int index2) {
        Monomial temp = this.get(index1);
        this.set(index1, index2);
        this.set(index2, temp);
    }
    
    private void insert(int index, Monomial value) {
        this.setSize(this.getSize() + 1));
        this.set(0, value);
        this.move(0, index);
    }
    
    private void move(int index1, int index2) {
        Monomial temp = this.get(index1);
        if (index1 > index2) {
            for (int i = index1 - 1; i >= index2; i--) {
                this.set(i + 1, this.get(i));
            }
        } else {
            for (int i = index1; i < index2; i++) {
                this.set(i, this.get(i + 1));
            }
        }
        this.set(index2, temp);
    }
                 
    private void sort() {
        boolean hasSwapped = true;
        while (hasSwapped) {
            hasSwapped = false;
            for (int i = 0; i < this.getSize() - 1; i++) {
                if (this.get(i).getDegree() > this.get(i + 1).getDegree()) {
                    hasSwapped = true;
                    this.swap(i, i + 1);
                }
            }
    }
    
    private void parse(String input) {
        input = input.replaceAll("[ ()]", "");
        int[] operators = new int[input.length() - input.replaceAll("[+-]", "").length()];
        int[] breaks = new int[operators.length + 1];
        breaks[breaks.length - 1] = input.length();
        for (int i = 0, counter = 1; i < input.length(); i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-') {
                if (counter > 0) {
                    if (operators[counter - 1] != i - 1) {
                        breaks[counter] = i;
                        operators[counter++] = i;
                    }
                }
            }
        }
        Monomial[] monomials = new Monomial[breaks.length - 1];
        for (int i = 1, counter = 0; i < breaks.length; i++) {
            if (breaks[i - 1] == 0) {
                monomials[counter++] = new Monomial(input.substring(breaks[i - 1], breaks[i]));
            } else {
                monomials[counter++] = new Monomial(input.substring(breaks[i - 1] + 1, breaks[i]));
            }
        }
    }
}
