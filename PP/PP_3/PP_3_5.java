// Find the distance between two cities

public class PP_3_5 {

    final double earthRadius = 6372.795;

    public static void main(String[] args) {
        PP_3_5 p = new PP_3_5();
        
        System.out.println(p.distance(36.12, -86.67, 33.94, -118.4));
    }
    
    public double distance(double x1deg, double y1deg, double x2deg, double y2deg) {
        double x1, y1, x2, y2;
        x1 = Math.toRadians(x1deg);
        y1 = Math.toRadians(y1deg);
        x2 = Math.toRadians(x2deg);
        y2 = Math.toRadians(y2deg);
        
        double radDiff;
        radDiff = Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y2 - y1));
        
        return radDiff * earthRadius;
    }
}
