package org.example;

import java.util.Scanner;

public class RectangleMath {

    Scanner scanner = new Scanner(System.in);

    int rectangleLength = scanner.nextInt();//number for rectangle length
    int rectangleHeight = scanner.nextInt();//number fpr rectangle height

    void rectangleAreaAndPerimeter(){//method for calculate are and perimeter of rectangle
        int rectangleL = rectangleLength;
        int rectangleH = rectangleHeight;

        int rectangleA = rectangleL * rectangleH;//calculate area of rectangle

        System.out.println("Rectangle area is " + rectangleA);//print result for area

        int rectangleP = 2 * rectangleL +  2 * rectangleH;//calculate perimeter of rectangle

        System.out.println("Rectangle perimeter is " + rectangleP);//print result for perimeter

    }

//

    public static void main(String[] args) {

        System.out.println("Please enter two number for calculate rectangle perimeter and area:");


        RectangleMath perimeterAndArea = new RectangleMath();
        perimeterAndArea.rectangleAreaAndPerimeter();



    }
}
