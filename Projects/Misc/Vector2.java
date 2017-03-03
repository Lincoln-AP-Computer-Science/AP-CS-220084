/**
 * 2-Value Vector Object.
 *
 * <P>Used to store 2 related values.
 *
 * <P>Commonly used, but not limited to, storing points
 *
 * @author Chai Nunes
 * @version 1.0
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
     * @param x a double to define the x-value of the vector
     * @param y a double to define the y-value of the vector
     */
    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /** 
     * Compare the x-value of two Vector2 instances.
     *
     * @param v1    the first Vector2 instance to compare x-values
     * @param v2    the second Vector2 instance to compare x-values
     * @return      true if the x-values are equivalent
     */
    public static boolean equalsX(Vector2 v1, Vector2 v2) {
        return (v1 instanceof Vector2 && v2 instanceof Vector2) && (v1.x == v2.x);
    }
   
    /** 
     * Compare the y-value of two Vector2 instances.
     *
     * @param v1    the first Vector2 instance to compare y-values
     * @param v2    the second Vector2 instance to compare y-values
     * @return      true if the y-values are equivalent
     */
    public static boolean equalsY(Vector2 v1, Vector2 v2) {
        return (v1 instanceof Vector2 && v2 instanceof Vector2) && (v1.y == v2.y);
    }
    
    /**
     * Get a Vector2 with the smallest values of two Vector2 instances.
     *
     * @param v1    the first Vector2 instance to compare values
     * @param v2    the second Vector2 instance to compare values
     * @return      a new Vector2 instance with the smallest values
     */
    public static Vector2 smallest(Vector2 v1, Vector2 v2) {
        if (!(v1 instanceof Vector2 && v2 instanceof Vector2)) {
            return new Vector2();
        }
        
        double x = (v1.x <= v2.x) ? v1.x : v2.x;
        double y = (v1.y <= v2.y) ? v1.y : v2.y;
        
        return new Vector2(x, y);
    }
    
    /**
     * Get a Vector2 with the largest values of two Vector2 instances.
     *
     * @param v1    the first Vector2 instance to compare values
     * @param v2    the second Vector2 instance to compare values
     * @return      a new Vector2 instance with the largest values
     */
    public static Vector2 largest(Vector2 v1, Vector2 v2) {
        if (!(v1 instanceof Vector2 && v2 instanceof Vector2)) {
            return new Vector2();
        }
        
        int x = (v1.x >= v2.x) ? v1.x : v2.x;
        int y = (v1.y >= v2.y) ? v1.y : v2.y;
        
        return new Vector2(x, y);
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
     * Get a Vector2 with the smallest values with another Vector2
     *
     * @param v  the Vector2 instance to compare values
     * @return   a new Vector2 instance with the smallest values
     * @see      #smallest(Vector2 v1, Vector2 v2)
     */
    public Vector2 smallest(Vector2 v) {
        return smallest(this, v);
    }
   
    /**
     * Get a Vector2 with the largest values with another Vector2
     *
     * @param v  the Vector2 instance to compare values
     * @return   a new Vector2 instance with the largest values
     * @see      #largest(Vector2 v1, Vector2 v2)
     */
    public Vector2 largest(Vector2 v) {
        return largest(this, v);
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
     * @see     Object#equals(Object obj)
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        
        if (!(obj instanceof Vector2)) {
            return false;
        }
       
        Vector2 v = (Vector2) obj;
       
        return this.equalsX(v) && this.equalsY(v);
    }
}
