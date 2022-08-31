package homework2.task2;

/* 2. Объявить массив с n-м количеством случайных чисел (используя инициализатор массива)
      и вывести на консоль простые числа из этого массива. */

public class Main {
    public static void main(String[] args) {
        int[] array = {31, 8, -1, 0, -10, 5, 28, 16, 15, 14, 36, 10, 81, 71, 90};
        for (int i = 0; i < array.length; i++) {
            boolean prime = true;
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    prime = false;
                }
            }
            if (array[i] > 1 && prime) {
                System.out.println(array[i]);
            }
        }
    }

}
