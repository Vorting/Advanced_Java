package advanced_Java.set;

import java.util.HashSet;
import java.util.Set;

public class HashSet2Demo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Mike");
        hashSet.add("Katy");
        hashSet.add("Tom");
        hashSet.add("George");
        hashSet.add("Donald");
        hashSet.add("Tom");
        hashSet.add("Tom");

        for (String name : hashSet) {
            System.out.println(name);
        }

        System.out.println(hashSet);
    }
}
