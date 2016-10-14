import java.util.*;

public class ExerciseFour {
    
    public static void main(String[] args) {
        ExerciseFour ef = new ExerciseFour();
        
        int[][] points = {
                {0, 0}, 
                {3, 4}, 
                {3, 0}
            };
        
        System.out.print(ef.calculate(points));
    }
    
    public double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    public double calculate(int[][] allPoints) {
        int[][] points = allPoints;
        double[][] dist = new double[points.length][points.length];
        int x1, y1, x2, y2;
        double longestDistance = dist[0][0];
//         for(int i = 0; i < points.length; i++) {
//             System.out.println(Arrays.toString(points[i]));
//         }
        double[] distances = new double[points.length];
        for (int i = 0; i < points.length; i++) {
            x1 = points[i][0];
            y1 = points[i][1];
            
            for (int j = 0; j < points.length; j++) {
                if (j != i) {
                    x2 = points[j][0];
                    y2 = points[j][1];
                    
                    dist[i][j] = distance(x1, y1, x2, y2);
                }
            }
        }
        
        for (int k = 0; k < dist.length; k++) {
            for (int l = 0; l < dist[0].length; l++) {
                if (dist[k][l] > longestDistance) {
                    longestDistance = dist[k][l];
                }
            }
        }
        
        return longestDistance;
    }
}
