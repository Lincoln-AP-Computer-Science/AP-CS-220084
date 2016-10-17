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
        
        System.out.println(ef.calculate(names, points));
    }
    
    public double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    public String calculate(String[] places, int[][] points) {
        double[][] dist = new double[points.length][points.length];
        String[] furthest = new String[2];
        
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                dist[i][j] = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
            }
        }
        
        double longestDistance = -1;
        for (int k = 0; k < dist.length; k++) {
            for (int l = 0; l < dist[0].length; l++) {
                if (dist[k][l] > longestDistance) {
                    longestDistance = dist[k][l];
                    furthest[0] = places[k] + " at " + Arrays.toString(points[k]);
                    furthest[1] = places[l] + " at " + Arrays.toString(points[l]);
                }
            }
        }
        
        return "The longest distance is " + longestDistance + " miles between " + furthest[0] + " and " + furthest[1];
    }
}
