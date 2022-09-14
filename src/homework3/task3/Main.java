package homework3.task3;

/* Задать массив с n чисел (используя инициализатор массива).
Найти числа, состоящее только из различных цифр. (строки не использовать!!!) */

public class Main {
    public static void main(String[] args) {
        int[] array = {118888, 887, 41, 186, 9571, 12345678, 333, 10000, 77788};
        int countNum = 0;
        int differNumbers;
        boolean figuresEgual = false;
        System.out.print("Numbers without repeating digits in array : ");

        for (int numbers : array) {
            differNumbers = numbers;

            while (differNumbers != 0) {
                ++countNum;
                differNumbers /= 10;
            }

            int[] digits = new int[countNum];
            countNum = 0;
            differNumbers = numbers;

            while (differNumbers % 10 != 0) {
                digits[countNum++] = differNumbers % 10;
                differNumbers /= 10;
            }

            countNum = 0;
            figuresEgual = false;
            for (int i = 0; i < digits.length; i++) {
                if (figuresEgual) {
                    break;
                }

                for (int j = i + 1; j < digits.length; j++) {
                    if (digits[i] == digits[j]) {
                        figuresEgual = true;
                        break;
                    }
                }
            }
            if (figuresEgual == false) {
                System.out.print(" " + numbers + " ");
            }
        }
    }

}

