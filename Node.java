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
            System.out.println("Added head as " + data);
            head = newNode;
            newNode.next = null;
            newNode.data = data;
            
            System.out.println("Head is" + data);
            System.out.println("List is");
            printLL(head);
            
        }
        else{
            Node temp = head;
            System.out.println("Added " + data);
            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.data = data;
            newNode.next = null;
            printLL(head);
            
        }
        System.out.println("Returned head as " + head.data);
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
            System.out.println("Reached with" + head.data);
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
            System.out.println("head is : " + head.data);
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

