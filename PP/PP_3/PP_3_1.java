// Write a program that produces images of Chirstmas trees as output.

public class PP_3_1 {
    
    public static void main(String[] args) {
        PP_3_1 p = new PP_3_1();
        
        p.tree(3, 4);
        
        System.out.println();
        
        p.tree(2, 5);
    }
    
    public void tree(int segments, int height) {
        for(int i = 0; i < segments; i++) {
            for (int j = i + 1; j < height + i + 1; j++) {
                for (int k = 0; k < (segments * height / 2) - j + 1; k++) {
                    System.out.print(" ");
                }
                for (int k = 1; k < j; k++) {
                    System.out.print("*");
                }
                System.out.print("*");
                for (int k = 1; k < j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for (int i = 0; i < segments * height / 2; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int i = 0; i < segments * height / 2 - 3; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 7; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
