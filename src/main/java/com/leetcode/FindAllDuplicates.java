package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//442 : https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindAllDuplicates {


    public static void main(String[] args) {


        int[] nums = {4,3,2,7,8,2,3,1};

        findDuplicates(nums);

    }


    public static List<Integer> findDuplicates(int[] nums) {

        int i= 0;

        while (i<nums.length){

            int correct =  nums[i]-1;

            if (nums[i]!=nums[correct]){

                int temp = nums[i];
                nums[i]= nums[correct];
                nums[correct]= temp;
            }else{

                i++;
            }


        }

        List<Integer> list =new ArrayList<Integer>();
        for (int index = 0; index < nums.length ; index++) {

            if (nums[index]!=index+1){

                list.add(nums[index]);


            }

        }
        System.out.println(Arrays.toString(nums));
        System.out.println(list);
        return  list;



    }




    }



