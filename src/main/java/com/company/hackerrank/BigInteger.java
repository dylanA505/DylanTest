package com.company.hackerrank;

import java.util.Scanner;

public class BigInteger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        java.math.BigInteger bigIntegerOne = scanner.nextBigInteger();
        java.math.BigInteger bigIntegerTwo = scanner.nextBigInteger();
        scanner.close();

        System.out.println(bigIntegerOne.add(bigIntegerTwo));
        System.out.println(bigIntegerOne.multiply(bigIntegerTwo));


    }
}
