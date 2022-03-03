     
//////////////////////////////////////*A function to reverse the linked list in an iterative format*////////////////////////////////////////

public class Node {

    public int data;
    public Node next;
    static Node head = null; 

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

    static Node addNode(int data){
        Node newNode = new Node(data);
        if(head == null)
        {
            
            head = newNode;
            newNode.next = null;
            newNode.data = data;
            
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.data = data;
            newNode.next = null;  
        }

        return(head);
    }

    public static Node ReverseIterative(Node head)
    {
        if(head == null)
        {
            System.out.println("List is Empty!!!!!!");
            return(null);
        }
        else{

            Node prevNode = null;
            Node currentNode = head;
            Node nextNode = null;

            while(currentNode != null)
            {
                nextNode = currentNode.next;
                currentNode.next = prevNode;
                prevNode = currentNode;
                currentNode = nextNode;
                
            }
            head = prevNode;
        }
        return(head);
    }

    public static void printLL(Node start)
    {
        while(start != null)
       {
           System.out.print(start.data + "-> ");
           start = start.next;
       }
    }
}

