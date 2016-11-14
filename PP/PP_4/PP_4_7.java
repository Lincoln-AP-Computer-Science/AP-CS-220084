public class PP_4_7 {

    public static void main(String[] args) {
        int[] n = {1, 1, 0, 0};
        for (int i = 0; i < 11; i++) {
            for (int j = 10; j >= 0; j--) {
                if (i == j) {
                    System.out.printf("%4d", 1);
                    for (int k = 0; k < i; k++) {
                        if (k == i - 1) {
                            System.out.printf("%4d", 1);
                            break;
                        }
                        if (k == 0 || k == i - 2) {
                            System.out.printf("%4d", i);
                        } else if (k == 1 || k == i - 3) {
                            System.out.printf("%4d", n[0] - i);
                        } else if (k == 2 || k == i - 4) {
                            System.out.printf("%4d", n[1] - (n[0] + n[0]) + i);
                        } else {
                            System.out.printf("%4d", 0);
                        }
                        if (k == 0) {
                            n[0] += i;
                            n[1] += n[0];
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
