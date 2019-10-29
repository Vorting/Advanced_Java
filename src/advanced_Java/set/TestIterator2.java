package advanced_Java.set;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestIterator2 {
    private static int increase = 0;
//    private static int decrease = 0;

    public static void main(String[] args) {

        int count = increase;
        int count2 = increase;
        try {
            List<Integer> arrayList = new ArrayList<>();

            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(2);
            arrayList.add(3);

            System.out.println("ArrayList: " + arrayList);

            ListIterator<Integer> listIterator = arrayList.listIterator();

            int currentIdx = listIterator.next();
            int nextIndex = listIterator.nextIndex();
            System.out.println("\nUsing ListIterator:\n");
            while (listIterator.hasNext()) {
                if (currentIdx!=nextIndex) {
                    count++;
                    currentIdx = listIterator.next();
                    nextIndex = listIterator.next();
                    continue;
                } else if (currentIdx==nextIndex){
                    count2++;
                }

                System.out.println("Value is: " + listIterator.next());

            }
        } catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
        System.out.println(count2);
    }
}
