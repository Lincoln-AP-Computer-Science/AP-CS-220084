// Import java.util.* to import Scanner
import java.util.*;

// Class head
public class ProcessingNumbers {
    
    // Main function
    public static void main(String[] args) {
        // Create scanner object
        Scanner sc = new Scanner(System.in);
        
        // Declare the smallest, largest, sumEven, and largestEven integers
        int smallest, largest, sumEven, largestEven;
        
        // Query the user for the array size
        System.out.println("Input number of numbers to compare:");
        
        // Set the array size to the user input
        int[] nums = new int[sc.nextInt()];
        
        // Query the user to input numbers
        System.out.println("Input numbers separated by a new line or space:");
        // Loop through all available array values
        for(int i = 0; i < nums.length; i++) {
            // Ensure that there is another integer
            if (sc.hasNextInt()) {
                // Set current array value to the next integer
                nums[i] = sc.nextInt();
            }
        }
        
        // Minimum and Maximum value ensure the next number is always bigger or smaller.
        largest = Integer.MIN_VALUE;
        smallest = Integer.MAX_VALUE;
        sumEven = 0;
        largestEven = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            // Check if the number is even
            if (nums[i] % 2 == 0) {
                // Add number to the sum
                sumEven += nums[i];
                // Check if the number is greater than the largest even
                if (nums[i] > largestEven) {
                    // Set largest even to the current number
                    largestEven = nums[i];
                }
            }
            
            // Check if the number is greater than the largest number
            if (nums[i] > largest) {
                largest = nums[i];
            }
            
            // Check if the number is less than the smallest number
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        
        // Print output
        System.out.println("Smallest integer: " + smallest);
        System.out.println("Largest integer: " + largest);
        System.out.println("Sum of even integers: " + sumEven);
        System.out.println("Largest even integer: " + largestEven);
    }
}
