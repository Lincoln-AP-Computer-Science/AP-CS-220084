public class ArtProject2016 {
    
    public static void main(String[] args) {
        ArtProject2016 art = new ArtProject2016();
        
        art.writeChars('=', 20);
        for (int i = 0; i < 10; i++) {
            art.writeChars('>', i);
            art.writeChars(' ', 20 - 2 * i);
            art.writeChars('>', i);
            System.out.println();
        }
    }
    
    public static void writeChars(char numbers, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(numbers);
        }
    }
}
