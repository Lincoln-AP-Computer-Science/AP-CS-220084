import java.util.*;

public class PP_4_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0, day = 0, year = 0; // input values for month, day, and year. 
        int daysSince = 0; // Counts days since 1/1/0001 (a monday)
        boolean invalid = true; // Checks if the date is invalid
        String weekday; // The day of the week at the end
        int[] daysInMonths = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // Corresponds with months of the year
        
        while (invalid) { // Accepts input and loops if the date invalid (Ignore mostly here)
            System.out.println("Input month, day, and year separated by spaces:");
            month = sc.nextInt();
            day = sc.nextInt();
            year = sc.nextInt();
            
            if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
                daysInMonths[1] = 29;
            }
            
            if (month < 1 || month > 12) {
                System.out.println("Month (" + month + ") is invalid!");
                invalid = true;
            } else if (day < 1 || day > daysInMonths[month - 1]) {
                System.out.println("Day (" + year + ") is invalid!");
                invalid = true;
            } else if (year < 1 || year > 9999) {
                System.out.println("Year (" + year + ") is invalid!");
                invalid = true;
            } else {
                invalid = false;
                break;
            }
        }
        
        for (int i = 1; i < year; i++) { // Loop through all years since "year 1"
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) { // Special leap year rules
                daysSince += 366; // Leap year has 366 days in a year
            } else {
                daysSince += 365; // Normal year has 365 days in a year
            }
        }
        
        for (int i = 1; i < month; i++) { // Loop through days of the month
            daysSince += daysInMonths[i - 1]; // Add the days in each month
        }
        
        daysSince += day - 1; // I honestly don't know why I have to subtract 1 but it works just go with it
        
        switch(daysSince % 7) {
            case 0: weekday = "Monday"; break;
            case 1: weekday = "Tuesday"; break;
            case 2: weekday = "Wednesday"; break;
            case 3: weekday = "Thursday"; break;
            case 4: weekday = "Friday"; break;
            case 5: weekday = "Saturday"; break;
            case 6: weekday = "Sunday"; break;
            default: weekday = "failed"; break;
        }
        System.out.println(month + "/" + day + "/" + year + " was a " + weekday + ".");
    }
}
