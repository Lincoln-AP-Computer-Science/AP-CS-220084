/**
 * 2-Value Vector Object.
 *
 * <P>Used to store 2 related values.
 *
 * <P>Commonly used, but not limited to, storing points
 */
public class Vector2 {
    
    protected double x, y;
    
    /** Constructor. */
    public Vector2() {
        this.x = 0;
        this.y = 0;
    }
    
    /**
     * Constructor.
     *
     * @param x an int to define the x-value of the vector
     * @param y an int to define the y-value of the vector
     */
    public Vector2(int x, int y) {
        this.x = (double) x;
        this.y = (double) y;
    }
    
    /**
     * Constructor.
     *
     * @param x a double to define the x-value of the vector
     * @param y a double to define the y-value of the vector
     */
    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Set the x-value.
     *
     * @param x a double to define the x-value of the vector
     * @return  the new x-value
     */
    public double setX(double x) {
        this.x = x;
        return this.x;
    }
    
    /**
     * Set the x-value.
     *
     * @param x a double to define the x-value of the vector
     * @return  the new x-value
     * @see     #setX(double x)
     */
    public double setX(int x) {
        return this.setX((double) x);
    }
    
    /**
     * Set the y-value.
     *
     * @param y a double to define the y-value of the vector
     * @return  the new y-value
     */
    public double setY(double y) {
        this.y = y;
        return this.y;
    }
    
    /**
     * Set the y-value.
     *
     * @param y a double to define the y-value of the vector
     * @return  the new y-value
     * @see     #setY(double y)
     */
    public double setY(int y) {
        return this.setY((double) y);
    }
    
    /** 
     * Compare the x-value of another Vector2.
     *
     * @param v the vector2 to compare x-values
     * @return  true if the x-values are equivalent
     */
    public boolean equalsX(Vector2 v) {
        return this.x == v.x;
    }
    
    /** 
     * Compare the y-value of another Vector2.
     *
     * @param v the vector2 to compare y-values
     * @return  true if the y-values are equivalent
     */
    public boolean equalsY(Vector2 v) {
        return this.y == v.y;
    }
    
    /**
     * Converts the vector to a String.
     *
     * @return  the vector as a string
     * @see     Object#toString()
     */
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
    
    /**
     * Allows comparison of another Vector2
     *
     * @return  true of the data values are equivalent
     * @see     Object#equals(Object)
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        
        if (!(o instanceof Vector2)) {
            return false;
        }
        
        Vector2 v = (Vector2) o;
        
        return this.equalsX(v) && this.equalsY(v);
    }
}
