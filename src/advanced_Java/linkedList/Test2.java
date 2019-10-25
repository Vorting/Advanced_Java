package advanced_Java.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        // head -> [5] -> [1] -> [2] -> [3] -> [4]
        /*
        Если производим удаление элементов из листа, либо производим добавление
        элементов в начало листа, то лучше использовать LinkedList, потому что это будет
        гораздо более эффективно
         */
        List<Integer> arrayList = new ArrayList<>();
        // [7] [6] [1] [2] [3] [4]
        /*
        Если производим много записей в конец листа, если производим много считываний из листа
        то нужно использовать ArrayList, ибо это гораздо быстрее
         */

        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
