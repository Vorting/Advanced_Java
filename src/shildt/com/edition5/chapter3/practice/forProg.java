package shildt.com.edition5.chapter3.practice;

/*
Итерационное выражение для цикла for не обязательно должно изменять перемен¬
ную цикла на фиксированную величину. Эта переменная может принимать произ¬
вольные значения. Напишите программу, использующую цикл for для вывода чисел
в геометрической прогрессии 1, 2, 4, 8, 16, 32 и т.д.

 */
public class forProg {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i += i ){
            System.out.println(i);
        }
    }
}
