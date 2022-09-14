package homework3.task4;

/* Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз
 (матрица обязательно должна быть квадратной, массив не создавать)
 */

public class Main {
    public static void main(String[] args) {
        int k = 8;
        int n = 1;
        int num = 1;
        while (n * n < k) {
            n++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (num <= k) {
                    System.out.print(num + "\t");
                    num++;
                }
            }
            System.out.println();
        }
    }

}
