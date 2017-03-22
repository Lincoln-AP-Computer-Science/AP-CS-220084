public class Color {
    private double r, g, b, a;
    
    public Color() {
        this(1.0, 1.0, 1.0, 1.0);
    }
    
    public Color(double r, double g, double b) {
        this(r, g, b, 1.0);
    }
    
    public Color(double r, double g, double b, double a) {
        if (r > 1.0) r = 1.0;
        if (g > 1.0) g = 1.0;
        if (b > 1.0) b = 1.0;
        if (a > 1.0) a = 1.0;
        
        if (r < 0.0) r = 0.0;
        if (g < 0.0) g = 0.0;
        if (b < 0.0) b = 0.0;
        if (a < 0.0) a = 0.0;
        
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }
    
    public Color(String hex) {
        hex = hex.toUpperCase();
        hex = hex.replaceAll("#", "");
        
        Exception invalidHex = new Exception("Invalid hexadecimal value " + hex);
            
        if (!(hex.length() == 6 || hex.length() == 8)) {
            throw new RuntimeException(invalidHex);
        }
        
        for (char c : hex.toCharArray()) {
            int ascii = (int) c;
            if (ascii < (int) '0' || ascii > (int) '9') {
                if (ascii < (int) 'A' || ascii > (int) 'F') {
                    throw new RuntimeException(invalidHex);
                }
            }
        }
        
        this.r = (double) Integer.valueOf(hex.substring(0, 2), 16) / 255;
        this.g = (double) Integer.valueOf(hex.substring(2, 4), 16) / 255;
        this.b = (double) Integer.valueOf(hex.substring(4, 6), 16) / 255;
        
        if (hex.length() == 8) {
            this.a = (double) Integer.valueOf(hex.substring(6, 8), 16) / 255;
        }        
    }
    
    public double getR() { return this.r; }
    
    public double getG() { return this.g; }
    
    public double getB() { return this.b; }
    
    public double getA() { return this.a; }
    
    public String toHexadecimal() {
        String hex = "#";
        hex += Integer.toHexString((int) (this.getR() * 255));
        hex += Integer.toHexString((int) (this.getG() * 255));
        hex += Integer.toHexString((int) (this.getB() * 255));
        hex += Integer.toHexString((int) (this.getA() * 255));
        return hex;
    }
    
    public void setR(double r) {
        if (r > 1.0) r = 1.0;
        if (r < 0.0) r = 0.0;
        this.r = r;
    }
    
    public void setG(double g) {
        if (g > 1.0) g = 1.0;
        if (g < 0.0) g = 0.0;
        this.g = g;
    }
    
    public void setB(double b) {
        if (b > 1.0) b = 1.0;
        if (b < 0.0) b = 0.0;
        this.b = b;
    }
    
    public void setA(double a) {
        if (a > 1.0) a = 1.0;
        if (a < 0.0) a = 0.0;
        this.a = a;
    }
    
    public void set(double r, double g, double b) {
        new Color(r, g, b);
    }
    
    public void set(double r, double g, double b, double a) {
        new Color(r, g, b, a);
    }
    
    public void set(String hex) {
        new Color(hex);
    }
    
    public void add(Color c) {
        this.setR(this.getR() + c.getR());
        this.setG(this.getG() + c.getG());
        this.setB(this.getB() + c.getB());
        this.setA(this.getA() + c.getA());
    }
    
    public void subtract(Color c) {
        this.setR(this.getR() - c.getR());
        this.setG(this.getG() - c.getG());
        this.setB(this.getB() - c.getB());
        this.setA(this.getA() - c.getA());
    }
}
