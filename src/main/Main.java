package main;

public class Main {

    public static void main(String[] args) {
        Arithmetic arithmetic1 = new Arithmetic();
        arithmetic1.takeParm(3,3);
        System.out.println("Сумма чисел: " + arithmetic1.sumAB());
        System.out.println("Умножение: " + arithmetic1.multAB());
        System.out.println("Максимальное: " + arithmetic1.maxAB());
        System.out.println("Минимальное: " + arithmetic1.minAB());
    }
}