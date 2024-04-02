package org.launchcode;

import java.util.Scanner;

public class NumTypes2 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter the number of miles driven: ");
        double numMilesDriven = input.nextDouble();

        System.out.println("Hello, please enter the amount of gas consumed (in gallons): ");
        double numGallonsGas = input.nextDouble();

        double mpg = numMilesDriven / numGallonsGas;

        System.out.println("You are running on " + mpg + " mpg.");

    }
}
