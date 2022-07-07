package com.basicPrograms;

public class Factorial_recursion {
    public static void main(String[] args) {


      int result =  printFactorial(7);

        System.out.println(result);
    }


    public static int printFactorial(int num){

        if (num==0){

            return 1;

        }

       return  num *  printFactorial(num-1);

    }
}
