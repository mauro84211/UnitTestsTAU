package notificationService;

/**
 * Interface specifying messaging capabilities.
 *
 * @author Tariq King
 */
public interface Notification {
    
    void notify(String message, String recipient);
    
    void connect();
    
    void disconnect();
    
    boolean isConnected();
    
}