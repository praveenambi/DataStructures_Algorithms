package com.selectionSort;

import java.util.Arrays;


/**
 *  Select sort : select sort is nothing but , to select the max value in the array and placing it in a right place ,
 *  i.e getting the max value and putting it in the last index of the array at each iteration , so at end of each array
 *  the max value and consequnce max values   will be in the last position
 *
 *  Note : Run the loop till arr.lenght -i -1 : becoz  the at each iteration, the max will be already sortged and  there is no point in running loop till last index
 *
 *  Time Complexity = the loop will be run till = 1+2+3+4+...............(n-1) time , as we are comparing the each element with one element , so the no of matches
 *  will be array elements -1
 *
 *  sum of natural numbers  = n(n-1)/2
 *                          = n^2 -n/2  (ignore the constats)
 *                          = n^2
 *
 *  The time complexity will be as O(n^2);
 */

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {4,3,2,6,5,8,6,90,87};

        selectSort(arr);

        System.out.println(Arrays.toString(arr));

    }



    public static  void selectSort(int[] arr){

        for (int i = 0; i <arr.length ; i++) {

            int last = arr.length-i-1;

            int max = getmaxIndex(arr, 0, last);

            swapIndex(arr,max,last);


        }

    }

    public static void swapIndex(int[] arr,int first,int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;



    }


    public   static int getmaxIndex(int[] arr, int start, int end){

        int max =start;

        for (int i = start; i <=end ; i++) {

            if (arr[max]< arr[i]){

                max=i;

            }

        }


        return  max;
    }




}
