package com.recursion;

public class SkipApple {

    public static void main(String[] args) {

       String ans  =  skipAppple("assdfereapplejhhsga");
        System.out.println(ans);
    }

    public static String skipAppple(String unprocessed){

            if (unprocessed.isEmpty()){


                return "";
            }

            if (unprocessed.startsWith("apple")){
                return  skipAppple(unprocessed.substring(5));

            }else

                return unprocessed.charAt(0)+skipAppple(unprocessed.substring(1));

        }


    }
