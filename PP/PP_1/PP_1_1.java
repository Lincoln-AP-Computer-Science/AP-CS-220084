// Write a program to spell out MISSISSIPPI in block letters (one per line)
public class PP_1_1 {
    public static void main(String[] args) {
        PP_1_1 p = new PP_1_1();
        p.M();
        p.I();
        p.S();
        p.S();
        p.I();
        p.S();
        p.S();
        p.I();
        p.P();
        p.P();
        p.I();
    }
    
    void M() {
        System.out.println("M     M");
        System.out.println("MM   MM");
        System.out.println("M M M M");
        System.out.println("M  M  M");
        System.out.println("M     M");
        System.out.println("M     M");
        System.out.println("M     M");
        System.out.println("");
    }
    
    void I() {
        System.out.println("IIIII");
        for (int _ = 0; _ < 5; _++) {
            System.out.println("  I  ");
        }
        System.out.println("IIIII");
        System.out.println("");
    }
    
    void S() {
        System.out.println(" SSSSS");
        System.out.println("S     S");
        System.out.println("S");
        System.out.println(" SSSSS");
        System.out.println("      S");
        System.out.println("S     S");
        System.out.println(" SSSSS");
        System.out.println("");
    }
    
    void P() {
        System.out.println("PPPPPP");
        System.out.println("P     P");
        System.out.println("P     P");
        System.out.println("PPPPPP");
        for (int _ = 0; _ < 3; _++) {
            System.out.println("P");
        }
    }
}
