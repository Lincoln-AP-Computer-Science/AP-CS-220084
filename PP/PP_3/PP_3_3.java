// Write a program that shows the total number of presents in "The Twelve Days of Christmas"

public class PP_3_3 {
    
    public static void main(String[] args) {
        PP_3_3 p = new PP_3_3();
        
        System.out.println("+-------+-------------------+---------------+");
        System.out.println("|Day\t|Presents Received\t|Total Presents\t|");
        System.out.println("+-------+-------------------+---------------+");
        for (int i = 1; i <= 12; i++) {
            System.out.print("|" + i + "\t\t");
            System.out.print("|" + i + "\t\t\t\t\t");
            System.out.println("|" + p.addSum(i) + "\t\t\t\t|");
            System.out.println("+-------+-------------------+---------------+");
        }
        
    }
    
    public int addSum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
