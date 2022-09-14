package homework3.task2;

/* Задать массив с n чисел (используя инициализатор массива).
Найти самое короткое последнее и самое длинное последнее число.
Вывести найденные числа и их длину. (строки не использовать!!!)
 */

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 777, 111, 42, 88888888, 4321, 1111, 1};
        int minNum = array[0];
        int maxNum = 0;
        int minLength = 1;
        int maxLength = 0;

        for (int i = 0; i < array.length; i++) {
            int length = 1;
            int num = array[i];
            while (num / 10 >= 1) {
                length++;
                num /= 10;
            }
            if (length >= maxLength) {
                maxNum = array[i];
                maxLength = length;
            }
            if (length <= minLength) {
                minNum = array[i];
                minLength = length;
            }
        }
        System.out.println("Last max long number is: " + maxNum + ". It's length is: " + maxLength);
        System.out.println("Last min long number is: " + minNum + ". It's length is: " + minLength);
    }

}
