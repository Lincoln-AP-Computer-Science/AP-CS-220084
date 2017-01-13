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
		if (haskw(input, "no")) {
			return "Why so negative?";
		} else if (haskw(input, "mother")
				|| haskw(input, "father")
				|| haskw(input, "sister")
				|| haskw(input, "brother")) {
			return "Tell me more about your family.";
		} else if (haskw(input, "dog") 
                || haskw(input, "cat")) {
            return "Tell me more about your pets.";
        } else if (haskw(input, "ms. reid")
                || haskw(input, "ms. robey")
                || haskw(input, "mr. kappia")
                || haskw(input, "mr. macko")
                || haskw(input, "mr. chen")
                || haskw(input, "srta. barragan")
                || haskw(input, "ms. barragan")) {
            return "That sounds like a great teacher.";
        } else if (haskw(input, "meet you") 
                || haskw(input, "you're welcome")) {
            return "Thank you.";
        } else if (haskw(input, "thank you")
                || haskw(input, "thanks")) {
            return "You're welcome.";
        } else if (haskw(input, " programming")) {
            return "My creator loves to program!";
        } else if (haskw(input, "artificial intelligence")) {
            return "I am artificial intelligence. Not very intelligent, but still...";
        } else {
			return getRandomResponse();
        }
	}
    
    private boolean haskw(String toSearch, String kw) {
        return toSearch.indexOf(kw) >= 0;
    }
    
    private int findKeyword(String input, String goal, int startPos) {
        String phrase = input.trim().toLowerCase();
        goal = goal.toLowerCase();
        int psn = phrase.indexOf(goal, startPos);
    }
   
	private String getRandomResponse() {
		final int NUM_RESPONSES = 6;
		int response = (int)(Math.random() * (NUM_RESPONSES - 1));
		
        switch(response) {
            case 0: return "Interesting, tell me more.";
            case 1: return "Hmmm.";
            case 2: return "Do you really think so?"; 
            case 3: return "You don't say.";
            case 4: return "I see.";
            case 5: return "Cool.";
            default: return "tHerE iS soMEthInG wRoNg witH MY coDE";
        }
	}
}
