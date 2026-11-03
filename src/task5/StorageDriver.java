package task5;

// Bridge Pattern: Implementor Interface
public interface StorageDriver {
    byte[] loadRawBlob(String resourceUri);
    String getStorageType();
}