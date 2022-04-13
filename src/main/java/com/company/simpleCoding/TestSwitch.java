package com.company.simpleCoding;

public class TestSwitch {


    public static void main(String[] args) {

        // case: can use all type of primitive data type

        char switchValue = 'd';

        switch (switchValue) {
            case 'a':
                System.out.println("Value was a");
                break;
            case 'b':
                System.out.println("Value was b");
                break;
            case 'c':
            case 'd':
            case 'e':
                System.out.println("Value was " + switchValue);
                break;
            default:
                System.out.println("Value was not found");
                break;

        }

    }
}
