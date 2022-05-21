package com.subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * What is Subset ?
 *  Ans = the concept of taking or removing an element or an character from a array or a string is  called as Subset
 *
 *  Eg : "abc"
 *  ans =["a", "b", "c","ab","ac",abc","bc]
 *
 *  note: The orders can not be changed as because its not an combinations
 *![](Subset_recursiv tree.png)
 *
 *  recursive tree:      will take the concepts of processed and unprocessed structure
 *
 *
 * Logic : take the first char of string  and either  add it to the processed string or just ignore it , so this needs to
 *
 *  Time Complexity : o(n) , where N is lenght of the string
 *
 *![](Subset_recursiv tree.png)
 *
 */

public class StringSubSetsASCII {



    public static ArrayList<String> getSubsets(String processed, String unprocessed){

        if (unprocessed.isEmpty()){


            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list ;

        }
        char ch = unprocessed.charAt(0);

        ArrayList<String> first = getSubsets(processed,unprocessed.substring(1));
        ArrayList<String> second =  getSubsets(processed+(ch+0), unprocessed.substring(1));
        ArrayList<String> third  =  getSubsets(processed+ch,unprocessed.substring(1));


        first.addAll(second);
        first.addAll(third);

        return  first;

    }


    public static void main(String[] args) {

        List<String> anslist = getSubsets("","abc");
        System.out.println(anslist);

    }
}
