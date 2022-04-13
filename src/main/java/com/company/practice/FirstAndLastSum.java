package com.company.practice;

public class FirstAndLastSum {

    public static int sumFirstAndLastDigit(int number){

        //invalid options
        if(number < 0){
            return -1;
        }

        //variables
        int lastDigit = 0;

        //last Digit
        lastDigit = number % 10;

        //first Digit
        while(number >= 10){
            number = number / 10;
        }


        return number + lastDigit;
    }
}
