package com.leetcode;

public class RemoveElement_Array {


    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int k = removeElement(nums,val);

        System.out.println(k);


    }




    public static int removeElement(int[] nums, int val) {

        int k=0;

        for (int i = 1; i <=nums.length-1 ; i++) {

            if (i<=nums.length-1 && nums[i-1]==val){

                nums[i-1]=nums[nums.length-1];
                nums[nums.length-1]=val;
                k++;
            }

        }

        return  k;
    }





}
