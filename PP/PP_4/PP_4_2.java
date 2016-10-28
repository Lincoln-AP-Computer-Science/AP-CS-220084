import java.util.*;

public class PP_4_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0, day = 0, year = 0, leapYears, normalYears, daysSince;
        boolean invalid = true;
        String weekday;
        int[] daysInMonths = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        while (invalid) {
            System.out.println("Input month, day, and year separated by spaces:");
            month = sc.nextInt();
            day = sc.nextInt();
            year = sc.nextInt();
            
            if ((year % 100 == 0 || year % 4 != 0) && year % 400 != 0) {
                daysInMonths[1] = 28;
            }
            else if (year % 4 == 0) {
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
        
        leapYears = (year - 1) / 4;
        normalYears = (year - 1) - leapYears;
        
        daysSince = normalYears * 365 + leapYears * 366;
        for (int i = 1; i < month; i++) {
            daysSince += daysInMonths[i - 1];
        }
        daysSince += day - 1;
        
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
