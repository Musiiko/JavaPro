package homework14.task3.runner;

import homework14.task3.list.FileHelper;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        FileHelper fileHelper = new FileHelper();
        fileHelper.validator("C:\\Users\\Sergey\\NewJavaProject\\JavaPro\\src\\homework14\\task3\\words.txt", map);

        System.out.print(map);
    }

}
