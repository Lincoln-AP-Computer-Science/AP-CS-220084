public class DrawBoxes {
    public static void main (String[] args) {
        for (int i = 0; i < 2; i++) {
            box();
        }
    }
    
    void box () {
        for (int i = 0; i < 4; i++) {
            if (i > 0 && i < 3) {
               edged();
            } else {
               cornered();
            }
        }
        System.out.println();
    }
    
    void cornered () {
        System.out.println("+------+");
    }
    
    void edged () {
        System.out.println("|      |");
    }
}
