package com.recursion;

/**
 *  What is recursion : A function calling itself is a  recursive function
 *
 *
 *  Steps to understand the Recursion:
 *  1. First , look at the problem and  whether we can devide the problem into sub problems eg : binary search
 *  2.  try to frame the recurrative statement  , so in this example it fibonacci(N) = fibonacci(N-1) + fibonacci(N-1)
 *       the addition of previous two element is  equal to the next fibonaci series
 * 3. draw the recursive tree structure  and try to understand the way  functions are called.
 * the resursive tree functions are always called from left side of tree
 * 4.analyze how the values are being returned  after debugging
 * 5. Analyze and understand  how functions are being called and removed in stack memory.
 *
 */

class FibonacciSeries {


    public static int fibonacci(int number){

        if (number<2){

            return number;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);


    }


    public static void main(String[] args) {

       int result =  fibonacci(3);
        System.out.println(result);
    }




}
