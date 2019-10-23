package advanced_Java.ArrayList.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatIndx {

    private String name;

    public CatIndx(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        List<CatIndx> cats = new ArrayList<>();
        CatIndx thomas = new CatIndx("Томас");
        CatIndx behemoth = new CatIndx("Бегемот");
        CatIndx philip = new CatIndx("Филип");
        CatIndx fluffy = new CatIndx("Пушок");

        int thomasIndx = cats.indexOf(thomas);
        System.out.println(Arrays.toString(new int[]{thomasIndx}));

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
