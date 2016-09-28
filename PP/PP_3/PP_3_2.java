// [Compound Interest]

public class PP_3_2 {

    public static void main(String[] args) {
        PP_3_2 p = new PP_3_2();

        p.interest(1000, 100, 6.25);
    }

    public void interest(int inital, int deposit, double interest) {
        double balance = inital;
        String strbalance = Double.toString(balance);
        System.out.print("+");
        for(int i = 0; i < 59; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.println("|\tYear\t|\tInterest\t|\tNew Deposit\t|\tNew Balance\t|");
        for (int i = 0; i <= 25; i++) {
            for (int j = 0; j < strbalance.length(); j++) {
                if(strbalance.charAt(j) == '.') {
                    if (j < strbalance.length() - 2) {
                        strbalance = strbalance.substring(0, j + 3);
                    } else if (j < strbalance.length() - 1) {
                        strbalance = strbalance.substring(0, j + 2) + "0";
                    }
                }
            }
        
            System.out.print("|\t" + i + "\t\t");
            System.out.print("|\t" + interest + "%\t\t");
            if (i == 0) {
                System.out.print("|\t" + 0 + "\t\t\t");
            } else {
                System.out.print("|\t" + deposit + "\t\t\t");
            }
            System.out.println("|\t" + strbalance + "\t\t|");

            balance = deposit * (i + 1);
            balance += inital * Math.pow((1 + interest / 100), i + 1);
            strbalance = Double.toString(balance);
        }
        System.out.print("+");
        for(int i = 0; i < 59; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
