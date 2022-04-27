package com.leetcode;

public class PeakMountainArray {


    public static void main(String[] args) {

        int[] arr = {0, 1, 8, 10,15,20,3,2,1};
        int targetelement = findPeak(arr);

        System.out.println("The park element is " + targetelement);

    }

    public static int findPeak(int[] arr) {

        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {


                return i;
            }

        }

        return -1;
    }
}
