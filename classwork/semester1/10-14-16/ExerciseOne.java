public class ExerciseOne {
   
    public static void main(String[] args) {
        ExerciseOne eo = new ExerciseOne();
        
        System.out.println("Problem 1a:");
        eo.A("Hasta Manana");
        /* Output:
            0: H
            1: a
            2: s
            3: t
            4: a
            5:  
            6: M
            7: a
            8: n
            9: a
            10: n
            11: a
        */
        System.out.println();
        
        System.out.println("Problem 1b:");
        eo.B("Hasta Manana");
        // Output:
        // Hasta Manana
        System.out.println();
        
        System.out.println("Problem 1c:");
        eo.C("Hasta Manana");
        // Output:
        // ananaM atsaH
        System.out.println();
        
        System.out.println("Problem 1d:");
        eo.D("Hasta Manana");
        // Output:
        // HaHaHaHaHaHa
    }
    
    public void A(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(i + ": " + s.charAt(i));
        }
    }
    
    public void B(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
    
    public void C(String s) {
        for (int i = (s.length() - 1); i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
    
    public void D(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i % 2));
        }
    }
}
