public class BaseChange {
    
    public static void main(String[] args) {
        Number n = new Number(16, "FF");
        System.out.println(n);
        System.out.println(n.convertBase(10));
    }
}
