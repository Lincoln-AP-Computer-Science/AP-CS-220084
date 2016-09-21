// Wrote a program that produces as output what vaguely resmbles a textbook. Make it possible to change
// the size of the figure.

public class PP_2_8 {
    final int SIZE = 10;
    
    public static void main(String[] args) {
        PP_2_8 p = new PP_2_8();

        for (int i = 0; i < p.SIZE + 1; i++) {
            System.out.print(" ");
        }
        System.out.print("+");
        for (int i = 0; i < p.SIZE * 3; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for (int i = 0; i < p.SIZE; i++) {
            for (int j = 0; j < p.SIZE - i; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 0; j < p.SIZE - (i + 1); j++) {
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
        for (int i = 0; i < p.SIZE * 3; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < p.SIZE; i++) {
            System.out.print("/");
        }
        System.out.println();

        for (int i = 0; i < p.SIZE / 2; i++) {
            System.out.print("|");
            if (p.SIZE * 3 > 22) {
                if (p.SIZE % 2 == 0) {
                    for (int j = 0; j < (p.SIZE * 3 - 22) / 2; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("Building Java Programs");
                   for (int j = 0; j < (p.SIZE * 3 - 22) / 2; j++) {
                       System.out.print(" ");
                    }
                } else {
                    for (int j = 0; j < (p.SIZE * 3 - 22) / 2; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("Building Java Programs");
                   for (int j = 0; j < (p.SIZE * 3 - 22) / 2 + 1; j++) {
                       System.out.print(" ");
                    }
                }
            } else {
                for (int j = 0; j < p.SIZE * 3; j++) {
                    System.out.print(" ");
                }
            }
            System.out.print("|");
            for (int j = 0; j < p.SIZE / 2 - i; j++) {
                System.out.print("//");
            }
            System.out.println();
        }

        System.out.print("+");
        for (int i = 0; i < p.SIZE * 3; i++) {
            System.out.print("-");
        }
        System.out.print("+");
    }
}
