import java.util.*;

public class SystemLog {
    
    private List<LogMessage> messageList;
    
    public SystemLog(LogMessage... messages) {
        this.messageList = new ArrayList<LogMessage>();
        for (LogMessage message : messages) { this.messageList.add(message); }
    }
    
    public List<LogMessage> removeMessages(String keyword) {
        List<LogMessage> output = new ArrayList<LogMessage>();
        for (int i = 0; i < this.messageList.size(); i++) {
            if (this.messageList.get(i).containsWord(keyword)) {
                output.add(this.messageList.get(i));
                this.messageList.remove(i);
            }
        }
        
        return output;
    }
}
