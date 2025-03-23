package main;

public class TwoDimensionalArray {
    public static char[][] getTwoDimensionalArray(int size) {
        // Создаем двумерный массив заданного размера
        char[][] array = new char[size][size];

        // Заполняем массив
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Проверяем, находится ли текущая ячейка на одной из диагоналей
                if (i == j || i + j == size - 1) {
                    array[i][j] = 'X';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        return array;
    }

    // Метод для вывода массива на экран (для удобства тестирования)
    public static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) { // Проход по строкам
            for (int j = 0; j < array[i].length; j++) { // Проход по элементам строки
                System.out.print(array[i][j]); // Вывод элемента
            }
            System.out.println(); // Переход на новую строку
        }
    }
}

