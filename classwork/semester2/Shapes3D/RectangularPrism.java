public class RectangularPrism implements Shape3D {
    
    private double l, w, d;
    
    public RectangularPrism() {
        this.l = 0;
        this.w = 0;
        this.d = 0;
    }
    
    public RectangularPrism(double l, double w, double d) {
        this.l = l;
        this.w = w;
        this.d = d;
    }
    
    public double getSurfaceArea() {
        return 2 * (l * w + l * d + w * d);
    }
    
    public double getVolume() {
        return l * w * d;
    }
}