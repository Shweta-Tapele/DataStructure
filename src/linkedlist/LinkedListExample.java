package linkedlist;



class Node
{
    int data;
    Node next;

    Node (int d)
    {
        data = d;
        next = null;
    }
}

class LinkedListExample
{
    Node head;



    public void push(int new_data)
    {
        //Allocate the node and put in data
        Node new_node = new Node(new_data);
        //make next of the new_node as head
        new_node.next = head;
        //move head to point new_node
        head = new_node;
    }


    public int getCount()
    {
        Node current = head;
        int count =0;

        while(current!= null)
        {
            count++;
            current = current.next;
        }

        return count;
    }



    public static void main(String[] args)
    {
      LinkedListExample l1 = new LinkedListExample();
      l1.push(10);
      l1.push(20);
      l1.push(30);


        System.out.println(l1.getCount());

    }



}