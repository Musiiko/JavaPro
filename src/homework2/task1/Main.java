package homework2.task1;

/* 1. Объявить массив с n-м количеством случайных чисел (используя инициализатор массива)
        и вывести на консоль четные и нечетные числа из этого массива. */

public class Main {
    public static void main(String[] args) {
        int[] array = {11, 111, 10, 12, 21, 0, -12, 10, -2, 44, 32, 21, 8, -24, 42};
        System.out.print("Even numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

}



