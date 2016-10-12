public class ExerciseThree {
    
    public static void main(String[] args) {
        ExerciseThree et = new ExerciseThree();
        
        et.calculate(0, 0, 3, 4, 3, 0);
    }
    
    public double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    public double[] lawOfCosines(double a, double b, double c) {
        double A = Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2);
        A /= 2 * b * c;
        A = Math.toDegrees(Math.acos(A));
        
        double B = Math.pow(c, 2) + Math.pow(a, 2) - Math.pow(b, 2);
        B /= 2 * c * a;
        B = Math.toDegrees(Math.acos(B));
        
        double C = 180 - A - B;
        
        double[] angles = new double[3];
        angles[0] = A;
        angles[1] = B;
        angles[2] = C;
        
        return angles;
    }
    
    public void calculate(int x1, int y1, int x2, int y2, int x3, int y3) {
        double[] distances = new double[3];
        double[] angles = new double[3];
        
        distances[0] = distance(x1, y1, x2, y2);
        distances[1] = distance(x2, y2, x3, y3);
        distances[2] = distance(x3, y3, x1, y1);
        
        for (int i = 0; i < 3; i++) {
            angles[i] = lawOfCosines(distances[1], distances[2], distances[0])[i];
        }
        
        System.out.print("From Point One, face Point Three and turn ");
        System.out.print(angles[0]);
        System.out.print(" degrees to the left and walk ");
        System.out.print(distances[0]);
        System.out.println(" to reach Point Two.");
        
        System.out.print("From Point Two, face Point One and turn ");
        System.out.print(angles[1]);
        System.out.print(" degrees to the left and walk ");
        System.out.print(distances[1]);
        System.out.println(" to reach Point Three.");
        
        System.out.print("To return to Point One from Point Three, face Point Two and turn ");
        System.out.print(angles[2]);
        System.out.print(" degrees to the left and walk ");
        System.out.print(distances[2]);
        System.out.println(" miles.");
    }
}
