package com.company.practice;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo){


        //casting:
        int num1 = (int)(numberOne * 100);
        int num2 = (int)(numberTwo * 100);

        if(num1 == num2){
            return true;
        }
        return false;
    }
}
