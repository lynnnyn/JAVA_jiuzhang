//package com.company;



public class Solution {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */

    public Solution(){

    }
    public int reverseInteger(int number) {
        // write your code here
        int digit = number % 10;
        int tenth = (number/10)%10;
        int hund = (number/100)%10;
        int newNumber = digit*100+tenth*10+hund;
        return newNumber;
    }


    public static void main(String[] args) {
            // write your code here
        Solution myAns = new Solution();
        System.out.println(myAns.reverseInteger(280));
    }

}























