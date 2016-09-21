// Write a program that produces [a rocket ship]. Make it possible to change the size.

public class PP_2_6 {
    final int SIZE = 3;
    
    public static void main(String[] args) {
        PP_2_6 p = new PP_2_6();
        
        for (int i = 0; i < p.SIZE * 2 - 1; i++) {
            for(int j = 0; j < p.SIZE * 2 - (i + 1); j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++) {
                System.out.print("/");
            }
            System.out.print("**");
            for(int j = 0; j < i + 1; j++) {
                System.out.print("\\");
            }
            for(int j = 0; j < p.SIZE * 2 - (i + 1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        
        p.drawDivider();
        
        for(int i = 0; i < p.SIZE * 2; i++) {
            System.out.print("|");
            for(int j = 0; j < 2; j++) {
                if (i < p.SIZE) {
                    for (int k = 0; k < p.SIZE - (i + 1); k++) {
                        System.out.print(".");
                    }
                    for (int k = 0; k < (i + 1) * 2; k++) {
                        if(k % 2 == 0) {
                            System.out.print("/");
                        } else {
                            System.out.print("\\");
                        }
                    }
                    for (int k = 0; k < p.SIZE - (i + 1); k++) {
                        System.out.print(".");
                    }
                } else {
                    for (int k = 0; k < i - p.SIZE; k++) {
                        System.out.print(".");
                    }
                    for (int k = 0; k < (p.SIZE * 2 - i) * 2; k++) {
                        if(k % 2 == 0) {
                            System.out.print("\\");
                        } else {
                            System.out.print("/");
                        }
                    }
                    for (int k = 0; k < i - p.SIZE; k++) {
                        System.out.print(".");
                    }
                }
            }
            System.out.println("|");
        }
        
        p.drawDivider();
        
        for(int i = 0; i < p.SIZE * 2; i++) {
            System.out.print("|");
            for(int j = 0; j < 2; j++) {
                if (i < p.SIZE) {
                    for (int k = 0; k < i; k++) {
                        System.out.print(".");
                    }
                    for (int k = 0; k < (p.SIZE - i) * 2; k++) {
                        if(k % 2 == 0) {
                            System.out.print("\\");
                        } else {
                            System.out.print("/");
                        }
                    }
                    for (int k = 0; k < i; k++) {
                        System.out.print(".");
                    }
                } else {
                    for (int k = 0; k < p.SIZE * 2 - (i + 1); k++) {
                        System.out.print(".");
                    }
                    for (int k = 0; k < (i + 1 - p.SIZE) * 2; k++) {
                        if(k % 2 == 0) {
                            System.out.print("/");
                        } else {
                            System.out.print("\\");
                        }
                    }
                    for (int k = 0; k < p.SIZE * 2 - (i + 1); k++) {
                        System.out.print(".");
                    }
                }
            }
            System.out.println("|");
        }
        
        p.drawDivider();
        
        for (int i = 0; i < p.SIZE * 2 - 1; i++) {
            for(int j = 0; j < p.SIZE * 2 - (i + 1); j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++) {
                System.out.print("/");
            }
            System.out.print("**");
            for(int j = 0; j < i + 1; j++) {
                System.out.print("\\");
            }
            for(int j = 0; j < p.SIZE * 2 - (i + 1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
    public void drawDivider() {
        System.out.print("+");
        for(int i = 0; i < SIZE * 4; i++) {
            if(i % 2 == 0) {
                System.out.print("=");
            } else {
                System.out.print("*");
            }
        }
        System.out.println("+");
    }
}
