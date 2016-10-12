public class ExerciseFour {
    
    public static void main(String[] args) {
        ExerciseFour ef = new ExerciseFour();
    }
    
    public double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    public void calculate(int[][] allPoints) {
        int[] points = new int[allPoints.length];
        System.out.print(points.length);
    }
}
