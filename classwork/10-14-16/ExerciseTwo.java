public class ExerciseTwo {
    
    public static void main(String[] args) {
        ExerciseTwo et = new ExerciseTwo();
        
        System.out.println("Problem 2a:");
        et.A("Hello, world");
        // Output:
        // world
        System.out.println();
        
        System.out.println("Problem 2b:");
        et.B("Hello, world");
        /* Output:
            Hello, world
            llo, world
            o, world
             world
            orld
            ld
        */
        System.out.println();
        
        System.out.println("Problem 2c:");
        et.C("Hello, world");
        /* Output:
            d
            rld
            world
            , world
            lo, world
            ello, world
        */
        System.out.println();
        
        System.out.println("Problem 2d:");
        et.D("Hello, world");
        /* Output:
            He
            el
            ll
            lo
            o,
            , 
             w
            wo
            or
            rl
            ld
        */
        System.out.println();
    }
    
    public void A(String s) {
        System.out.println(s.substring(7));
    }
    
    public void B(String s) {
        for (int i = 0; i < s.length(); i+=2) {
            System.out.println(s.substring(i));
        }
    }
    
    public void C(String s) {
        for (int i = (s.length() - 1); i >= 0; i-=2) {
            System.out.println(s.substring(i));
        }
    }
    
    public void D(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            System.out.println(s.substring(i, i + 2));
        }
    }
}
