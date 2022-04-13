package com.company.simpleCoding;

import java.util.Scanner;

public class ReadUserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your year of birth:");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();            // it will assume the (ENTER key) as one input

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        int age = 2021 - yearOfBirth;

        if (age >= 0 && age <= 100) {
            System.out.println("Your name is: " + name + " and your are " + age + " years old!");
        } else {
            System.out.println("Invalid year of birth!");
        }


        scanner.close();           //always close afterward
}

    }

