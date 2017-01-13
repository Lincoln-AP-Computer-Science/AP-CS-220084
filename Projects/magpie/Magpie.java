public class Magpie {

    public String getName() {
        return "Hello. I am Maggie. What is your name?";
    }

    public String getGreeting(String name) {
        return "Nice to meet you, " + name + ".";
    }
   
    public String getResponse(String input) {
        input = input.trim().toLowerCase();
        if (input.length() <= 0) {
            return "Say something, please.";
        }
        
        String[][] res = {
                {"hello", "hey", "hi", "sup", "heyo", "greetings", "salutations"},
                {"no", "not"},
                {"mother", "father", "sister", "brother"},
                {"dog", "cat"},
                {"ms. reid", "mrs. reid", "ms. robey", "srta. barragan", "ms. barragan"},
                {"mr. kappia", "mr. macko", "mr. chen"},
                {"nice to meet you"},
                {"you're welcome", "say thank you"},
                {"thank you", "thanks"},
                {"ai", "artificial intelligence"}
        };
        
        String[] ans = {
                "Hello!",
                "Why so negative?",
                "Tell me more about your family.",
                "Tell me more about your pets.",
                "She sounds like a good teacher.",
                "He sounds like a good teacher.",
                "Nice to meet you too.",
                "Thank you.",
                "You're welcome.",
                "I am artificial intelligence. Not very intelligent, but still..."
        };
        
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                if (haskw(input, res[i][j])) {
                    return ans[i];
                }
            }
        }
        
        if (haskw(input, "i") && haskw(input, "you", findKeyword(input, "you", 0))) {
            return handleIYou(input);
        }
        
        return getRandomResponse();
    }
    
    private String handleIYou(String input) {
        String lastChar = input.substring(input.length() - 1);
        if (lastChar.equals(".")) {
            input = input.substring(0, input.length() - 1);
        }
        
        int posI = findKeyword(input, "i", 0);
        int posYou = findKeyword(input, "you", posI);
        String filler = input.substring(posI + 1, posYou).trim();
        return "Why do you " + filler + "me?";
    }
    
    private boolean haskw(String toSearch, String kw) {
        return findKeyword(toSearch, kw, 0) >= 0;
    }
    
    private boolean haskw(String toSearch, String kw, int pos) {
        return findKeyword(toSearch, kw, pos) >= 0;
    }
    
    private int findKeyword(String input, String goal, int startPos) {
        goal = goal.toLowerCase();
        int pos = input.indexOf(goal, startPos);
        
        while (pos >= 0) {
            String before = new String(), after = new String();
            
            if (pos > 0) {
                before = input.substring(pos - 1, pos);
            }
            if (pos + goal.length() < input.length()) {
                after = input.substring(pos + goal.length(), pos + goal.length() + 1);
            }
            
            if ((before.compareTo("a") < 0 || before.compareTo("z") > 0)
                    && (after.compareTo("a") < 0 || after.compareTo("z") > 0)) {
                return pos;
            }
            pos = input.indexOf(goal, pos + 1);
        }
        
        return -1;
    }
   
    private String getRandomResponse() {
        int response = (int)(Math.random() * (randResponses.length - 1));
        return randResponses[response];
    }
    
    private String[] randResponses = {
            "Interesting, tell me more.",
            "Hmmm.",
            "Do you really think so?",
            "You don't say.",
            "I see.",
            "Cool."
    };
}
