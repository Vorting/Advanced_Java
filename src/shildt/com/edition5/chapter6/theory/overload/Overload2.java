package shildt.com.edition5.chapter6.theory.overload;

public class Overload2 {

    void f(int x){
        System.out.println("Inside f(int): "+x);
    }

    void f(double x){
        System.out.println("Inside f(double): "+x);
    }
}
