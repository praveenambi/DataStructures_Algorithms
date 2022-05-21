package com.recursion;

public class RemoveCharacters_FromStrings {


    public static void main(String[] args) {


        skepChar("", "bccaddsda");
    }


    public static void skepChar(String processed, String unprocessed){



        if (unprocessed.isEmpty()){

            System.out.println(processed);

            return;
        }
        char ch = unprocessed.charAt(0);

        if (ch=='a'){
            skepChar(processed,unprocessed.substring(1));

        }else {

            skepChar(processed+ch,unprocessed.substring(1));
        }
    }

}
