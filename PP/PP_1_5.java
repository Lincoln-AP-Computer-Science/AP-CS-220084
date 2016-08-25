public class PP_1_5 {
    String jackBuilt = "hosue that Jack built.\n";
    String[] objs = {"malt", "rat", "cat", "dog", "cow with the crumpled horn", "maiden all forlorn"};
    String[] verbs = {"lay", "ate", "killed", "worried", "tossed", "milked"};

    public static void main(String[] args) {
        PP_1_5 p = new PP_1_5();
        p.song();
    }
    
    void startln(String s) {
        System.out.println("This is the " + s);
    }
    
    void that(String end) {
        System.out.println("That " + end);
    }
    
    void song() {
        for(int i = 0; i < objs.length; i++) {
            for (int j = i; j >= 0; j--) {
                if(j == i) {
                    if(i > 0) {
                        startln(objs[j] + ",");
                    } else {
                        startln(objs[j]);
                    }
                } 
            }
        }
    }
}
