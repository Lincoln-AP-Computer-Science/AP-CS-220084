import java.util.*;

public class ExerciseFour {
    
    public static void main(String[] args) {
        ExerciseFour ef = new ExerciseFour();
        
        String[] names = {
            "Baltimare",
            "Manehattan",
            "Los Pegasus",
            "Neighagra Falls",
            "Badlands",
            "Ponyville"
        };
        
        int[][] points = {
                {29, 16},
                {34, 8},
                {6, 19},
                {22, 7},
                {25, 24},
                {16, 14}
            };
        
        ef.calculate(names, points);
    }
    
    public void distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    public String calculate(String[] places, int[][] allPoints) {
        int[][] points = allPoints;
        double[][] dist = new double[points.length][points.length];
        int x1, y1, x2, y2;
        double longestDistance = dist[0][0];
        String[] furthest = new String[2];
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
                    furthest[0] = points[k];
                    furthest[1] = points[l];
                }
            }
        }
        
        System.out.println("The longest distance is " + longestDistance + " between " + furthest[0] + " and " + furthest[1]);
    }
}
