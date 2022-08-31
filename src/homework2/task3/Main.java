package homework2.task3;

/* 3. Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран
      (первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих) */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] fibonaci = new int[20];
        for (int i = 0; i < fibonaci.length; i++) {
            if (i == 0 || i == 1) {
                fibonaci[i] = i;
            } else {
                fibonaci[i] = fibonaci[i - 2] + fibonaci[i - 1];
            }
        }
        System.out.println(Arrays.toString(fibonaci));
    }

}
