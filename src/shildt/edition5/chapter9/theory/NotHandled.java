package shildt.edition5.chapter9.theory;

public class NotHandled {
    public static void main(String[] args) {
        int[] nums = new int[4];

        System.out.println("Before exception is generated.");

        //Попытка за границы массива
        nums[7] = 10;
    }
}
