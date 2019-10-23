package advanced_Java.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

//        hashSet.add("Mike");
//        hashSet.add("Katy");
//        hashSet.add("Tom");
//        hashSet.add("George");
//        hashSet.add("Donald");

//        linkedHashSet.add("Mike");
//        linkedHashSet.add("Katy");
//        linkedHashSet.add("Tom");
//        linkedHashSet.add("George");
//        linkedHashSet.add("Donald");

        treeSet.add("Mike");
        treeSet.add("Katy");
        treeSet.add("Tom");
        treeSet.add("George");
        treeSet.add("Donald");

        for (String name : treeSet) {
            System.out.println(name);
        }
    }
}
