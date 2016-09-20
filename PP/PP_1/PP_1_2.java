// Write a program that prints similar letters to three people of your choice.
public class PP_1_2 {
    public static void main(String[] args) {
        PP_1_2 p = new PP_1_2();
        p.friend1();
        p.friend2();
        p.friend3();
    }
    
    void message(String name) {
        System.out.println("Dear " + name + ",\n");
        System.out.println("    Lorem ipsum dolor sit amet, consectetur");
        System.out.println("adipiscing elit. In risus libero, luctus");
        System.out.println("in nisl non, porttitor placerat sapien.");
        System.out.println("Cras posuere arcu massa, quis gravida sem");
        System.out.println("mollis ac. Etiam mollis lacus eu porta");
        System.out.println("semper. Curabitur erat dolor, porta id mi");
        System.out.println("quis, vehicula sollicitudin nunc. Sed");
        System.out.println("lacinia, urna ut convallis dignissim, mauris");
        System.out.println("erat facilisis enim, ut tempus magna dolor ut");
        System.out.println("arcu. Donec porttitor tristique dictum.");
        System.out.println("Curabitur sollicitudin ipsum id mauris rhoncus");
        System.out.println("convallis. Vestibulum laoreet ultricies dapibus.");
        System.out.println(" Aliquam ex dolor, maximus ut turpis at, egestas");
        System.out.println("posuere nisi. Phasellus bibendum volutpat risus");
        System.out.println("vestibulum varius. Duis sit amet velit ut tellus");
        System.out.println("iaculis lacinia. Etiam non est augue.");
        System.out.println("\nSincerely,\n           Chai Nunes\n\n");
    }
    
    void friend1() {
        message("Max");
    }
    
    void friend2() {
        message("Jessica");
    }
    
    void friend3() {
        message("Zach");
    }
}
