// Write a program that produces calendars as output

public class PP_3_6 {

    public static void main(String[] args) {
        PP_3_6 p = new PP_3_6();
        
        p.calendar(6, 31);
    }

    public void calendar(int firstSunday, int days) {
        int columns;
        System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
        System.out.println("+------+------+------+------+------+------+------+");
        
        if (days == 28 && firstSunday == 1) {
            columns = 4;
        } else {
            if (firstSunday == 1) {
                columns = 5;
            } else {
                if (5 * 7 - (8 - firstSunday) >= 31) {
                    columns = 5;
                } else {
                    columns = 6;
                }
            }
        }
        
        int d = 1;
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 && j < 8 - firstSunday && firstSunday > 1) {
                    if (j == 0) {
                        System.out.print("|      |");
                    } else {
                        System.out.print("      |");
                    }
                } else if (d <= days) {
                    String prefix;
                    if (j == 0) {
                        prefix = "|  ";
                    } else {
                        prefix = "  ";
                    }
                    
                    if (d < 10) {
                        System.out.print(prefix + d++ + "   |");
                    } else {
                        System.out.print(prefix + d++ + "  |");
                    }
                } else {
                    System.out.print("      |");
                }
            }
            System.out.println();
        }
        
        System.out.println("+------+------+------+------+------+------+------+");    
    }
}
