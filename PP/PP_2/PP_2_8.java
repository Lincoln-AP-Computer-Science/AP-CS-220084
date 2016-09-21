// Wrote a program that produces as output what vaguely resmbles a textbook. Make it possible to change
// the size of the figure.

public class PP_2_8 {
    
    public static void main(String[] args) {
        final int SIZE = 10;

        for (int i = 0; i < SIZE + 1; i++) {
            System.out.print(" ");
        }
        System.out.print("+");
        for (int i = 0; i < SIZE * 3; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE - i; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 0; j < SIZE - (i + 1); j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    System.out.print("___");
                } else {
                    System.out.print("/__");
                }
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("/");
            }
            System.out.println();
        }

        System.out.print("+");
        for (int i = 0; i < SIZE * 3; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("/");
        }
        System.out.println();

        for (int i = 0; i < SIZE / 2; i++) {
            System.out.print("|");
            if (SIZE * 3 > 22) {
                for (int j = 0; j < (SIZE * 3 - 22) / 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("Building Java Programs");
                for (int j = 0; j < (SIZE * 3 - 22) / 2; j++) {
                    System.out.print(" ");
                }
            } else {
                for (int j = 0; j < SIZE * 3; j++) {
                    System.out.print(" ");
                }
            }
            System.out.print("|");
            for (int j = 0; j < SIZE / 2 - i; j++) {
                System.out.print("//");
            }
            System.out.println();
        }

        System.out.print("+");
        for (int i = 0; i < SIZE * 3; i++) {
            System.out.print("-");
        }
        System.out.print("+");
    }
}
