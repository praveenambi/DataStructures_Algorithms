package com.recursion;



public class PriductOfNumbers {


    public static void main(String[] args) {

      int product =   productNumbers(2);

        System.out.println(product);


    }



    public   static  int productNumbers(int number){

        if (number<=1){

            return  1;
        }

        return number * productNumbers(number-1);


    }
}
