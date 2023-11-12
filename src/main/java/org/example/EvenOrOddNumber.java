package org.example;

import java.util.Scanner;

public class EvenOrOddNumber {

    public void evenOrOddNumber(){//method for calculate even or odd number

        System.out.println("Please enter number:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if ((number % 2) == 0){//Checking number is even

            System.out.println("The number is Even");
        }
        else {//when number is not even

            System.out.println("The number is Odd");
        }

    }

    public static void main(String[] args) {

        EvenOrOddNumber evenOrOdd = new EvenOrOddNumber();
        evenOrOdd.evenOrOddNumber();//print result by method evenOrOddNumber


    }
}
