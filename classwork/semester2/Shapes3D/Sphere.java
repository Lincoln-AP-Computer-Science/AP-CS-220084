public class Sphere implements Shape3D {
    
    private double r;
    
    public Sphere() {
        this.r = 0;
    }
    
    public Sphere(double r) {
        this.r = r;
    }
    
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(r, 2);
    }
    
    public double getVolume() {
        return 4 * Math.PI * Math.pow(r, 3) / 3;
    }
}