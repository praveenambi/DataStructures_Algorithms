package com.recursion;

public class LinearSearch {


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,7,9,13,17,21,26,28};

        boolean status =  isArraySorted(arr,0);
        System.out.println(status);




    }


    public static boolean isArraySorted(int[] arr,int index){


        if (index==arr.length-1){

            return  true;
        }

        return  arr[index] < arr[index+1] && isArraySorted(arr,index+1);

    }






}
