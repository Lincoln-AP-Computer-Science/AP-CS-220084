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
    
    private void parse(String input) {
        input = input.replaceAll("[ ()]", "");
        int[] operators = new int[input.length() - input.replaceAll("[+-]", "").length()];
        for (int i = 0, counter = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-') {
                try {
                    if (operators[counter - 1] != i + 1) {
                        operators[counter++] = i;
                    }
                }
            }
        }
        Monomial[] monomials = new Monomial[operators.length];
        for (int i = 0, counter = 0; i < operators.length; i++) {
            if (operators[i] != 0) {
                //monomials[counter++] = new Monomial(input.substring(0, operators[i] + 1));
            }
        }
    }
    
    // public void parseString(String input) {
//         input = input.replaceAll(" ", "");
//         int[] operators = new int[input.length() - input.replaceAll("[+-]", "").length()];
//         for (int i = 0, counter = 0; i < input.length(); i++) {
//             if (input.charAt(i) == '+' || input.charAt(i) == '-') {
//                 operators[counter++] = i;
//                 System.out.println(i);
//             }
//         }
//         String[] monomials = new String[operators.length];
//         for (int i = 0, counter = 0; i < operators.length; i++) {
//             if (operators[i] != 0) {
//                 monomials[counter++] = input.substring(0, operators[i] + 1);
//                 System.out.println(input.substring(0, operators[i]));
//                 // input = input.substring(operators[i]);
//             }
//         }
//     }
}
