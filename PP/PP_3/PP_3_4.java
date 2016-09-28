// Write a program that promps for the lengths of the sides of a triangle and reports the three angles

public class PP_3_4 {
    
    public static void main(String[] args) {
        PP_3_4 p = new PP_3_4();
        
        System.out.println(p.getAngles(8, 6, 7));
    }
    
    public String getAngles(double a, double b, double c) {
        double cosA = (b * b + c * c - a * a) / (2 * b * c);
        double cosB = (a * a + c * c - b * b) / (2 * a * c);
        double cosC = (a * a + b * b - c * c) / (2 * a * b);
        double aVal = Math.toDegrees(Math.acos(cosA));
        double bVal = Math.toDegrees(Math.acos(cosB));
        double cVal = Math.toDegrees(Math.acos(cosC));
        String result = aVal + ", " + bVal + ", " + cVal;
        
        return result;
    }
}
