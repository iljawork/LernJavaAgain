package main;

public class Screen {
    public final double screenWidth = 700.5;
    private final ScreenType screenType;
    private final Diagonal diagonal;

    public Screen(ScreenType screenType, Diagonal diagonal) {
        this.diagonal = diagonal;
        this.screenType = screenType;
    }

    public double getScreenWidth() {
        return screenWidth;
    }

    public ScreenType getScreenType() {
        return screenType;
    }

    public Diagonal getDiagonal() {
        return diagonal;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "diagonal=" + diagonal +
                ", type=" + screenType +
                ", weight=" + screenWidth +
                '}';
    }


}
