public class Dessert {
    // Private Variables
    private double price, weight;
    private int calories;
    
    // Public Constructors
    public Dessert() {
        this.price = 3.00;
        this.weight = 3.0;
        this.calories = 500;
    }
    
    public Dessert(double price, double weight, int calories) {
        this.price = price;
        this.weight = weight;
        this.calories = calories;
    }
    
    // Public Methods
    public double getPrice() {
        return price;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public int getCalories() {
        return calories;
    }
    
    public void setPrice(double price) {
        if (price >= 0) this.price = price;
    }
    
    public void setWeight(double weight) {
        if (weight > 0) this.weight = weight;
    }
    
    public void setCalories(int calories) {
        if (calories > 0) this.calories = calories;
    }
    
    @Override
    public String toString() {
        return "Price: " + Double.toString(this.price)
            + "\nWeight: " + Double.toString(this.weight)
            + "\nCalories: " + Double.toString(this.calories); 
    }
}
