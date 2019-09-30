package shildt.edition5.chapter9.theory;

public class ExcDemo1 {
    public static void main(String[] args) {
        int[] nums = new int[4];

        //Создание блока try.
        try {
            System.out.println("Before exception is generated.");

            //попытка обратиться за границы массива.
            nums[0] = 10;
            System.out.println("this won`t be displayed");

            //перехват исключения в связи с обращением за границы массива
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
