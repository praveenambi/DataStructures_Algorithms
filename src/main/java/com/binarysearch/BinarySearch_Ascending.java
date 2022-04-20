package com.binarysearch;


/*  This is binary search algorithm , to find out the desired element ,
    This is basically reducing the array size, which must be the sorted array
     The time complexity for this is O(logN) , where N is the size of array
 */

public class BinarySearch_Ascending {


    public static void main(String[] args) {

        int[] arr = {2,4,7,9,11,17,23,34,46,47,66};
        int target = 47;
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

            if (target<arr[mid]){

                end=mid-1;
            }
            else if(target>arr[mid]){

                start= mid+1;
            }
            else {

                return mid;
            }

        }

        return -1;
    }
}
