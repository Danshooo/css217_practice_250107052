package task5;

// Bridge Pattern: Abstraction (DigitalAsset)
public abstract class DigitalAsset {
    protected final StorageDriver driver; // Bridge reference to Implementor
    protected final String assetPath;

    public DigitalAsset(StorageDriver driver, String assetPath) {
        this.driver = driver;
        this.assetPath = assetPath;
    }

    public abstract void render();
}
