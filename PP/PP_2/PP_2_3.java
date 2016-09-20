// Write a program that produces [a specific pattern].

public class PP_2_3 {

    public static void main(String[] args) {
        System.out.print("+");
        for (int i = 0; i < 9; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for (int i = 0; i < 8; i++) {
            System.out.print("|");
            if (i < 4) {
                for (int j = 0; j < 4 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("/");
                }
            } else {
                for (int j = 0; j < i - 3; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 7 - i; j++) {
                    System.out.print("\\");
                }
            }
            System.out.print("*");
            if (i < 4) {
                for (int j = 0; j < i; j++) {
                    System.out.print("\\");
                }
                for (int j = 0; j < 4 - i; j++) {
                    System.out.print(" ");
                }
            } else {
                for (int j = 0; j < 7 - i; j++) {
                    System.out.print("/");
                }
                for (int j = 0; j < i - 3; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }

        System.out.print("+");
        for (int i = 0; i < 9; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for (int i = 0; i < 8; i++) {
            System.out.print("|");
            if (i < 4) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 3 - i; j++) {
                    System.out.print("\\");
                }
            } else {
                for (int j = 0; j < 8 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i - 4; j++) {
                    System.out.print("/");
                }
            }
            System.out.print("*");
            if (i < 4) {
                for (int j = 0; j < 3 - i; j++) {
                    System.out.print("/");
                }
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" ");
                }
            } else {
                for (int j = 0; j < i - 4; j++) {
                    System.out.print("\\");
                }
                for (int j = 0; j < 8 - i; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }

        System.out.print("+");
        for (int i = 0; i < 9; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
