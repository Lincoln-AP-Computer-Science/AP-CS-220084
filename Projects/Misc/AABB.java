// Axis-Aligned Bounding Box
public class AABB {
    // === PROTECTED VARIABLES === \\
    
    protected Vector2 min, max;
    
    // === PUBLIC CONSTRUCTORS === \\
    
    // Default constructor
    public AABB () {
        this.min = new Vector2();
        this.max = new Vector2();
    }
    
    // Vector2, Vector2 constructor
    public AABB (Vector2 min, Vector2 max) {
        this.min = min;
        this.max = max;
    }
    
    // int, int, int, int constructor
    public AABB (int xMin, int yMin, int xMax, int yMax) {
        this.min = new Vector2(xMin, yMin);
        this.max = new Vector2(xMax, yMax);
    }
    
    // Vector2, int, int constructor
    public AABB (Vector2 center, int width, int height) {
        this.min = new Vector2(center.x - (width / 2),
                center.y - (height / 2));
        this.max = new Vector2(center.x + (width / 2 + width % 2),
                center.y + (height / 2 + height % 2));
    }
    
    // === PUBLIC METHODS == \\
    
    public boolean isWithin (AABB aabb) {
        if (this.min.x >= aabb.min.x
                && this.min.y >= aabb.min.y
                && this.max.x <= aabb.max.x
                && this.max.y <= aabb.max.y) {
            return true;
        }
        return false;
    }
    
    public boolean hasWithin (AABB aabb) {
        return aabb.isWithin(this);
    }
    
    public boolean outsideCollision (AABB aabb) {
        if (this.isWithin(aabb) || this.hasWithin(aabb)) {
            return true;
        }
        
        if (((this.min.x >= aabb.min.x && this.min.x <= aabb.max.x)
                || (this.max.x <= aabb.max.x && this.max.x >= aabb.min.x))
                && ((this.min.y >= aabb.min.y && this.min.y <= aabb.max.y)
                || (this.max.y <= aabb.max.y && this.max.y >= aabb.min.y))){
            return true;
        }
        
        return false;
    }
    
    public boolean insideCollision (AABB aabb) {
        if (((this.min.x <= aabb.min.x && this.max.x >= aabb.min.x)
                || (this.max.x >= aabb.max.x && this.min.x <= aabb.max.x))
                && ((this.min.y <= aabb.min.y && this.max.y >= aabb.min.y)
                || (this.max.y >= aabb.max.y && this.min.y <= aabb.max.y))){
            return true;
        }
        
        return false;
    }
}
