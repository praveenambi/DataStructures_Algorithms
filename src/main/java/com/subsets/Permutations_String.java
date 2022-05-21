package com.subsets;


import java.util.ArrayList;

/**
 *
 *  Problem statement : permutations of a given string
 *   String = "abc"
 *   Ans : cba bca bac cab acb abc
 *
 *   Logic : here the common sense tell us that , we are not ignoring any character in the recursive function calls
 *           Its just that , we are re arranging the position of characters at each recursion calls
 *
 *           Here the no of recursive calls is depend on the size of the processed , as explained in the recursive flow daigram .
 *           OS it will be recursive calls = Processsed.soze() +1
 *
 *           so at each stage of recursion , the no of recursive calls are doubled
 *           The count of recursion calls count = unprocessed.lenght()!
 *
 *
 * resursive tree: ![](Permutations_recursion.png)
 *
 * Time complexity : O(N2)
 *
 */

public class Permutations_String {

    public static void main(String[] args) {

        //arrangePermutations("","abc");

      ArrayList<String> output =  arrangePermutationsList("","abc");
        System.out.println(output);

    }

    public static void arrangePermutations(String processed,String unprocessed){


        if (unprocessed.isEmpty()){

            System.out.print(" " + processed);
            return;

        }

        char ch = unprocessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {

            String first = processed.substring(0,i);
            String second = processed.substring(i,processed.length());
            arrangePermutations(first+ch+second, unprocessed.substring(1));


        }




    }


    public static ArrayList<String> arrangePermutationsList(String processed, String unprocessed){


        if (unprocessed.isEmpty()){


            ArrayList<String> list = new ArrayList<>();
           // System.out.print(" " + processed);
            list.add(processed);
            return list;

        }

        char ch = unprocessed.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= processed.length(); i++) {

            String first = processed.substring(0,i);
            String second = processed.substring(i,processed.length());
            ans.addAll(arrangePermutationsList(first+ch+second, unprocessed.substring(1)));


        }



        return  ans;
    }





}
