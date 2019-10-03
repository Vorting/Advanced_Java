package advanced_Java.arrayListDemo.Cat;

import java.util.ArrayList;
import java.util.List;

public class CatContains {
    private String name;

    public CatContains(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List<CatContains> catList = new ArrayList<>();
        CatContains thomas = new CatContains("Томас");
        CatContains behemoth = new CatContains("Бегемот");
        CatContains philip = new CatContains("Филипп Маркович");
        CatContains fluffy = new CatContains("Пушок");

        catList.add(thomas);
        catList.add(behemoth);
        catList.add(philip);
        catList.add(fluffy);

        catList.remove(fluffy);

        System.out.println(catList.contains(fluffy));

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
