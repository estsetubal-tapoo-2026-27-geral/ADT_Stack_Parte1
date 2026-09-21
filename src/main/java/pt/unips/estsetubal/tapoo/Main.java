package pt.unips.estsetubal.tapoo;

import pt.unips.estsetubal.tapoo.adt.Stack;
import pt.unips.estsetubal.tapoo.adt.StackArrayList;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new StackArrayList<>();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }


        System.out.println("Stack is empty? " + stack.isEmpty());

        System.out.println("Top of stack is: " + stack.peek());

        System.out.println("Pop all elements from stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("Stack is empty? " + stack.isEmpty());


    }
}
