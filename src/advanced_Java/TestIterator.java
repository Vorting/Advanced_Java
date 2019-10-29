package advanced_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestIterator {
    public static void main(String[] args) {
        try {
            List<Integer> arrayList = new ArrayList<>();

            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(2);
            arrayList.add(3);

            System.out.println("ArrayList: " + arrayList);

            ListIterator<Integer> listIterator = arrayList.listIterator();

            System.out.println("\nUsing ListIterator:\n");
            while (listIterator.hasNext()) {
                System.out.println("Value is: " + listIterator.next());
            }
        } catch (NullPointerException e) {
            System.out.println("Exception trown : " + e);
        }
    }
}
