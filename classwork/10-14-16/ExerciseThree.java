public class ExerciseThree {

    public static void main(String[] args) {
        ExerciseThree et = new ExerciseThree();
        
        for (char c = 'a'; c < 'f'; c++) {
            System.out.println("Problem 3" + c);
            if (c < 'c') {
                et.run(c, "Hello, world", "world");
            } else {
                et.run(c, "Stand clear of the closing ", "doors");
            }
            System.out.println();
        }
    }
    
    public void run(char c, String s, String t) {
        switch(c) {
            case 'a': A(s); break;
            case 'b': B(s, t); break;
            case 'c': C(s, t); break;
            case 'd': D(s, t); break;
            case 'e': E(s + t, t); break;
            default: break;
        }
    }
    
    public void A(String s) {
        System.out.println("world starts at index " + s.indexOf("world"));
        // Output:
        // world starts at index 7
    }
    
    public void B(String s, String t) {
        System.out.println(t + " starts at index " + s.indexOf(t));
        // Output:
        // world starts at index 7
    }
    
    public void C(String s, String t) {
        String altogether = s + t;
        System.out.println(t + " starts at index " + altogether.indexOf(t));
        // Output:
        // doors starts at index 27
    }
    
    public void D(String s, String t) {
        System.out.println("I got index: " + s.indexOf(t)); 
        // Output:
        // I got index: -1
    }
    
    public void E(String s, String t) {
        System.out.println(s.charAt(s.indexOf(t) + 1));
        System.out.println(s.charAt(s.indexOf(t) + 3));
        System.out.println(s.charAt(s.indexOf(t) + 4));
        /* Output:
            o
            r
            s
        */
    }
}
