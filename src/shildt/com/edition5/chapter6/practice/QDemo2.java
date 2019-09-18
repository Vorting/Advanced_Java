package shildt.com.edition5.chapter6.practice;

public class QDemo2 {
    public static void main(String[] args) {

        //строим очередь для хранения 10  элементов
        Queue q1 = new Queue(10);
        char name[] = {'T', 'o', 'm'};
        Queue q2 = new Queue(name);

        char ch;
        int i;

        // поместим ряд символов в очередь q1
        for (i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        Queue q3 = new Queue(q1);

        System.out.println("Contents of q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");
        System.out.println("Contents of q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");
        System.out.println("Contents of q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
