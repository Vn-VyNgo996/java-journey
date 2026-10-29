package notifier;

public class ConsoleNotifier implements Notifier{
    public void send(String to, String message){
        System.out.printf("[NOTIFY] " + to + " : " +message );
    }
}
