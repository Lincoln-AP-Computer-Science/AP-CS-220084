import java.util.*;
import java.lang.*;

public class ExerciseFour {
    
    public static void main(String[] args) {
        ExerciseFour ef = new ExerciseFour();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the number of locations to compare:");
        int places = sc.nextInt();
        String[] names = new String[places];
        int[][] points = new int[places][2];
        
        for (int i = 0; i < places; i++) {
            System.out.println("Input a new location name:");
            sc.nextLine();
            names[i] = sc.nextLine();
            System.out.println("Input the X coordinate of that location:");
            points[i][0] = sc.nextInt();
            System.out.println("Input the Y coordinate of that location:");
            points[i][1] = sc.nextInt();
        }
        
        // Baltimare: (29, 16)
        // Manehattan: (34, 8)
        // Los Pegasus: (6, 19)
        // Neighagra Falls: (22, 7)
        // Badlands: (25, 24)
        // Ponyville: (16, 14)
        
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
        
        for (int i = 0; i < furthest.length; i++) {
            furthest[i] = furthest[i].replace('[', '(');
            furthest[i] = furthest[i].replace(']', ')');
        }
        
        return "The longest distance is " + longestDistance + " miles between " + furthest[0] + " and " + furthest[1] + ".";
    }
}
