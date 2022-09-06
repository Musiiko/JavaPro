package homework14.task2;

import homework14.task2.singlylinkedlist.ListContainer;

public class Runner {

    public static void main(String[] args) {
        Integer[] data = {15, 3, 8, 12, 17};
        ListContainer<Integer> intList = new ListContainer<>(data);

        System.out.println(intList);
        intList.addFirst(1);
        intList.addLast(4);
        intList.removeFirst();
        intList.removeLast();
        intList.addByIndex(2, 4);
        System.out.println(intList);
        intList.replaceElements(2, 0);
        intList.addByIndex(5, 1);
        intList.removeLast();
        System.out.println(intList);
        System.out.println(intList.getSize());
    }

}