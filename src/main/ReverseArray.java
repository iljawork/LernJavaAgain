package main;

import java.util.Arrays;

public class ReverseArray {
    public static String[] reverse(String[] array) {
        int j = array.length - 1;
        int i = 0;

        while (i < j) {
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    return array;
    }



}
