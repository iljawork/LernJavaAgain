package main;

public class Arithmetic {
    int a;
    int b;
    int sum;

    public void takeParm(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sumAB() {
        return sum = a + b;
    }

    public int multAB() {
        return a * b;
    }

    public int maxAB() {
    return a > b ? a : b;
    }

    public int minAB() {
        return a < b ? a : b;
    }
}
