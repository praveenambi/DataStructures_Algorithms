package com.recursion;

/**
 *  What is recursion : A function calling itself is a  recursive function
 *
 *
 *  Steps to understand the Recursion:
 *  1. First , look at the problem and  whether we can devide the problem into sub problems eg : binary search
 *  2.  try to frame the recurrative statement  , so in this example it f(N) = O(1) + f(N/2)
 *        O(1)  is a constant time to know where the target element exist
 *        f(n/2) : deviding the array size at each iteration and
 *
 * 3. draw the recursive tree structure  and try to understand the way  functions are called.
 * the resursive tree functions are always called from left side of tree
 * 4.analyze how the values are being returned  after debugging
 * 5. Analyze and understand  how functions are being called and removed in stack memory.
 * 6. pass the parameters in method itself , so that which are being used in the future calls of the function , eg : start and end \
 *    at each iteration start and end will be used at each call  of recursion
 *
 *
 *
 *
 */


public class BinarySearch_Recursion {

    public static void main(String[] args) {

        int[] arr ={1,2,5,7,90,99,10};
        int target = 10;

        int  correct_index = binarySearch(arr,target,0,arr.length-1);

        System.out.println(correct_index);
    }


    public  static  int binarySearch(int[] arr, int target , int start, int end){

        if (start>end){

            return  -1;

        }
        int middle = start +(end - start)/2;

        if (arr[middle] == target){

            return middle;

        }
        if (target>middle){

            return  binarySearch(arr,target, middle+1,end);
        }else

            return binarySearch(arr,target,start,middle-1);

    }
}
