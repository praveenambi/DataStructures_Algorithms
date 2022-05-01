package com.cyclicsort;

import java.util.Arrays;

/**
 * Cyclic sort : cyclic sort is nothing but , comparing the index withe the array value, if the array values is not eqaula to the index , then swap  the value with correct index
 * again check the i value, if not eqauls then swap it with array value, if index and vlues are eqaul the increment the i value
 *
 * Time complexity : since we are using the single loop and no of comparisons will be n-1 , so the ignoring the constatnts
 * the time complexity will be O(N)
 *
 *
 * Hint : if the given number are 1 to N, the simply apply cyclic sort, to sort the arrays and to find the missing numbers
 *
 */


public class CyclicSort {

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};

        cyclicSort(arr);

       // System.out.println(Arrays.toString(cyclicSort(arr)));

    }



    public  static  void cyclicSort(int[] arr){

        int i= 0;

        while (i<arr.length){

            int correct =  arr[i];

            if ((i+1)!=(correct)){

                int temp = arr[i];
                arr[i]= arr[correct];
                arr[correct]= temp;
            }else{

                i++;
            }


        }

        System.out.println(Arrays.toString(arr));

    }
}
