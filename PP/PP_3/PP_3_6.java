// Write a program that produces calendars as output

public class PP_3_6 {

    public static void main(String[] args) {
        PP_3_6 p = new PP_3_6();
        
        p.calendar(6, 31);
    }

    public void calendar(int firstSunday, int days) {
        if (firstSunday > 1) {
            int[][] cal = new int[5][7];
        }
        System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
        System.out.println("+------+------+------+------+------+------+------+");
    }
}
