package org.example;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three numbers");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber){

            System.out.println("First number is largest");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {

            System.out.println("Second number is largest");
        }
        else {

            System.out.println("Third number is largest");
        }


    }
}