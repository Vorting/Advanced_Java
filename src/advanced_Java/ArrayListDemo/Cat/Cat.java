package advanced_Java.arrayListDemo.Cat;

import java.util.ArrayList;
import java.util.List;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        Cat thomas = new Cat("Томас");
        Cat behemoth = new Cat("Бегемот");
        Cat philip = new Cat("Филип");
        Cat fluffy = new Cat("Пушок");

        int thomasIndx = cats.indexOf(thomas);
        System.out.println(thomasIndx);
    }
}
