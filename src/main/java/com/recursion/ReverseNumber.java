package com.recursion;



/**
 *  Reverse number :  take the numer and module of 10 and get reminder  , take the digits by Math.log10(n)+1 , method
 *
 *  get the reminder  and multiply the reminder with 10 to power of  digits-1 , plus the reminder
 *
 *  so the first reminder will be moving to left side multiplied by 10^digits-1 , so will get the reverse number
 *
 *
 *  Follow the same approach for palindrome and store the original number in variable and revrser number , then compare both
 *
 *
 */

public class ReverseNumber {

    public static void main(String[] args) {




       int newnum =  reverse(13245);
        System.out.println(newnum);

    }



    public static  int  reverse(int number){


        int digits  = (int)(Math.log10(number)) +1;

        return helper(number,digits);



    }

    public  static int helper(int number, int digits)
    {

        if (number%10==number){

            return number;

        }

        int rem = number%10;

        return  rem * (int)Math.pow(10,digits-1)  + helper(number/10, digits-1);


    }





}
