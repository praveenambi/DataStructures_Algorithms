package com.leetcode;

public class FirstandLastPosition {

    public int[] searchRange(int[] nums, int target){
        int[] arr ={-1,-1};


        int start = searchIndexofElement(nums,target,true);
        int end = searchIndexofElement(nums,target,false);
        arr[0] = start;
        arr[1]= end;

        return  arr;
    }

    public static int searchIndexofElement(int[] nums, int target, boolean firstElementIndex){

        int ans =-1;
        int start =0;
        int end = nums.length-1;

        if (nums.length <=0){

            return  -1;
        }

        while (start<=end){

            // find out the mid element by below formulae
            int mid = start+ (end-start) /2;

            if (target<nums[mid]){

                end=mid-1;
            }
            else if(target>nums[mid]){

                start= mid+1;
            }
            else {
// potential answer has been found which is mid , now there could be possibilities  of elements at left side of mid
                // so  we will try to search in the left side by putting condition as
                ans=mid;

                if (firstElementIndex){

                    end =mid-1;
                }else {

                    start= mid+1;
                }

            }

        }

        return ans;

    }



}
