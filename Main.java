
                                /*Main driver Class and main function to call*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in); 
       int data;
       Node tempHead = null;
       System.out.println("CREATE YOUR LINKED LIST HERE: ");
       System.out.println("KEEP ENTERING DATA FOR NODE. ENTER -1 TO EXIT");
       data = sc.nextInt();
       while(data != -1){
           
           tempHead = Node.addNode(data);
           System.out.println("ENTER NEXT VALUE: ");
           data = sc.nextInt();
       }
       Node newHead = Node.ReverseIterative(tempHead);
       System.out.println("REVERSED LINKED LIST IS : " );
       Node.printLL(newHead);
       
       sc.close();
    }
}