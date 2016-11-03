import java.util.*;

public class PP_4_4 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = cal.get(Calendar.YEAR);
        int doy = cal.get(Calendar.DAY_OF_YEAR);
        int day_1 = 0, day_2 = 0;
        int month_1, month_2;
        int dif_1, dif_2;
        
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            months[1] = 29;
        }
        
        System.out.println("Input first birthday month and day separated by spaces as numerals:");
        month_1 = sc.nextInt();
        day_1 += sc.nextInt();
        for (int i = 0; i < month_1; i++) {
            day_1 += months[i];
        }
        
        System.out.println("Input second birthday month and day separated by spaces as numerals:");
        month_2 = sc.nextInt();
        day_2 += sc.nextInt();
        for (int i = 0; i < month_2; i++) {
            day_2 += months[i];
        }
        
        if (doy < day_1) {
            dif_1 = day_1 - doy;
        } else {
            dif_1 = doy - day_1;
        }
        
        if (doy < day_2) {
            dif_2 = day_2 - doy;
        } else {
            dif_2 = doy - day_2;
        }
        
        if (dif_1 < dif_2) {
            System.out.println("Birthday 1 is sooner");
        } else if (dif_2 < dif_1) {
            System.out.println("Birthday 2 is sooner");
        } else {
            System.out.println("Both birthdays are the same.");
        }
    }
}
