package shildt.edition5.chapter3.practice;

import java.io.IOException;

public class Help2 {
    public static void main(String args[]) throws IOException {

        char choice, ignore;
        do {
            System.out.println("Help on: ");
            System.out.println("\t1.\'if\'" + ";");
            System.out.println("\t2.\'switch\'" + ".");
            System.out.println("\t3.\'for\'");
            System.out.println("\t4.\'while\'");
            System.out.println("\t5.\'do-while\'\n");
            System.out.print("Choose one: ");
            choice = (char) System.in.read();

            // отвергнуть все остальные символы во входном буфере
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice < '1' | choice > '5');
        switch (choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println(" case constant:");
                System.out.println(" statement sequence");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The for:\n");
                System.out.print("for(init; condition; iteration)");
                System.out.println(" statement;");
                break;
            case '4':
                System.out.println("The while:\n");
                System.out.println("while(condition) statement;");
                break;
            case '5':
                System.out.println("The do-while:\n");
                System.out.println("do {");
                System.out.println(" statement;");
                System.out.println("} while (condition);");
                break;
        }
    }
}

