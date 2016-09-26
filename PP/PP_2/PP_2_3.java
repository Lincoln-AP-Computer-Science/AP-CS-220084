// Write a program that produces [a specific pattern].

public class PP_2_3 {
    int size = 8;

    public static void main(String[] args) {
        PP_2_3 p = new PP_2_3();
        
        if (p.size % 2 == 1) {
            p.size -= 1;
        }
        
        p.divider();

        for (int i = 0; i < p.size; i++) {
            System.out.print("|");
            if (i < p.size / 2) {
                for (int j = 0; j < p.size / 2 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("/");
                }
            } else {
                for (int j = 0; j < i - (p.size / 2 - 1); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (p.size - 1) - i; j++) {
                    System.out.print("\\");
                }
            }
            System.out.print("*");
            if (i < p.size / 2) {
                for (int j = 0; j < i; j++) {
                    System.out.print("\\");
                }
                for (int j = 0; j < p.size / 2 - i; j++) {
                    System.out.print(" ");
                }
            } else {
                for (int j = 0; j < (p.size - 1) - i; j++) {
                    System.out.print("/");
                }
                for (int j = 0; j < i - (p.size / 2 - 1); j++) {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }

        p.divider();
        
        for (int i = 0; i < p.size; i++) {
            System.out.print("|");
            if (i < p.size / 2) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (p.size / 2 - 1) - i; j++) {
                    System.out.print("\\");
                }
            } else {
                for (int j = 0; j < p.size - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i - p.size / 2; j++) {
                    System.out.print("/");
                }
            }
            System.out.print("*");
            if (i < p.size / 2) {
                for (int j = 0; j < (p.size / 2 - 1) - i; j++) {
                    System.out.print("/");
                }
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" ");
                }
            } else {
                for (int j = 0; j < i - p.size / 2; j++) {
                    System.out.print("\\");
                }
                for (int j = 0; j < p.size - i; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }

        p.divider();
    }
    
    public void divider() {
        System.out.print("+");
        for (int i = 0; i < size + 1; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
