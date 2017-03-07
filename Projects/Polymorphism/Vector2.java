public class Vector2 {
    protected double x, y;
    
    public Vector2() {
        this.x = 0;
        this.y = 0;
    }
    
    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double setX(double x) {
        this.x = x;
        return this.x;
    }
    
    public double setY(double y) {
        this.y = y;
        return this.y;
    }
}
