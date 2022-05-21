package com.recursion;

public class SkipChracter_Steams {


    public static void main(String[] args) {

      String Ans =   skipChar("hassddassfg");
        System.out.println(Ans);

    }

    public static String skipChar(String unprocessed){

        if (unprocessed.isEmpty()){


            return "";
        }
        char ch = unprocessed.charAt(0);

        if (ch=='a'){
            return  skipChar(unprocessed.substring(1));

        }else

            return ch+skipChar(unprocessed.substring(1));

    }



}
