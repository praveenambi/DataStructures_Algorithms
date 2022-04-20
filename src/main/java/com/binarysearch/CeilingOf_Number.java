package com.binarysearch;


/*
Problem statement: Find the Ceiling of a number in a given array

Problem description :  The problem is to find the ceiling number of a given number is a array.
Ceiling number is like the is smallest number, which is greater than or equal to given number

int[] arr = {2,4,7,9,11,17,23,34,46,47,66};
int target = 45;
output : 46

In the above example , 46 is the smallest number whih is greater than the target number

Logic: need to apply the binary search  and if the condition (start<=end) fails ,
when  it becomes like end<start, then return the  element at start index

Time complexity: O(logN), where N is size of array
 */

public class CeilingOf_Number {


    public static void main(String[] args) {
        int[] arr = {2,4,7,9,11,17,23,34,46,47,66};
        int target = 67;
        int targetelement =  findCeilingNumber(arr,target);

        System.out.println("The target element is found is " + targetelement);
    }

    public static int findCeilingNumber(int[] arr , int target){

        int start =0;
        int end = arr.length-1;

        if (arr.length <=0 || target>arr.length-1){

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

                return arr[mid];
            }

        }

        return arr[start];
    }


}
