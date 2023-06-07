package linkedlist;

public class LinkedListgetCountrec {


    private  Node head;

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public int getCountRec(Node node)
    {
        if(node == null)
        {
            return 0;
        }

        return 1+ getCountRec(node.next);
    }

    public int getCount()
    {
        return getCountRec(head);
    }


    public static void main(String[] args)
    {
        LinkedListgetCountrec l1 = new LinkedListgetCountrec();
        l1.push(20);
        l1.push(40);

        System.out.println(l1.getCount());
    }
}
