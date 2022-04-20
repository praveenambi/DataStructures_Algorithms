package com.binarysearch;


/*  This is binary search algorithm , to find out the desired element ,
    This is basically reducing the array size, which must be the sorted array
     The time complexity for this is O(logN) , where N is the size of array
 */

public class BinarySearch_Descending {


    public static void main(String[] args) {

        int[] arr = {99,87,76,66,54,40,39,38,33,32,28,26,24,6,2};
        int target = 2;
        int targetelement =  findTargetElement(arr,target);

        System.out.println("The target element is found at " + targetelement);


    }
    public static int findTargetElement(int[] arr , int target){

        int start =0;
        int end = arr.length-1;

        if (arr.length <=0){

            return  -1;
        }


        while (start<=end){

            // find out the mid element by below formulae
            int mid = start+ (end-start) /2;

            if (target>arr[mid]){

                end=mid-1;
            }
            else if(target<arr[mid]){

                start= mid+1;
            }
            else {

                return mid;
            }

        }

        return -1;
    }
}
