package com.recursion;


/**
 *  Find the factorial number using recursion :
 *  1. Try to devide the  problem statement into sub problem  parts
 *   eg :  f(5) = 5 * f(4)
 *                     *
 *                     *
 *                     *4 * f(3)
 *                           *
 *                           *
 *                           3 * f(2)
 *                                *
 *                                *
 *                                2* f(1)
 *
 *       so , the recurative statments are F(N) = N * f(N-1)
 *
 * 2. the parameters are the N values
 * 3. return the calculated factorial number of given N  Values
 *
 *
 *
 */




public class FatorialNumber {


    public static void main(String[] args) {

        int fact = getFactorial(5);

        System.out.println(fact);

    }


    public  static  int getFactorial(int n ){


        if ( n==0){

            return 1;
        }

        return n * getFactorial(n-1);

    }
}
