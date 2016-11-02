import java.util.*;

public class PP_4_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double GPA_1, SAT_1, ACT_1, avg_1; // Stats for student 1
        double GPA_2, SAT_2, ACT_2, avg_2; // Stats for student 2
        
        System.out.println("Input Weighted GPA, SAT, and ACT scores for Student 1 separated by a space:");
        GPA_1 = sc.nextDouble();
        SAT_1 = sc.nextDouble();
        ACT_1 = sc.nextDouble();
        
        System.out.println("Input Weighted GPA, SAT, and ACT scores for Student 2 separated by a space:");
        GPA_2 = sc.nextDouble();
        SAT_2 = sc.nextDouble();
        ACT_2 = sc.nextDouble();
        
        avg_1 = (GPA_1 + SAT_1 + ACT_1) / (5 + 1600 + 36);
        avg_2 = (GPA_2 + SAT_2 + ACT_2) / (5 + 1600 + 36);
        
        if (avg_1 > avg_2) {
            System.out.println("Student 1 is more qualified.");
        } else if (avg_2 > avg_1) {
            System.out.println("Student 2 is more qualified.");
        } else {
            System.out.println("Both students are equally qualified.");
        }
    }
}
