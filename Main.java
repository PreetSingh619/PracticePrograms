import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws NullPointerException {
       Scanner sc = new Scanner(System.in); 
       int data;
       Node tempHead = null;
       System.out.println("CREATE YOUR LINKED LIST HERE: ");
       System.out.println("KEEP ENTERING DATA FOR NODE. ENTER -1 TO EXIT");
       data = sc.nextInt();
       while(data != -1){
           System.out.println("Called with" + data);
           tempHead = Node.addNode(data);
           System.out.println("Head is " + tempHead);
           System.out.println("ENTER NEXT VALUE: ");
           data = sc.nextInt();
       }
       Node newHead = Node.ReverseIterative(tempHead);
       System.out.println("ORIGINAL LINKED LIST IS :" + tempHead.data);
       Node.printLL(tempHead);
       System.out.println("REVERSE LINKED LIST IS :" + newHead.data);
       Node.printLL(newHead);
       
       sc.close();
    }
}