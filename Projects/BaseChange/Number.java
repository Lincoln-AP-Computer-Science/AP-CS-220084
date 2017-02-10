import java.util.*;

public class Number {
    
    private int base;
    private String value;
    
    public Number(int base, String value) {
        if (base <= 0) {
            throw new IllegalArgumentException("Base cannot be negative (input: " 
                    + base + ").");
        } else if (base > 36) {
            throw new IllegalArgumentException("Base cannot be > 36 (input: " 
                    + base + ").");
        }
        this.base = base;
        
        for (char c : value.toUpperCase().toCharArray()) {
            if ((base <= 10 && c >= '0' + base - 1) || c >= 'A' + base - 10) {
                throw new IllegalArgumentException("Value is invalid for base of " 
                        + base + " (illegal char: " + c + ").");
            }
        }
        this.value = value.toUpperCase();
    }
    
    @Override
    public String toString() {
        return this.value;
    }
    
    public String convertBase(int base) {
        int newVal = 0;
        for (int i = 0; i < this.value.length(); i++) {
            if (value.charAt(i) >= 'A') {
                newVal += (value.charAt(i) - (int) 'A' + 10) * Math.pow(16, i);
            } else if (value.charAt(i) >= '0' && value.charAt(i) <= '9') {
                newVal += Character.getNumericValue(value.charAt(i));
            }
        }
        return Integer.toString(newVal);
    }
}
