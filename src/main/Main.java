package main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Вася","Саша","Дима"};

        System.out.println("Изначальный массив:\n" + Arrays.toString(array));

        ReverseArray.reverse(array);
        System.out.println("Перевёрнутый массив:\n" + Arrays.toString(array));

    }
}
