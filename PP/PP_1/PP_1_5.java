// Write a program that produces as output the words of "The House That Jack Built."

public class PP_1_5 {
    
    String[] objs = {"the house that Jack built.\n", "the malt", "the rat,", "the cat,", "the dog,", "the cow with the crumpled horn,", "the maiden all forlorn,"};
    String[] verbs = {"lay in", "ate", "killed", "worried", "tossed", "milked"};

    public static void main(String[] args) {
        PP_1_5 p = new PP_1_5();
        p.song();
    }
    
    void startln(String s) {
        System.out.println("This is " + s);
    }
    
    void that(String verb, String obj) {
        System.out.println("That " + verb + " " + obj);
    }
    
    void song() {
        for(int i = 0; i < objs.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (j == i) {
                    startln(objs[j]);
                } else {
                    that(verbs[j], objs[j]);
                }
            }
        }
    }
}
