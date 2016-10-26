import java.util.*;

public class Lesson_3_11 {

    public static void main(String[] args) {
        Lesson_3_11 lesson = new Lesson_3_11();
        
        lesson.question1();
    }
    
    public void question1() {
        int a = 2;
        int x = 0;
        for (int i = x; x < 30; x++) {
            System.out.println("Spongebob Squarepants! " + x);
        }
        System.out.println("Spongebob Squarepants! " + x);
    }
    
    public void question2() {
        int sum = 1000;
        int total, count1, count2;
        Scanner console = new Scanner(System.in);
        System.out.println("Is your money multiplied 1 or 2 times?");
        int times = console.nextInt();
        System.out.println("And how much are you contributing?");
        int donation = console.nextInt();
    }
}
