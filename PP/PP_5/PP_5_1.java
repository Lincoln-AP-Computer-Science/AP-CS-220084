import java.util.*;

public class PP_5_1 {

    public static void main(String[] args) {
        PP_5_1 pp = new PP_5_1();
        while (true) {
            if (!pp.run()) {
                System.out.println("Terminated");
                break;
            }
        }
    }
    
    public boolean run() {
        Scanner sc = new Scanner(System.in);
        String[] input;
        String output = "";
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        
        System.out.println("Input a sentence with no punctuation:");
        input = sc.nextLine().split("\\s+");
            
        if (input[0].length() > 0) {
            for (int i = 0; i < input.length; i++) {
                String firstSound = "";
                for (int j = 0; j < input[i].length(); j++) {
                    if (firstSound == "") {
                        for (int k = 0; k < vowels.length; k++) {
                            if (input[i].charAt(j) == vowels[k]) {
                                firstSound = input[i].substring(0, j);
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                }
                input[i] = input[i].concat("-" + firstSound + "ay");
                output = output.concat(input[i] + " ");
            }
            
            output = output.trim();
            System.out.println(output);
            return true;
        }
        return false;
    }
}
