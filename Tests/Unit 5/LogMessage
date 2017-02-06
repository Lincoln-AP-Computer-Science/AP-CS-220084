public class LogMessage {

    // INSTANCE VARIABLES
    
    private String machineID;
    private String description;
    
    // CONSTRUCTORS
    
    public LogMessage(String message) {
        if (this.isValidMessage(message)) {
            int colon = message.indexOf(':');
            this.machineID = message.substring(0, colon);
            this.description = message.substring(colon + 1);
        } else {
            throw new IllegalArgumentException("Message \"" + message 
                + "\" is not a valid log message"); 
        }
    }
    
    // PUBLIC METHODS
    
    public boolean containsWord(String keyword) {
        int index = this.description.indexOf(keyword);
        if (index != -1) {
            boolean before = false, after = false;
            
            if (index == 0 || this.description.charAt(index - 1) == ' ') {
                before = true;
            }
            
            if (index == this.description.length() - keyword.length()
                    || this.description.charAt(index + keyword.length()) == ' ') {
                after = true;       
            }
            
            if (before && after) { return true; }
        }
        
        return false;
    }
    
    public String getMachineID() { return this.machineID; }
    
    public String getDescription() { return this.description; }
    
    // PRIVATE METHODS
    
    private boolean isValidMessage(String message) {
    
        message = message.trim();
        if (message.length() - message.replaceAll(":", "").length() != 1
                || message.indexOf(':') <= 0
                || message.indexOf(':') == message.length() - 1) {
            return false;
        }
        
        return true;
    }
    
}
