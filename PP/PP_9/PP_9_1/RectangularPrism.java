public class RectangularPrism implements Shape3D {
    private double l, w, h;
    
    public RectangularPrism (double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    
    public double getVolume() {
        return l * w * h;
    }
    
    public double getSurfaceArea() {
        return 2 * (l * w + l * h + w * h);
    }
}