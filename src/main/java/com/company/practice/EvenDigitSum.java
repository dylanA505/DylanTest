package com.company.practice;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){   //123456789

        if(number < 0){
            return -1;
        }

        int sum = 0;
        int lastDigit = 0;

        while(number > 0){

            lastDigit = number % 10;
            if (lastDigit % 2 == 0){
                sum = sum + lastDigit;
            }
            number = number / 10;

        }
        return sum;
    }
}
