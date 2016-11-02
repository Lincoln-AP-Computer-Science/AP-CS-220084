import java.util.*;

public class PP_4_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PP_4_1 pp = new PP_4_1();
        
        int input = 0;
        
        while (input < 1 || input > 1000) {
            System.out.println("Input a number between 1 and 1000 to convert to Roman Numerals:");
            input = sc.nextInt();
            if (input < 1) {
                System.out.println("Try Again! Input number should be greater than or equal to 1.");
            } else if (input > 1000) {
                System.out.println("Try Again! Input number should be less than or equal to 1000.");
            }
        }
        
        System.out.println(pp.convertToRomanNumerals(input));
    }
    
    public String convertToRomanNumerals(int n) {
        int[] numbers = {1, 5, 10, 50, 100, 500, 1000};
        char[] letters = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int num = n, index = 0;
        char[] outputChars = new char[12];

        
        while (num != 0) {
            for (int i = numbers.length; i > 0; i--) {
                boolean met = false;
                if (num >= numbers[i - 1]) {
                    met = true;
                } else {
                    for (int j = 100, k = 4; j > 0; j /= 10, k -= 2) {
                        if (num >= numbers[i - 1] - j && num > j) {
                            num += j;
                            outputChars[index] = letters[k];
                            index++;
                            met = true;
                            break;
                        }
                    }
                    
                }
                if (met) {
                    num -= numbers[i - 1];
                    outputChars[index] = letters[i - 1];
                    index++;
                    break;
                }
            }
        }
        
        char[] endChars = new char[index];
        for (int i = 0; i < endChars.length; i++) {
            endChars[i] = outputChars[i];
        }
        
        return String.valueOf(endChars);
    }
}
