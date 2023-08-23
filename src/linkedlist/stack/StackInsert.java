package linkedlist.stack;

import java.util.Stack;

//Program to write a method to insert in a Stack at given index using auxilary stack
public class StackInsert {

           static void insertinTheMiddle(int index, int value, Stack<Integer> stack1)
        {

            Stack<Integer> temp = new Stack<>();
            for(int i =1; i<= stack1.size()-index+1; i++)
            {
                int ele = stack1.peek();
                temp.push(ele);
                stack1.pop();
            }

            stack1.push(value);
            while(!temp.isEmpty())
            {
                int ele = temp.peek();
                stack1.push(ele);
                temp.pop();
            }

        }


    public static void main(String[] args)
    {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        insertinTheMiddle(2,25,stack1);

        System.out.println(stack1);


    }




}

