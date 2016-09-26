// Write a progam that produces [a specific pattern].

public class PP_2_1 {
    
    public static void main(String[] args) {
        PP_2_1 p = new PP_2_1();
        
        for(int i = 7; i > 0; i--) {
            p.leftCurtain(i);
            p.centerPattern(i);
            p.rightCurtain(i);
            System.out.println();
        }
    }
    
    public void leftCurtain(int i) {
        for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
        }
        for (int j = 0; j < 8 - i; j++) {
            System.out.print(" ");
        }
    }
    
    public void centerPattern(int i) {
        for(int j = 0; j < i - 1; j++) {
            System.out.print("//");
        }
        for(int j = 0; j < 7 - i; j++) {
            System.out.print("\\\\");
        }
    }
    
    public void rightCurtain(int i) {
        for(int j = 0; j < 8 - i; j++) {
            System.out.print(" ");
        }
        for(int j = 0; j < i - 1; j++) {
            System.out.print("*");
        }
    }
}
