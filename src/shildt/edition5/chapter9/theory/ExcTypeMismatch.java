package shildt.edition5.chapter9.theory;

public class ExcTypeMismatch {
    public static void main(String[] args) {
        int[] num = new int[4];

        try {
            System.out.println("Before exception is generated.");
            //При выполнении следующего оператора возникает
            //исключение ArrayIndexOutOfBoundsException
            num[7] = 10;
            System.out.println("this won`t be displayed.");

        /* Исключение, связанное с обращением за границы массива,
        нельзя обработать с помощью оператора catch, в котором указан тип исключения ArithmeticException. */
        } catch (ArithmeticException exc) {
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
