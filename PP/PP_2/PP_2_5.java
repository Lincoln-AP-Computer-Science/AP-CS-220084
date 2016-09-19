public class PP_2_5 {
    public static void main(String[] args) {
        System.out.println("test");
        final int stairs = 5;
        for (int i = 0; i < stairs; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 5 * (stairs - (i + 1)); k++) {
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
        for (int i = 0; i < (stairs + 1) * 5 + 2; i++) {
            System.out.print("*");
        }
    }
}
