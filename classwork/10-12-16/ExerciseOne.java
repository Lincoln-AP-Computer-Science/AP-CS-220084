public class ExerciseOne {
    
    public static void main(String[] args) {
        ExerciseOne eo = new ExerciseOne();
        
        System.out.print("Distance from Baltimare (29, 16) ");
        System.out.print("to Manehattan (34, 8) = ");
        System.out.println(eo.distance(29, 16, 34, 8));
        
        System.out.print("Distance from Los Pegasus (6, 19) ");
        System.out.print("to Neighagra Falls (22, 7) = ");
        System.out.println(eo.distance(6, 19, 22, 7));
        
        System.out.print("Distance from Badlands (25, 24) ");
        System.out.print("to Ponyville (16, 14) = ");
        System.out.println(eo.distance(25, 24, 16, 14));
    }
    
    public double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
