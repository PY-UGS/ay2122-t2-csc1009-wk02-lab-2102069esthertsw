package com.esther.lab.wk02;

import java.util.Scanner;

public class Q1Circle {
    private static final float PI = 3.14159f;   //Private static final = const
    double radius;
        Q1Circle(double newRadius)
        {
            radius = newRadius; // ATTRIBUTE: radius
        }

        double getArea() {      //FUNCTION: getArea, return double value
            return radius * radius * PI;
        }   //PI* r^2

        /*double getPerimeter() {
        return 2 * radius * PI; //PI * diameter
        }*/

        void setRadius(double newRadius)    //FUNCTION: change radius of existing object
        {
            radius = newRadius;
        }


        public static void main(String [] args){    //cannot run without main()
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the radius of circle: ");
            double newRadius = input.nextDouble();
            Q1Circle c = new Q1Circle(newRadius);
            System.out.println("The area of the circle with radius " + c.radius + " is " + (float)c.getArea());
            //IMPROVEMENT: while loop with flags for user to run again, use setRadius() to save memory space
        }
}
