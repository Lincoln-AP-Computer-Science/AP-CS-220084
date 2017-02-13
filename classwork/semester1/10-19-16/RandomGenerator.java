public class RandomGenerator {

    public static void main(String[] args) {
        RandomGenerator rg = new RandomGenerator();
        
        for (int i = 0; i < 5000; i++) {
            double random = rg.GenerateRange(0.85, 1);
            System.out.println("Run  #" + (i + 1) + ": " + random);
            if (random < 0.85 || random > 1) {
                System.out.println("FAILED ON RUN #" + (i + 1) + ": " + random);
                break;
            }
        }
    }
    
    public double GenerateRange(double a, double b) {
        return (b - a) * Math.random() + a;
    }
}
