import java.util.*;

public class PP_4_7 {

    public static void main(String[] args) {
        PP_4_7 pp = new PP_4_7();
        Scanner sc = new Scanner(System.in);
        int input;
        
        System.out.println("Input triangle size:");
        input = sc.nextInt();
        if (input > 13) {
            System.out.println("Warning: Any size greater than 13 " +
            "will make each number hard to identify.\n" +
            "Press enter to continue");
            sc.nextLine();
            sc.nextLine();
        }
        pp.pascal(input);
    }
    
    public void pascal(int size) {
        
        int[] n;
        if (size > 4) {
            n = new int[(size - 4) / 2 + size % 2];
        } else {
            n = new int[1];
        }
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j >= 0; j--) {
                if (i == j) {
                    System.out.printf("%4d", 1);
                    for (int k = 0; k < i; k++) {
                        if (k == i - 1) {
                            System.out.printf("%4d", 1);
                            break;
                        }
                        if (k == 0 || k == i - 2) {
                                System.out.printf("%4d", i);
                        } else {
                            for (int l = 0; l < n.length; l++) {
                                if (k == l + 1 || k == i - (l + 3)) { 
                                    System.out.printf("%4d", n[l]);
                                    break;
                                }
                            }
                        }
                        if (k == 0) {
                            for (int l = n.length - 1; l > 0; l--) {
                                n[l] += n[l - 1];
                            }
                            n[0] += i - 1;
                        }
                    }
                    System.out.println();
                } else if (j > i) {
                    System.out.print("  ");
                }
            }
        }
    }
}
