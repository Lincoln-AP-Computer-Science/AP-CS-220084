// Write a progam that produces [stairs]. Make it possible to change the number of stairs in the figure.

public class PP_2_5 {
    final int STAIRS = 5;
    
    public static void main(String[] args) {
        PP_2_5 p = new PP_2_5();
        
        for (int i = 0; i < p.STAIRS; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 5 * (p.STAIRS - (i + 1)); k++) {
                    System.out.print(" ");
                }
                switch (j) {
                    case 0:
                        System.out.print("  o  ******");
                        for (int k = 0; k < 5 * i; k++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                        break;
                    case 1:
                        System.out.print(" /|\\ *");
                        for (int k = 0; k < 5 * (i + 1); k++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                        break;
                    case 2:
                        System.out.print(" / \\ *");
                        for (int k = 0; k < 5 * (i + 1); k++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                        break;
                }
            }
        }
        for (int i = 0; i < (p.STAIRS + 1) * 5 + 2; i++) {
            System.out.print("*");
        }
    }
}
