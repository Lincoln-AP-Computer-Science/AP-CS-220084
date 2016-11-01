import java.util.*;

public class PP_4_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = {1, 5, 10, 50, 100, 500, 1000};
        char[] letters = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        
        int input, index = 0;
        char[] outputChars = new char[112]; // Largest number in Roman Numerals is 888 (DCCCLXXXVIII)
        String outputString;
        
        System.out.println("Input a number to convert to Roman Numerals:");
        input = sc.nextInt();
        
        
        System.out.println(input);
        while (input != 0) {
            for (int i = numbers.length; i > 0; i--) {
                if (input >= numbers[i - 1]) {
                    input -= numbers[i - 1];
                    outputChars[index] = letters[i - 1];
                    index++;
                    break;
                } else if (input >= numbers[i - 1] - 1) {
                    input -= numbers[i - 1] - 1;
                    outputChars[index] = letters[0];
                    index++;
                    outputChars[index] = letters[i - 1];
                    index++;
                    break;
                }
            }
        }
        System.out.println(input);
        char[] endChars = new char[index];
        for (int i = 0; i < endChars.length; i++) {
            endChars[i] = outputChars[i];
        }
        
        outputString = new String(endChars);
        System.out.println(outputString);
    }
}
