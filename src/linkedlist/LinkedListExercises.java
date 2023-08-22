package linkedlist;

import javax.swing.text.StyledEditorKit;

public class LinkedListExercises {


    class Node
    {
        int data;
        Node next;
         Node(int data)
        {
            this.data= data;
        }
    }

    Node head;
    Node tail;
    public void addNodeAtEnd(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }
    }

    public static void main(String[] args)
    {
        LinkedListExercises l1 = new LinkedListExercises();
        l1.addNodeAtEnd(10);
        l1.addNodeAtEnd(20);
        l1.addNodeAtEnd(30);
        l1.addNodeAtEnd(40);
    }
}
