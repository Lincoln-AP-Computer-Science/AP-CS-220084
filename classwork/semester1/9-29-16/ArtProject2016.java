public class ArtProject2016 {
    
    public static void main(String[] args) {
        ArtProject2016 art = new ArtProject2016();
        
        for (int i = -5; i <= 5; i++) {
            if(i % 2 == 0) {
                art.writeChars(' ', Math.abs(i * 2));
            } else {
                art.writeChars(':', Math.abs(i * 2));
            }
            for (int j = 0; j <= 5; j++) {
                if (i >= -5 + j && i <= 5 - j) {
                    art.writeChars('#', 1);
                    art.writeChars(' ', 2);
                }
            }
            if(i % 2 == 0) {
                art.writeChars(' ', Math.abs(i));
            } else {
                art.writeChars(':', Math.abs(i));
            }
            art.writeChars(':', Math.abs(i) + 1);
            art.writeChars('#', 5 - Math.abs(i));
            art.writeChars(' ', 5 - Math.abs(i));
            art.writeChars(':', Math.abs(i) + 1);
            System.out.println();
        }
    }
    
    public static void writeChars(char numbers, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(numbers);
        }
    }
}
