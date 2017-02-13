public class ExerciseTwo {
    
    public static void main(String[] args) {
        ExerciseTwo et = new ExerciseTwo();
        
        System.out.print("A circle with a diameter of 1 has a circumference of ");
        System.out.println(et.roadTrip(1));
    }
    
    public double roadTrip(int diameter) {
        return Math.PI * diameter;
    }
}
