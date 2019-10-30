package advanced_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestIterator2 {

    public static void main(String[] args) throws IOException {
        List<Integer> numOrder = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            numOrder.add(Integer.valueOf(reader.readLine()));
        }
        ListIterator listIterator = numOrder.listIterator();

        Object nextIdx = listIterator.nextIndex();
        Object prevIdx = listIterator.previousIndex();
        int result = 1;
        int count = 1;

        while (listIterator.hasNext()) {
                if (prevIdx == nextIdx) {
                    nextIdx = listIterator.next();
                    count++;
                    if (result < count) {
                        result = count;
                    }
            } else {
                count = 1;
                nextIdx = listIterator.next();
                prevIdx = nextIdx;
            }
        }
        System.out.println(result);
    }
}

