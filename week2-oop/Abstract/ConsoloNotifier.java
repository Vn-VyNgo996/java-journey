package Abstract;

public class ConsoloNotifier implements Notifier{
    @Override
    public void send(String to, String message){
        System.out.println("[NOTIFY] " + to + ": " + message);
    }
}
