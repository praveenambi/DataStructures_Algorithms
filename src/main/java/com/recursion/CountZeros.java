package com.recursion;

public class CountZeros {

    public static void main(String[] args) {


        int zeros =  countzeros(1000);
        System.out.println(zeros);

    }



    public static int countzeros(int num){

        if (num%10== num){
            return  0;


        }

        int rem  = num%10;

        if (rem==0){
            return countzeros(num/10)+1;

        }
        return countzeros(num/10);
    }
}
