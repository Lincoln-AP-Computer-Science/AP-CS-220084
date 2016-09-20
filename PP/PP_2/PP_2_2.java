public class PP_2_2 {

    public static void main(String[] args) {
        System.out.print("+");
        for (int i = 0; i < 6; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|");
                for (int k = 0; k < 2 - j; k++) {
                    System.out.print(" ");
                }
                System.out.print("^");
                for (int k = 0; k < j; k++) {
                    System.out.print("  ");
                }
                System.out.print("^");
                for (int k = 0; k < 2 - j; k++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
        }

        System.out.print("+");
        for (int i = 0; i < 6; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|");
                for (int k = 0; k < 2 - j; k++) {
                    System.out.print(" ");
                }
                System.out.print("v");
                for (int k = 0; k < j; k++) {
                    System.out.print("  ");
                }
                System.out.print("v");
                for (int k = 0; k < 2 - j; k++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
        }

        System.out.print("+");
        for (int i = 0; i < 6; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
