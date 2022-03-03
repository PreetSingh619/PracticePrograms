                            /*Given an unsorted array A of size N that contains only non-negative integers, 
                                    find a continuous sub-array which adds to a given number S.*/

                                                    /*GEEKSFORGEEKS EASY PROBLEM*/

     /*https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1/?page=1&category[]=Arrays&sortBy=submissions#*/


import java.util.ArrayList;

public class GivenSumSubArray {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        
        int i , sum = 0 , startIndex , endIndex;
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        //Using loop to run thrrough every element

        for( i=0 ; i<n ; i++ )
        {
            sum = 0;
            startIndex = i;                                     
            endIndex = i;
            
            //Using loop to add consecutive elements, avoiding going over s or going out of array index bound.
            while(sum <= s && endIndex < n)
            {
                sum = sum + arr[ endIndex++ ];
                
                //If sum is found add the start index and end index to ArrayList and return.(WIN CASE)
                if(sum == s)
                {
                    answer.add(startIndex + 1);
                    answer.add(endIndex);
                    return(answer);
                }
            }
        }

        //If code reaches here then sum is not found. Add -1 to ArrayList and return.(LOSE CASE)
        answer.add(-1);
        return(answer);
    }
}

