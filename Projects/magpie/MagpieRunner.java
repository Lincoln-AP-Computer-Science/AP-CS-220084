import java.util.*;

public class MagpieRunner {
	public static void main(String[] args) {
		Magpie maggie = new Magpie();
        Scanner sc = new Scanner (System.in);
        String name, input;
		
        System.out.println(maggie.getName());
        name = sc.nextLine();
        System.out.println (maggie.getGreeting(name));
        input = sc.nextLine();
		
		while (!input.equals("Bye")) {
	        System.out.println (maggie.getResponse(input));
			input = sc.nextLine();
		}
        System.out.println("Goodbye!");
	}
}
