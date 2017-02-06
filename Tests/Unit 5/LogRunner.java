public class LogRunner {
    
    public static void main(String[] args) {
        String[] messages = {
            "CLIENT3:security alert - repeated login failures",
            "Webserver:disk offline",
            "SERVER1:file not found",
            "SERVER2:read error on disk DSK1",
            "SERVER1:write error on disk DsK2",
            "Webserver:error on /dev/disk"
        };
        
        LogMessage[] logs = new LogMessage[messages.length];
        for (int i = 0; i < messages.length; i++) {
            logs[i] = new LogMessage(messages[i]);
        }
    }
}
