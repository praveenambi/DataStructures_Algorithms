package com.subsets;

import java.util.ArrayList;
import java.util.List;


/**
 *  Questions : [1,2,3]
 *
 *   Logic: take the first element  creste the ssubset ,
 *   the take the second element subsets and add it to the alreasy existing array  of previous element subsets
 *    Please refer ![](ArrayrecursiveTree.png) to undertand it more
 *
 *   Take an outer list which contains many many list inside  like [ [],[],[],[],[] ]
 *
 * Time complexity :  o(N * 2^n), where N is lenght of array and 2^n is the total no of subsets created at each level ,
 * as  at each stage  the no of subsets are getting doubled
 *
 */

public class ArraySubset {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        List<List<Integer>> ans = ArraySubset(arr);

        for (List<Integer> sublist: ans) {

            System.out.println(sublist);

        }

    }


    public static List<List<Integer>> ArraySubset(int[] arr){
        // create an outer list which contain the original list to return
        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<Integer>());  // initially create an empty array List and add to outerlist

        // iterate through each element of array
        for (int num :arr ) {
            int n = outerList.size();
            for (int i = 0; i <n ; i++) {
                List<Integer> internalList = new ArrayList<>(outerList.get(i));  // Internal list will be the exact copy of the outer list , so that we can add the current arry num in copied list
                internalList.add(num);
                outerList.add(internalList);
            }


        }

        return outerList;



    }





}
