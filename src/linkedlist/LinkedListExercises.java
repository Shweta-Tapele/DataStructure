package linkedlist;

import javax.swing.text.StyledEditorKit;

public class LinkedListExercises {


    private static Node head;

    class Node
    {
        int data;
        Node next;
         Node(int data)
        {
            this.data= data;
        }
    }

    Node tail;

    Node current;
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


    public void addNodeAtBegin(int data)
    {
        Node newNode1 = new Node(data);
        newNode1.next = head;
        head= newNode1;
    }


    public void addNodeAtGivenIndex(int data, int index)
    {
        current = head;
        int count = 1;
        Node newNode2 = new Node(data);
        while(current != null && count != index-1)
        {
            current= current.next;
            count++;
        }
        Node temp = current.next;
        current.next = newNode2;
        newNode2.next = temp;

    }


    public void displayList(Node headNode)
    {
        current = headNode;
        while (current!= null)
        {
            System.out.println(current.data);
            current= current.next;

        }
    }

    public void removeAtEnd()
    {
        Node current = head;
        while( current.next.next != null)
        {
            current= current.next;
        }
        current.next = null;
        tail = current;

    }

    public void removeAtBegin()
    {
        head = head.next;
    }


    public void removeAtGivenIndex(int index)
    {
        int count = 1;
        Node current = head;
        while (current != null && count != index-1)
        {
            current = current.next;
            count++;
        }
        current.next = current.next.next;
    }

    // remove a Node with Given Value
    public void removeNodewithGivenValue(int value)
    {
        if( head.data == value)
        {
            removeAtBegin();
        }
        else if (tail.data == value)
        {
            removeAtEnd();
        }
        else {
            Node current = head;
            int count = 1;
            while(current != null && current.data!= value)
            {
                current= current.next;
                count++;

            }
            if(current.data == value)
            {
                removeNodewithGivenValue(count);
            }
        }


    }
    public void removeAllNodesWithEvenValues()
    {
        Node current = head;
        //int count = 1;
        while(current.next != null)
        {
            if(current.data % 2 ==0)
            {
              removeNodewithGivenValue(current.data);
            }
            current = current.next;

        }
    }

    public void reverseLinkedList()
    {
        Node current = head;
        Node prev = null;
        Node next = null;

        while( current != null )
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        displayList(prev);
    }



    public static void main(String[] args)
    {
        LinkedListExercises l1 = new LinkedListExercises();
        l1.addNodeAtEnd(10);
        l1.addNodeAtEnd(20);
        l1.addNodeAtEnd(33);
        l1.addNodeAtEnd(43);
        //l1.addNodeAtBegin(5);
        //l1.addNodeAtGivenIndex(15,3);
        //l1.removeAtEnd();
        //l1.removeAtBegin();
        //l1.removeAtGivenIndex(3);
        //l1.removeNodewithGivenValue(40);
        //l1.removeAllNodesWithEvenValues();
        l1.displayList(head);
        l1.reverseLinkedList();

    }
}
