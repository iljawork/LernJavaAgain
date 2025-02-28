package main;

public class CPU {
    public final double diskWeight = 700.70;
    private final Frequency frequency;
    private final Manufacturer manufacturer;
    private final NumberOfCores numberOfCores;

    public CPU(Frequency frequency, Manufacturer manufacturer, NumberOfCores numberOfCores) {
        this.frequency = frequency;
        this.manufacturer = manufacturer;
        this.numberOfCores = numberOfCores;
    }

    public double getDiskWeight() {
        return diskWeight;
    }
    public Frequency getFrequency() {
        return frequency;
    }
    public Manufacturer getManufacturer() {
        return manufacturer;
    }
    public NumberOfCores getNumberOfCores() {
        return numberOfCores;
    }

}
