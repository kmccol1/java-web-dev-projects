package org.launchcode;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Area
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, please enter a radius: ");
        double radius = 0;
        boolean flag = false;
        do {
            try{

                String input = scan.next();
                System.out.println("input: " + input);
                radius = Double.parseDouble(input);

                if (radius < 0 || input.isEmpty())
                    System.out.println("Please enter a positive value: ");
                else
                    flag = true;


            }
//            catch(InputMismatchException e){
//                System.out.println("Please enter a numeric value: ");
//
//            }
            catch(NumberFormatException e){
                System.out.println("Please enter a numeric value: ");

            }
        }
        while(!flag);



        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with radius " + radius + " is equal to " + area + " square units.");

    }
}
