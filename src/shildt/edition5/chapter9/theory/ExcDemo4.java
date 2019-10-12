package shildt.edition5.chapter9.theory;

public class ExcDemo4 {
    public static void main(String[] args) {
        // Здесь массив number длиннее массива denom.
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " is " +
                        numer[i] / denom[i]);
                //За блоком try следует несколько блоков catch подряд
            } catch (ArithmeticException exc) {
                //Перехватить исключение
                System.out.println("Can`t divide by Zero!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                //Перехватить исключение
                System.out.println("No matching element found.");
            }
        }
    }
}
