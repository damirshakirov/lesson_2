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
        for (int ii : intArray5) { // Поиск максимального элемента в массиве
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
        */

        System.out.println();
        System.out.println();
        System.out.println("Задание №6");
//        int[] intArray6 = new int[5];
//        for (i = 0; i < 5; i++) { // Заполнение массива случайными целыми числами
//            intArray6[i] = generateRandom(0, 10);
//            System.out.print(intArray6[i] + " ");
//        }
        System.out.println();
        int[] intArray6 = {1, 2, 1, 0, 3};
        for (i = 0; i < intArray6.length; i++) {
            System.out.print(intArray6[i] + " ");
        }
        System.out.println();
        for (i = 0; i < intArray6.length; i++) {
            if (checkBalance(intArray6, i))
                System.out.println("Индекс элемента: " + i + ". Значение элемента: " + intArray[i - 1]);
        }

        /*
        7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
         или отрицательным), при этом метод должен сместить все элементымассива на n позиций.
          Для усложнения задачи нельзя пользоваться вспомогательными массивами.
         */

        System.out.println();
        System.out.println();
        System.out.println("Задание №7");
        int[] intArray7 = {1, 2, 1, 0, 3};
        int n = 2;
        for (i = 0; i < intArray7.length; i++) {
            System.out.print(intArray7[i] + " ");
        }
        System.out.println();
        splitArray(intArray7, n);

        /*
        1.4.3. Для двух заданных векторов длины n, представленных одномерными массивами, напишите фрагмент кода
        для вычсиления евклидова расстояния между ними (квадратный корень из суммы квадратов разностей между
        соответствующими элементами).
         */

        System.out.println();
        System.out.println();
        System.out.println("Задание №1.4.3");



         /*
        1.4.4. Напишите фрагмент кода, который переставляет в обратном порядке значения в одномерном строковом
        массиве. Не создавайте массив для хранения результатов. Подсказка: воспользуйтесь кодом, приведенным в тексте,
        для перестановки значений двух элементов.
         */
    }


    private static int generateRandom(int a, int b) {
        return a + (int) (Math.random() * b);
    }

    private static boolean checkBalance(int array[], int i) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int j = 0; j < i; j++) {
            sumLeft = array[j] + sumLeft;
        }
        for (int j = array.length - 1; j > i; j--) {
            sumRight = array[j] + sumRight;
        }
        if (sumLeft == sumRight) return true;
        else return false;
    }

    private static void splitArray(int array[], int n) {
        for (int i = 0; i < array.length-n; i++) {
            System.out.print(array[i+n] + " ");
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}






