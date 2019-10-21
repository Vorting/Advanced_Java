package advanced_Java.ArrayList.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatGet {
    private String name;

    public CatGet(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List<CatGet> catList = new ArrayList<>();
        CatGet thomas = new CatGet("Томас");
        CatGet behemoth = new CatGet("Бегемот");
        CatGet philip = new CatGet("Филипп Маркович");
        CatGet fluffy = new CatGet("Пушок");

        catList.add(thomas);
        catList.add(behemoth);
        catList.add(philip);
        catList.add(fluffy);

        CatGet secondCat = catList.get(1);
        System.out.println(Arrays.toString(new CatGet[]{secondCat}));
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
