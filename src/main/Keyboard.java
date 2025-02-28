package main;

public class Keyboard {
    public final double keyboardWeight = 300.5;
    private final KeyboardLight keyboardLight;
    private final KeyboardType keyboardType;

    public Keyboard(KeyboardType keyboardType, KeyboardLight keyboardLight) {
        this.keyboardType = keyboardType;
        this.keyboardLight = keyboardLight;
    }

    public double getKeyboardWeight() {
        return keyboardWeight;
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public KeyboardLight getKeyboardLight() {
        return keyboardLight;
    }
}
