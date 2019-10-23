package advanced_Java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteratorDemo {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("first", "Mama");
        map.put("second", "Mila");
        map.put("third", "Ramu");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
