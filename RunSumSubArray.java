                                /*Given an unsorted array A of size N that contains only non-negative integers, 
                                find a continuous sub-array which adds to a given number S.*/

                                                    /*GEEKSFORGEEKS EASY PROBLEM*/

     /*https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1/?page=1&category[]=Arrays&sortBy=submissions#*/


                                                /*Driver code to run this Code*/
import java.util.Scanner;
import java.util.ArrayList;

public class RunSumSubArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int s = sc.nextInt();
        

            int[] m = new int[n];

            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
                
            ArrayList<Integer> res = GivenSumSubArray.subarraySum(m, n, s);

            for(int ii = 0;ii<res.size();ii++){

            System.out.print(res.get(ii) + " ");
            System.out.println();

            }    
        }

        sc.close();
    }
}
