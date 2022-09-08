package homework6.task2_3;
/* Дано натуральное число n (обычная переменная int).
   Рекурсивно вывести все числа от 1 до n. (Ввод 5 -> вывод 1 2 3 4 5)
   Рекурсивно вычислить сумму цифр числа */

public class Main {
    public static void main(String[] args) {
        int firstNumber = 5;
        print(firstNumber);
        int secondNumber = 12345;
        System.out.println("\n" + calculateSum(secondNumber));
    }

    public static void print(int number) {
        if (number > 0) {
            print(number - 1);
            System.out.println(number);
        }
    }

    public static int calculateSum(int number) {
        return number < 10 ? number : ((number % 10) + calculateSum(number / 10));
    }

}

