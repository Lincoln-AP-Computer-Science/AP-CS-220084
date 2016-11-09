import java.util.*;

public class PP_4_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input;
        int[] numbers = new int[7];
        int seventh = 0;
        
        System.out.println("Type in your code:");
        input = sc.next().split("");
        
        for (int i = 1; i <= numbers.length; i++) {
            numbers[i - 1] = Integer.parseInt(input[i]);
        }
        
        for (int i = 0; i < numbers.length - 1; i++) {
            seventh += (i + 1) * numbers[i];
        }
        
        seventh %= 10;
        
        if (numbers[6] == seventh) {
            System.out.println("Correct!");
        } else {
            System.out.println("Mistyped!");
        }
        
        System.out.println(seventh);
    }
}
