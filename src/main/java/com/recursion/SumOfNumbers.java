package com.recursion;

public class SumOfNumbers {

    public static void main(String[] args) {
      int sum =   sumNumbers(5);
        System.out.println(sum);

    }

    public  static  int  sumNumbers(int number){

        if (number<0){

            return  0;
        }

        return  number + sumNumbers(number-1);


    }





}
