package advanced_Java.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test3 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); //внутри не гарант. никакого порядка

        // в каком порядке пары <K,V> были добавлены в таком порядке они и вернутся
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        Map<Integer, String> treeMap = new TreeMap<>(); // пары <K,V> сортируются по ключу (естественным порядком)

//        testMap(hashMap);
//        testMap(linkedHashMap);
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {

        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
