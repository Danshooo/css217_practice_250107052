package task3;

// Bridge Pattern: Implementor (MessageChannel)
public interface MessageChannel {
    void transmit(String recipient, String message);
}