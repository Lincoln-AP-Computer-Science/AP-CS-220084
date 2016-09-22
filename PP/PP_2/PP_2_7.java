// Write a program theat produces [what vaguely resembles the Seattle Space Needle].

public class PP_2_7 {
    final int SIZE = 4;
    
    public static void main(String[] args) {
        PP_2_7 p = new PP_2_7();
        
        p.tower();
        
        p.top();
                
        p.divider();
        
        for (int i = 0; i < p.SIZE; i++) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            System.out.print("\\_/");
            for (int j = 0; j < p.SIZE * 6 - i * 4 - 4; j++) {
                if (j % 2 == 0) {
                    System.out.print("\\");
                } else {
                    System.out.print("/");
                }
            }
            System.out.println("\\_/");
        }
        
        p.tower();
        
        for(int i = 0; i < p.SIZE * 4; i++) {
            for (int j = 0; j < p.SIZE * 3 - 3; j++) {
                System.out.print(" ");
            }
            System.out.println("|%%||%%|");
        }
        
        p.top();
        
        p.divider();
    }
    
    public void tower() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE * 3; j++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }
    
    public void divider() {
        System.out.print("|");
        for (int i = 0; i < SIZE * 6; i++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }
    
    public void top() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < (SIZE - (i + 1)) * 3; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    System.out.print("__/");
                } else {
                    System.out.print(":::");
                }
            }
            System.out.print("||");
            for (int j = 0; j < i + 1; j++) {
                if (j == i) {
                    System.out.print("\\__");
                } else {
                    System.out.print(":::");
                }
            }
            System.out.println();
        }

    }
}
