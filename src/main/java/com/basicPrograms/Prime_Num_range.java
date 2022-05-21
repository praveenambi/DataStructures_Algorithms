package com.basicPrograms;

public class Prime_Num_range {


    public static void main(String[] args) {

        findPrimes(2,49);

    }


    public static void findPrimes(int start , int end){


        while (start<=end){

            if ((start%2)!=0 && start%start==0){

                System.out.print(" " +start);

            }
            start++;
        }



    }
}
