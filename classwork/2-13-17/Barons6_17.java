public class Barons6_17 {
    
    public static void main(String[] args) {
        
        System.out.println("Loop 1");
    
        loopOne(); // v[vIndex] == w[wIndex] will be true
        
        System.out.println("Loop 2");
        
        loopTwo(); // wIndex == M will be true
    }
    
    public static void loop(int M, int N, int[] v, int[] w) {
        int vIndex = 0, wIndex = 0;
        while (vIndex < N && wIndex < M) {
            
            if (v[vIndex] == w[wIndex]) {
                System.out.println("True");
                break;
            } else if (v[vIndex] < w[wIndex]) {
                vIndex++;
            } else {
                wIndex++;
            }
            
            System.out.println("Reached the end");
            System.out.print("vIndex == N: ");
            System.out.println(vIndex == N);
            System.out.print("wIndex == M: ");
            System.out.println(wIndex == M);
            if (vIndex < v.length && wIndex < w.length) {
                // Make sure there's no index out of bounds (index N or M are too big)
                System.out.print("v[vIndex] == w[wIndex]: ");
                System.out.println(v[vIndex] == w[wIndex]);
            }
            if (vIndex > 0 && wIndex > 0) { 
                // Make sure there's no index out of bounds (no -1 index)
                System.out.print("v[vIndex - 1] == w[wIndex - 1]: ");
                System.out.println(v[vIndex - 1] == w[wIndex - 1]);
            }

            System.out.println();
        }

    }
    
    
    public static void loopOne() {
        int M = 6, N = 5;
        int[] v = {2, 4, 6, 8, 10};
        int[] w = {1, 3, 5, 7, 10, 11};
        
        loop(M, N, v, w);
    }
    
    public static void loopTwo() {
        int M = 5, N = 5;
        int[] v = {2, 4, 6, 8, 10};
        int[] w = {1, 3, 5, 7, 9};
        
        loop(M, N, v, w);
    }
}
