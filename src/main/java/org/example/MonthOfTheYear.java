package org.example;

import java.util.Scanner;

public class MonthOfTheYear {

    public  static void printMonthOfTheYear(int month){

        switch (month) {
            case 1:
                System.out.printf("Entered %d. You have selected January\n", month);
                break;
            case 2:
                System.out.printf("Entered %d. You have selected February\n", month);
                break;
            case 3:
                System.out.printf("Entered %d. You have selected March\n", month);
                break;
            case 4:
                System.out.printf("Entered %d. You have selected April\n", month);
                break;
            case 5:
                System.out.printf("Entered %d. You have selected May\n", month);
                break;
            case 6:
                System.out.printf("Entered %d. You have selected June\n", month);
                break;
            case 7:
                System.out.printf("Entered %d. You have selected July\n", month);
                break;
            case 8:
                System.out.printf("Entered %d. You have selected August\n", month);
                break;
            case 9:
                System.out.printf("Entered %d. You have selected September\n", month);
                break;
            case 10:
                System.out.printf("Entered %d. You have selected October\n", month);
                break;
            case 11:
                System.out.printf("Entered %d. You have selected November\n", month);
                break;
            case 12:
                System.out.printf("Entered %d. You have selected December\n", month);
                break;

            default:
                System.out.printf("Entered %d. Invalid selection\n", month);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter month(1 - 12) of the year :");
        int month = scanner.nextInt();

        printMonthOfTheYear(month);
    }
}
