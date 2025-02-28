package main;

public class Storage {
    public final double storageWeight = 1000;
    private final StorageType storageType;
    private final StorageVolume storageVolume;

    public Storage(StorageType storageType, StorageVolume storageVolume) {
        this.storageType = storageType;
        this.storageVolume = storageVolume;
    }

    public double getStorageWeight() {
        return storageWeight;
    }
    public StorageType getStorageType() {
        return storageType;
    }
    public StorageVolume getStorageVolume() {
        return storageVolume;
    }
}
