package lesson2;

import java.util.ArrayList;
import java.util.function.Consumer;

public class SecondClass {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add(1, "Amigo");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.addAll(list);
        System.out.println("Первое добавление: " + secondList);
        secondList.addAll(1, list);
        System.out.println("Второе добавление в середину: " + secondList);

        ArrayList<String> copyOfSecondList = (ArrayList<String>) secondList.clone();
        secondList.clear();
        System.out.println(copyOfSecondList);

        System.out.println(copyOfSecondList.contains("Hello"));
        System.out.println(copyOfSecondList.contains("Check"));

        secondList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}



