package shildt.com.edition5.chapter6.theory.staticBlock;

import shildt.com.edition5.chapter6.theory.staticBlock.StaticBlock;

public class StaticBlockDemo {
    public static void main(String[] args) {

        StaticBlock staticBlock = new StaticBlock("Inside constructor");

        System.out.println("Square root of 2 is " +
                StaticBlock.rootOf2);
        System.out.println("Square root of 3 is " +
                StaticBlock.rootOf3);

    }
}
