package task3;

// Strategy Pattern: Dispatch Policy
public interface DispatchStrategy {
    boolean shouldDispatch(int severityLevel, int currentHour);
    String getStrategyName();
}