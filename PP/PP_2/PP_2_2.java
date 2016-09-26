// Write a program the produces [a specific pattern].

public class PP_2_2 {

    public static void main(String[] args) {
        PP_2_2 p = new PP_2_2();
        
        p.divider();

        for (int i = 0; i < 2; i++) {
            p.arrow("^");
        }

        p.divider();

        for (int i = 0; i < 2; i++) {
            p.arrow("v");
        }

        p.divider();
    }
    
    public void divider() {
        System.out.print("+");
        for (int i = 0; i < 6; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    
    public void arrow(String character) {
        for (int j = 0; j < 3; j++) {
            System.out.print("|");
            for (int k = 0; k < 2 - j; k++) {
                System.out.print(" ");
            }
            System.out.print(character);
            for (int k = 0; k < j; k++) {
                System.out.print("  ");
            }
            System.out.print(character);
            for (int k = 0; k < 2 - j; k++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
