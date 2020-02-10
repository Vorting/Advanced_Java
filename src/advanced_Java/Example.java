package advanced_Java;

import javax.crypto.spec.PSource;

public class Example {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.err.println("Divide by 0");
        }

        System.out.println("The end");

    }

}
