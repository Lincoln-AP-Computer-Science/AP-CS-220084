public class ExerciseFour {

    public static void main(String[] args) {
        ExerciseFour ef = new ExerciseFour();
        
        for (char c = 'a'; c < 'e'; c++) {
            System.out.println("Problem 4" + c);
            ef.run(c, "hi there", "HI THERE");
            System.out.println();
        }
    }
    
    public void run(char c, String s, String t) {
        switch(c) {
            case 'a': A(s, t); break;
            case 'b': B(s, t); break;
            case 'c': C(s, t); break;
            case 'd': D(s, t); break;
            default: break;
        }
    }
    
    public void A(String s, String t) {
        System.out.println(s.equals(t));
        // Output:
        // false
    }
    
    public void B(String s, String t) {
        System.out.println(s.toUpperCase().equals(t));
        // Output:
        // true
    }
    
    public void C(String s, String t) {
        System.out.println(s.equals(t.toLowerCase()));
        // Output:
        // true
    }
    
    public void D(String s, String t) {
        System.out.println(t.equals(s.toLowerCase()));
        // Output:
        // false
    }
}
