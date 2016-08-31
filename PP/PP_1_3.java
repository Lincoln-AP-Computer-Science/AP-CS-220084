public class PP_1_3 {
    String[] objs = {"fly", "spider", "bird", "cat", "dog", "cow"};

    public static void main(String[] args) {
        PP_1_3 p = new PP_1_3();
        p.fly();
        p.spider();
        p.bird();
    }
    
    void oldLady(String obj) {
        System.out.println("There was an old lady who swallowed a " + obj);
    }
    
    void middle() {
        System.out.println("I don't know why");
        System.out.println("She swallowed the fly");
        System.out.println("Perhaps she'll die.");
    }
    
    public static int strIndexOf(String[] arr, String s) {
        int i = 1;
        for (i = 1; i < arr.length; i++) {
            if(arr[i].equals(s)) {
                break;
            }
        }
        return i;
    }
    
    void reason(String s) {
        int index = strIndexOf(objs, s);
        for (int i = index; i >= 1; i--) {
            System.out.println("She swallowed the " + objs[i] + " to catch the " + objs[i-1] + ".");
        }
    }
    
    void fly() {
        oldLady("fly");
        System.out.println("I don't know why she swallowed the fly");
        System.out.println("Perhaps she'll die");
        System.out.println("But it's only a fly");
        System.out.println("I think I'll cry");
        System.out.println("She gulped it out of the sky");
        System.out.println("Oh, my!\n");
    }
    
    void spider() {
        oldLady("spider");
        System.out.println("That wiggled and jiggled and tickled inside her.");
        reason("spider");
        middle();
        System.out.println("Gone to the by and by");
        System.out.println("Sigh\n");
    }
    
    void bird() {
        oldLady("bird");
        System.out.println("How absurd! She swallowed a bird!");
        reason("bird");
        middle();
        System.out.println("She'll leave us high and dry.");
    }
    
    void cat() {
    
    }
    
    void dog() {
    
    }
    
    void cow() {
    
    }
    
    void horse() {
    
    }
}
