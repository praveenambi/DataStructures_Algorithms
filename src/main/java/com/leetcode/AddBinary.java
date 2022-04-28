package com.leetcode;

public class AddBinary {

    public static void main(String[] args) {

       String fresult =  addBin("1010","1011");

        System.out.println(fresult);
    }


    public static String addBin(String a , String b){

        StringBuilder sb = new StringBuilder();

        int i  = sb.length()-1;
        int j = b.length()-1;
        int carry =0;


        while (i>=0 || j>=0){
            int sum = carry;

            if (j>=0){

                sum=sum+b.charAt(j--)-0;

            }
            if (i>=0){

                sum=sum+a.charAt(i--)-0;

            }
            sb.append(sum%2);
            sum = sum/2;
        }
        if (carry!=0){
            sb.append(carry);
        }



        return  sb.toString();
    }


}
