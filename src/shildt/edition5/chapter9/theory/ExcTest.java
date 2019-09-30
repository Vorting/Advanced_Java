package shildt.edition5.chapter9.theory;

public class ExcTest {
    static void genException() {
        int nums[] = new int[4];
        System.out.println("Before exception is generated.");

        //генерируется исключение в связи с обращеинем за границы массива
        nums[7] = 10;
        System.out.println("this won`t be displayed");
    }
}


class ExcDemo2 {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        }
        //перехватываем исключение
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
