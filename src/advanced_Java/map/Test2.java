package advanced_Java.map;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        /* элементы в HashMap не имеют какого-либо порядка
        т.е. упорядоченность єлементов не гарантируется
        порядок вывода может меняться, каждый раз при запуске программы
         */

        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
