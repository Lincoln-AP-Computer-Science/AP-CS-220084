import java.util.*;

public class PP_4_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PP_4_1 pp = new PP_4_1();
        
        int input = 0;
        
        // These statements are in a loop so that the program cannot continue unless the input value is within the bounds.
        while (input < 1 || input > 1000) {
            System.out.println("Input a number between 1 and 1000 to convert to Roman Numerals:");
            input = sc.nextInt();
            
            // The following outputs a message if the input value is outside the bounds.
            if (input < 1) {
                System.out.println("Try Again! Input number should be greater than or equal to 1.");
            } else if (input > 1000) {
                System.out.println("Try Again! Input number should be less than or equal to 1000.");
            }
        }
        
        // Run the conversion
        System.out.println(pp.convertToRomanNumerals(input));
    }
    
    public String convertToRomanNumerals(int n) {
        
        // An array of the numbers with their corresponding letters in a separate array.
        int[] numbers = {1, 5, 10, 50, 100, 500, 1000};
        char[] letters = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        
        // The num variable signifies the value currently being processed and index signifies which character to change.
        int num = n, index = 0;
        
        // I was too lazy to use an ArrayList, so instead I created a list with a size of 12 because the largest output (DCCCLXXXVIII)
        // is 12 characters.
        char[] outputChars = new char[12];

        // Repeat the loop until num is 0, signifying that no more letters need to be outputted.
        while (num != 0) {
            
            // i is the index at which the output character is
            for (int i = numbers.length; i > 0; i--) {
                
                // The met variable is true when num is equal to one of the numbers in the numbers array.
                boolean met = false;
                if (num >= numbers[i - 1]) {
                    met = true;
                } else {
                    
                    // This loop support IV, IX, XL, XC, CD, and CM by iterating through the numbers 100, 10, and 1 and placing the
                    // letter that comes before into outputChars.
                    for (int j = 100, k = 4; j > 0; j /= 10, k -= 2) {
                        if (num >= numbers[i - 1] - j && num > j) {
                            
                            // Without num += j, the letter that comes after would not be placed. For example, if the number is 4,
                            // the letter I would be placed, but since 4 is less than 5 (V), V would not be placed.
                            num += j;
                            outputChars[index] = letters[k];
                            index++;
                            met = true;
                            break;
                        }
                    }
                    
                }
                if (met) {
                    
                    // The following subtracts the value of the character that will be placed and places that character in ouputChars.
                    // The subtraction enusres that the output value is equal to the input value because the input minus the output
                    // will be 0.
                    num -= numbers[i - 1];
                    outputChars[index] = letters[i - 1];
                    index++;
                    break;
                }
            }
        }
        
        // Copy the ouputChars array into a new, accurately sized character array.
        char[] endChars = new char[index];
        for (int i = 0; i < endChars.length; i++) {
            endChars[i] = outputChars[i];
        }
        
        // Convert the output to a String
        return String.valueOf(endChars);
    }
}
