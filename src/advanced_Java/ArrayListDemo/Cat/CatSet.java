package advanced_Java.arrayListDemo.Cat;

import java.util.ArrayList;
import java.util.List;

public class CatSet {
    private String name;

    public CatSet(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List<CatSet> catList = new ArrayList<>();
        CatSet thomas = new CatSet("Томас");
        CatSet behemot = new CatSet("Бегемот");
        CatSet philip = new CatSet("Филипп Маркович");
        CatSet fluffy = new CatSet("Пушок");

        catList.add(thomas);
        catList.add(behemot);

        System.out.println(catList.toString());

        catList.set(0, philip);

        System.out.println(catList.toString());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
