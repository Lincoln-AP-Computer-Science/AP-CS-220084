public class PP_3_2 {
    
    public static void main(String[] args) {
        PP_3_2 p = new PP_3_2();
        
        p.interest(1000, 100, 6.25);
    }
    
    public void interest(int inital, int deposit, double interest) {
        double balance = inital;
        System.out.println("+-----------------------------------------------------------+");
        System.out.println("|\tYear\t|\tInterest\t|\tNew Deposit\t|\tNew Balance\t|");
        for (int i = 0; i <= 25; i++) {
            System.out.print("|\t" + i + "\t\t");
            System.out.print("|\t" + interest  + "\t\t");
            if (i == 0) {
                System.out.print("|\t" + 0 + "\t\t\t");
            } else {
                System.out.print("|\t" + deposit + "\t\t\t");
            }
            System.out.println("|\t" + balance + "\t\t|");
        }
    }
}
