
               
               /*A simple solution to find maximum sub array sum from an array of integers(both positive and negative)*/
            
import java.util.Scanner;

public class KadaneAlgo {

    static long maxSubArraySum(int arr[], int n){
        
        int i ;
        int positiveSum = 0 , currentSum = 0;
        int negativeSum = Integer.MIN_VALUE;                    //Variable for sum when all elements are negative
        
        for( i=0 ; i<n ; i++)
        {
            currentSum += arr[i];
                
            if(negativeSum < arr[i] && arr[i] < 0)
                negativeSum = arr[i];
                
            if(currentSum < 0)
                currentSum = 0;
                
            if(positiveSum < currentSum)
                positiveSum = currentSum;
                
        }
        
        if(positiveSum == 0)                                    //if positive sum is 0 then all elements must be negative
            return(negativeSum);                                //Returning negativeSum if all elements are negative
        else
            return(positiveSum);                                // Returning positveSum for base case(positive and negative mixed)
    }


                        
                                /*Driver Code*/
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array:(positive size only)");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements in array");

        for(int i=0 ; i<n ; i++)
            arr[i] = sc.nextInt();

        long answer = maxSubArraySum(arr , n);

        System.out.println("Maximum sum is:" + answer);

        sc.close();

    }
    
}
    

