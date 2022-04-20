package com.linearSearch;

public class LinearSearch_element {

/* This is linear search algorithm , to search the given element in an array of lenght N
   The time complexity  of the Algorithm is  O(N), as the entire array has be serached  for the target element element
   The time time complexity grows as the the size of the array grows with N elements
 */

    public static void main(String[] args) {

        int[] arr = {4,3,2,6,5,8,6,90,87};
        int target = 0;

        System.out.println(searchGivenElement(arr,target));

    }
    public static int searchGivenElement(int[] arr, int target){

        if (arr.length<=0){

            return -1;
        }

        for(int index=0; index<=arr.length-1;index++){

            int element = arr[index];
            // if element is equals the target element
            if (element==target){
                // then return the index of the given  element  else return -1
                return element;

            }

        }
        return -1;
    }
}





