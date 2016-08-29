public class PP_1_3 {
    String[] objs = {"fly", "spider", "bird", "cat", "dog", "cow"};

    public static void main(String[] args) {
        PP_1_3 p = new PP_1_3();
        p.reason("spider");
    }
    
    void oldLady(String obj) {
        System.out.println("There was an old lady who swallowed a " + obj);
    }
    
    void middle() {
        System.out.println("I don't know why");
        System.out.println("She swallowed the fly");
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
        
    }
}
