package shildt.edition5.chapter3.Theory;

public class Comma {
    public static void main(String args[]) {

        int i, j;
        //Для управления этим циклом используются две переменные.
        for (i = 0, j = 10; i < j; i++, j--)
            System.out.println("i and j: " + i + " " + j);
    }
}
