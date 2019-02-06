package ru.geekbrains.lesson_2;

public class Main {

    public static void main(String[] args) {
	/*
	1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
	С помощью цикла и условия заменить 0 на 1, 1 на 0;
	*/
        System.out.println("Задание №1");
        int[] intArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i : intArray) {
            if (i == 0) i = 1;
            else i = 0;
            System.out.print(i + " ");
        }

	/*

    2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
       */
        System.out.println();
        System.out.println();
        System.out.println("Задание №2");
        int[] intArray2 = new int[8];
        int j = 0;
        for (int i = 0; i < 8; i++) {
            intArray2[i] = j;
            j += 3;
            System.out.print(intArray2[i] + " ");
        }

	/*
    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    */
        System.out.println();
        System.out.println();
        System.out.println("Задание №3");
        int[] intArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i : intArray3) {
            if (i < 6) i = i * 2;
            System.out.print(i + " ");
        }
	/*
    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и
     с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    */
        System.out.println();
        System.out.println();
        System.out.println("Задание №4");
        int i = 3; // Размер квадратной матрицы
        int[][] intArray4 = new int[i][i]; // Инициализация двумерного массива
        for (int k1 = 0; k1 < i; k1++) {
            for (int k2 = 0; k2 < i; k2++) {
                if (k1 == k2) intArray4[k1][k2] = 1;
                else intArray4[k1][k2] = 0;
                System.out.print(intArray4[k1][k2] + " ");
            }
            System.out.println();
        }
	/*
    5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    */
        System.out.println();
        System.out.println();
        System.out.println("Задание №5");
        int[] intArray5 = new int[5];
        for (i = 0; i < 5; i++) { // Заполнение массива случайными целыми числами
            intArray5[i] = generateRandom(0, 10);
            System.out.print(intArray5[i] + " ");
        }
        int max = intArray5[0];
        int min = intArray5[0];
        for (int ii:intArray5) { // Поиск максимального элемента в массиве
            if (ii > max) max = ii;
            if (ii < min) min = ii;
        }
        System.out.println();
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);


	/*

    6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

    7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
     или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
	 */
    }

    private static int generateRandom(int a, int b) {
        int random = a + (int) (Math.random() * b);
        return random;
    }
}


