/**
 * Axis-Aligned Bounding Box
 *
 * <P>Rectangular bounding box to handle collisions and other conditionals
 *
 * @author Chai Nunes
 * @version 1.0
 */
public class AABB {
    
    protected Vector2 min, max;
    
    /** Default Constructor. */
    public AABB () {
        this.min = new Vector2();
        this.max = new Vector2();
    }
    
    /**
     * 
     */
    public AABB (Vector2 min, Vector2 max) {
        this.min = min;
        this.max = max;
    }
    
    // double, double, double, double constructor
    // Initializes with minimum and maximum points as ints
    public AABB (double xMin, double yMin, double xMax, double yMax) {
        this.min = new Vector2(xMin, yMin);
        this.max = new Vector2(xMax, yMax);
    }
    
    // Vector2, double, double constructor
    // Initializes with position and size
    public AABB (Vector2 center, double width, double height) {
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
