package linkedlist.stack;

import java.util.Stack;

public class StackDS {

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        //System.out.println(stack1.size());
        //System.out.println(stack1.isEmpty());
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        System.out.println(stack1);
        moveStack(stack1, stack2);
        moveStack(stack2, stack3);
        moveStack(stack3, stack1);

        System.out.println(stack1);
        //stack1.pop();
        //System.out.println(stack1);
        //System.out.println(stack1.peek());
        //System.out.println(stack1.contains(30));

    }

    private static void moveStack(Stack<Integer> source, Stack<Integer> dest) {
        while (!source.isEmpty()) {
            int a = source.peek();
            dest.push(a);
            source.pop();
        }

    }
}