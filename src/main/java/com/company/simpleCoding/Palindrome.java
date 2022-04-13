package com.company.simpleCoding;

public class Palindrome {

    public static boolean isPalindrome(int number){

        //variables
        int lastDigits = 0;
        int reverse = 0;
        int value = number;

        while(number != 0){
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        if(value == number){
            return true;
        }



        return false;
    }
}
