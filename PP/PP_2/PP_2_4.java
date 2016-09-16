public class PP_2_4 {
    public static void main(String[] args) {
        for(int i = 0; i < 11; i++) {
            if(i == 0 || i == 10) {
                System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
            } else if (i == 5) {
                System.out.println("     ||");
            } else if (i < 5) {
                for(int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("\\");
                for(int j = 0; j < 5 - i; j++) {
                    System.out.print("::");
                }
                System.out.print("/");
                System.out.println();
            } else {
                for(int j = 0; j < 10 - i; j++) {
                    System.out.print(" ");
                }
                System.out.print("/");
                for(int j = 0; j < i - 5; j++) {
                    System.out.print("::");
                }
                System.out.print("\\");
                System.out.println();
            }
        }
    }
}
