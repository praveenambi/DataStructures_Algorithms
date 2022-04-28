package com.bubblesort;

import java.math.BigInteger;
import java.util.Arrays;

/*
The iteration  for each i value  an at end of each iteration  the max value will be at the end of arra.

Time complexity : O(N) , where the N will be size of array
 */

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2,6,2,1,0,4,2,6,7,9,10,54,98,12,43};
        int[] arr1 = {1,2,3,4,5};
        sortBubble(arr1);

        System.out.println(Arrays.toString(arr1));

    }

    public   static    void sortBubble(int[] arr){
        boolean swaped;
        // run the steps n-1 times
        for (int i = 0; i <arr.length ; i++) {
            swaped =false;
            // for each iteraion of i value, max number will come at the end
            for (int j = 1; j < arr.length-i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j]< arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] =temp;
                    swaped = true;
                }

            }
// if the array is sorted and  no swap is occured for one perticular i value, the break the loop and stop execution
            if (!swaped){
                break;
            }

        }

    }

}
