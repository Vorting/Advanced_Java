package shildt.edition5.chapter8.theory.interfaces;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is " + ob.getNext());
        }

        System.out.println("\nResetting");
        ob.rest();
        for (int j = 0; j < 5; j++) {
            System.out.println("Next value is " + ob.getNext());
        }
        System.out.println("\nStarting at 100");
        ob.setStart(100);
        for (int k = 0; k < 5; k++) {
            System.out.println("Next value is " + ob.getNext());
        }
    }
}
