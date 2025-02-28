package main;

public class RAM {
    public final double ramWeight = 700.70;
    private final RamVolume ramVolume;
    private final TypeRam typeRam;

    public RAM(RamVolume ramVolume,  TypeRam typeRam) {
        this.ramVolume = ramVolume;
        this.typeRam = typeRam;
    }

    public double getRamWeight() {
        return ramWeight;
    }

    public TypeRam getTypeRam() {
        return typeRam;
    }

    public RamVolume getRamVolume() {
        return ramVolume;
    }
}
