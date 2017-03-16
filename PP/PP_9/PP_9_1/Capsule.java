public class Capsule implements Shape3D {
    private double r, h;
    
    public Capsule (double r, double h) {
        this.r = r;
        this.h = h;
    }
    
    public double getVolume() {
        return Math.PI * Math.pow(r, 2) * (4.0 / 3.0 * r + h);
    }
    
    public double getSurfaceArea() {
        return 2 * Math.PI * r * (2 * r + h);
    }
}