package shildt.com.edition5.chapter3.practice;
/*
Код ASCII-символов нижнего регистра отличается от кода соответствующих символов
верхнего регистра на величину 32. Следовательно, для преобразования строчной
буквы в прописную нужно уменьшить ее код на 32. Используйте это обстоятельство
для написания программы, осуществляющей ввод символов с клавиатуры. При выводе
 результатов данная программа должна преобразовывать строчные буквы в прописные,
 а прописные — в строчные. Остальные символы не должны изменяться.
Работа программы должна завершаться после того, как пользователь введет с клавиатуры точку.
И наконец, сделайте так, чтобы программа отображала число символов,
для которых был изменен регистр.
 */

public class CaseChg {
    public static void main(String args[]) throws java.io.IOException {
        char ch;
        int changes = 0;
        System.out.println("Enter some words (\'.\' to stop):");
        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.print(ch);
            } else if (ch >= 'A' & ch <= 'Z') {
                ch += 32;
                changes++;
                System.out.print(ch);
            }
        } while (ch != '.');
        System.out.println("Case changes: " + changes);
    }
}
