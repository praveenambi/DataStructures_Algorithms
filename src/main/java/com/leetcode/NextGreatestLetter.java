package com.leetcode;

public class NextGreatestLetter {


    public static void main(String[] args) {
        char[]  letters = {'c','f','j'};
        char target = 'c';
        // Output: "c"

        char targetelement =  nextGreatestLetter(letters,target);

        System.out.println("The target element is found is " + targetelement);

    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start =0;
        int end = letters.length-1;

        while (start<=end){

            // find out the mid element by below formulae
            int mid = start+ (end-start) /2;

            if (target<letters[mid]){

                end=mid-1;
            }
            else {

                start= mid+1;
            }

        }

        return letters[start%letters.length];
    }






}
