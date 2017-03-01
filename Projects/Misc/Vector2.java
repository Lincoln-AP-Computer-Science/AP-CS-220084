// Stores 2 related variables as 1 object for accessibility
public class Vector2 {
    // === PROTECTED VARIABLES === \\
    
    protected int x, y;
    
    // === PUBLIC CONSTRUCTORS === \\
    
    // Default constructor
    public Vector2 () {
        this.x = 0;
        this.y = 0;
    }
    
    public Vector2 (int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // === PUBLIC METHODS === \\
    
    // Sets the X value and returns the new value
    public int setX (int x) {
        this.x = x;
        return this.x;
    }
    
    // Sets the Y value and returns the new value
    public int setY (int y) {
        this.y = y;
        return this.y;
    }
    
    // Checks if the X values are equivalent
    public boolean equalsX (Vector2 v) {
        return this.x == v.x;
    }
    
    // Checks if the Y values are equivalent
    public boolean equalsY (Vector2 v) {
        return this.y == v.y;
    }
    
    // Makes printed instance easily readable
    @Override
    public String toString () {
        return "(" + this.x + ", " + this.y + ")";
    }
    
    // To allow object comparison; must be Object argument to override
    @Override
    public boolean equals (Object o) {
        // Check if Object o is the same instance
        if (o == this) {
            return true;
        }
        
        // Check if Object o is the same type
        if (!(o instanceof Vector2)) {
            return false;
        }
        
        // Typecast to compare data members
        Vector2 v = (Vector2) o;
        
        // Make necessary comparisons
        return this.equalsX(v) && this.equalsY(v);
    }
}
