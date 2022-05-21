package com.cyclicsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CycleSortHighindex {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        cyclicSort(arr);

    }





    public  static  List<Integer> cyclicSort(int[] nums){

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

                list.add(index+1);


            }

        }
        System.out.println(Arrays.toString(nums));
        System.out.println(list);
        return  list;



    }




}
