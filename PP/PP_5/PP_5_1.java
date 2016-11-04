import java.util.*;

public class PP_5_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input;
        String output = "";
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        
        System.out.println("Input a sentence with no punctuation:");
        input = sc.nextLine().split("\\s+");
        
        for (int i = 0; i < input.length; i++) {
            String firstSound = "";
            for (int j = 0; j < input[i].length(); j++) {
                if (firstSound == "") {
                    for (int k = 0; k < vowels.length; k++) {
                        if (j > 0 && input[i].charAt(j) == vowels[k]) {
                            firstSound = input[i].substring(0, j);
                            input[i] = input[i].replace(firstSound, "");
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
    }
}
