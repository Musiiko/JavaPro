package homework2.task4;

/* 4. Объявить массив с n-м количеством случайных чисел (используя инициализатор массива)
        и вывести на консоль наибольшее и наименьшее число из этого массива. */

public class Main {
    public static void main(String[] args) {
        int[] array = {11, 111, 10, 12, 21, 0, -12, 10, -2, 44, 32, 21, 8, -24, 42};
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("MINIMUM = " + min);
        System.out.println("MAXIMUM = " + max);
    }

}
