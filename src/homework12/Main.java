package homework12;

/* Реализовать структуру данных односвязного списка.
Список сделать обобщенным (Generic).
Функции списка:
Инициализация списка(пустого и на основании массива)
Добавление узла в список в начало, конец и внутрь по нидексу
Удаление узла из начала, конца и n-го элемента
Вывод элементов списка (toString())
Взаимообмен двух узлов списка (по двум идексам)
Количество элементов в списке
Проверить список на пустоту
Индекс в ноде не хранить! */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        Integer[] array = new Integer[]{0, 2, 4, 6, 8, 10};
        List<Integer> arrayList = new List<>(array);
        System.out.println(arrayList);

        List<String> stringsLinkedList = new List<>();
        stringsLinkedList.elementToTheEndList("0");
        stringsLinkedList.elementToTheEndList("2");
        stringsLinkedList.elementToTheEndList("4");
        System.out.println(stringsLinkedList);

        stringsLinkedList.getValue(1);
        stringsLinkedList.elementToTheBeginList("42");
        System.out.println(stringsLinkedList.getValue(0));

        ArrayList<Integer> newList = new ArrayList<>();

        newList.add(0);
        newList.add(2);
        newList.add(4);
        System.out.println("My List:");
        System.out.print(newList);
    }

}