// Write a program that produces as output the lyrics of the song, "There Was an Old Lady Who Swallowed a Fly," by
// Simms Taback.

public class PP_1_3 {
    String[] objs = {"fly", "spider", "bird", "cat", "dog", "cow"};

    public static void main(String[] args) {
        PP_1_3 p = new PP_1_3();
        p.fly();
        p.spider();
        p.bird();
        p.cat();
        p.dog();
        p.horse();
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
        System.out.println("She'll leave us high and dry.\n");
    }
    
    void cat() {
        oldLady("cat");
        System.out.println("Imagine that! She swallowed a cat.");
        reason("cat");
        middle();
        System.out.println("I hope it's a lie.\n");
    }
    
    void dog() {
        oldLady("dog");
        System.out.println("She went whole hog to swallow the dog.");
        reason("dog");
        middle();
        System.out.println("There's a tear in my eye.\n");
        
    }
    
    void cow() {
        oldLady("cow");
        System.out.println("I don't know how she swallowed the cow.");
        reason("cow");
        middle();
        System.out.println("I'd rather have ham on rye.");
        System.out.println("And she had a frog on the sly.");
        System.out.println("She did it in one try.\n");
    }
    
    void horse() {
        oldLady("horse");
        System.out.println("She dies, of course.");
        System.out.println("It was the last course.");
        System.out.println("I'm filled with remorse.");
        System.out.println("What's left to say...");
        System.out.println("Even the artist is crying.");
        System.out.println("We'll miss her dearly.");
        System.out.println("It is such a loss.");
        System.out.println("She had no time to floss.");
        System.out.println("She missed out on the sauce.\n");
        System.out.println("Moral: Never swallow a horse.");
    }
}
