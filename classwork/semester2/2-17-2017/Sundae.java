import java.util.*;

public class Sundae extends Dessert {
    // Private Variables
    private ArrayList<String> toppings;
    
    // Constructors
    public Sundae() {
        super();
        this.toppings = new ArrayList<String>();
        this.toppings.add("Whipped Cream");
    }
    
    public Sundae(double price, double weight, int calories, String... toppings) {
        super(price, weight, calories);
        this.toppings = new ArrayList<String>(Arrays.asList(toppings));
    }
    
    // Public Methods
    public ArrayList<String> getToppings() {
        return this.toppings;
    }
    
    public void setToppings(String... toppings) {
        this.toppings = new ArrayList<String>(Arrays.asList(toppings));
    }
}
