package com.insertionSort;

import java.util.Arrays;

/**
 *  Sorting algorithm : Insertion sort is nothing but , inserting the right element at its place,
 *  at each iteration , the left part of the array is getting sorted.
 *
 *  I will run till n-2 values , as  we are starting the J as i+1 , so if we run the i values in n-1 , then will get the IndexPOutof Bound exception
 *
 *  J value will compare the element with j-1 , of J value is less than J-1 , then  swap the elements , else break the loop
 *  as there is no point to compare with other elements behind left.
 *  J value should be greater than 0 always ,if not we cant compare wioth J-1 as -1 index, which is not valid.
 *
 *  Time complexity : The worst case complexity is o(n^2) , if we get the complete descinding array as [5,4,3,2,1], where we need to compare each element through loops
 *                    the best case is sorted array O(N) times , as  its compares with N-1 times , [1,2,3,4,5]
 *
 *
 *
 *
 */



public class InsertionSort {


    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 6, 5, 8, 6, 90, 87};

        insertSort(arr);

        System.out.println(Arrays.toString(arr));

    }


    public static void insertSort(int[] arr) {


        for (int i = 0; i < arr.length - 1; i++) {


            for (int j = i + 1; j > 0; j--) {

                if (arr[j] < arr[j - 1]) {

                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                } else {

                    break;
                }
            }

        }

    }


}